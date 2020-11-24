package typings.headroomJs.mod.headroom

import typings.headroomJs.anon.Bottom
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadroomOptions extends js.Object {
  
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
  implicit class HeadroomOptionsOps[Self <: HeadroomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClasses(value: Bottom): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnBottom(value: () => Unit): Self = this.set("onBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBottom: Self = this.set("onBottom", js.undefined)
    
    @scala.inline
    def setOnNotBottom(value: () => Unit): Self = this.set("onNotBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnNotBottom: Self = this.set("onNotBottom", js.undefined)
    
    @scala.inline
    def setOnNotTop(value: () => Unit): Self = this.set("onNotTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnNotTop: Self = this.set("onNotTop", js.undefined)
    
    @scala.inline
    def setOnPin(value: () => Unit): Self = this.set("onPin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPin: Self = this.set("onPin", js.undefined)
    
    @scala.inline
    def setOnTop(value: () => Unit): Self = this.set("onTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTop: Self = this.set("onTop", js.undefined)
    
    @scala.inline
    def setOnUnpin(value: () => Unit): Self = this.set("onUnpin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnpin: Self = this.set("onUnpin", js.undefined)
    
    @scala.inline
    def setScroller(value: HTMLElement): Self = this.set("scroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroller: Self = this.set("scroller", js.undefined)
    
    @scala.inline
    def setTolerance(value: Tolerance | Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
}
