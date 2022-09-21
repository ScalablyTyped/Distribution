package typings.materialMenuSurface

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialMenuSurface.anon.PartialMDCMenuDistance
import typings.materialMenuSurface.constantsMod.Corner
import typings.materialMenuSurface.foundationMod.MDCMenuSurfaceFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/menu-surface/component", "MDCMenuSurface")
  @js.native
  open class MDCMenuSurface protected () extends MDCComponent[MDCMenuSurfaceFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCMenuSurfaceFoundation, args: Any*) = this()
    
    var anchorElement: typings.std.Element | Null = js.native
    
    def close(): Unit = js.native
    def close(skipRestoreFocus: Boolean): Unit = js.native
    
    /* private */ var deregisterBodyClickListener: Any = js.native
    
    /* private */ var handleBodyClick: Any = js.native
    
    /* private */ var handleKeydown: Any = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(): Unit = js.native
    
    /* private */ var previousFocus: Any = js.native
    
    def quickOpen_=(quickOpen: Boolean): Unit = js.native
    
    /* private */ var registerBodyClickListener: Any = js.native
    
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
    def setMenuSurfaceAnchorElement(element: typings.std.Element): Unit = js.native
  }
  /* static members */
  object MDCMenuSurface {
    
    @JSImport("@material/menu-surface/component", "MDCMenuSurface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCMenuSurface = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCMenuSurface]
  }
  
  type MDCMenuSurfaceFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCMenuSurfaceFoundation], 
    MDCMenuSurface
  ]
}
