package typings.luaparse.mod

import typings.luaparse.AnonTrue
import typings.luaparse.astMod.Chunk
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luaparse", "parse")
@js.native
object parse extends js.Object {
  def apply(): Parser = js.native
  def apply(code: String): Chunk = js.native
  def apply(code: String, options: Partial[Options] with AnonTrue): Parser = js.native
  def apply(options: Partial[Options]): Parser = js.native
}

