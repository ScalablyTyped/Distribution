package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.log4jsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternLayout extends Layout {
  // specifier for the output format, using placeholders as described below
  var pattern: String = js.native
  // user-defined tokens to be used in the pattern
  var tokens: js.UndefOr[StringDictionary[Token]] = js.native
  var `type`: pattern = js.native
}

object PatternLayout {
  @scala.inline
  def apply(pattern: String, `type`: pattern): PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternLayout]
  }
  @scala.inline
  implicit class PatternLayoutOps[Self <: PatternLayout] (val x: Self) extends AnyVal {
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: pattern): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokens(value: StringDictionary[Token]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
  
}

