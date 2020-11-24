package typings.jui.anon

import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarSize extends js.Object {
  
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
  implicit class BarSizeOps[Self <: BarSize] (val x: Self) extends AnyVal {
    
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
    def setBarSize(value: Double): Self = this.set("barSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarSize: Self = this.set("barSize", js.undefined)
    
    @scala.inline
    def setBarStyle(value: js.Object): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setHideClass(value: String): Self = this.set("hideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideClass: Self = this.set("hideClass", js.undefined)
    
    @scala.inline
    def setInitSize(value: String | Double): Self = this.set("initSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitSize: Self = this.set("initSize", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMinSizeVarargs(value: Double*): Self = this.set("minSize", js.Array(value :_*))
    
    @scala.inline
    def setMinSize(value: Double | js.Array[Double]): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setSplitterClass(value: String): Self = this.set("splitterClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitterClass: Self = this.set("splitterClass", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
  }
}
