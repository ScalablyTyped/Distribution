package typings.kosCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispatch extends js.Object {
  var dispatch: js.Any
  var getState: js.Any
}

object Dispatch {
  @scala.inline
  def apply(dispatch: js.Any, getState: js.Any): Dispatch = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispatch]
  }
}

