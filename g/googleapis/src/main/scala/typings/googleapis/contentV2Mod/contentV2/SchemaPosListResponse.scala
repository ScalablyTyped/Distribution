package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaPosStore]] = js.undefined
}
object SchemaPosListResponse {
  
  @scala.inline
  def apply(): SchemaPosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosListResponse]
  }
  
  @scala.inline
  implicit class SchemaPosListResponseMutableBuilder[Self <: SchemaPosListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaPosStore]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaPosStore*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
