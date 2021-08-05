package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceSolutionKey extends StObject {
  
  /**
    * The conference solution type.
    * If a client encounters an unfamiliar or empty type, it should still be able to display the entry points. However, it should disallow modifications.
    * The possible values are:
    * - "eventHangout" for Hangouts for consumers (http://hangouts.google.com)
    * - "eventNamedHangout" for classic Hangouts for Google Workspace users (http://hangouts.google.com)
    * - "hangoutsMeet" for Google Meet (http://meet.google.com)
    * - "addOn" for 3P conference providers
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ConferenceSolutionKey {
  
  inline def apply(): ConferenceSolutionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceSolutionKey]
  }
  
  extension [Self <: ConferenceSolutionKey](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
