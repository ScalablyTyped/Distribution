package typings.limeDashJs.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  var code: Double
  var description: js.UndefOr[String] = js.undefined
}

object Reason {
  @scala.inline
  def apply(code: Double, description: String = null): Reason = {
    val __obj = js.Dynamic.literal(code = code)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Reason]
  }
}

