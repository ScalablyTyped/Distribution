package typings.ionicReact.ionTabsMod

import typings.ionicCore.componentsMod._Global_.HTMLIonRouterOutletElement
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.Ref
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
  def contextType: Context[NavContextState] = js.native
}

