package typings
package inkLib.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", JSImport.Namespace)
@js.native
object inkModMembers extends js.Object {
  val Bold: InkComponent[js.Object] = js.native
  val Color: ComponentClass[inkLib.Anon_BgYellowBright, js.Object, js.Object] = js.native
  val Fragment: InkComponent[js.Object] = js.native
  val Underline: InkComponent[js.Object] = js.native
  def h[P /* <: stdLib.Record[java.lang.String, _] */](`type`: ComponentClass[P, _, _], props: P, children: InkNode*): InkElement = js.native
  def h[P /* <: stdLib.Record[java.lang.String, _] */](`type`: StatelessComponent[P, _], props: P, children: InkNode*): InkElement = js.native
  @JSName("h")
  def h_br(`type`: inkLib.inkLibStrings.br, props: js.Object, children: InkNode*): InkElement = js.native
  @JSName("h")
  def h_div(`type`: inkLib.inkLibStrings.div, props: js.Object, children: InkNode*): InkElement = js.native
  @JSName("h")
  def h_span(`type`: inkLib.inkLibStrings.span, props: js.Object, children: InkNode*): InkElement = js.native
  def render(tree: InkElement): js.Function0[scala.Unit] = js.native
  def render(tree: InkElement, stream: nodeLib.NodeJSNs.WriteStream): js.Function0[scala.Unit] = js.native
  def renderToString(tree: InkElement): java.lang.String = js.native
  def renderToString(tree: InkElement, prevTree: InkElement): java.lang.String = js.native
}

