package typings.atIonicReact.distTypesComponentsNavigationIonBackButtonMod

import typings.atIonicReact.distTypesComponentsNavigationRoutingNavContextMod.NavContextState
import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton")
@js.native
class IonBackButton ()
  extends Component[BackButtonProps, js.Object, js.Any] {
  @JSName("context")
  var context_IonBackButton: ContextType[Context[NavContextState]] = js.native
  def clickButton(e: MouseEvent): Unit = js.native
}

