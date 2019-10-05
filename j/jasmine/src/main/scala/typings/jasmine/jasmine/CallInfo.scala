package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallInfo extends js.Object {
  /** All arguments passed to the call */
  var args: js.Array[_]
  /** The context (the this) for the call */
  var `object`: js.Any
  /** The return value of the call */
  var returnValue: js.Any
}

object CallInfo {
  @scala.inline
  def apply(args: js.Array[_], `object`: js.Any, returnValue: js.Any): CallInfo = {
    val __obj = js.Dynamic.literal(args = args, returnValue = returnValue)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[CallInfo]
  }
}

