package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "TextP")
@js.native
class TextP protected () extends js.Object {
  def this(operator: EnumValue, value: java.lang.String) = this()
  def this(operator: EnumValue, value: java.lang.String, other: js.Any) = this()
  def and(): P = js.native
  def and(arg: js.Any): P = js.native
  def or(): P = js.native
  def or(arg: js.Any): P = js.native
}

/* static members */
@JSImport("gremlin", "TextP")
@js.native
object TextP extends js.Object {
  def containing(args: js.Any*): gremlinLib.gremlinMod.TextP = js.native
  def endingWith(args: js.Any*): gremlinLib.gremlinMod.TextP = js.native
  def notContaining(args: js.Any*): gremlinLib.gremlinMod.TextP = js.native
  def notEndingWith(args: js.Any*): gremlinLib.gremlinMod.TextP = js.native
  def notStartingWith(args: js.Any*): gremlinLib.gremlinMod.TextP = js.native
  def startingWith(args: js.Any*): gremlinLib.gremlinMod.TextP = js.native
}

