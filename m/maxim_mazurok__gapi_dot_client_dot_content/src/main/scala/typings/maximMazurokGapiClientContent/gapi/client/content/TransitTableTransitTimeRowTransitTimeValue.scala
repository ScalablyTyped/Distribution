package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitTableTransitTimeRowTransitTimeValue extends StObject {
  
  /** Must be greater than or equal to `minTransitTimeInDays`. */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  
  /** Transit time range (min-max) in business days. 0 means same day delivery, 1 means next day delivery. */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
}
object TransitTableTransitTimeRowTransitTimeValue {
  
  @scala.inline
  def apply(): TransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTableTransitTimeRowTransitTimeValue]
  }
  
  @scala.inline
  implicit class TransitTableTransitTimeRowTransitTimeValueMutableBuilder[Self <: TransitTableTransitTimeRowTransitTimeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTransitTimeInDays(value: Double): Self = StObject.set(x, "maxTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTransitTimeInDaysUndefined: Self = StObject.set(x, "maxTransitTimeInDays", js.undefined)
    
    @scala.inline
    def setMinTransitTimeInDays(value: Double): Self = StObject.set(x, "minTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTransitTimeInDaysUndefined: Self = StObject.set(x, "minTransitTimeInDays", js.undefined)
  }
}
