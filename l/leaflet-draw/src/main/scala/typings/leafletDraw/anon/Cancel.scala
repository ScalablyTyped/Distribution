package typings.leafletDraw.anon

import typings.leafletDraw.mod.Localization.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var cancel: Action
  
  var clearAll: Action
  
  var save: Action
}
object Cancel {
  
  @scala.inline
  def apply(cancel: Action, clearAll: Action, save: Action): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clearAll = clearAll.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Action): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAll(value: Action): Self = StObject.set(x, "clearAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: Action): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
  }
}
