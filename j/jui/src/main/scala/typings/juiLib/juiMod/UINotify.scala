package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UINotify extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_BottomBottomleft): this.type = js.native
  /**
    * Adds a notice message. The value passed is the data object shown by the notice template
    *
    */
  def add(data: js.Object, timeout: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

