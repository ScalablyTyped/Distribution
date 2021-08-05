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
  
  inline def apply(cancel: Action, clearAll: Action, save: Action): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clearAll = clearAll.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: Action): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setClearAll(value: Action): Self = StObject.set(x, "clearAll", value.asInstanceOf[js.Any])
    
    inline def setSave(value: Action): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
  }
}
