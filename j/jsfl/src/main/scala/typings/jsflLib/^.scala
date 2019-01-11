package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  // Global variables
  @JSName("$dom")
  var $dom: jsflLib.FlashDocument = js.native
  @JSName("$library")
  var $library: jsflLib.FlashLibrary = js.native
  @JSName("$selection")
  var $selection: js.Array[jsflLib.FlashElement] = js.native
  @JSName("$timeline")
  var $timeline: jsflLib.FlashTimeline = js.native
  var FLfile: jsflLib.FlashFLfile = js.native
  var fl: jsflLib.FlashFL = js.native
  var xjsfl: jsflLib._xjsfl = js.native
  // http://www.xjsfl.com/support/guides/working-with-flash/introduction-to-selectors
  // http://www.xjsfl.com/support/api/elements/ElementSelector
  @JSName("$")
  def $(selector: java.lang.String): jsflLib.ElementCollection = js.native
  // http://www.xjsfl.com/support/api/elements/ItemSelector
  @JSName("$$")
  def $$(selector: java.lang.String): jsflLib.ItemCollection = js.native
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

