package typings.atJupyterlabExtensionmanager.libWidgetMod

import typings.atJupyterlabExtensionmanager.libWidgetMod.SearchBarNs.IProperties
import typings.atJupyterlabExtensionmanager.libWidgetMod.SearchBarNs.IState
import typings.react.reactMod.Component
import typings.react.reactMod.FormEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/widget", "SearchBar")
@js.native
class SearchBar protected ()
  extends Component[IProperties, IState, js.Any] {
  def this(props: IProperties) = this()
  /**
    * Handler for search input changes.
    */
  def handleChange(e: FormEvent[HTMLElement]): Unit = js.native
}

