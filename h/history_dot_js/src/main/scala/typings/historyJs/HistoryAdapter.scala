package typings.historyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryAdapter extends StObject {
  
  def bind(element: js.Any, event: String, callback: js.Function0[Unit]): Unit
  
  def onDomLoad(callback: js.Function0[Unit]): Unit
  
  def trigger(element: js.Any, event: String): Unit
}
object HistoryAdapter {
  
  inline def apply(
    bind: (js.Any, String, js.Function0[Unit]) => Unit,
    onDomLoad: js.Function0[Unit] => Unit,
    trigger: (js.Any, String) => Unit
  ): HistoryAdapter = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), onDomLoad = js.Any.fromFunction1(onDomLoad), trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[HistoryAdapter]
  }
  
  extension [Self <: HistoryAdapter](x: Self) {
    
    inline def setBind(value: (js.Any, String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction3(value))
    
    inline def setOnDomLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onDomLoad", js.Any.fromFunction1(value))
    
    inline def setTrigger(value: (js.Any, String) => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
  }
}
