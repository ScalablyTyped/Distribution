package typings.ink.inkMod

import typings.ink.Anon_BgBlack
import typings.ink.inkStrings.br
import typings.ink.inkStrings.div
import typings.ink.inkStrings.span
import typings.node.NodeJSNs.WriteStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Bold: InkComponent[js.Object] = js.native
  val Color: ComponentClass[Anon_BgBlack, js.Object, js.Object] = js.native
  val Fragment: InkComponent[js.Object] = js.native
  val Underline: InkComponent[js.Object] = js.native
  def h[P /* <: Record[String, _] */](`type`: ComponentClass[P, _, _], props: P, children: InkNode*): InkElement = js.native
  def h[P /* <: Record[String, _] */](`type`: StatelessComponent[P, _], props: P, children: InkNode*): InkElement = js.native
  @JSName("h")
  def h_br(`type`: br, props: js.Object, children: InkNode*): InkElement = js.native
  @JSName("h")
  def h_div(`type`: div, props: js.Object, children: InkNode*): InkElement = js.native
  @JSName("h")
  def h_span(`type`: span, props: js.Object, children: InkNode*): InkElement = js.native
  def render(tree: InkElement): js.Function0[Unit] = js.native
  def render(tree: InkElement, stream: WriteStream): js.Function0[Unit] = js.native
  def renderToString(tree: InkElement): String = js.native
  def renderToString(tree: InkElement, prevTree: InkElement): String = js.native
}

