package typings.jpm

import typings.jpm.jpmStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get and set text and HTML selections in the current web page
  */
@JSImport("sdk/selection", JSImport.Namespace)
@js.native
object selectionMod extends js.Object {
  var html: String = js.native
  val isContiguous: Boolean = js.native
  var text: String = js.native
  @JSName("on")
  def on_select(event: select, handler: js.Function0[_]): Unit = js.native
  @JSName("removeListener")
  def removeListener_select(event: select, handler: js.Function): Unit = js.native
}

