package typings.luminoDomutils.elementMod.ElementExt

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/domutils/types/element", "ElementExt.sizeLimits")
@js.native
object sizeLimits extends js.Object {
  
  /**
    * Compute the size limits for an element.
    *
    * @param element - The element of interest.
    *
    * @returns The size limit data for the specified element.
    */
  def apply(element: Element): ISizeLimits = js.native
}
