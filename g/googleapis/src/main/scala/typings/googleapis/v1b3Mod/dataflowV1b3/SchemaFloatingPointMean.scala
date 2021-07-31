package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a floating point mean metric contribution.
  */
trait SchemaFloatingPointMean extends StObject {
  
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[Double] = js.undefined
}
object SchemaFloatingPointMean {
  
  @scala.inline
  def apply(): SchemaFloatingPointMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloatingPointMean]
  }
  
  @scala.inline
  implicit class SchemaFloatingPointMeanMutableBuilder[Self <: SchemaFloatingPointMean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: SchemaSplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
