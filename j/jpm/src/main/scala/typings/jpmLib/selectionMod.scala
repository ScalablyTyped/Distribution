package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Get and set text and HTML selections in the current web page
 */
@JSImport("sdk/selection", JSImport.Namespace)
@js.native
object selectionMod extends js.Object {
  var html: java.lang.String = js.native
  val isContiguous: scala.Boolean = js.native
  var text: java.lang.String = js.native
  @JSName("on")
  def on_select(event: jpmLib.jpmLibStrings.select, handler: js.Function0[_]): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_select(event: jpmLib.jpmLibStrings.select, handler: js.Function): scala.Unit = js.native
}

