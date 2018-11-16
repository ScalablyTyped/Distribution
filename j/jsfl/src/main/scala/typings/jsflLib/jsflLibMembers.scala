package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object jsflLibMembers extends js.Object {
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
  def $(selector: java.lang.String): ElementCollection = js.native
  // http://www.xjsfl.com/support/api/elements/ItemSelector
  @JSName("$$")
  def $$(selector: java.lang.String): ItemCollection = js.native
  def alert(alertText: java.lang.String): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def confirm(strAlert: java.lang.String): scala.Boolean = js.native
  def debug(item: js.Any): scala.Unit = js.native
  def format(format: java.lang.String, params: js.Any*): scala.Unit = js.native
  // Library / class loading
  def include(className: java.lang.String): scala.Unit = js.native
  // Inspection and debugging
  def inspect(item: js.Any): scala.Unit = js.native
  def list(item: js.Any): scala.Unit = js.native
  // File
  def load(filePath: java.lang.String): java.lang.String = js.native
  def prompt(promptMsg: java.lang.String): java.lang.String = js.native
  def prompt(promptMsg: java.lang.String, text: java.lang.String): java.lang.String = js.native
  def require(className: java.lang.String): scala.Unit = js.native
  def save(filePath: java.lang.String, data: java.lang.String): scala.Unit = js.native
  // Global functions
  // Output
  def trace(args: js.Any*): scala.Unit = js.native
}

