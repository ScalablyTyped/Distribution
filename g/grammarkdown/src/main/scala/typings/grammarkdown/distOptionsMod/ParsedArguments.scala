package typings.grammarkdown.distOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedArguments
  extends /* key */ StringDictionary[js.Any] {
  var argv: js.Array[String]
  var rest: js.Array[String]
}

object ParsedArguments {
  @scala.inline
  def apply(
    argv: js.Array[String],
    rest: js.Array[String],
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): ParsedArguments = {
    val __obj = js.Dynamic.literal(argv = argv, rest = rest)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedArguments]
  }
}

