package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestTargetsForShard extends StObject {
  
  /**
    * Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, "package com.my.packages" "class com.my.package.MyClass". The number of test_targets must be greater than 0.
    */
  var testTargets: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTestTargetsForShard {
  
  inline def apply(): SchemaTestTargetsForShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestTargetsForShard]
  }
  
  extension [Self <: SchemaTestTargetsForShard](x: Self) {
    
    inline def setTestTargets(value: js.Array[String]): Self = StObject.set(x, "testTargets", value.asInstanceOf[js.Any])
    
    inline def setTestTargetsNull: Self = StObject.set(x, "testTargets", null)
    
    inline def setTestTargetsUndefined: Self = StObject.set(x, "testTargets", js.undefined)
    
    inline def setTestTargetsVarargs(value: String*): Self = StObject.set(x, "testTargets", js.Array(value*))
  }
}
