package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an upload session reference. This reference is created via
  * upload method. Updating of item content may refer to this uploaded content
  * via contentDataRef.
  */
@js.native
trait SchemaUploadItemRef extends js.Object {
  /**
    * Name of the content reference. The maximum length is 2048 characters.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaUploadItemRef {
  @scala.inline
  def apply(): SchemaUploadItemRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadItemRef]
  }
  @scala.inline
  implicit class SchemaUploadItemRefOps[Self <: SchemaUploadItemRef] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

