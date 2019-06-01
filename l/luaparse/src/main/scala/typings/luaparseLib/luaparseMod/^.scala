package typings
package luaparseLib.luaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luaparse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(): Parser = js.native
  def parse(code: java.lang.String): luaparseLib.libAstMod.Chunk = js.native
  def parse(code: java.lang.String, options: stdLib.Partial[Options] with luaparseLib.Anon_True): Parser = js.native
  def parse(options: stdLib.Partial[Options]): Parser = js.native
  @JSName("parse")
  def parse_Chunk(code: java.lang.String, options: stdLib.Partial[Options]): luaparseLib.libAstMod.Chunk = js.native
}

