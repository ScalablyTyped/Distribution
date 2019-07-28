package typings.materializeDashCss.materializeDashCssMod

import typings.cash.Cash
import typings.materializeDashCss.JQuery
import typings.materializeDashCss.MNs.ToastOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Automatically initialize components.
    */
  def AutoInit(): Unit = js.native
  def AutoInit(context: Element): Unit = js.native
  def textareaAutoResize(textarea: Cash): Unit = js.native
  def textareaAutoResize(textarea: JQuery): Unit = js.native
  def textareaAutoResize(textarea: Element): Unit = js.native
  /**
    * Create a toast
    */
  def toast(options: Partial[ToastOptions]): typings.materializeDashCss.MNs.Toast = js.native
  def updateTextFields(): Unit = js.native
}

