package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedArguments
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var argv: js.Array[java.lang.String]
  var rest: js.Array[java.lang.String]
}

object ParsedArguments {
  @scala.inline
  def apply(
    argv: js.Array[java.lang.String],
    rest: js.Array[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ParsedArguments = {
    val __obj = js.Dynamic.literal(argv = argv, rest = rest)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedArguments]
  }
}

