package typings.graphql.languageVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterLeave[T] extends js.Object {
  val enter: js.UndefOr[T] = js.undefined
  val leave: js.UndefOr[T] = js.undefined
}

object EnterLeave {
  @scala.inline
  def apply[T](enter: T = null, leave: T = null): EnterLeave[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterLeave[T]]
  }
}

