package typings.atIonicReact.distTypesComponentsNavigationRoutingIonRouterOutletMod

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonRouterOutletElement
import typings.atIonicReact.distTypesComponentsNavigationRoutingNavContextMod.NavContextState
import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/routing/IonRouterOutlet", "IonRouterOutlet")
@js.native
class IonRouterOutlet protected ()
  extends Component[IonRouterOutletProps, IonRouterOutletState, js.Any] {
  def this(props: IonRouterOutletProps) = this()
  var containerEl: RefObject[HTMLIonRouterOutletElement] = js.native
  @JSName("context")
  var context_IonRouterOutlet: ContextType[Context[NavContextState]] = js.native
  var id: String = js.native
  @JSName("componentDidMount")
  def componentDidMount_MIonRouterOutlet(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MIonRouterOutlet(): Unit = js.native
}

