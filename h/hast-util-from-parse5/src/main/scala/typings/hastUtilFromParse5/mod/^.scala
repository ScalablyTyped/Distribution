package typings.hastUtilFromParse5.mod

import typings.parse5.mod.Document
import typings.unist.mod.Node
import typings.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hast-util-from-parse5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Transform [Parse5’s AST](https://github.com/inikulin/parse5/blob/master/packages/parse5/docs/tree-adapter/default/interface-list.md)
    * to a [**hast**](https://github.com/syntax-tree/hast)
    * [*tree*](https://github.com/syntax-tree/unist#tree).
    *
    * @param options If `options` is a [`VFile`](https://github.com/vfile/vfile), it’s treated
    *                 as `{file: options}`.
    */
  def apply(ast: Document): Node = js.native
  def apply(ast: Document, options: HastUtilFromParse5Options): Node = js.native
  def apply(ast: Document, options: VFile): Node = js.native
}

