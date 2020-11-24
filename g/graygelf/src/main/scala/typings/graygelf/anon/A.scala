package typings.graygelf.anon

import typings.graygelf.mod.GelfMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A extends js.Object {
  
  def a(short_message: String): GelfMessage = js.native
  def a(short_message: String, full_message: js.UndefOr[scala.Nothing], customFields: GelfMessage): GelfMessage = js.native
  def a(short_message: String, full_message: String): GelfMessage = js.native
  def a(short_message: String, full_message: String, customFields: GelfMessage): GelfMessage = js.native
  def a(short_message: Error): GelfMessage = js.native
  def a(short_message: Error, full_message: js.UndefOr[scala.Nothing], customFields: GelfMessage): GelfMessage = js.native
  def a(short_message: Error, full_message: String): GelfMessage = js.native
  def a(short_message: Error, full_message: String, customFields: GelfMessage): GelfMessage = js.native
}
