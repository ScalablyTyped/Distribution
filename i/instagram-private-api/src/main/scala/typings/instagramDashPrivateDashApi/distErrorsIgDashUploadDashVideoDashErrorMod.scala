package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distErrorsIgDashResponseDotErrorMod.IgResponseError
import typings.instagramDashPrivateDashApi.distResponsesUploadDotRepositoryDotVideoDotResponseMod.UploadRepositoryVideoResponseRootObject
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-upload-video-error", JSImport.Namespace)
@js.native
object distErrorsIgDashUploadDashVideoDashErrorMod extends js.Object {
  @js.native
  class IgUploadVideoError protected ()
    extends IgResponseError[js.Any] {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
    var videoInfo: js.Any = js.native
  }
  
}

