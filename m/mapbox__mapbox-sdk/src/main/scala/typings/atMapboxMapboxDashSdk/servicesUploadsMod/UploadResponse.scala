package typings.atMapboxMapboxDashSdk.servicesUploadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadResponse extends js.Object {
  var complete: Boolean
  var created: String
  var error: js.UndefOr[js.Any] = js.undefined
  var id: String
  var modified: String
  var name: String
  var owner: String
  var progress: Double
  var tileset: String
}

object UploadResponse {
  @scala.inline
  def apply(
    complete: Boolean,
    created: String,
    id: String,
    modified: String,
    name: String,
    owner: String,
    progress: Double,
    tileset: String,
    error: js.Any = null
  ): UploadResponse = {
    val __obj = js.Dynamic.literal(complete = complete, created = created, id = id, modified = modified, name = name, owner = owner, progress = progress, tileset = tileset)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[UploadResponse]
  }
}

