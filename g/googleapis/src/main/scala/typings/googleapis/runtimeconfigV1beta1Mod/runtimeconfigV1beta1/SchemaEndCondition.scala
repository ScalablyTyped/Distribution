package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The condition that a Waiter resource is waiting for.
  */
trait SchemaEndCondition extends StObject {
  
  /**
    * The cardinality of the `EndCondition`.
    */
  var cardinality: js.UndefOr[SchemaCardinality] = js.undefined
}
object SchemaEndCondition {
  
  @scala.inline
  def apply(): SchemaEndCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndCondition]
  }
  
  @scala.inline
  implicit class SchemaEndConditionMutableBuilder[Self <: SchemaEndCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardinality(value: SchemaCardinality): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
  }
}
