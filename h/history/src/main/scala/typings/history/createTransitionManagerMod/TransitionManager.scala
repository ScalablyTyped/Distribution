package typings.history.createTransitionManagerMod

import typings.history.historyMod.Action
import typings.history.historyMod.Location
import typings.history.historyMod.LocationListener
import typings.history.historyMod.UnregisterCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionManager[S] extends js.Object {
  def appendListener(listener: LocationListener[S]): UnregisterCallback = js.native
  def confirmTransitionTo(
    location: Location[S],
    action: Action,
    getUserConfirmation: js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit],
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def notifyListeners(location: Location[S], action: Action): Unit = js.native
  def setPrompt(): UnregisterCallback = js.native
  def setPrompt(nextPrompt: Prompt[S]): UnregisterCallback = js.native
}

