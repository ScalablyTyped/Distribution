package typings.intlDashMessageformatDashParser.libParserMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib/parser", "SyntaxError")
@js.native
class SyntaxError protected () extends Error {
  def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
  def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  var expected: js.Array[Expectation] = js.native
  var found: String | Null = js.native
  var location: IFileRange = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

/* static members */
@JSImport("intl-messageformat-parser/lib/parser", "SyntaxError")
@js.native
object SyntaxError extends js.Object {
  def buildMessage(expected: js.Array[Expectation]): String = js.native
  def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
}

