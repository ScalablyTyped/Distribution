package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManualSharding extends StObject {
  
  /**
    * Required. Group of packages, classes, and/or test methods to be run for each manually-created shard. You must specify at least one shard if this field is present. When you select one or more physical devices, the number of repeated test_targets_for_shard must be <= 50. When you select one or more ARM virtual devices, it must be <= 50. When you select only x86 virtual devices, it must be <= 500.
    */
  var testTargetsForShard: js.UndefOr[js.Array[SchemaTestTargetsForShard]] = js.undefined
}
object SchemaManualSharding {
  
  inline def apply(): SchemaManualSharding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManualSharding]
  }
  
  extension [Self <: SchemaManualSharding](x: Self) {
    
    inline def setTestTargetsForShard(value: js.Array[SchemaTestTargetsForShard]): Self = StObject.set(x, "testTargetsForShard", value.asInstanceOf[js.Any])
    
    inline def setTestTargetsForShardUndefined: Self = StObject.set(x, "testTargetsForShard", js.undefined)
    
    inline def setTestTargetsForShardVarargs(value: SchemaTestTargetsForShard*): Self = StObject.set(x, "testTargetsForShard", js.Array(value*))
  }
}
