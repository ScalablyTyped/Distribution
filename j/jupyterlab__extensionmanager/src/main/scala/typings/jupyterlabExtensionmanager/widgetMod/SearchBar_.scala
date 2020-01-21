package typings.jupyterlabExtensionmanager.widgetMod

import typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties
import typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IState
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/widget", "SearchBar")
@js.native
class SearchBar_ protected ()
  extends Component[IProperties, IState, js.Any] {
  def this(props: IProperties) = this()
  /**
    * Handler for search input changes.
    */
  def handleChange(e: FormEvent[HTMLElement]): Unit = js.native
}

