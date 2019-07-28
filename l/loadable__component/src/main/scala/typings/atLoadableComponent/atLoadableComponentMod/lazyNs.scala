package typings.atLoadableComponent.atLoadableComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", "lazy")
@js.native
object lazyNs extends js.Object {
  def lib[TModule](loadFn: js.Function1[/* props */ js.Object, js.Promise[TModule]]): LoadableLibrary[TModule] = js.native
}

