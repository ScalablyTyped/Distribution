package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typings.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igUserHasLoggedOutErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-user-has-logged-out.error", "IgUserHasLoggedOutError")
  @js.native
  class IgUserHasLoggedOutError protected () extends IgResponseError[LoginRequiredResponse] {
    def this(response: IgResponse[LoginRequiredResponse]) = this()
  }
}
