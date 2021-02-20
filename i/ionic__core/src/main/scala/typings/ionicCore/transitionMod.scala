package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.navInterfaceMod.NavOptions
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  @JSImport("@ionic/core/dist/types/utils/transition", "deepReady")
  @js.native
  def deepReady(): js.Promise[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/transition", "deepReady")
  @js.native
  def deepReady(el: js.Any): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/transition", "getIonPageElement")
  @js.native
  def getIonPageElement(element: HTMLElement): Element = js.native
  
  @JSImport("@ionic/core/dist/types/utils/transition", "lifecycle")
  @js.native
  def lifecycle(el: js.UndefOr[scala.Nothing], eventName: String): Unit = js.native
  @JSImport("@ionic/core/dist/types/utils/transition", "lifecycle")
  @js.native
  def lifecycle(el: HTMLElement, eventName: String): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/transition", "setPageHidden")
  @js.native
  def setPageHidden(el: HTMLElement, hidden: Boolean): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/transition", "transition")
  @js.native
  def transition(opts: TransitionOptions): js.Promise[TransitionResult] = js.native
  
  @js.native
  trait TransitionOptions extends NavOptions {
    
    var baseEl: js.Any = js.native
    
    var enteringEl: HTMLElement = js.native
    
    var leavingEl: js.UndefOr[HTMLElement] = js.native
    
    var progressCallback: js.UndefOr[js.Function1[/* ani */ js.UndefOr[Animation], Unit]] = js.native
  }
  object TransitionOptions {
    
    @scala.inline
    def apply(baseEl: js.Any, enteringEl: HTMLElement): TransitionOptions = {
      val __obj = js.Dynamic.literal(baseEl = baseEl.asInstanceOf[js.Any], enteringEl = enteringEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionOptions]
    }
    
    @scala.inline
    implicit class TransitionOptionsMutableBuilder[Self <: TransitionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseEl(value: js.Any): Self = StObject.set(x, "baseEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnteringEl(value: HTMLElement): Self = StObject.set(x, "enteringEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavingEl(value: HTMLElement): Self = StObject.set(x, "leavingEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavingElUndefined: Self = StObject.set(x, "leavingEl", js.undefined)
      
      @scala.inline
      def setProgressCallback(value: /* ani */ js.UndefOr[Animation] => Unit): Self = StObject.set(x, "progressCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressCallbackUndefined: Self = StObject.set(x, "progressCallback", js.undefined)
    }
  }
  
  @js.native
  trait TransitionResult extends StObject {
    
    var animation: js.UndefOr[Animation] = js.native
    
    var hasCompleted: Boolean = js.native
  }
  object TransitionResult {
    
    @scala.inline
    def apply(hasCompleted: Boolean): TransitionResult = {
      val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionResult]
    }
    
    @scala.inline
    implicit class TransitionResultMutableBuilder[Self <: TransitionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setHasCompleted(value: Boolean): Self = StObject.set(x, "hasCompleted", value.asInstanceOf[js.Any])
    }
  }
}
