package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorAxisCurrentDateIndicatorLabelsOptions extends StObject {
  
  /**
    * (Gantt) Whether to hide labels that are outside the plot area.
    */
  var clip: js.UndefOr[Boolean] = js.undefined
}
object ColorAxisCurrentDateIndicatorLabelsOptions {
  
  inline def apply(): ColorAxisCurrentDateIndicatorLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisCurrentDateIndicatorLabelsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorAxisCurrentDateIndicatorLabelsOptions] (val x: Self) extends AnyVal {
    
    inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
  }
}
