package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for aggregate stats.
  */
@js.native
trait SchemaAggregateStats extends StObject {
  
  /**
    * The number of messages sent between a pair of peers.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#aggregateStats.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The maximum amount.
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * The minimum amount.
    */
  var min: js.UndefOr[String] = js.native
  
  /**
    * The total number of bytes sent for messages between a pair of peers.
    */
  var sum: js.UndefOr[String] = js.native
}
object SchemaAggregateStats {
  
  @scala.inline
  def apply(): SchemaAggregateStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateStats]
  }
  
  @scala.inline
  implicit class SchemaAggregateStatsMutableBuilder[Self <: SchemaAggregateStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setSum(value: String): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
