package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the credits
    * text.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The URL for the credits label.
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Credits for map source to be concatenated with conventional
    * credit text. By default this is a format string that collects copyright
    * information from the map if available.
    */
  var mapText: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Detailed credits for map source to be displayed on hover of
    * credits text. By default this is a format string that collects copyright
    * information from the map if available.
    */
  var mapTextFull: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Position configuration for the
    * credits label.
    */
  var position: js.UndefOr[AlignObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the credits
    * label.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the credits label.
    */
  var text: js.UndefOr[String] = js.undefined
}
object CreditsOptions {
  
  @scala.inline
  def apply(): CreditsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditsOptions]
  }
  
  @scala.inline
  implicit class CreditsOptionsMutableBuilder[Self <: CreditsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setMapText(value: String): Self = StObject.set(x, "mapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTextFull(value: String): Self = StObject.set(x, "mapTextFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTextFullUndefined: Self = StObject.set(x, "mapTextFull", js.undefined)
    
    @scala.inline
    def setMapTextUndefined: Self = StObject.set(x, "mapText", js.undefined)
    
    @scala.inline
    def setPosition(value: AlignObject): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
