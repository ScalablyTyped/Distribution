package typings.atIonicReact.atIonicReactMod

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerOptions
import typings.atIonicReact.Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount
import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "IonPicker")
@js.native
class IonPicker protected () extends Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount {
  def this(props: PickerOptions with ReactControllerProps) = this()
}

@JSImport("@ionic/react", "IonPicker")
@js.native
object IonPicker extends Instantiable1[
      /* props */ PickerOptions with ReactControllerProps, 
      Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount
    ] {
  var contextType: js.UndefOr[Context[_]] = js.native
  val displayName: String = js.native
}

