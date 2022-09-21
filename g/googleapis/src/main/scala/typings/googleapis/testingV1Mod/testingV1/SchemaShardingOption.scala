package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShardingOption extends StObject {
  
  /**
    * Shards test cases into the specified groups of packages, classes, and/or methods.
    */
  var manualSharding: js.UndefOr[SchemaManualSharding] = js.undefined
  
  /**
    * Uniformly shards test cases given a total number of shards.
    */
  var uniformSharding: js.UndefOr[SchemaUniformSharding] = js.undefined
}
object SchemaShardingOption {
  
  inline def apply(): SchemaShardingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShardingOption]
  }
  
  extension [Self <: SchemaShardingOption](x: Self) {
    
    inline def setManualSharding(value: SchemaManualSharding): Self = StObject.set(x, "manualSharding", value.asInstanceOf[js.Any])
    
    inline def setManualShardingUndefined: Self = StObject.set(x, "manualSharding", js.undefined)
    
    inline def setUniformSharding(value: SchemaUniformSharding): Self = StObject.set(x, "uniformSharding", value.asInstanceOf[js.Any])
    
    inline def setUniformShardingUndefined: Self = StObject.set(x, "uniformSharding", js.undefined)
  }
}
