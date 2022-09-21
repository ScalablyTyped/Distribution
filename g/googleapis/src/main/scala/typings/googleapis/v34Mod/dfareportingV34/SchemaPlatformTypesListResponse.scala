package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlatformTypesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#platformTypesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Platform type collection.
    */
  var platformTypes: js.UndefOr[js.Array[SchemaPlatformType]] = js.undefined
}
object SchemaPlatformTypesListResponse {
  
  inline def apply(): SchemaPlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformTypesListResponse]
  }
  
  extension [Self <: SchemaPlatformTypesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlatformTypes(value: js.Array[SchemaPlatformType]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    inline def setPlatformTypesVarargs(value: SchemaPlatformType*): Self = StObject.set(x, "platformTypes", js.Array(value*))
  }
}
