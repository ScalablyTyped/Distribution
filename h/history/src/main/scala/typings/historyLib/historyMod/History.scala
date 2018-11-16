package typings
package historyLib.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History[HistoryLocationState] extends js.Object {
  var action: Action = js.native
  var length: scala.Double = js.native
  var location: Location[HistoryLocationState] = js.native
  def block(): UnregisterCallback = js.native
  def block(prompt: TransitionPromptHook): UnregisterCallback = js.native
  def block(prompt: java.lang.String): UnregisterCallback = js.native
  def block(prompt: scala.Boolean): UnregisterCallback = js.native
  def createHref(location: LocationDescriptorObject[HistoryLocationState]): Href = js.native
  def go(n: scala.Double): scala.Unit = js.native
  def goBack(): scala.Unit = js.native
  def goForward(): scala.Unit = js.native
  def listen(listener: LocationListener): UnregisterCallback = js.native
  def push(location: LocationDescriptorObject[HistoryLocationState]): scala.Unit = js.native
  def push(path: Path): scala.Unit = js.native
  def push(path: Path, state: HistoryLocationState): scala.Unit = js.native
  def replace(location: LocationDescriptorObject[HistoryLocationState]): scala.Unit = js.native
  def replace(path: Path): scala.Unit = js.native
  def replace(path: Path, state: HistoryLocationState): scala.Unit = js.native
}

