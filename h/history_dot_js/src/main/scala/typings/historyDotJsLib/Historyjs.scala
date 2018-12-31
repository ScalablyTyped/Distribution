package typings
package historyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Since History is defined in lib.d.ts as well
// the name for our interfaces was chosen to be Historyjs
// However at runtime you would need to do
// https://github.com/DefinitelyTyped/DefinitelyTyped/issues/277
// var Historyjs: Historyjs = <any>History;
@js.native
trait Historyjs extends js.Object {
  var Adapter: HistoryAdapter = js.native
  var emulated: Anon_HashChange = js.native
  var enabled: scala.Boolean = js.native
  var options: HistoryOptions = js.native
  def back(): scala.Unit = js.native
  def clearAllIntervals(): scala.Unit = js.native
  def clearQueue(): Historyjs = js.native
  def debug(messages: js.Any*): scala.Unit = js.native
  def forward(): scala.Unit = js.native
  def getCurrentIndex(): scala.Double = js.native
  def getHash(): java.lang.String = js.native
  def getRootUrl(): java.lang.String = js.native
  def getState(): HistoryState = js.native
  def getState(friendly: scala.Boolean): HistoryState = js.native
  def getState(friendly: scala.Boolean, create: scala.Boolean): HistoryState = js.native
  def getStateById(id: java.lang.String): HistoryState = js.native
  def getStateByIndex(index: scala.Double): HistoryState = js.native
  def getStateId(passedState: HistoryState): java.lang.String = js.native
  def go(x: stdLib.Number): scala.Unit = js.native
  def log(messages: js.Any*): scala.Unit = js.native
  def pushState(data: js.Any, title: java.lang.String, url: java.lang.String): scala.Boolean = js.native
  def pushState(data: js.Any, title: java.lang.String, url: java.lang.String, queue: scala.Boolean): scala.Boolean = js.native
  def replaceState(data: js.Any, title: java.lang.String, url: java.lang.String): scala.Boolean = js.native
  def replaceState(data: js.Any, title: java.lang.String, url: java.lang.String, queue: scala.Boolean): scala.Boolean = js.native
  /**
    * History.setTitle(title)
    * Applies the title to the document
    * @param {HistoryState} newState
    * @return {Boolean}
    */
  def setTitle(newState: HistoryState): scala.Boolean = js.native
}

