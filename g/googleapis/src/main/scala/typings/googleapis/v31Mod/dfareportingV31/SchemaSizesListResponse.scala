package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Size List Response
  */
trait SchemaSizesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#sizesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Size collection.
    */
  var sizes: js.UndefOr[js.Array[SchemaSize]] = js.undefined
}
object SchemaSizesListResponse {
  
  @scala.inline
  def apply(): SchemaSizesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSizesListResponse]
  }
  
  @scala.inline
  implicit class SchemaSizesListResponseMutableBuilder[Self <: SchemaSizesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "sizes", js.Array(value :_*))
  }
}
