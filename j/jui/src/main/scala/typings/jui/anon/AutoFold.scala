package typings.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFold extends StObject {
  
  /**
    * @cfg {Boolean} [autoFold=false]
    * When you click on a node, the node folding
    */
  var autoFold: js.UndefOr[Boolean] = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Integer} [index=null]
    * Sets an enabled node
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {Boolean} [multipanel=false]
    */
  var multipanel: js.UndefOr[Boolean] = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
}
object AutoFold {
  
  @scala.inline
  def apply(): AutoFold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFold]
  }
  
  @scala.inline
  implicit class AutoFoldMutableBuilder[Self <: AutoFold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFold(value: Boolean): Self = StObject.set(x, "autoFold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFoldUndefined: Self = StObject.set(x, "autoFold", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setMultipanel(value: Boolean): Self = StObject.set(x, "multipanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipanelUndefined: Self = StObject.set(x, "multipanel", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
