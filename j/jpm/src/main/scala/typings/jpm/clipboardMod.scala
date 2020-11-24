package typings.jpm

import typings.jpm.jpmStrings.html
import typings.jpm.jpmStrings.image
import typings.jpm.jpmStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sdk/clipboard", JSImport.Namespace)
@js.native
object clipboardMod extends js.Object {
  
  def get(): String = js.native
  @JSName("get")
  def get_html(datatype: html): String = js.native
  @JSName("get")
  def get_image(datatype: image): String = js.native
  @JSName("get")
  def get_text(datatype: text): String = js.native
  
  def set(data: String): Unit = js.native
  @JSName("set")
  def set_html(data: String, datatype: html): Unit = js.native
  @JSName("set")
  def set_image(data: String, datatype: image): Unit = js.native
  @JSName("set")
  def set_text(data: String, datatype: text): Unit = js.native
}
