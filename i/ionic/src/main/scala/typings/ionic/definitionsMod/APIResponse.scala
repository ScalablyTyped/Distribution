package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.APIResponseSuccess
  - typings.ionic.definitionsMod.APIResponseError
*/
trait APIResponse extends StObject
object APIResponse {
  
  @scala.inline
  def APIResponseError(error: APIResponseErrorError, meta: APIResponseMeta): typings.ionic.definitionsMod.APIResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.APIResponseError]
  }
  
  @scala.inline
  def APIResponseSuccess(data: APIResponseData, meta: APIResponseMeta): typings.ionic.definitionsMod.APIResponseSuccess = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.APIResponseSuccess]
  }
}
