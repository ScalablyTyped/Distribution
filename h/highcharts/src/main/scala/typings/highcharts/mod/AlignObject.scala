package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignObject extends js.Object {
  
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
  implicit class AlignObjectOps[Self <: AlignObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAlignByTranslate(value: Boolean): Self = this.set("alignByTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignByTranslate: Self = this.set("alignByTranslate", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
