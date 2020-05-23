package typings.materialMenuSurface

import typings.materialBase.componentMod.MDCComponent
import typings.materialBase.foundationMod.default
import typings.materialMenuSurface.anon.PartialMDCMenuDistance
import typings.materialMenuSurface.constantsMod.Corner
import typings.materialMenuSurface.foundationMod.MDCMenuSurfaceFoundation
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu-surface/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCMenuSurface () extends MDCComponent[MDCMenuSurfaceFoundation, default[MDCMenuSurfaceFoundation]] {
    var anchorElement: Element | Null = js.native
    var quickOpen: Boolean = js.native
    var root_ : HTMLElement = js.native
    def close(): Unit = js.native
    def close(skipRestoreFocus: Boolean): Unit = js.native
    def isOpen(): Boolean = js.native
    def open(): Unit = js.native
    /** Sets the absolute x/y position to position based on. Requires the menu to be hoisted. */
    def setAbsolutePosition(x: Double, y: Double): Unit = js.native
    /**
      * @param corner Default anchor corner alignment of top-left surface corner.
      */
    def setAnchorCorner(corner: Corner): Unit = js.native
    def setAnchorMargin(margin: PartialMDCMenuDistance): Unit = js.native
    /** Sets the menu-surface to position: fixed. */
    def setFixedPosition(isFixed: Boolean): Unit = js.native
    /** Sets the foundation to use page offsets for an positioning when the menu is hoisted to the body. */
    def setIsHoisted(isHoisted: Boolean): Unit = js.native
    /** Sets the element that the menu-surface is anchored to. */
    def setMenuSurfaceAnchorElement(element: Element): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuSurface extends js.Object {
    def attachTo(root: Element): MDCMenuSurface = js.native
  }
  
  type MDCMenuSurfaceFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCMenuSurfaceFoundation], 
    MDCMenuSurface
  ]
}

