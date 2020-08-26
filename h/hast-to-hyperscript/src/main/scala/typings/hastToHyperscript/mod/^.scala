package typings.hastToHyperscript.mod

import typings.std.ReturnType
import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hast-to-hyperscript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Hast utility to transform a tree to something else through a hyperscript DSL.
    *
    * @param h Hyperscript function
    * @param tree Tree to transform
    * @param options Options or prefix
    * @typeParam H a Hyperscript like function type, can be inferred
    */
  def apply[H /* <: CreateElementLike */](h: H, tree: Node): ReturnType[H] = js.native
  def apply[H /* <: CreateElementLike */](h: H, tree: Node, options: Options): ReturnType[H] = js.native
  def apply[H /* <: CreateElementLike */](h: H, tree: Node, options: Prefix): ReturnType[H] = js.native
}

