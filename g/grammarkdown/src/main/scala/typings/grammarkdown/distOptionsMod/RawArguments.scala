package typings.grammarkdown.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawArguments extends js.Object {
  var args: js.Array[RawArgument]
  var rest: js.Array[String]
}

object RawArguments {
  @scala.inline
  def apply(args: js.Array[RawArgument], rest: js.Array[String]): RawArguments = {
    val __obj = js.Dynamic.literal(args = args, rest = rest)
  
    __obj.asInstanceOf[RawArguments]
  }
}

