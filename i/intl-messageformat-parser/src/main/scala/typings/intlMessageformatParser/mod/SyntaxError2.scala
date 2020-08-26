package typings.intlMessageformatParser.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxError2 extends Error {
  var expected: js.Array[Expectation] = js.native
  var found: String | Null = js.native
  var location: IFileRange = js.native
}

object SyntaxError2 {
  @scala.inline
  def apply(expected: js.Array[Expectation], location: IFileRange, message: String, name: String): SyntaxError2 = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxError2]
  }
  @scala.inline
  implicit class SyntaxError2Ops[Self <: SyntaxError2] (val x: Self) extends AnyVal {
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
    def setExpectedVarargs(value: Expectation*): Self = this.set("expected", js.Array(value :_*))
    @scala.inline
    def setExpected(value: js.Array[Expectation]): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: IFileRange): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setFound(value: String): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoundNull: Self = this.set("found", null)
  }
  
}

