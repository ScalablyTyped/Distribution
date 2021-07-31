package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.igUploadVideoErrorMod.IgUploadVideoError
import typings.instagramPrivateApi.uploadRepositoryVideoResponseMod.UploadRepositoryVideoResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igConfigureVideoErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-configure-video-error", "IgConfigureVideoError")
  @js.native
  class IgConfigureVideoError protected () extends IgUploadVideoError {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
  }
}
