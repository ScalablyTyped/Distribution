package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic Targeting Key List Response
  */
trait SchemaDynamicTargetingKeysListResponse extends StObject {
  
  /**
    * Dynamic targeting key collection.
    */
  var dynamicTargetingKeys: js.UndefOr[js.Array[SchemaDynamicTargetingKey]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKeysListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDynamicTargetingKeysListResponse {
  
  inline def apply(): SchemaDynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKeysListResponse]
  }
  
  extension [Self <: SchemaDynamicTargetingKeysListResponse](x: Self) {
    
    inline def setDynamicTargetingKeys(value: js.Array[SchemaDynamicTargetingKey]): Self = StObject.set(x, "dynamicTargetingKeys", value.asInstanceOf[js.Any])
    
    inline def setDynamicTargetingKeysUndefined: Self = StObject.set(x, "dynamicTargetingKeys", js.undefined)
    
    inline def setDynamicTargetingKeysVarargs(value: SchemaDynamicTargetingKey*): Self = StObject.set(x, "dynamicTargetingKeys", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
