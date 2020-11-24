package typings.ionicReact.ionTabsMod

import typings.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typings.ionicReact.ionTabsContextMod.IonTabsContextState
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
class IonTabs protected ()
  extends Component[Props, js.Object, js.Any] {
  def this(props: Props) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MIonTabs(): Unit = js.native
  
  @JSName("context")
  var context_IonTabs: ContextType[Context[NavContextState]] = js.native
  
  var ionTabContextState: IonTabsContextState = js.native
  
  var routerOutletRef: Ref[HTMLIonRouterOutletElement] = js.native
  
  var selectTabHandler: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.native
  
  var tabBarRef: RefObject[_] = js.native
}
/* static members */
@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
object IonTabs extends js.Object {
  
  def contextType: Context[NavContextState] = js.native
}
