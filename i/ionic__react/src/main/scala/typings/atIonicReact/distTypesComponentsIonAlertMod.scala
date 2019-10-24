package typings.atIonicReact

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonAlert", JSImport.Namespace)
@js.native
object distTypesComponentsIonAlertMod extends js.Object {
  @js.native
  class IonAlert protected () extends Anon_CallbackComponentDidMount {
    def this(props: AlertOptions with ReactControllerProps) = this()
  }
  
  @js.native
  object IonAlert extends Instantiable1[/* props */ AlertOptions with ReactControllerProps, Anon_CallbackComponentDidMount] {
    var contextType: js.UndefOr[Context[_]] = js.native
    val displayName: String = js.native
  }
  
}

