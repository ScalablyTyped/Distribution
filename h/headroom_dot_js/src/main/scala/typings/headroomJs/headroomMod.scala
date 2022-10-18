package typings.headroomJs

import typings.headroomJs.anon.Bottom
import typings.headroomJs.headroomMod.Headroom.HeadroomOptions
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
/* static members */
object headroomMod {
  
  /**
    * UI enhancement for fixed headers.
    * Hides header when scrolling down
    * Shows header when scrolling up
    */
  @JSImport("headroom", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Headroom {
    def this(element: HTMLElement) = this()
    def this(element: Node) = this()
    def this(element: HTMLElement, options: HeadroomOptions) = this()
    def this(element: Node, options: HeadroomOptions) = this()
    
    /** destroy the headroom instance, removing event listeners and any classes added */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
    /* CompleteClass */
    override def freeze(): Unit = js.native
    
    /** initialise */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** forcibly set the headroom instance's state to pinned */
    /* CompleteClass */
    override def pin(): Unit = js.native
    
    /** resume responding to scroll events */
    /* CompleteClass */
    override def unfreeze(): Unit = js.native
    
    /** forcibly set the headroom instance's state to unpinned */
    /* CompleteClass */
    override def unpin(): Unit = js.native
  }
  @JSImport("headroom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("headroom", "cutsTheMustard")
  @js.native
  def cutsTheMustard: Boolean = js.native
  inline def cutsTheMustard_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cutsTheMustard")(x.asInstanceOf[js.Any])
  
  /**
    *  Default options
    */
  @JSImport("headroom", "options")
  @js.native
  val options: HeadroomOptions = js.native
  
  /**
    * UI enhancement for fixed headers.
    * Hides header when scrolling down
    * Shows header when scrolling up
    */
  trait Headroom extends StObject {
    
    /** destroy the headroom instance, removing event listeners and any classes added */
    def destroy(): Unit
    
    /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
    def freeze(): Unit
    
    /** initialise */
    def init(): Unit
    
    /** forcibly set the headroom instance's state to pinned */
    def pin(): Unit
    
    /** resume responding to scroll events */
    def unfreeze(): Unit
    
    /** forcibly set the headroom instance's state to unpinned */
    def unpin(): Unit
  }
  object Headroom {
    
    inline def apply(
      destroy: () => Unit,
      freeze: () => Unit,
      init: () => Unit,
      pin: () => Unit,
      unfreeze: () => Unit,
      unpin: () => Unit
    ): Headroom = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), freeze = js.Any.fromFunction0(freeze), init = js.Any.fromFunction0(init), pin = js.Any.fromFunction0(pin), unfreeze = js.Any.fromFunction0(unfreeze), unpin = js.Any.fromFunction0(unpin))
      __obj.asInstanceOf[Headroom]
    }
    
    extension [Self <: Headroom](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setFreeze(value: () => Unit): Self = StObject.set(x, "freeze", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setPin(value: () => Unit): Self = StObject.set(x, "pin", js.Any.fromFunction0(value))
      
      inline def setUnfreeze(value: () => Unit): Self = StObject.set(x, "unfreeze", js.Any.fromFunction0(value))
      
      inline def setUnpin(value: () => Unit): Self = StObject.set(x, "unpin", js.Any.fromFunction0(value))
    }
    
    trait HeadroomOptions extends StObject {
      
      /** css classes to apply multiple classes are also supported with a space-separated list */
      var classes: js.UndefOr[Bottom] = js.undefined
      
      /**
        * vertical offset in px before element is first unpinned or you can specify offset individually for up/down scroll
        * @default 0
        */
      var offset: js.UndefOr[Offset | Double] = js.undefined
      
      /** callback when at bottom of page, `this` is headroom object */
      var onBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** callback when moving away from bottom of page, `this` is headroom object */
      var onNotBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** callback when below offset, `this` is headroom object */
      var onNotTop: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** callback when pinned, `this` is headroom object */
      var onPin: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** callback when above offset, `this` is headroom object */
      var onTop: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** callback when unpinned, `this` is headroom object */
      var onUnpin: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * element to listen to scroll events on
        * @default window
        */
      var scroller: js.UndefOr[HTMLElement] = js.undefined
      
      /** scroll tolerance in px before state changes or you can specify tolerance individually for up/down scroll */
      var tolerance: js.UndefOr[Tolerance | Double] = js.undefined
    }
    object HeadroomOptions {
      
      inline def apply(): HeadroomOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HeadroomOptions]
      }
      
      extension [Self <: HeadroomOptions](x: Self) {
        
        inline def setClasses(value: Bottom): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
        
        inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
        
        inline def setOffset(value: Offset | Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setOnBottom(value: () => Unit): Self = StObject.set(x, "onBottom", js.Any.fromFunction0(value))
        
        inline def setOnBottomUndefined: Self = StObject.set(x, "onBottom", js.undefined)
        
        inline def setOnNotBottom(value: () => Unit): Self = StObject.set(x, "onNotBottom", js.Any.fromFunction0(value))
        
        inline def setOnNotBottomUndefined: Self = StObject.set(x, "onNotBottom", js.undefined)
        
        inline def setOnNotTop(value: () => Unit): Self = StObject.set(x, "onNotTop", js.Any.fromFunction0(value))
        
        inline def setOnNotTopUndefined: Self = StObject.set(x, "onNotTop", js.undefined)
        
        inline def setOnPin(value: () => Unit): Self = StObject.set(x, "onPin", js.Any.fromFunction0(value))
        
        inline def setOnPinUndefined: Self = StObject.set(x, "onPin", js.undefined)
        
        inline def setOnTop(value: () => Unit): Self = StObject.set(x, "onTop", js.Any.fromFunction0(value))
        
        inline def setOnTopUndefined: Self = StObject.set(x, "onTop", js.undefined)
        
        inline def setOnUnpin(value: () => Unit): Self = StObject.set(x, "onUnpin", js.Any.fromFunction0(value))
        
        inline def setOnUnpinUndefined: Self = StObject.set(x, "onUnpin", js.undefined)
        
        inline def setScroller(value: HTMLElement): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
        
        inline def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
        
        inline def setTolerance(value: Tolerance | Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
        
        inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
      }
    }
    
    trait Offset extends StObject {
      
      /** @default 0 */
      var down: js.UndefOr[Double] = js.undefined
      
      /** @default 0 */
      var up: js.UndefOr[Double] = js.undefined
    }
    object Offset {
      
      inline def apply(): Offset = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Offset]
      }
      
      extension [Self <: Offset](x: Self) {
        
        inline def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      }
    }
    
    trait Tolerance extends StObject {
      
      /** @default 0 */
      var down: js.UndefOr[Double] = js.undefined
      
      /** @default 0 */
      var up: js.UndefOr[Double] = js.undefined
    }
    object Tolerance {
      
      inline def apply(): Tolerance = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Tolerance]
      }
      
      extension [Self <: Tolerance](x: Self) {
        
        inline def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      }
    }
  }
}
