package typings.atMapboxMapboxDashSdk

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: Blob | ArrayBuffer | String
  var iconId: String
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object Anon_File {
  @scala.inline
  def apply(file: Blob | ArrayBuffer | String, iconId: String, styleId: String, ownerId: String = null): Anon_File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], iconId = iconId, styleId = styleId)
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    __obj.asInstanceOf[Anon_File]
  }
}

