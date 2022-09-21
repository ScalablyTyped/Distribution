package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventPeriodRange extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#eventPeriodRange`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when this update period ends, in millis, since 1970 UTC (Unix Epoch).
    */
  var periodEndMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when this update period begins, in millis, since 1970 UTC (Unix Epoch).
    */
  var periodStartMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventPeriodRange {
  
  inline def apply(): SchemaEventPeriodRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventPeriodRange]
  }
  
  extension [Self <: SchemaEventPeriodRange](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPeriodEndMillis(value: String): Self = StObject.set(x, "periodEndMillis", value.asInstanceOf[js.Any])
    
    inline def setPeriodEndMillisNull: Self = StObject.set(x, "periodEndMillis", null)
    
    inline def setPeriodEndMillisUndefined: Self = StObject.set(x, "periodEndMillis", js.undefined)
    
    inline def setPeriodStartMillis(value: String): Self = StObject.set(x, "periodStartMillis", value.asInstanceOf[js.Any])
    
    inline def setPeriodStartMillisNull: Self = StObject.set(x, "periodStartMillis", null)
    
    inline def setPeriodStartMillisUndefined: Self = StObject.set(x, "periodStartMillis", js.undefined)
  }
}
