package typings.luaparse.mod

import typings.luaparse.PartialOptions
import typings.luaparse.PartialOptionswaittrue
import typings.luaparse.astMod.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luaparse", "parse")
@js.native
object parse extends js.Object {
  def apply(): Parser = js.native
  def apply(code: String): Chunk = js.native
  def apply(code: String, options: PartialOptions): Chunk = js.native
  def apply(code: String, options: PartialOptionswaittrue): Parser = js.native
  def apply(options: PartialOptions): Parser = js.native
}

