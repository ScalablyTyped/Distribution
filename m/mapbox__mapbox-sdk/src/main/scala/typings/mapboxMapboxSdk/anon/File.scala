package typings.mapboxMapboxSdk.anon

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var file: Blob | ArrayBuffer | String = js.native
  var iconId: String = js.native
  var ownerId: js.UndefOr[String] = js.native
  var styleId: String = js.native
}

object File {
  @scala.inline
  def apply(file: Blob | ArrayBuffer | String, iconId: String, styleId: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setFile(value: Blob | ArrayBuffer | String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconId(value: String): Self = this.set("iconId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
  }
  
}

