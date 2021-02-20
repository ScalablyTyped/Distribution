package typings.jui.anon

import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarSize extends StObject {
  
  /**
    * @cfg {Number} [barSize=4]
    * set splitter's bar size
    */
  var barSize: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {Object} [barStyle={}]
    * set custom splitter bar style
    */
  var barStyle: js.UndefOr[js.Object] = js.native
  
  /**
    * @cfg {"vertical"/"horizontal"} [direction='vertical']
    * set bar's direction
    */
  var direction: js.UndefOr[vertical | horizontal] = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Boolean} [fixed=false]
    *
    * if fixed is true, panels can not resize.
    *
    */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {String} [hideClass='hide']
    * set splitter's hide class for design
    */
  var hideClass: js.UndefOr[String] = js.native
  
  /**
    * @cfg {String/Number} [initSize='50%']
    * set first panel's default width or height
    */
  var initSize: js.UndefOr[String | Double] = js.native
  
  /**
    * @cfg {String} [items=[]]
    *
    * set items  to placed in vertical or horizontal
    *
    * support max two times
    *
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @cfg {Number/Array} [minSize=30]
    * set panel's minimum width or height
    *
    * if minSize is number , minSize is conver to array
    *
    * minSize[0] is first panel's minimum size
    * minSize[1] is second panel's minimum size
    *
    */
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * @cfg {String} [splitterClass='ui-splitter']
    * set splitter's class for design
    */
  var splitterClass: js.UndefOr[String] = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
}
object BarSize {
  
  @scala.inline
  def apply(): BarSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarSize]
  }
  
  @scala.inline
  implicit class BarSizeMutableBuilder[Self <: BarSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarSize(value: Double): Self = StObject.set(x, "barSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarSizeUndefined: Self = StObject.set(x, "barSize", js.undefined)
    
    @scala.inline
    def setBarStyle(value: js.Object): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setHideClass(value: String): Self = StObject.set(x, "hideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideClassUndefined: Self = StObject.set(x, "hideClass", js.undefined)
    
    @scala.inline
    def setInitSize(value: String | Double): Self = StObject.set(x, "initSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSizeUndefined: Self = StObject.set(x, "initSize", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMinSize(value: Double | js.Array[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setMinSizeVarargs(value: Double*): Self = StObject.set(x, "minSize", js.Array(value :_*))
    
    @scala.inline
    def setSplitterClass(value: String): Self = StObject.set(x, "splitterClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterClassUndefined: Self = StObject.set(x, "splitterClass", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
