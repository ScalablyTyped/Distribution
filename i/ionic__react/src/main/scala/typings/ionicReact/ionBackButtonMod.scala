package typings.ionicReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.ionicReact.ionicReactStrings.icon
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Context
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", JSImport.Namespace)
@js.native
object ionBackButtonMod extends js.Object {
  @js.native
  class IonBackButton protected () extends AnonCallback {
    def this(props: Props) = this()
    def this(props: Props, context: js.Any) = this()
  }
  
  @js.native
  object IonBackButton
    extends Instantiable1[/* props */ Props, AnonCallback]
       with Instantiable2[/* props */ Props, /* context */ js.Any, AnonCallback] {
    val contextType: Context[NavContextState] = js.native
    val displayName: String = js.native
  }
  
  type Props = (Omit[typings.ionicCore.componentsMod.LocalJSX.IonBackButton, icon]) with IonicReactProps with AnonIcon
}

