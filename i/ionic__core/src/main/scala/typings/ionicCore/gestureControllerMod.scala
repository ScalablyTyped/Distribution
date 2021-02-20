package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureControllerMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/gesture-controller", "GESTURE_CONTROLLER")
  @js.native
  val GESTURE_CONTROLLER: GestureController = js.native
  
  @js.native
  trait BlockerConfig extends StObject {
    
    var disable: js.UndefOr[js.Array[String]] = js.native
    
    var disableScroll: js.UndefOr[Boolean] = js.native
  }
  object BlockerConfig {
    
    @scala.inline
    def apply(): BlockerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockerConfig]
    }
    
    @scala.inline
    implicit class BlockerConfigMutableBuilder[Self <: BlockerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: js.Array[String]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDisableVarargs(value: String*): Self = StObject.set(x, "disable", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BlockerDelegate extends StObject {
    
    def block(): Unit = js.native
    
    var ctrl: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    var disable: js.Any = js.native
    
    var disableScroll: js.Any = js.native
    
    var id: js.Any = js.native
    
    def unblock(): Unit = js.native
  }
  object BlockerDelegate {
    
    @scala.inline
    def apply(
      block: () => Unit,
      ctrl: js.Any,
      destroy: () => Unit,
      disable: js.Any,
      disableScroll: js.Any,
      id: js.Any,
      unblock: () => Unit
    ): BlockerDelegate = {
      val __obj = js.Dynamic.literal(block = js.Any.fromFunction0(block), ctrl = ctrl.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disable = disable.asInstanceOf[js.Any], disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unblock = js.Any.fromFunction0(unblock))
      __obj.asInstanceOf[BlockerDelegate]
    }
    
    @scala.inline
    implicit class BlockerDelegateMutableBuilder[Self <: BlockerDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: () => Unit): Self = StObject.set(x, "block", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCtrl(value: js.Any): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisable(value: js.Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScroll(value: js.Any): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnblock(value: () => Unit): Self = StObject.set(x, "unblock", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait GestureConfig extends StObject {
    
    var disableScroll: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var priority: js.UndefOr[Double] = js.native
  }
  object GestureConfig {
    
    @scala.inline
    def apply(name: String): GestureConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureConfig]
    }
    
    @scala.inline
    implicit class GestureConfigMutableBuilder[Self <: GestureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  @js.native
  trait GestureController extends StObject {
    
    def canStart(gestureName: String): Boolean = js.native
    
    def capture(gestureName: String, id: Double, priority: Double): Boolean = js.native
    
    var capturedId: js.Any = js.native
    
    /**
      * Creates a blocker that will block any other gesture events from firing. Set in the ion-gesture component.
      */
    def createBlocker(): BlockerDelegate = js.native
    def createBlocker(opts: BlockerConfig): BlockerDelegate = js.native
    
    /**
      * Creates a gesture delegate based on the GestureConfig passed
      */
    def createGesture(config: GestureConfig): GestureDelegate = js.native
    
    def disableGesture(gestureName: String, id: Double): Unit = js.native
    
    def disableScroll(id: Double): Unit = js.native
    
    var disabledGestures: js.Any = js.native
    
    var disabledScroll: js.Any = js.native
    
    def enableGesture(gestureName: String, id: Double): Unit = js.native
    
    def enableScroll(id: Double): Unit = js.native
    
    var gestureId: js.Any = js.native
    
    def isCaptured(): Boolean = js.native
    
    def isDisabled(gestureName: String): Boolean = js.native
    
    def isScrollDisabled(): Boolean = js.native
    
    var newID: js.Any = js.native
    
    def release(id: Double): Unit = js.native
    
    var requestedStart: js.Any = js.native
    
    def start(gestureName: String, id: Double, priority: Double): Boolean = js.native
  }
  
  @js.native
  trait GestureDelegate extends StObject {
    
    def canStart(): Boolean = js.native
    
    def capture(): Boolean = js.native
    
    var ctrl: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    var disableScroll: js.Any = js.native
    
    var id: js.Any = js.native
    
    var name: js.Any = js.native
    
    var priority: js.Any = js.native
    
    def release(): Unit = js.native
    
    def start(): Boolean = js.native
  }
  object GestureDelegate {
    
    @scala.inline
    def apply(
      canStart: () => Boolean,
      capture: () => Boolean,
      ctrl: js.Any,
      destroy: () => Unit,
      disableScroll: js.Any,
      id: js.Any,
      name: js.Any,
      priority: js.Any,
      release: () => Unit,
      start: () => Boolean
    ): GestureDelegate = {
      val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), capture = js.Any.fromFunction0(capture), ctrl = ctrl.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[GestureDelegate]
    }
    
    @scala.inline
    implicit class GestureDelegateMutableBuilder[Self <: GestureDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanStart(value: () => Boolean): Self = StObject.set(x, "canStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCapture(value: () => Boolean): Self = StObject.set(x, "capture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCtrl(value: js.Any): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableScroll(value: js.Any): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: js.Any): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Boolean): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
}
