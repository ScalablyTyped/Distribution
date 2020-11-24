package typings.instagramPrivateApi

import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typings.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-user-has-logged-out.error", JSImport.Namespace)
@js.native
object igUserHasLoggedOutErrorMod extends js.Object {
  
  @js.native
  class IgUserHasLoggedOutError () extends IgResponseError[LoginRequiredResponse]
}
