package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBrowsersListResponse extends StObject {
  
  /**
    * Browser collection.
    */
  var browsers: js.UndefOr[js.Array[SchemaBrowser]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#browsersListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBrowsersListResponse {
  
  inline def apply(): SchemaBrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowsersListResponse]
  }
  
  extension [Self <: SchemaBrowsersListResponse](x: Self) {
    
    inline def setBrowsers(value: js.Array[SchemaBrowser]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: SchemaBrowser*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
