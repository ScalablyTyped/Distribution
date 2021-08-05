package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for aggregate stats.
  */
trait SchemaAggregateStats extends StObject {
  
  /**
    * The number of messages sent between a pair of peers.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#aggregateStats.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum amount.
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum amount.
    */
  var min: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of bytes sent for messages between a pair of peers.
    */
  var sum: js.UndefOr[String] = js.undefined
}
object SchemaAggregateStats {
  
  inline def apply(): SchemaAggregateStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateStats]
  }
  
  extension [Self <: SchemaAggregateStats](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setSum(value: String): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
