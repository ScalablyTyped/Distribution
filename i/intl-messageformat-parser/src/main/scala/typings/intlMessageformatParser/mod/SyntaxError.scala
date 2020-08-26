package typings.intlMessageformatParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser", "SyntaxError")
@js.native
class SyntaxError protected () extends SyntaxError2 {
  def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
  def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
}

/* static members */
@JSImport("intl-messageformat-parser", "SyntaxError")
@js.native
object SyntaxError extends js.Object {
  def buildMessage(expected: js.Array[Expectation]): String = js.native
  def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
}

