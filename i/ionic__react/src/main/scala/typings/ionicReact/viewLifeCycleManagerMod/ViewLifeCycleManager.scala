package typings.ionicReact.viewLifeCycleManagerMod

import typings.ionicReact.anon.ComponentCanBeDestroyed
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/routing/ViewLifeCycleManager", "ViewLifeCycleManager")
@js.native
class ViewLifeCycleManager protected ()
  extends Component[ViewTransitionManagerProps, ViewTransitionManagerState, js.Any] {
  def this(props: ViewTransitionManagerProps) = this()
  var _isMounted: js.Any = js.native
  var ionLifeCycleContext: ComponentCanBeDestroyed = js.native
  @JSName("componentDidMount")
  def componentDidMount_MViewLifeCycleManager(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MViewLifeCycleManager(): Unit = js.native
}

