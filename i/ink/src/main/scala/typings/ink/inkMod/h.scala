package typings.ink.inkMod

import typings.ink.Anon_Children
import typings.ink.inkStrings.br
import typings.ink.inkStrings.div
import typings.ink.inkStrings.span
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", "h")
@js.native
object h extends js.Object {
  @js.native
  class Fragment protected ()
    extends Component[js.Object, js.Any, js.Any] {
    def this(props: js.Object with Anon_Children, context: js.Object) = this()
  }
  
  val Fragment: InkComponent[js.Object] = js.native
  def apply(`type`: br, props: js.Object, children: InkNode*): InkElement = js.native
  def apply(`type`: div, props: js.Object, children: InkNode*): InkElement = js.native
  def apply(`type`: span, props: js.Object, children: InkNode*): InkElement = js.native
  def apply[P /* <: Record[String, _] */](`type`: ComponentClass[P, _, _], props: P, children: InkNode*): InkElement = js.native
  def apply[P /* <: Record[String, _] */](`type`: StatelessComponent[P, _], props: P, children: InkNode*): InkElement = js.native
}

