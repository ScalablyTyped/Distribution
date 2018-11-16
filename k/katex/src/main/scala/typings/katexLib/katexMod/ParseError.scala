package typings
package katexLib.katexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex", "ParseError")
@js.native
class ParseError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, lexer: js.Any, position: scala.Double) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var position: scala.Double = js.native
}

