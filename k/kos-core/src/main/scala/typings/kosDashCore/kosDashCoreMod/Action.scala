package typings.kosDashCore.kosDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  var payload: js.UndefOr[Partial[T] with StringDictionary[js.Any]] = js.undefined
  var `type`: String
}

object Action {
  @scala.inline
  def apply[T](`type`: String, payload: Partial[T] with StringDictionary[js.Any] = null): Action[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
}

