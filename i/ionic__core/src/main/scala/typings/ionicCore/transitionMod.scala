package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.navInterfaceMod.NavOptions
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  @JSImport("@ionic/core/dist/types/utils/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deepReady(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepReady")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def deepReady(el: js.Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepReady")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getIonPageElement(element: HTMLElement): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getIonPageElement")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def lifecycle(el: Unit, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lifecycle")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def lifecycle(el: HTMLElement, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lifecycle")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setPageHidden(el: HTMLElement, hidden: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPageHidden")(el.asInstanceOf[js.Any], hidden.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def transition(opts: TransitionOptions): js.Promise[TransitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("transition")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransitionResult]]
  
  trait TransitionOptions
    extends StObject
       with NavOptions {
    
    var baseEl: js.Any
    
    var enteringEl: HTMLElement
    
    var leavingEl: js.UndefOr[HTMLElement] = js.undefined
    
    var progressCallback: js.UndefOr[js.Function1[/* ani */ js.UndefOr[Animation], Unit]] = js.undefined
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
  
  trait TransitionResult extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var hasCompleted: Boolean
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
