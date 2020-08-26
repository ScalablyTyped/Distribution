package typings.keystonejsOembedAdapters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OEmbedAdapterConfig extends js.Object {
  var apiKey: String = js.native
}

object OEmbedAdapterConfig {
  @scala.inline
  def apply(apiKey: String): OEmbedAdapterConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OEmbedAdapterConfig]
  }
  @scala.inline
  implicit class OEmbedAdapterConfigOps[Self <: OEmbedAdapterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
  }
  
}

