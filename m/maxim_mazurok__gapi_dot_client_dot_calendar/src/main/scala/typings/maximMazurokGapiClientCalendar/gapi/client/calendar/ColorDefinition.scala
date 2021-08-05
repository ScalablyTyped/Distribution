package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorDefinition extends StObject {
  
  /** The background color associated with this color definition. */
  var background: js.UndefOr[String] = js.undefined
  
  /** The foreground color that can be used to write on top of a background with 'background' color. */
  var foreground: js.UndefOr[String] = js.undefined
}
object ColorDefinition {
  
  inline def apply(): ColorDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorDefinition]
  }
  
  extension [Self <: ColorDefinition](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
  }
}
