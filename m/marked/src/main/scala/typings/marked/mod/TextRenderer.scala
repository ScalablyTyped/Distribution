package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "TextRenderer")
@js.native
class TextRenderer () extends js.Object {
  
  def br(): String = js.native
  
  def codespan(text: String): String = js.native
  
  def del(text: String): String = js.native
  
  def em(text: String): String = js.native
  
  def html(text: String): String = js.native
  
  def image(href: String, title: String, text: String): String = js.native
  def image(href: String, title: Null, text: String): String = js.native
  def image(href: Null, title: String, text: String): String = js.native
  def image(href: Null, title: Null, text: String): String = js.native
  
  def link(href: String, title: String, text: String): String = js.native
  def link(href: String, title: Null, text: String): String = js.native
  def link(href: Null, title: String, text: String): String = js.native
  def link(href: Null, title: Null, text: String): String = js.native
  
  def strong(text: String): String = js.native
  
  def text(text: String): String = js.native
}
