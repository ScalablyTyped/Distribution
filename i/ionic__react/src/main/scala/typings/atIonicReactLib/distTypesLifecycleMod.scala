package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/lifecycle", JSImport.Namespace)
@js.native
object distTypesLifecycleMod extends js.Object {
  val IonLifeCycleContext: reactLib.reactMod.Context[
    atIonicReactLib.distTypesLifecycleIonLifeCycleContextMod.IonLifeCycleContextInterface
  ] = js.native
  def useIonViewDidEnter(callback: js.Function): scala.Unit = js.native
  def useIonViewDidLeave(callback: js.Function): scala.Unit = js.native
  def useIonViewWillEnter(callback: js.Function): scala.Unit = js.native
  def useIonViewWillLeave(callback: js.Function): scala.Unit = js.native
  def withIonLifeCycle(WrappedComponent: reactLib.reactMod.ComponentType[_]): atIonicReactLib.Anon_ContextType = js.native
}

