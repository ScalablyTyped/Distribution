package typings.loadableComponent.anon

import typings.loadableComponent.mod.LoadableLibrary
import typings.loadableComponent.mod.OptionsWithoutResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[Props, Module](loadFn: js.Function1[/* props */ Props, js.Promise[Module]]): LoadableLibrary[Module] = js.native
  def apply[Props, Module](
    loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
    options: OptionsWithoutResolver[Props]
  ): LoadableLibrary[Module] = js.native
}

