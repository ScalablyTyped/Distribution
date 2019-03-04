package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainedFormat extends js.Object {
  var input: java.lang.String
  var invalidReason: js.UndefOr[java.lang.String] = js.undefined
  var matches: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var rawMatches: js.UndefOr[stdLib.RegExpMatchArray | scala.Null] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  var result: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.undefined
  var tokens: js.Array[luxonLib.Anon_Literal]
  var zone: js.UndefOr[Zone | scala.Null] = js.undefined
}

object ExplainedFormat {
  @scala.inline
  def apply(
    input: java.lang.String,
    tokens: js.Array[luxonLib.Anon_Literal],
    invalidReason: java.lang.String = null,
    matches: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rawMatches: stdLib.RegExpMatchArray = null,
    regex: stdLib.RegExp = null,
    result: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    zone: Zone = null
  ): ExplainedFormat = {
    val __obj = js.Dynamic.literal(input = input, tokens = tokens)
    if (invalidReason != null) __obj.updateDynamic("invalidReason")(invalidReason)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (rawMatches != null) __obj.updateDynamic("rawMatches")(rawMatches)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (result != null) __obj.updateDynamic("result")(result)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[ExplainedFormat]
  }
}

