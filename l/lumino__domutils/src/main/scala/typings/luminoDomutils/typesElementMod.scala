package typings.luminoDomutils

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesElementMod {
  
  object ElementExt {
    
    @JSImport("@lumino/domutils/types/element", "ElementExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compute the box sizing for an element.
      *
      * @param element - The element of interest.
      *
      * @returns The box sizing data for the specified element.
      */
    inline def boxSizing(element: Element): IBoxSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("boxSizing")(element.asInstanceOf[js.Any]).asInstanceOf[IBoxSizing]
    
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
    inline def hitTest(element: Element, clientX: Double, clientY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hitTest")(element.asInstanceOf[js.Any], clientX.asInstanceOf[js.Any], clientY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    inline def scrollIntoViewIfNeeded(area: Element, element: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoViewIfNeeded")(area.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Compute the size limits for an element.
      *
      * @param element - The element of interest.
      *
      * @returns The size limit data for the specified element.
      */
    inline def sizeLimits(element: Element): ISizeLimits = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeLimits")(element.asInstanceOf[js.Any]).asInstanceOf[ISizeLimits]
    
    /**
      * An object which holds the border and padding data for an element.
      */
    trait IBoxSizing extends StObject {
      
      /**
        * The bottom border width, in pixels.
        */
      var borderBottom: Double
      
      /**
        * The left border width, in pixels.
        */
      var borderLeft: Double
      
      /**
        * The right border width, in pixels.
        */
      var borderRight: Double
      
      /**
        * The top border width, in pixels.
        */
      var borderTop: Double
      
      /**
        * The sum of horizontal border and padding.
        */
      var horizontalSum: Double
      
      /**
        * The bottom padding width, in pixels.
        */
      var paddingBottom: Double
      
      /**
        * The left padding width, in pixels.
        */
      var paddingLeft: Double
      
      /**
        * The right padding width, in pixels.
        */
      var paddingRight: Double
      
      /**
        * The top padding width, in pixels.
        */
      var paddingTop: Double
      
      /**
        * The sum of vertical border and padding.
        */
      var verticalSum: Double
    }
    object IBoxSizing {
      
      inline def apply(
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
      
      extension [Self <: IBoxSizing](x: Self) {
        
        inline def setBorderBottom(value: Double): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
        
        inline def setBorderLeft(value: Double): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
        
        inline def setBorderRight(value: Double): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
        
        inline def setBorderTop(value: Double): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
        
        inline def setHorizontalSum(value: Double): Self = StObject.set(x, "horizontalSum", value.asInstanceOf[js.Any])
        
        inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
        
        inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
        
        inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
        
        inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
        
        inline def setVerticalSum(value: Double): Self = StObject.set(x, "verticalSum", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object which holds the min and max size data for an element.
      */
    trait ISizeLimits extends StObject {
      
      /**
        * The maximum height, in pixels.
        */
      var maxHeight: Double
      
      /**
        * The maximum width, in pixels.
        */
      var maxWidth: Double
      
      /**
        * The minimum height, in pixels.
        */
      var minHeight: Double
      
      /**
        * The minimum width, in pixels.
        */
      var minWidth: Double
    }
    object ISizeLimits {
      
      inline def apply(maxHeight: Double, maxWidth: Double, minHeight: Double, minWidth: Double): ISizeLimits = {
        val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISizeLimits]
      }
      
      extension [Self <: ISizeLimits](x: Self) {
        
        inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
        
        inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
        
        inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
        
        inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      }
    }
  }
}
