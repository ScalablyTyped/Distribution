package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorDefinition extends StObject {
  
  /** The background color associated with this color definition. */
  var background: js.UndefOr[String] = js.native
  
  /** The foreground color that can be used to write on top of a background with 'background' color. */
  var foreground: js.UndefOr[String] = js.native
}
object ColorDefinition {
  
  @scala.inline
  def apply(): ColorDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorDefinition]
  }
  
  @scala.inline
  implicit class ColorDefinitionMutableBuilder[Self <: ColorDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
  }
}
