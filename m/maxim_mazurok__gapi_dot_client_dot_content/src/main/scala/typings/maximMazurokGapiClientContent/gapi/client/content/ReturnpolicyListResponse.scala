package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#returnpolicyListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[js.Array[ReturnPolicy]] = js.native
}
object ReturnpolicyListResponse {
  
  @scala.inline
  def apply(): ReturnpolicyListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyListResponse]
  }
  
  @scala.inline
  implicit class ReturnpolicyListResponseMutableBuilder[Self <: ReturnpolicyListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[ReturnPolicy]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ReturnPolicy*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
