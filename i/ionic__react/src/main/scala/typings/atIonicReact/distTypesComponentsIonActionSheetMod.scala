package typings.atIonicReact

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.ReactOverlayProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonActionSheet", JSImport.Namespace)
@js.native
object distTypesComponentsIonActionSheetMod extends js.Object {
  @js.native
  class IonActionSheet protected () extends Anon_Callback {
    def this(props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionSheetOptions */ js.Any) with ReactOverlayProps) = this()
  }
  
  @js.native
  object IonActionSheet
    extends Instantiable1[
          /* props */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionSheetOptions */ js.Any) with ReactOverlayProps, 
          Anon_Callback
        ] {
    var contextType: js.UndefOr[Context[_]] = js.native
    val displayName: String = js.native
  }
  
}

