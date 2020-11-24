package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorText
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtml
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtmlElement
*/
trait SavingMessageDescriptor extends js.Object
object SavingMessageDescriptor {
  
  @scala.inline
  def SavingMessageDescriptorText(text: String): SavingMessageDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptor]
  }
  
  @scala.inline
  def SavingMessageDescriptorHtml(html: String): SavingMessageDescriptor = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptor]
  }
  
  @scala.inline
  def SavingMessageDescriptorHtmlElement(el: HTMLElement): SavingMessageDescriptor = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptor]
  }
}
