package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-login-invalid-user.error", JSImport.Namespace)
@js.native
object igLoginInvalidUserErrorMod extends js.Object {
  @js.native
  class IgLoginInvalidUserError () extends IgResponseError[AccountRepositoryLoginErrorResponse]
  
}

