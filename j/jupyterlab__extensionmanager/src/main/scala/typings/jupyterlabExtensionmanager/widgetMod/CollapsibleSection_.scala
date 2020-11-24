package typings.jupyterlabExtensionmanager.widgetMod

import typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IState
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/extensionmanager/lib/widget", "CollapsibleSection")
@js.native
class CollapsibleSection_ protected ()
  extends Component[IProperties, IState, js.Any] {
  def this(props: IProperties) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MCollapsibleSection_(nextProps: IProperties): Unit = js.native
  
  /**
    * Handler for search input changes.
    */
  def handleCollapse(): Unit = js.native
}
