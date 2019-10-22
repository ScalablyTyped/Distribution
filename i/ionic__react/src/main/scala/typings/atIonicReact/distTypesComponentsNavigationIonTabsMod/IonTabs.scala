package typings.atIonicReact.distTypesComponentsNavigationIonTabsMod

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonRouterOutletElement
import typings.atIonicReact.distTypesContextsNavContextMod.NavContextState
import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
class IonTabs protected ()
  extends Component[Props, js.Object, js.Any] {
  def this(props: Props) = this()
  @JSName("context")
  var context_IonTabs: ContextType[Context[NavContextState]] = js.native
  var routerOutletRef: Ref[HTMLIonRouterOutletElement] = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
object IonTabs extends js.Object {
  val contextType: Context[NavContextState] = js.native
}

