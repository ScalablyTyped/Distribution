package typings.maximMazurokGapiClientCalendar.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  /**
    * The gadget's display mode. Deprecated. Possible values are:
    * - "icon" - The gadget displays next to the event's title in the calendar view.
    * - "chip" - The gadget displays when the event is clicked.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /** The gadget's height in pixels. The height must be an integer greater than 0. Optional. Deprecated. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The gadget's icon URL. The URL scheme must be HTTPS. Deprecated. */
  var iconLink: js.UndefOr[String] = js.undefined
  
  /** The gadget's URL. The URL scheme must be HTTPS. Deprecated. */
  var link: js.UndefOr[String] = js.undefined
  
  /** Preferences. */
  var preferences: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Display & TopLevel[js.Any]
  ] = js.undefined
  
  /** The gadget's title. Deprecated. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The gadget's type. Deprecated. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The gadget's width in pixels. The width must be an integer greater than 0. Optional. Deprecated. */
  var width: js.UndefOr[Double] = js.undefined
}
object Display {
  
  @scala.inline
  def apply(): Display = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit class DisplayMutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setPreferences(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Display & TopLevel[js.Any]
    ): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferencesUndefined: Self = StObject.set(x, "preferences", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
