package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataParam extends js.Object {
  var metadata: js.Any = js.native
}

object MetadataParam {
  @scala.inline
  def apply(metadata: js.Any): MetadataParam = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataParam]
  }
  @scala.inline
  implicit class MetadataParamOps[Self <: MetadataParam] (val x: Self) extends AnyVal {
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
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

