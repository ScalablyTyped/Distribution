package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSuite extends js.Object {
  def execute(): scala.Unit
}

object XSuite {
  @scala.inline
  def apply(execute: () => scala.Unit): XSuite = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
  
    __obj.asInstanceOf[XSuite]
  }
}

