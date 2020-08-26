package typings.hastUtilRaw

import typings.unist.mod.Node
import typings.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hast-util-raw", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Given a hast tree and an optional vfile (for positional info), return a new parsed-again hast tree.
    * @param tree original hast tree
    * @param file positional info
    */
  def apply(tree: Node): Node = js.native
  def apply(tree: Node, file: VFile): Node = js.native
}

