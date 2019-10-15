package typings.atIonicReact.atIonicReactMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.atIonicReact.Anon_CallbackClickButton
import typings.atIonicReact.distTypesComponentsNavigationIonBackButtonMod.Props
import typings.atIonicReact.distTypesContextsNavContextMod.NavContextState
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "IonBackButton")
@js.native
class IonBackButton protected () extends Anon_CallbackClickButton {
  def this(props: Props) = this()
  def this(props: Props, context: js.Any) = this()
}

@JSImport("@ionic/react", "IonBackButton")
@js.native
object IonBackButton
  extends Instantiable2[/* props */ Props, /* context */ js.Any, Anon_CallbackClickButton]
     with Instantiable1[/* props */ Props, Anon_CallbackClickButton] {
  val contextType: Context[NavContextState] = js.native
  val displayName: String = js.native
}

