package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Region List Response
  */
@js.native
trait SchemaRegionsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#regionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Region collection.
    */
  var regions: js.UndefOr[js.Array[SchemaRegion]] = js.native
}
object SchemaRegionsListResponse {
  
  @scala.inline
  def apply(): SchemaRegionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionsListResponse]
  }
  
  @scala.inline
  implicit class SchemaRegionsListResponseMutableBuilder[Self <: SchemaRegionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[SchemaRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: SchemaRegion*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
