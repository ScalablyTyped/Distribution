package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.igClientErrorMod.IgClientError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-response.error", JSImport.Namespace)
@js.native
object igResponseErrorMod extends js.Object {
  
  @js.native
  class IgResponseError[TBody /* <: StringDictionary[js.Any] */] protected () extends IgClientError {
    def this(response: IgResponse[TBody]) = this()
    
    var response: IgResponse[TBody] = js.native
    
    var text: String = js.native
  }
}
