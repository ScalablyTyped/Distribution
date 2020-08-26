package typings.mapboxMapboxSdk.uploadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadResponse extends js.Object {
  var complete: Boolean = js.native
  var created: String = js.native
  var error: js.UndefOr[js.Any] = js.native
  var id: String = js.native
  var modified: String = js.native
  var name: String = js.native
  var owner: String = js.native
  var progress: Double = js.native
  var tileset: String = js.native
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
    tileset: String
  ): UploadResponse = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], tileset = tileset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadResponse]
  }
  @scala.inline
  implicit class UploadResponseOps[Self <: UploadResponse] (val x: Self) extends AnyVal {
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
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileset(value: String): Self = this.set("tileset", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

