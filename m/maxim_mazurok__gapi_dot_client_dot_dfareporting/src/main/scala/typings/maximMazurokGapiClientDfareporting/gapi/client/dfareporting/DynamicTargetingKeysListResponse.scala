package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicTargetingKeysListResponse extends StObject {
  
  /** Dynamic targeting key collection. */
  var dynamicTargetingKeys: js.UndefOr[js.Array[DynamicTargetingKey]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dynamicTargetingKeysListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object DynamicTargetingKeysListResponse {
  
  inline def apply(): DynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicTargetingKeysListResponse]
  }
  
  extension [Self <: DynamicTargetingKeysListResponse](x: Self) {
    
    inline def setDynamicTargetingKeys(value: js.Array[DynamicTargetingKey]): Self = StObject.set(x, "dynamicTargetingKeys", value.asInstanceOf[js.Any])
    
    inline def setDynamicTargetingKeysUndefined: Self = StObject.set(x, "dynamicTargetingKeys", js.undefined)
    
    inline def setDynamicTargetingKeysVarargs(value: DynamicTargetingKey*): Self = StObject.set(x, "dynamicTargetingKeys", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
