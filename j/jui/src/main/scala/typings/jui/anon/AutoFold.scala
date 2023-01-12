package typings.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFold extends StObject {
  
  /**
    * @cfg {Boolean} [autoFold=false]
    * When you click on a node, the node folding
    */
  var autoFold: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[Any] = js.undefined
  
  /**
    * @cfg {Integer} [index=null]
    * Sets an enabled node
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {Boolean} [multipanel=false]
    */
  var multipanel: js.UndefOr[Boolean] = js.undefined
  
  var tpl: js.UndefOr[Any] = js.undefined
}
object AutoFold {
  
  inline def apply(): AutoFold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoFold] (val x: Self) extends AnyVal {
    
    inline def setAutoFold(value: Boolean): Self = StObject.set(x, "autoFold", value.asInstanceOf[js.Any])
    
    inline def setAutoFoldUndefined: Self = StObject.set(x, "autoFold", js.undefined)
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMultipanel(value: Boolean): Self = StObject.set(x, "multipanel", value.asInstanceOf[js.Any])
    
    inline def setMultipanelUndefined: Self = StObject.set(x, "multipanel", js.undefined)
    
    inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
