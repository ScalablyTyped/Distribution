package typings.history.mod

import typings.history.historyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def push(location: LocationDescriptor[HistoryLocationState]): Unit = js.native
  def push(path: Path): Unit = js.native
  def push(path: Path, state: HistoryLocationState): Unit = js.native
  def replace(location: LocationDescriptor[HistoryLocationState]): Unit = js.native
  def replace(path: Path): Unit = js.native
  def replace(path: Path, state: HistoryLocationState): Unit = js.native
}

@JSImport("history", "History")
@js.native
object History extends js.Object {
  type Hash = String
  type Href = String
  type LocationDescriptor[S] = typings.history.mod.History.Path | LocationDescriptorObject[S]
  type LocationKey = String
  type LocationListener[S] = js.Function2[/* location */ Location[S], /* action */ Action, Unit]
  type LocationState = PoorMansUnknown
  type Path = String
  type Pathname = String
  // The value type here is a "poor man's `unknown`". When these types support TypeScript
  // 3.0+, we can replace this with `unknown`.
  type PoorMansUnknown = js.UndefOr[js.Object | Null]
  type Search = String
  type TransitionHook[S] = js.Function2[
    /* location */ Location[S], 
    /* callback */ js.Function1[/* result */ js.Any, Unit], 
    js.Any
  ]
  type TransitionPromptHook[S] = js.Function2[/* location */ Location[S], /* action */ Action, String | `false` | Unit]
}

