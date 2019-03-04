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
  def apply(execute: js.Function0[scala.Unit]): XSuite = {
    val __obj = js.Dynamic.literal(execute = execute)
  
    __obj.asInstanceOf[XSuite]
  }
}

