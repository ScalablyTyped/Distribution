package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaImagesDeleteAllResponse extends js.Object {
  var deleted: js.UndefOr[js.Array[SchemaImage]] = js.native
}

object SchemaImagesDeleteAllResponse {
  @scala.inline
  def apply(): SchemaImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesDeleteAllResponse]
  }
  @scala.inline
  implicit class SchemaImagesDeleteAllResponseOps[Self <: SchemaImagesDeleteAllResponse] (val x: Self) extends AnyVal {
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
    def setDeletedVarargs(value: SchemaImage*): Self = this.set("deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[SchemaImage]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
  }
  
}

