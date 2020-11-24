package typings.htmlCodesniffer.mod.Util

import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.getElementWindow")
@js.native
object getElementWindow extends js.Object {
  
  def apply(element: Document): Window = js.native
  /**
    * Get the window object relating to the passed element.
    *
    * @param element The element (or document) to pass.
    */
  def apply(element: Element): Window = js.native
}
