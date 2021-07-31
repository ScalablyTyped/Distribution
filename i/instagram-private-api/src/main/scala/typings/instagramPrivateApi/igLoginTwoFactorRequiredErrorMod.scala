package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igLoginTwoFactorRequiredErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-login-two-factor-required.error", "IgLoginTwoFactorRequiredError")
  @js.native
  class IgLoginTwoFactorRequiredError protected () extends IgResponseError[AccountRepositoryLoginErrorResponse] {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
}
