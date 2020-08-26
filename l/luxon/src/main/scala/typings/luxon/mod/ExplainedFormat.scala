package typings.luxon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.luxon.anon.Literal
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplainedFormat extends js.Object {
  var input: String = js.native
  var invalidReason: js.UndefOr[String] = js.native
  var matches: js.UndefOr[StringDictionary[js.Any]] = js.native
  var rawMatches: js.UndefOr[RegExpMatchArray | Null] = js.native
  var regex: js.UndefOr[RegExp] = js.native
  var result: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  var tokens: js.Array[Literal] = js.native
  var zone: js.UndefOr[Zone | Null] = js.native
}

object ExplainedFormat {
  @scala.inline
  def apply(input: String, tokens: js.Array[Literal]): ExplainedFormat = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainedFormat]
  }
  @scala.inline
  implicit class ExplainedFormatOps[Self <: ExplainedFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: Literal*): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[Literal]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidReason(value: String): Self = this.set("invalidReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidReason: Self = this.set("invalidReason", js.undefined)
    @scala.inline
    def setMatches(value: StringDictionary[js.Any]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    @scala.inline
    def setRawMatches(value: RegExpMatchArray): Self = this.set("rawMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawMatches: Self = this.set("rawMatches", js.undefined)
    @scala.inline
    def setRawMatchesNull: Self = this.set("rawMatches", null)
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    @scala.inline
    def setResult(value: StringDictionary[js.Any]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setResultNull: Self = this.set("result", null)
    @scala.inline
    def setZone(value: Zone): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
    @scala.inline
    def setZoneNull: Self = this.set("zone", null)
  }
  
}

