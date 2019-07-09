package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser", "SyntaxError")
@js.native
class SyntaxError protected ()
  extends intlDashMessageformatDashParserLib.libParserMod.SyntaxError {
  def this(message: java.lang.String, expected: js.Array[intlDashMessageformatDashParserLib.libParserMod.Expectation], found: java.lang.String, location: intlDashMessageformatDashParserLib.libParserMod.IFileRange) = this()
  def this(message: java.lang.String, expected: js.Array[intlDashMessageformatDashParserLib.libParserMod.Expectation], found: scala.Null, location: intlDashMessageformatDashParserLib.libParserMod.IFileRange) = this()
}

/* static members */
@JSImport("intl-messageformat-parser", "SyntaxError")
@js.native
object SyntaxError extends js.Object {
  def buildMessage(expected: js.Array[intlDashMessageformatDashParserLib.libParserMod.Expectation]): java.lang.String = js.native
  def buildMessage(
    expected: js.Array[intlDashMessageformatDashParserLib.libParserMod.Expectation],
    found: java.lang.String
  ): java.lang.String = js.native
}

