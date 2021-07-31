package typings.headroom

import typings.headroom.anon.Bottom
import typings.headroom.anon.Down
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadroomOptions extends StObject {
  
  /** css classes to apply multiple classes are also supported with a space-separated list */
  var classes: js.UndefOr[Bottom] = js.undefined
  
  /** vertical offset in px before element is first unpinned */
  var offset: js.UndefOr[Double] = js.undefined
  
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
  
  /** element to listen to scroll events on, defaults to `window` */
  var scroller: js.UndefOr[HTMLElement] = js.undefined
  
  /** scroll tolerance in px before state changes or you can specify tolerance individually for up/down scroll */
  var tolerance: js.UndefOr[Down | Double] = js.undefined
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
    def setTolerance(value: Down | Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
