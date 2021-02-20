package typings.headroomJs

import typings.headroomJs.anon.Bottom
import typings.headroomJs.mod.headroom.HeadroomOptions
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * UI enhancement for fixed headers.
    * Hides header when scrolling down
    * Shows header when scrolling up
    */
  @JSImport("headroom.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Headroom_ {
    def this(element: HTMLElement) = this()
    def this(element: Node) = this()
    def this(element: HTMLElement, options: HeadroomOptions) = this()
    def this(element: Node, options: HeadroomOptions) = this()
  }
  @JSImport("headroom.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("headroom.js", "cutsTheMustard")
  @js.native
  def cutsTheMustard: Boolean = js.native
  @scala.inline
  def cutsTheMustard_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cutsTheMustard")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("headroom.js", "options")
  @js.native
  def options: HeadroomOptions = js.native
  @scala.inline
  def options_=(x: HeadroomOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /**
    * UI enhancement for fixed headers.
    * Hides header when scrolling down
    * Shows header when scrolling up
    */
  @js.native
  trait Headroom_ extends StObject {
    
    /** destroy the headroom instance, removing event listeners and any classes added */
    def destroy(): Unit = js.native
    
    /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
    def freeze(): Unit = js.native
    
    /** initialise */
    def init(): Unit = js.native
    
    /** forcibly set the headroom instance's state to pinned */
    def pin(): Unit = js.native
    
    /** resume responding to scroll events */
    def unfreeze(): Unit = js.native
    
    /** forcibly set the headroom instance's state to unpinned */
    def unpin(): Unit = js.native
  }
  object Headroom_ {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      freeze: () => Unit,
      init: () => Unit,
      pin: () => Unit,
      unfreeze: () => Unit,
      unpin: () => Unit
    ): Headroom_ = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), freeze = js.Any.fromFunction0(freeze), init = js.Any.fromFunction0(init), pin = js.Any.fromFunction0(pin), unfreeze = js.Any.fromFunction0(unfreeze), unpin = js.Any.fromFunction0(unpin))
      __obj.asInstanceOf[Headroom_]
    }
    
    @scala.inline
    implicit class Headroom_MutableBuilder[Self <: Headroom_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFreeze(value: () => Unit): Self = StObject.set(x, "freeze", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPin(value: () => Unit): Self = StObject.set(x, "pin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnfreeze(value: () => Unit): Self = StObject.set(x, "unfreeze", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnpin(value: () => Unit): Self = StObject.set(x, "unpin", js.Any.fromFunction0(value))
    }
  }
  
  object headroom {
    
    @js.native
    trait HeadroomOptions extends StObject {
      
      /** css classes to apply multiple classes are also supported with a space-separated list */
      var classes: js.UndefOr[Bottom] = js.native
      
      /**
        * vertical offset in px before element is first unpinned
        * @default 0
        */
      var offset: js.UndefOr[Double] = js.native
      
      /** callback when at bottom of page, `this` is headroom object */
      var onBottom: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** callback when moving away from bottom of page, `this` is headroom object */
      var onNotBottom: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** callback when below offset, `this` is headroom object */
      var onNotTop: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** callback when pinned, `this` is headroom object */
      var onPin: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** callback when above offset, `this` is headroom object */
      var onTop: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** callback when unpinned, `this` is headroom object */
      var onUnpin: js.UndefOr[js.Function0[Unit]] = js.native
      
      /**
        * element to listen to scroll events on
        * @default window
        */
      var scroller: js.UndefOr[HTMLElement] = js.native
      
      /** scroll tolerance in px before state changes or you can specify tolerance individually for up/down scroll */
      var tolerance: js.UndefOr[Tolerance | Double] = js.native
    }
    object HeadroomOptions {
      
      @scala.inline
      def apply(): HeadroomOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HeadroomOptions]
      }
      
      @scala.inline
      implicit class HeadroomOptionsMutableBuilder[Self <: HeadroomOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClasses(value: Bottom): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setOnBottom(value: () => Unit): Self = StObject.set(x, "onBottom", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnBottomUndefined: Self = StObject.set(x, "onBottom", js.undefined)
        
        @scala.inline
        def setOnNotBottom(value: () => Unit): Self = StObject.set(x, "onNotBottom", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnNotBottomUndefined: Self = StObject.set(x, "onNotBottom", js.undefined)
        
        @scala.inline
        def setOnNotTop(value: () => Unit): Self = StObject.set(x, "onNotTop", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnNotTopUndefined: Self = StObject.set(x, "onNotTop", js.undefined)
        
        @scala.inline
        def setOnPin(value: () => Unit): Self = StObject.set(x, "onPin", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnPinUndefined: Self = StObject.set(x, "onPin", js.undefined)
        
        @scala.inline
        def setOnTop(value: () => Unit): Self = StObject.set(x, "onTop", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnTopUndefined: Self = StObject.set(x, "onTop", js.undefined)
        
        @scala.inline
        def setOnUnpin(value: () => Unit): Self = StObject.set(x, "onUnpin", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnUnpinUndefined: Self = StObject.set(x, "onUnpin", js.undefined)
        
        @scala.inline
        def setScroller(value: HTMLElement): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
        
        @scala.inline
        def setTolerance(value: Tolerance | Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
      }
    }
    
    @js.native
    trait Tolerance extends StObject {
      
      /** @default 0 */
      var down: js.UndefOr[Double] = js.native
      
      /** @default 0 */
      var up: js.UndefOr[Double] = js.native
    }
    object Tolerance {
      
      @scala.inline
      def apply(): Tolerance = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Tolerance]
      }
      
      @scala.inline
      implicit class ToleranceMutableBuilder[Self <: Tolerance] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        @scala.inline
        def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      }
    }
  }
}
