package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  var payload: js.UndefOr[stdLib.Partial[T]] = js.undefined
  var `type`: java.lang.String
}

object Action {
  @scala.inline
  def apply[T](`type`: java.lang.String, payload: stdLib.Partial[T] = null): Action[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Action[T]]
  }
}

