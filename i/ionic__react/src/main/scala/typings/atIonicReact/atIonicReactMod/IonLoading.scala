package typings.atIonicReact.atIonicReactMod

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicCore.distTypesComponentsLoadingLoadingDashInterfaceMod.LoadingOptions
import typings.atIonicReact.Anon_CallbackComponentDidMountComponentDidUpdate
import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "IonLoading")
@js.native
class IonLoading protected () extends Anon_CallbackComponentDidMountComponentDidUpdate {
  def this(props: LoadingOptions with ReactControllerProps) = this()
}

@JSImport("@ionic/react", "IonLoading")
@js.native
object IonLoading extends Instantiable1[
      /* props */ LoadingOptions with ReactControllerProps, 
      Anon_CallbackComponentDidMountComponentDidUpdate
    ] {
  var contextType: js.UndefOr[Context[_]] = js.native
  val displayName: String = js.native
}

