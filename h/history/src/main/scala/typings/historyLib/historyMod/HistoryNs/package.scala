package typings
package historyLib.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HistoryNs {
  type Hash = java.lang.String
  type Href = java.lang.String
  type LocationDescriptor[S] = Path | historyLib.historyMod.LocationDescriptorObject[S]
  type LocationKey = java.lang.String
  type LocationListener = js.Function2[
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    /* action */ historyLib.historyMod.Action, 
    scala.Unit
  ]
  type LocationState = js.Any
  type Path = java.lang.String
  type Pathname = java.lang.String
  type Search = java.lang.String
  type TransitionHook = js.Function2[
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    /* callback */ js.Function1[/* result */ js.Any, scala.Unit], 
    js.Any
  ]
  type TransitionPromptHook = js.Function2[
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    /* action */ historyLib.historyMod.Action, 
    java.lang.String | historyLib.historyLibNumbers.`false` | scala.Unit
  ]
}
