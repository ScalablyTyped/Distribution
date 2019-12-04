package typings.atJupyterlabJsonDashExtension.libComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var filter: js.UndefOr[String] = js.undefined
  var value: String
}

object IState {
  @scala.inline
  def apply(value: String, filter: String = null): IState = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

