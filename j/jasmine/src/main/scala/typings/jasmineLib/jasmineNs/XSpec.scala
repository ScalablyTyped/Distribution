package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSpec extends js.Object {
  var id: scala.Double
  def runs(): scala.Unit
}

object XSpec {
  @scala.inline
  def apply(id: scala.Double, runs: js.Function0[scala.Unit]): XSpec = {
    val __obj = js.Dynamic.literal(id = id, runs = runs)
  
    __obj.asInstanceOf[XSpec]
  }
}

