package typings.luminoDomutils

import typings.luminoDomutils.elementMod.ElementExt.IBoxSizing
import typings.luminoDomutils.elementMod.ElementExt.ISizeLimits
import typings.std.Element
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ClipboardExt {
    
    @JSImport("@lumino/domutils", "ClipboardExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Copy text to the system clipboard.
      *
      * @param text - The text to copy to the clipboard.
      */
    inline def copyText(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyText")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object ElementExt {
    
    @JSImport("@lumino/domutils", "ElementExt")
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
  }
  
  object Platform {
    
    @JSImport("@lumino/domutils", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A flag indicating whether the browser is Edge.
      */
    @JSImport("@lumino/domutils", "Platform.IS_EDGE")
    @js.native
    val IS_EDGE: Boolean = js.native
    
    /**
      * A flag indicating whether the browser is IE.
      */
    @JSImport("@lumino/domutils", "Platform.IS_IE")
    @js.native
    val IS_IE: Boolean = js.native
    
    /**
      * A flag indicating whether the platform is Mac.
      */
    @JSImport("@lumino/domutils", "Platform.IS_MAC")
    @js.native
    val IS_MAC: Boolean = js.native
    
    /**
      * A flag indicating whether the platform is Windows.
      */
    @JSImport("@lumino/domutils", "Platform.IS_WIN")
    @js.native
    val IS_WIN: Boolean = js.native
    
    /**
      * Test whether the `accel` key is pressed.
      *
      * @param event - The keyboard or mouse event of interest.
      *
      * @returns Whether the `accel` key is pressed.
      *
      * #### Notes
      * On Mac the `accel` key is the command key. On all other
      * platforms the `accel` key is the control key.
      */
    inline def accelKey(event: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("accelKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def accelKey(event: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("accelKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object Selector {
    
    @JSImport("@lumino/domutils", "Selector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculate the specificity of a single CSS selector.
      *
      * @param selector - The CSS selector of interest.
      *
      * @returns The specificity of the selector.
      *
      * #### Undefined Behavior
      * The selector is invalid.
      *
      * #### Notes
      * This is based on https://www.w3.org/TR/css3-selectors/#specificity
      *
      * A larger number represents a more specific selector.
      *
      * The smallest possible specificity is `0`.
      *
      * The result is represented as a hex number `0x<aa><bb><cc>` where
      * each component is the count of the respective selector clause.
      *
      * If the selector contains commas, only the first clause is used.
      *
      * The computed result is cached, so subsequent calculations for the
      * same selector are extremely fast.
      */
    inline def calculateSpecificity(selector: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateSpecificity")(selector.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Test whether a selector is a valid CSS selector.
      *
      * @param selector - The CSS selector of interest.
      *
      * @returns `true` if the selector is valid, `false` otherwise.
      *
      * #### Notes
      * The computed result is cached, so subsequent tests for the same
      * selector are extremely fast.
      */
    inline def isValid(selector: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Test whether an element matches a CSS selector.
      *
      * @param element - The element of interest.
      *
      * @param selector - The valid CSS selector of interest.
      *
      * @returns `true` if the element is a match, `false` otherwise.
      *
      * #### Notes
      * This function uses the builtin browser capabilities when possible,
      * falling back onto a document query otherwise.
      */
    inline def matches(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
