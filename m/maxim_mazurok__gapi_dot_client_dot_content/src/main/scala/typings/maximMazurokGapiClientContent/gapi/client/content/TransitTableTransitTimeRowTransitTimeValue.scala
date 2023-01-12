package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitTableTransitTimeRowTransitTimeValue extends StObject {
  
  /** Must be greater than or equal to `minTransitTimeInDays`. */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.undefined
  
  /** Transit time range (min-max) in business days. 0 means same day delivery, 1 means next day delivery. */
  var minTransitTimeInDays: js.UndefOr[Double] = js.undefined
}
object TransitTableTransitTimeRowTransitTimeValue {
  
  inline def apply(): TransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTableTransitTimeRowTransitTimeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitTableTransitTimeRowTransitTimeValue] (val x: Self) extends AnyVal {
    
    inline def setMaxTransitTimeInDays(value: Double): Self = StObject.set(x, "maxTransitTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMaxTransitTimeInDaysUndefined: Self = StObject.set(x, "maxTransitTimeInDays", js.undefined)
    
    inline def setMinTransitTimeInDays(value: Double): Self = StObject.set(x, "minTransitTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMinTransitTimeInDaysUndefined: Self = StObject.set(x, "minTransitTimeInDays", js.undefined)
  }
}
