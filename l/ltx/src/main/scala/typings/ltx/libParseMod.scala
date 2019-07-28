package typings.ltx

import typings.ltx.libElementMod.Element
import typings.ltx.libParserMod.Parser
import typings.ltx.libParserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/parse", JSImport.Namespace)
@js.native
object libParseMod extends js.Object {
  def parse(data: String): Element = js.native
  def parse(data: String, options: Parser): Element = js.native
  def parse(data: String, options: ParserOptions): Element = js.native
}

