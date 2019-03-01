package typings
package jsbnLib.jsbnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomGenerator extends js.Object {
  def nextBytes(bytes: js.Array[scala.Double]): scala.Unit
}

object RandomGenerator {
  @scala.inline
  def apply(nextBytes: js.Function1[js.Array[scala.Double], scala.Unit]): RandomGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextBytes")(nextBytes)
    __obj.asInstanceOf[RandomGenerator]
  }
}

