package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceSolution extends StObject {
  
  /** The user-visible icon for this solution. */
  var iconUri: js.UndefOr[String] = js.undefined
  
  /** The key which can uniquely identify the conference solution for this event. */
  var key: js.UndefOr[ConferenceSolutionKey] = js.undefined
  
  /** The user-visible name of this solution. Not localized. */
  var name: js.UndefOr[String] = js.undefined
}
object ConferenceSolution {
  
  inline def apply(): ConferenceSolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceSolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConferenceSolution] (val x: Self) extends AnyVal {
    
    inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
    
    inline def setKey(value: ConferenceSolutionKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
