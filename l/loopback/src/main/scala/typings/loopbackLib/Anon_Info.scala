package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Info extends js.Object {
  var info: js.Any
  var infoCount: scala.Double
}

object Anon_Info {
  @scala.inline
  def apply(info: js.Any, infoCount: scala.Double): Anon_Info = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("infoCount")(infoCount)
    __obj.asInstanceOf[Anon_Info]
  }
}

