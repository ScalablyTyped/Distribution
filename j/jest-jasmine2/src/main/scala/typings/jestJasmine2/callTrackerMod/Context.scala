package typings.jestJasmine2.callTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var args: js.Array[_]
  var `object`: js.Any
  var returnValue: js.UndefOr[js.Any] = js.undefined
}

object Context {
  @scala.inline
  def apply(args: js.Array[_], `object`: js.Any, returnValue: js.Any = null): Context = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (returnValue != null) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

