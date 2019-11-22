package typings.instagramDashPrivateDashApi.distResponsesUploadDotRepositoryDotVideoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRepositoryVideoResponseRootObject extends js.Object {
  var status: String
  var xsharing_nonces: UploadRepositoryVideoResponseXsharing_nonces
}

object UploadRepositoryVideoResponseRootObject {
  @scala.inline
  def apply(status: String, xsharing_nonces: UploadRepositoryVideoResponseXsharing_nonces): UploadRepositoryVideoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, xsharing_nonces = xsharing_nonces)
  
    __obj.asInstanceOf[UploadRepositoryVideoResponseRootObject]
  }
}

