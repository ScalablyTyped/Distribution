package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-login-bad-password.error", JSImport.Namespace)
@js.native
object igLoginBadPasswordErrorMod extends js.Object {
  
  @js.native
  class IgLoginBadPasswordError () extends IgResponseError[AccountRepositoryLoginErrorResponse]
}
