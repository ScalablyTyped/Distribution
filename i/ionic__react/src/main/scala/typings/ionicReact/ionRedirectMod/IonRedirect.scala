package typings.ionicReact.ionRedirectMod

import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonRedirect", "IonRedirect")
@js.native
class IonRedirect ()
  extends Component[IonRedirectProps, IonRedirectState, js.Any] {
  @JSName("context")
  var context_IonRedirect: ContextType[Context[NavContextState]] = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/components/IonRedirect", "IonRedirect")
@js.native
object IonRedirect extends js.Object {
  def contextType: Context[NavContextState] = js.native
}

