package typings.mapboxMapboxSdk.anon

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var file: Blob | ArrayBuffer | String
  var iconId: String
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object File {
  @scala.inline
  def apply(file: Blob | ArrayBuffer | String, iconId: String, styleId: String, ownerId: String = null): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

