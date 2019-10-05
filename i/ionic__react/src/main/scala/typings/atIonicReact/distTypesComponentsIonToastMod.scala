package typings.atIonicReact

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonToast", JSImport.Namespace)
@js.native
object distTypesComponentsIonToastMod extends js.Object {
  @js.native
  class IonToast protected () extends Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount {
    def this(props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any) with ReactControllerProps) = this()
  }
  
  @js.native
  object IonToast
    extends Instantiable1[
          /* props */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any) with ReactControllerProps, 
          Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount
        ] {
    var contextType: js.UndefOr[Context[_]] = js.native
    val displayName: String = js.native
  }
  
}

