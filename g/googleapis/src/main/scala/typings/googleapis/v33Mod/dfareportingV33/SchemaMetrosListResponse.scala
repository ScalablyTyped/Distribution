package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metro List Response
  */
trait SchemaMetrosListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#metrosListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metro collection.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.undefined
}
object SchemaMetrosListResponse {
  
  inline def apply(): SchemaMetrosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrosListResponse]
  }
  
  extension [Self <: SchemaMetrosListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetros(value: js.Array[SchemaMetro]): Self = StObject.set(x, "metros", value.asInstanceOf[js.Any])
    
    inline def setMetrosUndefined: Self = StObject.set(x, "metros", js.undefined)
    
    inline def setMetrosVarargs(value: SchemaMetro*): Self = StObject.set(x, "metros", js.Array(value :_*))
  }
}
