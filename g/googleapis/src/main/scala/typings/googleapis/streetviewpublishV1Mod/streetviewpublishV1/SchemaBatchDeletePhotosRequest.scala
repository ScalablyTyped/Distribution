package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to delete multiple Photos.
  */
@js.native
trait SchemaBatchDeletePhotosRequest extends js.Object {
  /**
    * Required. IDs of the Photos. HTTP GET requests require the following
    * syntax for the URL query parameter:
    * `photoIds=&lt;id1&gt;&amp;photoIds=&lt;id2&gt;&amp;...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBatchDeletePhotosRequest {
  @scala.inline
  def apply(): SchemaBatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePhotosRequest]
  }
  @scala.inline
  implicit class SchemaBatchDeletePhotosRequestOps[Self <: SchemaBatchDeletePhotosRequest] (val x: Self) extends AnyVal {
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
    def setPhotoIdsVarargs(value: String*): Self = this.set("photoIds", js.Array(value :_*))
    @scala.inline
    def setPhotoIds(value: js.Array[String]): Self = this.set("photoIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoIds: Self = this.set("photoIds", js.undefined)
  }
  
}

