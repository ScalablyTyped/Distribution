package typings
package atIonicReactLib.distTypesLifecycleIonLifeCycleContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/lifecycle/IonLifeCycleContext", "DefaultIonLifeCycleContext")
@js.native
class DefaultIonLifeCycleContext () extends IonLifeCycleContextInterface {
  var componentCanBeDestroyedCallback: js.Function = js.native
  var ionViewDidEnterCallback: js.Function = js.native
  var ionViewDidLeaveCallback: js.Function = js.native
  var ionViewWillEnterCallback: js.Function = js.native
  var ionViewWillLeaveCallback: js.Function = js.native
  def componentCanBeDestroyed(): scala.Unit = js.native
  def onComponentCanBeDestroyed(callback: js.Function): scala.Unit = js.native
}

