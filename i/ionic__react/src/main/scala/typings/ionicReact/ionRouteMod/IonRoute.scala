package typings.ionicReact.ionRouteMod

import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonRoute", "IonRoute")
@js.native
class IonRoute ()
  extends Component[IonRouteProps, IonRouteState, js.Any] {
  @JSName("context")
  var context_IonRoute: ContextType[Context[NavContextState]] = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/components/IonRoute", "IonRoute")
@js.native
object IonRoute extends js.Object {
  def contextType: Context[NavContextState] = js.native
}

