package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIResponseSuccess extends APIResponse {
  
  var data: APIResponseData = js.native
  
  var meta: APIResponseMeta = js.native
}
object APIResponseSuccess {
  
  @scala.inline
  def apply(data: APIResponseData, meta: APIResponseMeta): APIResponseSuccess = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseSuccess]
  }
  
  @scala.inline
  implicit class APIResponseSuccessMutableBuilder[Self <: APIResponseSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: APIResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: APIResponseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
