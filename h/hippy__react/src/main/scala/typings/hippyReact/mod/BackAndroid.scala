package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackAndroid extends StObject {
  
  def addListener(handler: EventListener): BackAndroidRevoker
  
  def exitApp(): Unit
  
  def initEventListener(): Unit
  
  def removeListener(handler: EventListener): Unit
}
object BackAndroid {
  
  inline def apply(
    addListener: EventListener => BackAndroidRevoker,
    exitApp: () => Unit,
    initEventListener: () => Unit,
    removeListener: EventListener => Unit
  ): BackAndroid = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), exitApp = js.Any.fromFunction0(exitApp), initEventListener = js.Any.fromFunction0(initEventListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[BackAndroid]
  }
  
  extension [Self <: BackAndroid](x: Self) {
    
    inline def setAddListener(value: EventListener => BackAndroidRevoker): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setExitApp(value: () => Unit): Self = StObject.set(x, "exitApp", js.Any.fromFunction0(value))
    
    inline def setInitEventListener(value: () => Unit): Self = StObject.set(x, "initEventListener", js.Any.fromFunction0(value))
    
    inline def setRemoveListener(value: EventListener => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
  }
}
