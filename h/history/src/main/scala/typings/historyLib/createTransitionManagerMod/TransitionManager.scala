package typings
package historyLib.createTransitionManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionManager extends js.Object {
  def appendListener(listener: historyLib.historyMod.LocationListener): historyLib.historyMod.UnregisterCallback = js.native
  def confirmTransitionTo(
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState],
    action: historyLib.historyMod.Action,
    getUserConfirmation: js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
      scala.Unit
    ],
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def notifyListeners(
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState],
    action: historyLib.historyMod.Action
  ): scala.Unit = js.native
  def setPrompt(): historyLib.historyMod.UnregisterCallback = js.native
  def setPrompt(nextPrompt: Prompt): historyLib.historyMod.UnregisterCallback = js.native
}

