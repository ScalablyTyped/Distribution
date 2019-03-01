package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawArguments extends js.Object {
  var args: js.Array[RawArgument]
  var rest: js.Array[java.lang.String]
}

object RawArguments {
  @scala.inline
  def apply(args: js.Array[RawArgument], rest: js.Array[java.lang.String]): RawArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("rest")(rest)
    __obj.asInstanceOf[RawArguments]
  }
}

