package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  var code: scala.Double
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object Reason {
  @scala.inline
  def apply(code: scala.Double, description: java.lang.String = null): Reason = {
    val __obj = js.Dynamic.literal(code = code)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Reason]
  }
}

