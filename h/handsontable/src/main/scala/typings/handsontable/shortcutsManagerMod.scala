package typings.handsontable

import typings.handsontable.shortcutsContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsManagerMod {
  
  trait ShortcutManager extends StObject {
    
    def addContext(contextName: String): Context
    
    def destroy(): Unit
    
    def getActiveContextName(): String
    
    def getContext(contextName: String): js.UndefOr[Context]
    
    def isCtrlPressed(): Boolean
    
    def setActiveContextName(contextName: String): Unit
  }
  object ShortcutManager {
    
    inline def apply(
      addContext: String => Context,
      destroy: () => Unit,
      getActiveContextName: () => String,
      getContext: String => js.UndefOr[Context],
      isCtrlPressed: () => Boolean,
      setActiveContextName: String => Unit
    ): ShortcutManager = {
      val __obj = js.Dynamic.literal(addContext = js.Any.fromFunction1(addContext), destroy = js.Any.fromFunction0(destroy), getActiveContextName = js.Any.fromFunction0(getActiveContextName), getContext = js.Any.fromFunction1(getContext), isCtrlPressed = js.Any.fromFunction0(isCtrlPressed), setActiveContextName = js.Any.fromFunction1(setActiveContextName))
      __obj.asInstanceOf[ShortcutManager]
    }
    
    extension [Self <: ShortcutManager](x: Self) {
      
      inline def setAddContext(value: String => Context): Self = StObject.set(x, "addContext", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetActiveContextName(value: () => String): Self = StObject.set(x, "getActiveContextName", js.Any.fromFunction0(value))
      
      inline def setGetContext(value: String => js.UndefOr[Context]): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      inline def setIsCtrlPressed(value: () => Boolean): Self = StObject.set(x, "isCtrlPressed", js.Any.fromFunction0(value))
      
      inline def setSetActiveContextName(value: String => Unit): Self = StObject.set(x, "setActiveContextName", js.Any.fromFunction1(value))
    }
  }
}
