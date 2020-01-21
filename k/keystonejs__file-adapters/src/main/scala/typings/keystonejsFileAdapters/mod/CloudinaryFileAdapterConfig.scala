package typings.keystonejsFileAdapters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudinaryFileAdapterConfig extends js.Object {
  var apiKey: String
  var apiSecret: String
  var cloudName: String
  var folder: js.UndefOr[String] = js.undefined
}

object CloudinaryFileAdapterConfig {
  @scala.inline
  def apply(apiKey: String, apiSecret: String, cloudName: String, folder: String = null): CloudinaryFileAdapterConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiSecret = apiSecret.asInstanceOf[js.Any], cloudName = cloudName.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudinaryFileAdapterConfig]
  }
}

