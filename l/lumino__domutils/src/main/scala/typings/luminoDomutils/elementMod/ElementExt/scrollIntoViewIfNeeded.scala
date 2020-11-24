package typings.luminoDomutils.elementMod.ElementExt

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/domutils/types/element", "ElementExt.scrollIntoViewIfNeeded")
@js.native
object scrollIntoViewIfNeeded extends js.Object {
  
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
  def apply(area: Element, element: Element): Unit = js.native
}
