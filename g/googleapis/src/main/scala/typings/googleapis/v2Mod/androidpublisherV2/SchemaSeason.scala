package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeason extends StObject {
  
  /**
    * Inclusive end date of the recurrence period.
    */
  var end: js.UndefOr[SchemaMonthDay] = js.undefined
  
  /**
    * Optionally present list of prorations for the season. Each proration is a
    * one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing
    * information.
    */
  var prorations: js.UndefOr[js.Array[SchemaProrate]] = js.undefined
  
  /**
    * Inclusive start date of the recurrence period.
    */
  var start: js.UndefOr[SchemaMonthDay] = js.undefined
}
object SchemaSeason {
  
  inline def apply(): SchemaSeason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeason]
  }
  
  extension [Self <: SchemaSeason](x: Self) {
    
    inline def setEnd(value: SchemaMonthDay): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setProrations(value: js.Array[SchemaProrate]): Self = StObject.set(x, "prorations", value.asInstanceOf[js.Any])
    
    inline def setProrationsUndefined: Self = StObject.set(x, "prorations", js.undefined)
    
    inline def setProrationsVarargs(value: SchemaProrate*): Self = StObject.set(x, "prorations", js.Array(value :_*))
    
    inline def setStart(value: SchemaMonthDay): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
