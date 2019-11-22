package typings.instagramDashPrivateDashApi.distResponsesUploadDotRepositoryDotPhotoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRepositoryPhotoResponseRootObject extends js.Object {
  var status: String
  var upload_id: String
  var xsharing_nonces: UploadRepositoryPhotoResponseXsharing_nonces
}

object UploadRepositoryPhotoResponseRootObject {
  @scala.inline
  def apply(status: String, upload_id: String, xsharing_nonces: UploadRepositoryPhotoResponseXsharing_nonces): UploadRepositoryPhotoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, upload_id = upload_id, xsharing_nonces = xsharing_nonces)
  
    __obj.asInstanceOf[UploadRepositoryPhotoResponseRootObject]
  }
}

