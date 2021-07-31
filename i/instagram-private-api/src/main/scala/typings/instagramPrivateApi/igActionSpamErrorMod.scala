package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typings.instagramPrivateApi.spamResponseMod.SpamResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igActionSpamErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-action-spam.error", "IgActionSpamError")
  @js.native
  class IgActionSpamError protected () extends IgResponseError[SpamResponse] {
    def this(response: IgResponse[SpamResponse]) = this()
    
    def expirationDate: String | Null = js.native
  }
}
