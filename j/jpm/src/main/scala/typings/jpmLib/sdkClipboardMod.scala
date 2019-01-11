package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/clipboard", JSImport.Namespace)
@js.native
object sdkClipboardMod extends js.Object {
  def get(): java.lang.String = js.native
  @JSName("get")
  def get_html(datatype: jpmLib.jpmLibStrings.html): java.lang.String = js.native
  @JSName("get")
  def get_image(datatype: jpmLib.jpmLibStrings.image): java.lang.String = js.native
  @JSName("get")
  def get_text(datatype: jpmLib.jpmLibStrings.text): java.lang.String = js.native
  def set(data: java.lang.String): scala.Unit = js.native
  @JSName("set")
  def set_html(data: java.lang.String, datatype: jpmLib.jpmLibStrings.html): scala.Unit = js.native
  @JSName("set")
  def set_image(data: java.lang.String, datatype: jpmLib.jpmLibStrings.image): scala.Unit = js.native
  @JSName("set")
  def set_text(data: java.lang.String, datatype: jpmLib.jpmLibStrings.text): scala.Unit = js.native
}

