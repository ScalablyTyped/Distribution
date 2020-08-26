package typings.loadableComponent.mod

import typings.loadableComponent.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", JSImport.Default)
@js.native
object default extends js.Object {
  var lib: FnCall = js.native
  def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = js.native
  def apply[Props](
    loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]],
    options: OptionsWithoutResolver[Props]
  ): LoadableComponent[Props] = js.native
  def apply[Props, Module](
    loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
    options: OptionsWithResolver[Props, Module]
  ): LoadableComponent[Props] = js.native
}

