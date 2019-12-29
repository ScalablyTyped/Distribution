package typings.atIonicReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.atIonicReact.atIonicReactStrings.icon
import typings.atIonicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typings.atIonicReact.distTypesContextsNavContextMod.NavContextState
import typings.react.reactMod.Context
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", JSImport.Namespace)
@js.native
object distTypesComponentsNavigationIonBackButtonMod extends js.Object {
  @js.native
  class IonBackButton protected () extends Anon_Callback {
    def this(props: Props) = this()
    def this(props: Props, context: js.Any) = this()
  }
  
  @js.native
  object IonBackButton
    extends Instantiable2[/* props */ Props, /* context */ js.Any, Anon_Callback]
       with Instantiable1[/* props */ Props, Anon_Callback] {
    val contextType: Context[NavContextState] = js.native
    val displayName: String = js.native
  }
  
  type Props = (Omit[typings.atIonicCore.distTypesComponentsMod.LocalJSX.IonBackButton, icon]) with IonicReactProps with Anon_Icon
}

