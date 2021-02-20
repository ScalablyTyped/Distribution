package typings.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bottom extends StObject {
  
  /**
    * @cfg {String/Integer} [bottom="auto"]
    * Determines the Y coordinate based on the bottom side of a window
    */
  var bottom: js.UndefOr[String | Double] = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Integer} [height=300]
    * Determines the height of a window
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {String/Integer} [left="auto"]
    * Determines the X coordinate of a window
    */
  var left: js.UndefOr[String | Double] = js.native
  
  /**
    * @cfg {Boolean} [modal=false]
    * Applies a modal UI to a window
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Integer} [modalIndex=0]
    * Determines the z-index property of a modal UI
    */
  var modalIndex: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {Boolean} [move=true]
    * It is possible to move a window
    */
  var move: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Boolean} [resize=true]
    * It is possible to resize a window
    */
  var resize: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {String/Integer} [right="auto"]
    * Determines the X coordinate based on the right side of a window
    */
  var right: js.UndefOr[String | Double] = js.native
  
  /**
    * @cfg {String/Integer} [top="auto"]
    * Determines the Y coordinate of a window
    */
  var top: js.UndefOr[String | Double] = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Integer} [width=400]
    * Determines the horizontal size of a window
    */
  var width: js.UndefOr[Double] = js.native
}
object Bottom {
  
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: String | Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: String | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalIndex(value: Double): Self = StObject.set(x, "modalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalIndexUndefined: Self = StObject.set(x, "modalIndex", js.undefined)
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setRight(value: String | Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
