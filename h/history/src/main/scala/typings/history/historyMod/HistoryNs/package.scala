package typings.history.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HistoryNs {
  import typings.history.historyMod.Action
  import typings.history.historyMod.Location
  import typings.history.historyMod.LocationDescriptorObject
  import typings.history.historyNumbers.`false`

  type Hash = String
  type Href = String
  type LocationDescriptor[S] = typings.history.historyMod.HistoryNs.Path | LocationDescriptorObject[S]
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
