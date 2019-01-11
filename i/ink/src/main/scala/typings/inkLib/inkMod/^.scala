package typings
package inkLib.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Bold: inkLib.inkMod.InkComponent[js.Object] = js.native
  val Color: inkLib.inkMod.ComponentClass[inkLib.Anon_BgBlack, js.Object, js.Object] = js.native
  val Fragment: inkLib.inkMod.InkComponent[js.Object] = js.native
  val Underline: inkLib.inkMod.InkComponent[js.Object] = js.native
  def h[P /* <: stdLib.Record[java.lang.String, _] */](`type`: inkLib.inkMod.ComponentClass[P, _, _], props: P, children: inkLib.inkMod.InkNode*): inkLib.inkMod.InkElement = js.native
  def h[P /* <: stdLib.Record[java.lang.String, _] */](`type`: inkLib.inkMod.StatelessComponent[P, _], props: P, children: inkLib.inkMod.InkNode*): inkLib.inkMod.InkElement = js.native
  @JSName("h")
  def h_br(`type`: inkLib.inkLibStrings.br, props: js.Object, children: inkLib.inkMod.InkNode*): inkLib.inkMod.InkElement = js.native
  @JSName("h")
  def h_div(`type`: inkLib.inkLibStrings.div, props: js.Object, children: inkLib.inkMod.InkNode*): inkLib.inkMod.InkElement = js.native
  @JSName("h")
  def h_span(`type`: inkLib.inkLibStrings.span, props: js.Object, children: inkLib.inkMod.InkNode*): inkLib.inkMod.InkElement = js.native
  def render(tree: inkLib.inkMod.InkElement): js.Function0[scala.Unit] = js.native
  def render(tree: inkLib.inkMod.InkElement, stream: nodeLib.NodeJSNs.WriteStream): js.Function0[scala.Unit] = js.native
  def renderToString(tree: inkLib.inkMod.InkElement): java.lang.String = js.native
  def renderToString(tree: inkLib.inkMod.InkElement, prevTree: inkLib.inkMod.InkElement): java.lang.String = js.native
}

