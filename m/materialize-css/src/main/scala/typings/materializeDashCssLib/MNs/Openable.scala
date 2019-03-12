package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Openable extends js.Object {
  var isOpen: scala.Boolean
  def close(): scala.Unit
  def open(): scala.Unit
}

object Openable {
  @scala.inline
  def apply(close: () => scala.Unit, isOpen: scala.Boolean, open: () => scala.Unit): Openable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen, open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[Openable]
  }
}

