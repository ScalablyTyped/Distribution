package typings.kosCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispatch extends js.Object {
  var dispatch: js.Any
  var getState: js.Any
}

object AnonDispatch {
  @scala.inline
  def apply(dispatch: js.Any, getState: js.Any): AnonDispatch = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDispatch]
  }
}

