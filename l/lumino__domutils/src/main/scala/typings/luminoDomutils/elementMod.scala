package typings.luminoDomutils

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  object ElementExt {
    
    /**
      * Compute the box sizing for an element.
      *
      * @param element - The element of interest.
      *
      * @returns The box sizing data for the specified element.
      */
    @JSImport("@lumino/domutils/types/element", "ElementExt.boxSizing")
    @js.native
    def boxSizing(element: Element): IBoxSizing = js.native
    
    /**
      * Test whether a client position lies within an element.
      *
      * @param element - The DOM element of interest.
      *
      * @param clientX - The client X coordinate of interest.
      *
      * @param clientY - The client Y coordinate of interest.
      *
      * @returns Whether the point is within the given element.
      */
    @JSImport("@lumino/domutils/types/element", "ElementExt.hitTest")
    @js.native
    def hitTest(element: Element, clientX: Double, clientY: Double): Boolean = js.native
    
    /**
      * Vertically scroll an element into view if needed.
      *
      * @param area - The scroll area element.
      *
      * @param element - The element of interest.
      *
      * #### Notes
      * This follows the "nearest" behavior of the native `scrollIntoView`
      * method, which is not supported by all browsers.
      * https://drafts.csswg.org/cssom-view/#element-scrolling-members
      *
      * If the element fully covers the visible area or is fully contained
      * within the visible area, no scrolling will take place. Otherwise,
      * the nearest edges of the area and element are aligned.
      */
    @JSImport("@lumino/domutils/types/element", "ElementExt.scrollIntoViewIfNeeded")
    @js.native
    def scrollIntoViewIfNeeded(area: Element, element: Element): Unit = js.native
    
    /**
      * Compute the size limits for an element.
      *
      * @param element - The element of interest.
      *
      * @returns The size limit data for the specified element.
      */
    @JSImport("@lumino/domutils/types/element", "ElementExt.sizeLimits")
    @js.native
    def sizeLimits(element: Element): ISizeLimits = js.native
    
    /**
      * An object which holds the border and padding data for an element.
      */
    @js.native
    trait IBoxSizing extends StObject {
      
      /**
        * The bottom border width, in pixels.
        */
      var borderBottom: Double = js.native
      
      /**
        * The left border width, in pixels.
        */
      var borderLeft: Double = js.native
      
      /**
        * The right border width, in pixels.
        */
      var borderRight: Double = js.native
      
      /**
        * The top border width, in pixels.
        */
      var borderTop: Double = js.native
      
      /**
        * The sum of horizontal border and padding.
        */
      var horizontalSum: Double = js.native
      
      /**
        * The bottom padding width, in pixels.
        */
      var paddingBottom: Double = js.native
      
      /**
        * The left padding width, in pixels.
        */
      var paddingLeft: Double = js.native
      
      /**
        * The right padding width, in pixels.
        */
      var paddingRight: Double = js.native
      
      /**
        * The top padding width, in pixels.
        */
      var paddingTop: Double = js.native
      
      /**
        * The sum of vertical border and padding.
        */
      var verticalSum: Double = js.native
    }
    object IBoxSizing {
      
      @scala.inline
      def apply(
        borderBottom: Double,
        borderLeft: Double,
        borderRight: Double,
        borderTop: Double,
        horizontalSum: Double,
        paddingBottom: Double,
        paddingLeft: Double,
        paddingRight: Double,
        paddingTop: Double,
        verticalSum: Double
      ): IBoxSizing = {
        val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], borderLeft = borderLeft.asInstanceOf[js.Any], borderRight = borderRight.asInstanceOf[js.Any], borderTop = borderTop.asInstanceOf[js.Any], horizontalSum = horizontalSum.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], verticalSum = verticalSum.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBoxSizing]
      }
      
      @scala.inline
      implicit class IBoxSizingMutableBuilder[Self <: IBoxSizing] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBorderBottom(value: Double): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBorderLeft(value: Double): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBorderRight(value: Double): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBorderTop(value: Double): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalSum(value: Double): Self = StObject.set(x, "horizontalSum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalSum(value: Double): Self = StObject.set(x, "verticalSum", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object which holds the min and max size data for an element.
      */
    @js.native
    trait ISizeLimits extends StObject {
      
      /**
        * The maximum height, in pixels.
        */
      var maxHeight: Double = js.native
      
      /**
        * The maximum width, in pixels.
        */
      var maxWidth: Double = js.native
      
      /**
        * The minimum height, in pixels.
        */
      var minHeight: Double = js.native
      
      /**
        * The minimum width, in pixels.
        */
      var minWidth: Double = js.native
    }
    object ISizeLimits {
      
      @scala.inline
      def apply(maxHeight: Double, maxWidth: Double, minHeight: Double, minWidth: Double): ISizeLimits = {
        val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISizeLimits]
      }
      
      @scala.inline
      implicit class ISizeLimitsMutableBuilder[Self <: ISizeLimits] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      }
    }
  }
}
