package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  // Global variables
  @JSName("$dom")
  var $dom: FlashDocument = js.native
  @JSName("$library")
  var $library: FlashLibrary = js.native
  @JSName("$selection")
  var $selection: js.Array[FlashElement] = js.native
  @JSName("$timeline")
  var $timeline: FlashTimeline = js.native
  var FLfile: FlashFLfile = js.native
  var fl: FlashFL = js.native
  var xjsfl: _xjsfl = js.native
  // http://www.xjsfl.com/support/guides/working-with-flash/introduction-to-selectors
  // http://www.xjsfl.com/support/api/elements/ElementSelector
  @JSName("$")
  def $(selector: String): ElementCollection = js.native
  // http://www.xjsfl.com/support/api/elements/ItemSelector
  @JSName("$$")
  def $$(selector: String): ItemCollection = js.native
  def alert(alertText: String): Unit = js.native
  def clear(): Unit = js.native
  def confirm(strAlert: String): Boolean = js.native
  def debug(item: js.Any): Unit = js.native
  def format(format: String, params: js.Any*): Unit = js.native
  // Library / class loading
  def include(className: String): Unit = js.native
  // Inspection and debugging
  def inspect(item: js.Any): Unit = js.native
  def list(item: js.Any): Unit = js.native
  // File
  def load(filePath: String): String = js.native
  def prompt(promptMsg: String): String = js.native
  def prompt(promptMsg: String, text: String): String = js.native
  def require(className: String): Unit = js.native
  def save(filePath: String, data: String): Unit = js.native
  // Global functions
  // Output
  def trace(args: js.Any*): Unit = js.native
}

