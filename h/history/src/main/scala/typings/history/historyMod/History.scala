package typings.history.historyMod

import typings.history.historyBooleans.`false`
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

@JSImport("history", "History")
@js.native
object History extends js.Object {
  type Hash = String
  type Href = String
  type LocationDescriptor[S] = typings.history.historyMod.History.Path | LocationDescriptorObject[S]
  type LocationKey = String
  type LocationListener[S] = js.Function2[/* location */ Location[S], /* action */ Action, Unit]
  type LocationState = js.Any
  type Path = String
  type Pathname = String
  type Search = String
  type TransitionHook[S] = js.Function2[
    /* location */ Location[S], 
    /* callback */ js.Function1[/* result */ js.Any, Unit], 
    js.Any
  ]
  type TransitionPromptHook[S] = js.Function2[/* location */ Location[S], /* action */ Action, String | `false` | Unit]
}

