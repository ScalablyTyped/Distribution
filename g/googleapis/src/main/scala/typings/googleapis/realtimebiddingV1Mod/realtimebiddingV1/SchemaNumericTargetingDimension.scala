package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNumericTargetingDimension extends StObject {
  
  /**
    * The IDs excluded in a configuration.
    */
  var excludedIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The IDs included in a configuration.
    */
  var includedIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaNumericTargetingDimension {
  
  inline def apply(): SchemaNumericTargetingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericTargetingDimension]
  }
  
  extension [Self <: SchemaNumericTargetingDimension](x: Self) {
    
    inline def setExcludedIds(value: js.Array[String]): Self = StObject.set(x, "excludedIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedIdsNull: Self = StObject.set(x, "excludedIds", null)
    
    inline def setExcludedIdsUndefined: Self = StObject.set(x, "excludedIds", js.undefined)
    
    inline def setExcludedIdsVarargs(value: String*): Self = StObject.set(x, "excludedIds", js.Array(value*))
    
    inline def setIncludedIds(value: js.Array[String]): Self = StObject.set(x, "includedIds", value.asInstanceOf[js.Any])
    
    inline def setIncludedIdsNull: Self = StObject.set(x, "includedIds", null)
    
    inline def setIncludedIdsUndefined: Self = StObject.set(x, "includedIds", js.undefined)
    
    inline def setIncludedIdsVarargs(value: String*): Self = StObject.set(x, "includedIds", js.Array(value*))
  }
}
