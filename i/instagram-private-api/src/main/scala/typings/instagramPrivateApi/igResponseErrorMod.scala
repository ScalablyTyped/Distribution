package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.igClientErrorMod.IgClientError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igResponseErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-response.error", "IgResponseError")
  @js.native
  class IgResponseError[TBody /* <: StringDictionary[js.Any] */] protected () extends IgClientError {
    def this(response: IgResponse[TBody]) = this()
    
    var response: IgResponse[TBody] = js.native
    
    var text: String = js.native
  }
}
