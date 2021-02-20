package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#posListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[js.Array[PosStore]] = js.native
}
object PosListResponse {
  
  @scala.inline
  def apply(): PosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosListResponse]
  }
  
  @scala.inline
  implicit class PosListResponseMutableBuilder[Self <: PosListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[PosStore]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: PosStore*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
