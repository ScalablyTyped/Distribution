package typings.intlMessageformat.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "FormatError")
@js.native
class FormatError protected () extends Error {
  def this(msg: String, code: ErrorCode) = this()
  def this(msg: String, code: ErrorCode, originalMessage: String) = this()
  val code: ErrorCode = js.native
  /**
    * Original message we're trying to format
    * `undefined` if we're only dealing w/ AST
    *
    * @type {(string | undefined)}
    * @memberof FormatError
    */
  val originalMessage: js.UndefOr[String] = js.native
}

