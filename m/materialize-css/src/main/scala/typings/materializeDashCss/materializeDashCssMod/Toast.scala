package typings.materializeDashCss.materializeDashCssMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Toast")
@js.native
class Toast ()
  extends typings.materializeDashCss.MNs.Toast

/* static members */
@JSImport("materialize-css", "Toast")
@js.native
object Toast extends js.Object {
  /**
    * dismiss all toasts
    */
  def dismissAll(): Unit = js.native
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Toast = js.native
}

