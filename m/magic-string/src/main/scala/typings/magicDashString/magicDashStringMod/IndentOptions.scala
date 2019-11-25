package typings.magicDashString.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentOptions extends js.Object {
  var exclude: ExclusionRange | js.Array[ExclusionRange]
  var indentStart: Boolean
}

object IndentOptions {
  @scala.inline
  def apply(exclude: ExclusionRange | js.Array[ExclusionRange], indentStart: Boolean): IndentOptions = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], indentStart = indentStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndentOptions]
  }
}

