package typings.luxon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.luxon.anon.Literal
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
  var tokens: js.Array[Literal]
  var zone: js.UndefOr[Zone | Null] = js.undefined
}

object ExplainedFormat {
  @scala.inline
  def apply(
    input: String,
    tokens: js.Array[Literal],
    invalidReason: String = null,
    matches: StringDictionary[js.Any] = null,
    rawMatches: js.UndefOr[Null | RegExpMatchArray] = js.undefined,
    regex: RegExp = null,
    result: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined,
    zone: js.UndefOr[Null | Zone] = js.undefined
  ): ExplainedFormat = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    if (invalidReason != null) __obj.updateDynamic("invalidReason")(invalidReason.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (!js.isUndefined(rawMatches)) __obj.updateDynamic("rawMatches")(rawMatches.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (!js.isUndefined(result)) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(zone)) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainedFormat]
  }
}

