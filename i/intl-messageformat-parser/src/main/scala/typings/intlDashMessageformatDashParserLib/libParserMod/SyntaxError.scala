package typings
package intlDashMessageformatDashParserLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib/parser", "SyntaxError")
@js.native
class SyntaxError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, expected: js.Array[Expectation], found: java.lang.String, location: IFileRange) = this()
  def this(message: java.lang.String, expected: js.Array[Expectation], found: scala.Null, location: IFileRange) = this()
  var expected: js.Array[Expectation] = js.native
  var found: java.lang.String | scala.Null = js.native
  var location: IFileRange = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

/* static members */
@JSImport("intl-messageformat-parser/lib/parser", "SyntaxError")
@js.native
object SyntaxError extends js.Object {
  def buildMessage(expected: js.Array[intlDashMessageformatDashParserLib.libParserMod.Expectation]): java.lang.String = js.native
  def buildMessage(
    expected: js.Array[intlDashMessageformatDashParserLib.libParserMod.Expectation],
    found: java.lang.String
  ): java.lang.String = js.native
}

