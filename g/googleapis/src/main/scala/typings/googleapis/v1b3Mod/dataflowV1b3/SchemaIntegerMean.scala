package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of an integer mean metric contribution.
  */
@js.native
trait SchemaIntegerMean extends StObject {
  
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.native
  
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[SchemaSplitInt64] = js.native
}
object SchemaIntegerMean {
  
  @scala.inline
  def apply(): SchemaIntegerMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerMean]
  }
  
  @scala.inline
  implicit class SchemaIntegerMeanMutableBuilder[Self <: SchemaIntegerMean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: SchemaSplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSum(value: SchemaSplitInt64): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
