package typings.keystonejsFileAdapters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudinaryFileAdapterConfig extends js.Object {
  var apiKey: String = js.native
  var apiSecret: String = js.native
  var cloudName: String = js.native
  var folder: js.UndefOr[String] = js.native
}

object CloudinaryFileAdapterConfig {
  @scala.inline
  def apply(apiKey: String, apiSecret: String, cloudName: String): CloudinaryFileAdapterConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiSecret = apiSecret.asInstanceOf[js.Any], cloudName = cloudName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudinaryFileAdapterConfig]
  }
  @scala.inline
  implicit class CloudinaryFileAdapterConfigOps[Self <: CloudinaryFileAdapterConfig] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setApiSecret(value: String): Self = this.set("apiSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudName(value: String): Self = this.set("cloudName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
  }
  
}

