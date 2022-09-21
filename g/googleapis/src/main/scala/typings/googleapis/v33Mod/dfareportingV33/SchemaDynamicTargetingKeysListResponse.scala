package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicTargetingKeysListResponse extends StObject {
  
  /**
    * Dynamic targeting key collection.
    */
  var dynamicTargetingKeys: js.UndefOr[js.Array[SchemaDynamicTargetingKey]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#dynamicTargetingKeysListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDynamicTargetingKeysListResponse {
  
  inline def apply(): SchemaDynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKeysListResponse]
  }
  
  extension [Self <: SchemaDynamicTargetingKeysListResponse](x: Self) {
    
    inline def setDynamicTargetingKeys(value: js.Array[SchemaDynamicTargetingKey]): Self = StObject.set(x, "dynamicTargetingKeys", value.asInstanceOf[js.Any])
    
    inline def setDynamicTargetingKeysUndefined: Self = StObject.set(x, "dynamicTargetingKeys", js.undefined)
    
    inline def setDynamicTargetingKeysVarargs(value: SchemaDynamicTargetingKey*): Self = StObject.set(x, "dynamicTargetingKeys", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
