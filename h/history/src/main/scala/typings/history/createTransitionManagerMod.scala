package typings.history

import typings.history.mod.Action
import typings.history.mod.Location
import typings.history.mod.LocationListener
import typings.history.mod.UnregisterCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTransitionManagerMod {
  
  @JSImport("history/createTransitionManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](): TransitionManager[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TransitionManager[S]]
  
  type Prompt[S] = PromptFunction[S] | Boolean
  
  type PromptFunction[S] = js.Function2[/* location */ Location[S], /* action */ Action, js.Any]
  
  @js.native
  trait TransitionManager[S] extends StObject {
    
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
}
