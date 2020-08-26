package typings.loadableComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = js.native
  def lib[Module](loadFn: js.Function1[/* props */ js.Object, js.Promise[Module]]): LoadableLibrary[Module] = js.native
}

