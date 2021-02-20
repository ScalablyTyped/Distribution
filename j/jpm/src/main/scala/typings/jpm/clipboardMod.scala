package typings.jpm

import typings.jpm.jpmStrings.html
import typings.jpm.jpmStrings.image
import typings.jpm.jpmStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  @JSImport("sdk/clipboard", "get")
  @js.native
  def get(): String = js.native
  @JSImport("sdk/clipboard", "get")
  @js.native
  def get_html(datatype: html): String = js.native
  @JSImport("sdk/clipboard", "get")
  @js.native
  def get_image(datatype: image): String = js.native
  @JSImport("sdk/clipboard", "get")
  @js.native
  def get_text(datatype: text): String = js.native
  
  @JSImport("sdk/clipboard", "set")
  @js.native
  def set(data: String): Unit = js.native
  @JSImport("sdk/clipboard", "set")
  @js.native
  def set_html(data: String, datatype: html): Unit = js.native
  @JSImport("sdk/clipboard", "set")
  @js.native
  def set_image(data: String, datatype: image): Unit = js.native
  @JSImport("sdk/clipboard", "set")
  @js.native
  def set_text(data: String, datatype: text): Unit = js.native
}
