package typings.atIonicReact

import typings.atIonicReact.distTypesLifecycleIonLifeCycleContextMod.IonLifeCycleContextInterface
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/lifecycle", JSImport.Namespace)
@js.native
object distTypesLifecycleMod extends js.Object {
  val IonLifeCycleContext: Context[IonLifeCycleContextInterface] = js.native
  def useIonViewDidEnter(callback: js.Function): Unit = js.native
  def useIonViewDidLeave(callback: js.Function): Unit = js.native
  def useIonViewWillEnter(callback: js.Function): Unit = js.native
  def useIonViewWillLeave(callback: js.Function): Unit = js.native
  def withIonLifeCycle(WrappedComponent: ComponentType[_]): Anon_ContextType = js.native
}

