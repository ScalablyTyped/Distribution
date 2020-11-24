package typings.headroomJs.mod

import typings.headroomJs.mod.headroom.HeadroomOptions
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI enhancement for fixed headers.
  * Hides header when scrolling down
  * Shows header when scrolling up
  */
@JSImport("headroom.js", JSImport.Namespace)
@js.native
class ^ protected () extends Headroom_ {
  def this(element: HTMLElement) = this()
  def this(element: Node) = this()
  def this(element: HTMLElement, options: HeadroomOptions) = this()
  def this(element: Node, options: HeadroomOptions) = this()
}
@JSImport("headroom.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var cutsTheMustard: Boolean = js.native
  
  var options: HeadroomOptions = js.native
}
