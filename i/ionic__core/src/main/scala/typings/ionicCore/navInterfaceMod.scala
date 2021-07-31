package typings.ionicCore

import org.scalablytyped.runtime.Instantiable1
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navInterfaceMod {
  
  @JSImport("@ionic/core/dist/types/components/nav/nav-interface", "ViewController")
  @js.native
  class ViewController protected ()
    extends typings.ionicCore.viewControllerMod.ViewController {
    def this(component: js.Any) = this()
    def this(component: js.Any, params: ComponentProps[Null]) = this()
  }
  
  type NavComponent = ComponentRef | typings.ionicCore.viewControllerMod.ViewController
  
  trait NavComponentWithProps[T] extends StObject {
    
    var component: NavComponent
    
    var componentProps: js.UndefOr[ComponentProps[T] | Null] = js.undefined
  }
  object NavComponentWithProps {
    
    @scala.inline
    def apply[T](): NavComponentWithProps[T] = {
      val __obj = js.Dynamic.literal(component = null)
      __obj.asInstanceOf[NavComponentWithProps[T]]
    }
    
    @scala.inline
    implicit class NavComponentWithPropsMutableBuilder[Self <: NavComponentWithProps[?], T] (val x: Self & NavComponentWithProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: NavComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNull: Self = StObject.set(x, "component", null)
      
      @scala.inline
      def setComponentProps(value: ComponentProps[T]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentPropsNull: Self = StObject.set(x, "componentProps", null)
      
      @scala.inline
      def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.back
    - typings.ionicCore.ionicCoreStrings.forward
  */
  trait NavDirection extends StObject
  object NavDirection {
    
    @scala.inline
    def back: typings.ionicCore.ionicCoreStrings.back = "back".asInstanceOf[typings.ionicCore.ionicCoreStrings.back]
    
    @scala.inline
    def forward: typings.ionicCore.ionicCoreStrings.forward = "forward".asInstanceOf[typings.ionicCore.ionicCoreStrings.forward]
  }
  
  trait NavOptions
    extends StObject
       with RouterOutletOptions {
    
    var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
    
    var updateURL: js.UndefOr[Boolean] = js.undefined
    
    var viewIsReady: js.UndefOr[js.Function1[/* enteringEl */ HTMLElement, js.Promise[js.Any]]] = js.undefined
  }
  object NavOptions {
    
    @scala.inline
    def apply(): NavOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavOptions]
    }
    
    @scala.inline
    implicit class NavOptionsMutableBuilder[Self <: NavOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelegate(value: FrameworkDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      @scala.inline
      def setUpdateURL(value: Boolean): Self = StObject.set(x, "updateURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateURLUndefined: Self = StObject.set(x, "updateURL", js.undefined)
      
      @scala.inline
      def setViewIsReady(value: /* enteringEl */ HTMLElement => js.Promise[js.Any]): Self = StObject.set(x, "viewIsReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setViewIsReadyUndefined: Self = StObject.set(x, "viewIsReady", js.undefined)
    }
  }
  
  trait NavResult extends StObject {
    
    var direction: js.UndefOr[NavDirection] = js.undefined
    
    var enteringView: js.UndefOr[typings.ionicCore.viewControllerMod.ViewController] = js.undefined
    
    var hasCompleted: Boolean
    
    var leavingView: js.UndefOr[typings.ionicCore.viewControllerMod.ViewController] = js.undefined
    
    var requiresTransition: Boolean
  }
  object NavResult {
    
    @scala.inline
    def apply(hasCompleted: Boolean, requiresTransition: Boolean): NavResult = {
      val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any], requiresTransition = requiresTransition.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavResult]
    }
    
    @scala.inline
    implicit class NavResultMutableBuilder[Self <: NavResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: NavDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEnteringView(value: typings.ionicCore.viewControllerMod.ViewController): Self = StObject.set(x, "enteringView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnteringViewUndefined: Self = StObject.set(x, "enteringView", js.undefined)
      
      @scala.inline
      def setHasCompleted(value: Boolean): Self = StObject.set(x, "hasCompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavingView(value: typings.ionicCore.viewControllerMod.ViewController): Self = StObject.set(x, "leavingView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavingViewUndefined: Self = StObject.set(x, "leavingView", js.undefined)
      
      @scala.inline
      def setRequiresTransition(value: Boolean): Self = StObject.set(x, "requiresTransition", value.asInstanceOf[js.Any])
    }
  }
  
  type Page = Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  trait RouterOutletOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animationBuilder: js.UndefOr[AnimationBuilder] = js.undefined
    
    var deepWait: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[NavDirection] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var progressAnimation: js.UndefOr[Boolean] = js.undefined
    
    var showGoBack: js.UndefOr[Boolean] = js.undefined
    
    var skipIfBusy: js.UndefOr[Boolean] = js.undefined
  }
  object RouterOutletOptions {
    
    @scala.inline
    def apply(): RouterOutletOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOutletOptions]
    }
    
    @scala.inline
    implicit class RouterOutletOptionsMutableBuilder[Self <: RouterOutletOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAnimationBuilder(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "animationBuilder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationBuilderUndefined: Self = StObject.set(x, "animationBuilder", js.undefined)
      
      @scala.inline
      def setDeepWait(value: Boolean): Self = StObject.set(x, "deepWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepWaitUndefined: Self = StObject.set(x, "deepWait", js.undefined)
      
      @scala.inline
      def setDirection(value: NavDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setProgressAnimation(value: Boolean): Self = StObject.set(x, "progressAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressAnimationUndefined: Self = StObject.set(x, "progressAnimation", js.undefined)
      
      @scala.inline
      def setShowGoBack(value: Boolean): Self = StObject.set(x, "showGoBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGoBackUndefined: Self = StObject.set(x, "showGoBack", js.undefined)
      
      @scala.inline
      def setSkipIfBusy(value: Boolean): Self = StObject.set(x, "skipIfBusy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBusyUndefined: Self = StObject.set(x, "skipIfBusy", js.undefined)
    }
  }
  
  trait SwipeGestureHandler extends StObject {
    
    def canStart(): Boolean
    
    def onEnd(shouldComplete: Boolean): Unit
    
    def onStart(): Unit
  }
  object SwipeGestureHandler {
    
    @scala.inline
    def apply(canStart: () => Boolean, onEnd: Boolean => Unit, onStart: () => Unit): SwipeGestureHandler = {
      val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), onEnd = js.Any.fromFunction1(onEnd), onStart = js.Any.fromFunction0(onStart))
      __obj.asInstanceOf[SwipeGestureHandler]
    }
    
    @scala.inline
    implicit class SwipeGestureHandlerMutableBuilder[Self <: SwipeGestureHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanStart(value: () => Boolean): Self = StObject.set(x, "canStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnd(value: Boolean => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    }
  }
  
  type TransitionDoneFn = js.Function5[
    /* hasCompleted */ Boolean, 
    /* requiresTransition */ Boolean, 
    /* enteringView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], 
    /* leavingView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], 
    /* direction */ js.UndefOr[String], 
    Unit
  ]
  
  trait TransitionInstruction extends StObject {
    
    var done: js.UndefOr[TransitionDoneFn] = js.undefined
    
    var enteringRequiresTransition: js.UndefOr[Boolean] = js.undefined
    
    var insertStart: js.UndefOr[Double] = js.undefined
    
    var insertViews: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var leavingRequiresTransition: js.UndefOr[Boolean] = js.undefined
    
    var opts: js.UndefOr[NavOptions | Null] = js.undefined
    
    var reject: js.UndefOr[js.Function1[/* rejectReason */ String, Unit]] = js.undefined
    
    var removeCount: js.UndefOr[Double] = js.undefined
    
    var removeStart: js.UndefOr[Double] = js.undefined
    
    var removeView: js.UndefOr[typings.ionicCore.viewControllerMod.ViewController] = js.undefined
    
    var resolve: js.UndefOr[js.Function1[/* hasCompleted */ Boolean, Unit]] = js.undefined
  }
  object TransitionInstruction {
    
    @scala.inline
    def apply(): TransitionInstruction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionInstruction]
    }
    
    @scala.inline
    implicit class TransitionInstructionMutableBuilder[Self <: TransitionInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(
        value: (/* hasCompleted */ Boolean, /* requiresTransition */ Boolean, /* enteringView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], /* leavingView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], /* direction */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "done", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setEnteringRequiresTransition(value: Boolean): Self = StObject.set(x, "enteringRequiresTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnteringRequiresTransitionUndefined: Self = StObject.set(x, "enteringRequiresTransition", js.undefined)
      
      @scala.inline
      def setInsertStart(value: Double): Self = StObject.set(x, "insertStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertStartUndefined: Self = StObject.set(x, "insertStart", js.undefined)
      
      @scala.inline
      def setInsertViews(value: js.Array[js.Any]): Self = StObject.set(x, "insertViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertViewsUndefined: Self = StObject.set(x, "insertViews", js.undefined)
      
      @scala.inline
      def setInsertViewsVarargs(value: js.Any*): Self = StObject.set(x, "insertViews", js.Array(value :_*))
      
      @scala.inline
      def setLeavingRequiresTransition(value: Boolean): Self = StObject.set(x, "leavingRequiresTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavingRequiresTransitionUndefined: Self = StObject.set(x, "leavingRequiresTransition", js.undefined)
      
      @scala.inline
      def setOpts(value: NavOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptsNull: Self = StObject.set(x, "opts", null)
      
      @scala.inline
      def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      @scala.inline
      def setReject(value: /* rejectReason */ String => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      @scala.inline
      def setRemoveCount(value: Double): Self = StObject.set(x, "removeCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCountUndefined: Self = StObject.set(x, "removeCount", js.undefined)
      
      @scala.inline
      def setRemoveStart(value: Double): Self = StObject.set(x, "removeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveStartUndefined: Self = StObject.set(x, "removeStart", js.undefined)
      
      @scala.inline
      def setRemoveView(value: typings.ionicCore.viewControllerMod.ViewController): Self = StObject.set(x, "removeView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveViewUndefined: Self = StObject.set(x, "removeView", js.undefined)
      
      @scala.inline
      def setResolve(value: /* hasCompleted */ Boolean => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  type TransitionRejectFn = js.Function2[/* rejectReason */ js.Any, /* transition */ js.UndefOr[Animation], Unit]
  
  type TransitionResolveFn = js.Function5[
    /* hasCompleted */ Boolean, 
    /* requiresTransition */ Boolean, 
    /* enteringName */ js.UndefOr[String], 
    /* leavingName */ js.UndefOr[String], 
    /* direction */ js.UndefOr[String], 
    Unit
  ]
}
