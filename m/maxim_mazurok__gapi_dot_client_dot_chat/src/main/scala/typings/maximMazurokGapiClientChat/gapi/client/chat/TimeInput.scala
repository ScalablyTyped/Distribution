package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeInput extends StObject {
  
  /** The hour on a 24-hour clock. */
  var hours: js.UndefOr[Double] = js.undefined
  
  /** The number of minutes past the hour. Valid values are 0 to 59. */
  var minutes: js.UndefOr[Double] = js.undefined
}
object TimeInput {
  
  inline def apply(): TimeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeInput]
  }
  
  extension [Self <: TimeInput](x: Self) {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
  }
}
