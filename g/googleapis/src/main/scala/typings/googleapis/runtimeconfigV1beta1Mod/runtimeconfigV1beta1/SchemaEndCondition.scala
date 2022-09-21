package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndCondition extends StObject {
  
  /**
    * The cardinality of the `EndCondition`.
    */
  var cardinality: js.UndefOr[SchemaCardinality] = js.undefined
}
object SchemaEndCondition {
  
  inline def apply(): SchemaEndCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndCondition]
  }
  
  extension [Self <: SchemaEndCondition](x: Self) {
    
    inline def setCardinality(value: SchemaCardinality): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
  }
}
