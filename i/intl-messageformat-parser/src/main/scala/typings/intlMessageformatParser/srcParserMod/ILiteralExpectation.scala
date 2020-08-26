package typings.intlMessageformatParser.srcParserMod

import typings.intlMessageformatParser.intlMessageformatParserStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILiteralExpectation extends Expectation {
  var ignoreCase: Boolean = js.native
  var text: String = js.native
  var `type`: literal = js.native
}

object ILiteralExpectation {
  @scala.inline
  def apply(ignoreCase: Boolean, text: String, `type`: literal): ILiteralExpectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILiteralExpectation]
  }
  @scala.inline
  implicit class ILiteralExpectationOps[Self <: ILiteralExpectation] (val x: Self) extends AnyVal {
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
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: literal): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

