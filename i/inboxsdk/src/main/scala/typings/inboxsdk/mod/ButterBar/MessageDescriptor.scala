package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.ButterBar.MessageDescriptorText
  - typings.inboxsdk.mod.ButterBar.MessageDescriptorHtml
  - typings.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement
*/
trait MessageDescriptor extends StObject
object MessageDescriptor {
  
  @scala.inline
  def MessageDescriptorHtml(html: String): typings.inboxsdk.mod.ButterBar.MessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.ButterBar.MessageDescriptorHtml]
  }
  
  @scala.inline
  def MessageDescriptorHtmlElement(el: HTMLElement): typings.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement]
  }
  
  @scala.inline
  def MessageDescriptorText(text: String): typings.inboxsdk.mod.ButterBar.MessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.ButterBar.MessageDescriptorText]
  }
}
