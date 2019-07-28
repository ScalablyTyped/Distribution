package typings.luaparse.luaparseMod

import typings.luaparse.Anon_True
import typings.luaparse.libAstMod.Chunk
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luaparse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(): Parser = js.native
  def parse(code: String): Chunk = js.native
  def parse(code: String, options: Partial[Options]): Chunk = js.native
  def parse(options: Partial[Options]): Parser = js.native
  @JSName("parse")
  def parse_Parser(code: String, options: Partial[Options] with Anon_True): Parser = js.native
}

