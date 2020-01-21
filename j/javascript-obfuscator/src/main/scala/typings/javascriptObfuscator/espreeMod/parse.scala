package typings.javascriptObfuscator.espreeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("espree", "parse")
@js.native
object parse extends js.Object {
  def apply(code: String, options: ParseOptions): js.Any = js.native
  def apply(code: Buffer, options: ParseOptions): js.Any = js.native
}

