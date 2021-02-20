package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorText
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtml
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtmlElement
*/
trait SavingMessageDescriptor extends StObject
object SavingMessageDescriptor {
  
  @scala.inline
  def SavingMessageDescriptorHtml(html: String): typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtml]
  }
  
  @scala.inline
  def SavingMessageDescriptorHtmlElement(el: HTMLElement): typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtmlElement]
  }
  
  @scala.inline
  def SavingMessageDescriptorText(text: String): typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorText]
  }
}
