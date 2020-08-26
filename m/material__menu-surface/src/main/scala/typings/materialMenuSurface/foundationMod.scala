package typings.materialMenuSurface

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialMenuSurface.adapterMod.MDCMenuSurfaceAdapter
import typings.materialMenuSurface.anon.ANCHOR
import typings.materialMenuSurface.anon.ANCHORTOMENUSURFACEWIDTHRATIO
import typings.materialMenuSurface.anon.CLOSEDEVENT
import typings.materialMenuSurface.anon.PartialMDCMenuDistance
import typings.materialMenuSurface.anon.PartialMDCMenuSurfaceAdap
import typings.materialMenuSurface.constantsMod.Corner
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu-surface/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCMenuSurfaceFoundation () extends MDCFoundation[MDCMenuSurfaceAdapter] {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
    /**
      * Closes the menu surface.
      */
    def close(): Unit = js.native
    def close(skipRestoreFocus: Boolean): Unit = js.native
    /**
      * Flip menu corner horizontally.
      */
    def flipCornerHorizontally(): Unit = js.native
    /** Handle clicks and close if not within menu-surface element. */
    def handleBodyClick(evt: MouseEvent): Unit = js.native
    /** Handle keys that close the surface. */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    def isOpen(): Boolean = js.native
    /**
      * Open the menu surface.
      */
    def open(): Unit = js.native
    /** Sets the menu-surface position on the page. */
    def setAbsolutePosition(x: Double, y: Double): Unit = js.native
    /**
      * @param corner Default anchor corner alignment of top-left menu surface corner.
      */
    def setAnchorCorner(corner: Corner): Unit = js.native
    /**
      * @param margin Set of margin values from anchor.
      */
    def setAnchorMargin(margin: PartialMDCMenuDistance): Unit = js.native
    /** Used to set the menu-surface calculations based on a fixed position menu. */
    def setFixedPosition(isFixedPosition: Boolean): Unit = js.native
    /** Used to indicate if the menu-surface is hoisted to the body. */
    def setIsHoisted(isHoisted: Boolean): Unit = js.native
    def setQuickOpen(quickOpen: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCMenuSurfaceFoundation {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
  }
  
  /* static members */
  @js.native
  object MDCMenuSurfaceFoundation extends js.Object {
    def Corner: js.Any = js.native
    def cssClasses: ANCHOR = js.native
    /**
      * @see {@link MDCMenuSurfaceAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCMenuSurfaceAdapter = js.native
    def numbers: ANCHORTOMENUSURFACEWIDTHRATIO = js.native
    def strings: CLOSEDEVENT = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def Corner: js.Any = js.native
    def cssClasses: ANCHOR = js.native
    /**
      * @see {@link MDCMenuSurfaceAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCMenuSurfaceAdapter = js.native
    def numbers: ANCHORTOMENUSURFACEWIDTHRATIO = js.native
    def strings: CLOSEDEVENT = js.native
  }
  
}

