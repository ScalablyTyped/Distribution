package typings.luxon.luxonMod

import org.scalablytyped.runtime.StringDictionary
import typings.luxon.Anon_Literal
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainedFormat extends js.Object {
  var input: String
  var invalidReason: js.UndefOr[String] = js.undefined
  var matches: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var rawMatches: js.UndefOr[RegExpMatchArray | Null] = js.undefined
  var regex: js.UndefOr[RegExp] = js.undefined
  var result: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var tokens: js.Array[Anon_Literal]
  var zone: js.UndefOr[Zone | Null] = js.undefined
}

object ExplainedFormat {
  @scala.inline
  def apply(
    input: String,
    tokens: js.Array[Anon_Literal],
    invalidReason: String = null,
    matches: StringDictionary[js.Any] = null,
    rawMatches: RegExpMatchArray = null,
    regex: RegExp = null,
    result: StringDictionary[js.Any] = null,
    zone: Zone = null
  ): ExplainedFormat = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    if (invalidReason != null) __obj.updateDynamic("invalidReason")(invalidReason.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (rawMatches != null) __obj.updateDynamic("rawMatches")(rawMatches.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainedFormat]
  }
}

