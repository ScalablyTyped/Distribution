package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Upload reference for media files.
  */
@js.native
trait SchemaUploadRef extends js.Object {
  /**
    * Required. An upload reference should be unique for each user. It follows
    * the form:
    * &quot;https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}&quot;
    */
  var uploadUrl: js.UndefOr[String] = js.native
}

object SchemaUploadRef {
  @scala.inline
  def apply(uploadUrl: String = null): SchemaUploadRef = {
    val __obj = js.Dynamic.literal()
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUploadRef]
  }
}

