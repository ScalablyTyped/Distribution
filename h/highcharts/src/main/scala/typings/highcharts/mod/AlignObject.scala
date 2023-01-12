package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignObject extends StObject {
  
  /**
    * Horizontal alignment. Can be one of `left`, `center` and `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * Use the `transform` attribute with translateX and translateY custom
    * attributes to align this elements rather than `x` and `y` attributes.
    */
  var alignByTranslate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertical alignment. Can be one of `top`, `middle` and `bottom`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * Horizontal pixel offset from alignment.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical pixel offset from alignment.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object AlignObject {
  
  inline def apply(): AlignObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignObject] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignByTranslate(value: Boolean): Self = StObject.set(x, "alignByTranslate", value.asInstanceOf[js.Any])
    
    inline def setAlignByTranslateUndefined: Self = StObject.set(x, "alignByTranslate", js.undefined)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
