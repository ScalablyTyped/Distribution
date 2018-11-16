package typings
package historyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HistoryAdapter extends js.Object {
  def bind(element: js.Any, event: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  def onDomLoad(callback: js.Function0[scala.Unit]): scala.Unit
  def trigger(element: js.Any, event: java.lang.String): scala.Unit
}

