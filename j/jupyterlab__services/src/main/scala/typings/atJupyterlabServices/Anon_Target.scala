package typings.atJupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: js.UndefOr[String] = js.undefined
}

object Anon_Target {
  @scala.inline
  def apply(target: String = null): Anon_Target = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Target]
  }
}

