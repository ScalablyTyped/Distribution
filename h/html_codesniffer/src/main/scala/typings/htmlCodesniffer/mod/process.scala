package typings.htmlCodesniffer.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "process")
@js.native
object process extends js.Object {
  
  def apply(standard: String, content: String, callback: Callback): Unit = js.native
  def apply(
    standard: String,
    content: String,
    callback: Callback,
    failCallback: js.UndefOr[scala.Nothing],
    language: String
  ): Unit = js.native
  def apply(standard: String, content: String, callback: Callback, failCallback: FailCallback): Unit = js.native
  def apply(
    standard: String,
    content: String,
    callback: Callback,
    failCallback: FailCallback,
    language: String
  ): Unit = js.native
  def apply(standard: String, content: Element, callback: Callback): Unit = js.native
  def apply(
    standard: String,
    content: Element,
    callback: Callback,
    failCallback: js.UndefOr[scala.Nothing],
    language: String
  ): Unit = js.native
  def apply(standard: String, content: Element, callback: Callback, failCallback: FailCallback): Unit = js.native
  def apply(
    standard: String,
    content: Element,
    callback: Callback,
    failCallback: FailCallback,
    language: String
  ): Unit = js.native
}
