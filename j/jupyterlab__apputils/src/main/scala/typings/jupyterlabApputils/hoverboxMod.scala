package typings.jupyterlabApputils

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverboxMod {
  
  object HoverBox {
    
    /**
      * Set the visible dimensions of a hovering box anchored to an editor cursor.
      *
      * @param options - The hover box geometry calculation options.
      */
    @JSImport("@jupyterlab/apputils/lib/hoverbox", "HoverBox.setGeometry")
    @js.native
    def setGeometry(options: IOptions): Unit = js.native
    
    /**
      * Options for setting the geometry of a hovering node and its anchor node.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The referent anchor rectangle to which the hover box is bound.
        *
        * #### Notes
        * In an editor context, this value will typically be the cursor's
        * coordinate position, which can be retrieved via calling the
        * `getCoordinateForPosition` method.
        */
      var anchor: ClientRect = js.native
      
      /**
        * The node that hosts the anchor.
        *
        * #### Notes
        * The visibility of the anchor rectangle within this host node is the
        * heuristic that determines whether the hover box ought to be visible.
        */
      var host: HTMLElement = js.native
      
      /**
        * The maximum height of a hover box.
        *
        * #### Notes
        * This value is only used if a CSS max-height attribute is not set for the
        * hover box. It is a fallback value.
        */
      var maxHeight: Double = js.native
      
      /**
        * The minimum height of a hover box.
        */
      var minHeight: Double = js.native
      
      /**
        * The hover box node.
        */
      var node: HTMLElement = js.native
      
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
      var offset: js.UndefOr[Horizontal] = js.native
      
      /**
        * If space is available both above and below the anchor, denote which
        * location is privileged. Use forceBelow and forceAbove to mandate where
        * hover box should render relative to anchor.
        *
        * #### Notes
        * The default value is `'below'`.
        */
      var privilege: js.UndefOr[above | below | forceAbove | forceBelow] = js.native
      
      /**
        * If the style of the node has already been computed, it can be passed into
        * the hover box for geometry calculation.
        */
      var style: js.UndefOr[CSSStyleDeclaration] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(anchor: ClientRect, host: HTMLElement, maxHeight: Double, minHeight: Double, node: HTMLElement): IOptions = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnchor(value: ClientRect): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Horizontal): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setPrivilege(value: above | below | forceAbove | forceBelow): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
        
        @scala.inline
        def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
  }
}
