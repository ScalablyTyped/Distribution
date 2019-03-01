package typings
package kosDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispatch extends js.Object {
  var dispatch: js.Any
  var getState: js.Any
}

object Anon_Dispatch {
  @scala.inline
  def apply(dispatch: js.Any, getState: js.Any): Anon_Dispatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[Anon_Dispatch]
  }
}

