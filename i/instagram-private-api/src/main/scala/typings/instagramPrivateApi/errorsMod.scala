package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typings.instagramPrivateApi.checkpointResponseMod.CheckpointResponse
import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import typings.instagramPrivateApi.spamResponseMod.SpamResponse
import typings.instagramPrivateApi.uploadRepositoryVideoResponseMod.UploadRepositoryVideoResponseRootObject
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("instagram-private-api/dist/errors", "IgActionSpamError")
  @js.native
  class IgActionSpamError protected ()
    extends typings.instagramPrivateApi.igActionSpamErrorMod.IgActionSpamError {
    def this(response: IgResponse[SpamResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgChallengeWrongCodeError")
  @js.native
  class IgChallengeWrongCodeError ()
    extends typings.instagramPrivateApi.igChallengeWrongCodeErrorMod.IgChallengeWrongCodeError {
    def this(message: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgCheckpointError")
  @js.native
  class IgCheckpointError protected ()
    extends typings.instagramPrivateApi.igCheckpointErrorMod.IgCheckpointError {
    def this(response: IgResponse[CheckpointResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgClientError")
  @js.native
  class IgClientError ()
    extends typings.instagramPrivateApi.igClientErrorMod.IgClientError {
    def this(message: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgConfigureVideoError")
  @js.native
  class IgConfigureVideoError protected ()
    extends typings.instagramPrivateApi.igConfigureVideoErrorMod.IgConfigureVideoError {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgCookieNotFoundError")
  @js.native
  class IgCookieNotFoundError protected ()
    extends typings.instagramPrivateApi.igCookieNotFoundErrorMod.IgCookieNotFoundError {
    def this(name: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgExactUserNotFoundError")
  @js.native
  class IgExactUserNotFoundError ()
    extends typings.instagramPrivateApi.igExactUserNotFoundErrorMod.IgExactUserNotFoundError
  
  @JSImport("instagram-private-api/dist/errors", "IgInactiveUserError")
  @js.native
  class IgInactiveUserError protected ()
    extends typings.instagramPrivateApi.igInactiveUserErrorMod.IgInactiveUserError {
    def this(response: IgResponse[js.Any]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginBadPasswordError")
  @js.native
  class IgLoginBadPasswordError protected ()
    extends typings.instagramPrivateApi.igLoginBadPasswordErrorMod.IgLoginBadPasswordError {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginInvalidUserError")
  @js.native
  class IgLoginInvalidUserError protected ()
    extends typings.instagramPrivateApi.igLoginInvalidUserErrorMod.IgLoginInvalidUserError {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginRequiredError")
  @js.native
  class IgLoginRequiredError protected ()
    extends typings.instagramPrivateApi.igLoginRequiredErrorMod.IgLoginRequiredError {
    def this(response: IgResponse[LoginRequiredResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginTwoFactorRequiredError")
  @js.native
  class IgLoginTwoFactorRequiredError protected ()
    extends typings.instagramPrivateApi.igLoginTwoFactorRequiredErrorMod.IgLoginTwoFactorRequiredError {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgNetworkError")
  @js.native
  class IgNetworkError protected ()
    extends typings.instagramPrivateApi.igNetworkErrorMod.IgNetworkError {
    def this(e: Error) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgNoCheckpointError")
  @js.native
  class IgNoCheckpointError ()
    extends typings.instagramPrivateApi.igNoCheckpointErrorMod.IgNoCheckpointError {
    def this(message: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgNotFoundError")
  @js.native
  class IgNotFoundError protected ()
    extends typings.instagramPrivateApi.igNotFoundErrorMod.IgNotFoundError {
    def this(response: IgResponse[js.Any]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgParseError")
  @js.native
  class IgParseError protected ()
    extends typings.instagramPrivateApi.igParseErrorMod.IgParseError {
    def this(body: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgPrivateUserError")
  @js.native
  class IgPrivateUserError protected ()
    extends typings.instagramPrivateApi.igPrivateUserErrorMod.IgPrivateUserError {
    def this(response: IgResponse[js.Any]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgRequestsLimitError")
  @js.native
  class IgRequestsLimitError ()
    extends typings.instagramPrivateApi.igRequestsLimitErrorMod.IgRequestsLimitError
  
  @JSImport("instagram-private-api/dist/errors", "IgResponseError")
  @js.native
  class IgResponseError[TBody /* <: StringDictionary[js.Any] */] protected ()
    extends typings.instagramPrivateApi.igResponseErrorMod.IgResponseError[TBody] {
    def this(response: IgResponse[TBody]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgSentryBlockError")
  @js.native
  class IgSentryBlockError protected ()
    extends typings.instagramPrivateApi.igSentryBlockErrorMod.IgSentryBlockError {
    def this(response: IgResponse[js.Any]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgUploadVideoError")
  @js.native
  class IgUploadVideoError protected ()
    extends typings.instagramPrivateApi.igUploadVideoErrorMod.IgUploadVideoError {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgUserHasLoggedOutError")
  @js.native
  class IgUserHasLoggedOutError protected ()
    extends typings.instagramPrivateApi.igUserHasLoggedOutErrorMod.IgUserHasLoggedOutError {
    def this(response: IgResponse[LoginRequiredResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgUserIdNotFoundError")
  @js.native
  class IgUserIdNotFoundError ()
    extends typings.instagramPrivateApi.igUserIdNotFoundErrorMod.IgUserIdNotFoundError
}
