package typings.intlMessageformatParser.parserMod

import typings.intlMessageformatParser.intlMessageformatParserStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOtherExpectation extends Expectation {
  var description: String = js.native
  var `type`: other = js.native
}

object IOtherExpectation {
  @scala.inline
  def apply(description: String, `type`: other): IOtherExpectation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherExpectation]
  }
  @scala.inline
  implicit class IOtherExpectationOps[Self <: IOtherExpectation] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: other): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

