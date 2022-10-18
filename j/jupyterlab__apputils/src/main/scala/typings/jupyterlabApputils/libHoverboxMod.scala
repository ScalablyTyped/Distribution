package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.Bottom
import typings.jupyterlabApputils.anon.Horizontal
import typings.jupyterlabApputils.jupyterlabApputilsStrings.above
import typings.jupyterlabApputils.jupyterlabApputilsStrings.below
import typings.jupyterlabApputils.jupyterlabApputilsStrings.forceAbove
import typings.jupyterlabApputils.jupyterlabApputilsStrings.forceBelow
import typings.std.CSSStyleDeclaration
import typings.std.ClientRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHoverboxMod {
  
  object HoverBox {
    
    @JSImport("@jupyterlab/apputils/lib/hoverbox", "HoverBox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Set the visible dimensions of a hovering box anchored to an editor cursor.
      *
      * @param options - The hover box geometry calculation options.
      */
    inline def setGeometry(options: IOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGeometry")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Options for setting the geometry of a hovering node and its anchor node.
      */
    trait IOptions extends StObject {
      
      /**
        * The referent anchor rectangle to which the hover box is bound.
        *
        * #### Notes
        * In an editor context, this value will typically be the cursor's
        * coordinate position, which can be retrieved via calling the
        * `getCoordinateForPosition` method.
        */
      var anchor: ClientRect
      
      /**
        * The node that hosts the anchor.
        *
        * #### Notes
        * The visibility of the elements under hover box edges within this host
        * node is the heuristic that determines whether the hover box ought to be
        * visible.
        */
      var host: HTMLElement
      
      /**
        * The maximum height of a hover box.
        *
        * #### Notes
        * This value is only used if a CSS max-height attribute is not set for the
        * hover box. It is a fallback value.
        */
      var maxHeight: Double
      
      /**
        * The minimum height of a hover box.
        */
      var minHeight: Double
      
      /**
        * The hover box node.
        */
      var node: HTMLElement
      
      /**
        * Optional pixel offset values added to where the hover box should render.
        *
        * #### Notes
        * This option is useful for passing in values that may pertain to CSS
        * borders or padding in cases where the text inside the hover box may need
        * to align with the text of the referent editor.
        *
        * Because the hover box calculation may render a box either above or below
        * the cursor, the `vertical` offset accepts `above` and `below` values for
        * the different render modes.
        */
      var offset: js.UndefOr[Horizontal] = js.undefined
      
      /**
        * How to position the hover box if its edges extend beyond the view of the
        * host element. Value 'sticky' positions the box at the (inner or outer)
        * edge of the host element.
        *
        * #### Notes
        * The default value for each edge is `'hidden-inside'` for left and top,
        * and `hidden-outside` for right and bottom edges.
        */
      var outOfViewDisplay: js.UndefOr[Bottom] = js.undefined
      
      /**
        * If space is available both above and below the anchor, denote which
        * location is privileged. Use forceBelow and forceAbove to mandate where
        * hover box should render relative to anchor.
        *
        * #### Notes
        * The default value is `'below'`.
        */
      var privilege: js.UndefOr[above | below | forceAbove | forceBelow] = js.undefined
      
      /**
        * If the style of the node has already been computed, it can be passed into
        * the hover box for geometry calculation.
        */
      var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
    }
    object IOptions {
      
      inline def apply(anchor: ClientRect, host: HTMLElement, maxHeight: Double, minHeight: Double, node: HTMLElement): IOptions = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAnchor(value: ClientRect): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
        
        inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
        
        inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Horizontal): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setOutOfViewDisplay(value: Bottom): Self = StObject.set(x, "outOfViewDisplay", value.asInstanceOf[js.Any])
        
        inline def setOutOfViewDisplayUndefined: Self = StObject.set(x, "outOfViewDisplay", js.undefined)
        
        inline def setPrivilege(value: above | below | forceAbove | forceBelow): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
        
        inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
        
        inline def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabApputils.jupyterlabApputilsStrings.`hidden-inside`
    - typings.jupyterlabApputils.jupyterlabApputilsStrings.`hidden-outside`
    - typings.jupyterlabApputils.jupyterlabApputilsStrings.`stick-inside`
    - typings.jupyterlabApputils.jupyterlabApputilsStrings.`stick-outside`
  */
  trait OutOfViewDisplay extends StObject
  object OutOfViewDisplay {
    
    inline def `hidden-inside`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`hidden-inside` = "hidden-inside".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`hidden-inside`]
    
    inline def `hidden-outside`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`hidden-outside` = "hidden-outside".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`hidden-outside`]
    
    inline def `stick-inside`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`stick-inside` = "stick-inside".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`stick-inside`]
    
    inline def `stick-outside`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`stick-outside` = "stick-outside".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`stick-outside`]
  }
}
