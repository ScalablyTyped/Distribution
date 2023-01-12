package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgColorPicker
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * The event is fired when a color is selected.
    *
    * Function takes arguments evt and ui.
    * Use ui.color to get a reference to the color object.
    */
  var colorSelected: js.UndefOr[ColorSelectedEvent] = js.undefined
  
  /**
    * Gets/Sets the default colors. Default colors are the ones displayed in the upper table of the color picker.
    *             The array should contain arrays that contain the color values for every next row.
    *
    */
  var colors: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the standard colors. Standard colors are the ones displayed in the color picker bottom,
    *             visually separated from the default colors. The array should contain the color values.
    *
    */
  var standardColors: js.UndefOr[js.Array[Any]] = js.undefined
}
object IgColorPicker {
  
  inline def apply(): IgColorPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgColorPicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgColorPicker] (val x: Self) extends AnyVal {
    
    inline def setColorSelected(value: (/* event */ Event, /* ui */ ColorSelectedEventUIParam) => Unit): Self = StObject.set(x, "colorSelected", js.Any.fromFunction2(value))
    
    inline def setColorSelectedUndefined: Self = StObject.set(x, "colorSelected", js.undefined)
    
    inline def setColors(value: String): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setStandardColors(value: js.Array[Any]): Self = StObject.set(x, "standardColors", value.asInstanceOf[js.Any])
    
    inline def setStandardColorsUndefined: Self = StObject.set(x, "standardColors", js.undefined)
    
    inline def setStandardColorsVarargs(value: Any*): Self = StObject.set(x, "standardColors", js.Array(value*))
  }
}
