package typings.ink

import typings.ink.anon.OffsetX
import typings.ink.domMod.DOMElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink/build/render-node-to-output", JSImport.Namespace)
@js.native
object renderNodeToOutputMod extends js.Object {
  def default(node: DOMElement, output: typings.ink.outputMod.default, options: OffsetX): Unit = js.native
  type OutputTransformer = js.Function1[/* s */ String, String]
}

