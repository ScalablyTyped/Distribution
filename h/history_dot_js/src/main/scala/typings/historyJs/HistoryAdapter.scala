package typings.historyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryAdapter extends js.Object {
  def bind(element: js.Any, event: String, callback: js.Function0[Unit]): Unit
  def onDomLoad(callback: js.Function0[Unit]): Unit
  def trigger(element: js.Any, event: String): Unit
}

object HistoryAdapter {
  @scala.inline
  def apply(
    bind: (js.Any, String, js.Function0[Unit]) => Unit,
    onDomLoad: js.Function0[Unit] => Unit,
    trigger: (js.Any, String) => Unit
  ): HistoryAdapter = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), onDomLoad = js.Any.fromFunction1(onDomLoad), trigger = js.Any.fromFunction2(trigger))
  
    __obj.asInstanceOf[HistoryAdapter]
  }
}

