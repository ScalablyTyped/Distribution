package typings.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  /**
    * @cfg {Boolean} [close=true]
    * Closes the Auto when clicking on the dropdown list
    */
  var close: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {Integer} [height=0]
    * Determines the vertical size of a dropdown list
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {Boolean} [keydown=false]
    * It is possible to choose anything on the dropdown list with the arrow keys on the keyboard
    */
  var keydown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @cfg {Integer} [left=0]
    * Sets the X coordinate of the dropdown list
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {Array} nodes
    * Sets a dropdown list to data rather than markup
    */
  var nodes: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * @cfg {Integer} [top=0]
    * Sets the Y coordinate of the dropdown list
    */
  var top: js.UndefOr[Double] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {Integer} [width=0]
    * Determines the horizontal size of a dropdown list
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Close {
  
  inline def apply(): Close = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKeydown(value: Boolean): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setNodes(value: js.Array[js.Any]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: js.Any*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
