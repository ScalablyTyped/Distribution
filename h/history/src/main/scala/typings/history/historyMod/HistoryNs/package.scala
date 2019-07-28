package typings.history.historyMod

import typings.history.historyMod.Action
import typings.history.historyMod.Location
import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HistoryNs {
  type Hash = String
  type Href = String
  type LocationDescriptor[S] = typings.history.historyMod.HistoryNs.Path | LocationDescriptorObject[S]
  type LocationKey = String
  type LocationListener = js.Function2[
    /* location */ Location[typings.history.historyMod.LocationState], 
    /* action */ Action, 
    Unit
  ]
  type LocationState = js.Any
  type Path = String
  type Pathname = String
  type Search = String
  type TransitionHook = js.Function2[
    /* location */ Location[typings.history.historyMod.LocationState], 
    /* callback */ js.Function1[/* result */ js.Any, Unit], 
    js.Any
  ]
  type TransitionPromptHook = js.Function2[
    /* location */ Location[typings.history.historyMod.LocationState], 
    /* action */ Action, 
    String | `false` | Unit
  ]
}
