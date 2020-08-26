package typings.ink.buildLayoutMod

import typings.ink.domMod.DOMElement
import typings.ink.domMod.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink/build/build-layout", "buildLayout")
@js.native
object buildLayout extends js.Object {
  def apply(node: DOMElement, options: BuildLayoutOptions): TextNode | DOMElement = js.native
  def apply(node: TextNode, options: BuildLayoutOptions): TextNode | DOMElement = js.native
}

