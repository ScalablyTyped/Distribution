package typings.atIonicReact

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerOptions
import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonPicker", JSImport.Namespace)
@js.native
object distTypesComponentsIonPickerMod extends js.Object {
  @js.native
  class IonPicker protected () extends Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount {
    def this(props: PickerOptions with ReactControllerProps) = this()
  }
  
  @js.native
  object IonPicker extends Instantiable1[
          /* props */ PickerOptions with ReactControllerProps, 
          Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount
        ] {
    var contextType: js.UndefOr[Context[_]] = js.native
    val displayName: String = js.native
  }
  
}

