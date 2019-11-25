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
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadRepositoryPhotoResponseRootObject]
  }
}

