package typings.instagramPrivateApi.errorsMod

import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.uploadRepositoryVideoResponseMod.UploadRepositoryVideoResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors", "IgUploadVideoError")
@js.native
class IgUploadVideoError protected ()
  extends typings.instagramPrivateApi.igUploadVideoErrorMod.IgUploadVideoError {
  def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
}

