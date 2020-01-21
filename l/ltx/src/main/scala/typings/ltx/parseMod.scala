package typings.ltx

import typings.ltx.elementMod.Element
import typings.ltx.parserMod.Parser
import typings.ltx.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  def parse(data: String): Element = js.native
  def parse(data: String, options: Parser): Element = js.native
  def parse(data: String, options: ParserOptions): Element = js.native
}

