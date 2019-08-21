package typings.history.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History[HistoryLocationState] extends js.Object {
  var action: Action = js.native
  var length: Double = js.native
  var location: Location[HistoryLocationState] = js.native
  def block(): UnregisterCallback = js.native
  def block(prompt: String): UnregisterCallback = js.native
  def block(prompt: Boolean): UnregisterCallback = js.native
  def block(prompt: TransitionPromptHook[HistoryLocationState]): UnregisterCallback = js.native
  def createHref(location: LocationDescriptorObject[HistoryLocationState]): Href = js.native
  def go(n: Double): Unit = js.native
  def goBack(): Unit = js.native
  def goForward(): Unit = js.native
  def listen(listener: LocationListener[HistoryLocationState]): UnregisterCallback = js.native
  def push(location: LocationDescriptorObject[HistoryLocationState]): Unit = js.native
  def push(path: Path): Unit = js.native
  def push(path: Path, state: HistoryLocationState): Unit = js.native
  def replace(location: LocationDescriptorObject[HistoryLocationState]): Unit = js.native
  def replace(path: Path): Unit = js.native
  def replace(path: Path, state: HistoryLocationState): Unit = js.native
}

