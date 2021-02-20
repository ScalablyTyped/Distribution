package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignObject extends StObject {
  
  /**
    * Horizontal alignment. Can be one of `left`, `center` and `right`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  
  /**
    * Use the `transform` attribute with translateX and translateY custom
    * attributes to align this elements rather than `x` and `y` attributes.
    */
  var alignByTranslate: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertical alignment. Can be one of `top`, `middle` and `bottom`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  
  /**
    * Horizontal pixel offset from alignment.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Vertical pixel offset from alignment.
    */
  var y: js.UndefOr[Double] = js.native
}
object AlignObject {
  
  @scala.inline
  def apply(): AlignObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignObject]
  }
  
  @scala.inline
  implicit class AlignObjectMutableBuilder[Self <: AlignObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignByTranslate(value: Boolean): Self = StObject.set(x, "alignByTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignByTranslateUndefined: Self = StObject.set(x, "alignByTranslate", js.undefined)
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
