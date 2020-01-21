package typings.instagramPrivateApi.uploadRepositoryVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRepositoryVideoResponseRootObject extends js.Object {
  var status: String
  var xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces
}

object UploadRepositoryVideoResponseRootObject {
  @scala.inline
  def apply(status: String, xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces): UploadRepositoryVideoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadRepositoryVideoResponseRootObject]
  }
}

