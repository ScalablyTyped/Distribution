package typings
package atJupyterlabExtensionmanagerLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/widget", "SearchBar")
@js.native
class SearchBar protected ()
  extends reactLib.reactMod.Component[
      atJupyterlabExtensionmanagerLib.libWidgetMod.SearchBarNs.IProperties, 
      atJupyterlabExtensionmanagerLib.libWidgetMod.SearchBarNs.IState, 
      js.Any
    ] {
  def this(props: atJupyterlabExtensionmanagerLib.libWidgetMod.SearchBarNs.IProperties) = this()
  /**
    * Handler for search input changes.
    */
  def handleChange(e: stdLib.KeyboardEvent): scala.Unit = js.native
}

