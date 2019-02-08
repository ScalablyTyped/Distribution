package typings
package jscodeshiftLib.srcTemplateMod.templateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** Tagged template function. Parses the string as source and returns an Expression AST node. */
  def expression(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an Statement AST node. */
  def statement(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an array of Statement AST nodes. */
  def statements(args: js.Any*): js.Any
}

