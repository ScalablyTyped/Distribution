package typings
package atIonicReactLib.distTypesComponentsNavigationRoutingIonRouterOutletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/routing/IonRouterOutlet", "IonRouterOutlet")
@js.native
class IonRouterOutlet protected ()
  extends reactLib.reactMod.Component[IonRouterOutletProps, IonRouterOutletState, js.Any] {
  def this(props: IonRouterOutletProps) = this()
  var containerEl: reactLib.reactMod.RefObject[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonRouterOutletElement] = js.native
  @JSName("context")
  var context_IonRouterOutlet: reactLib.reactMod.ContextType[
    reactLib.reactMod.Context[
      atIonicReactLib.distTypesComponentsNavigationRoutingNavContextMod.NavContextState
    ]
  ] = js.native
  var id: java.lang.String = js.native
  @JSName("componentDidMount")
  def componentDidMount_MIonRouterOutlet(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MIonRouterOutlet(): scala.Unit = js.native
}

