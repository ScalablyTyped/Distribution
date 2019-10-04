package typings.atIonicReact

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/lifecycle", JSImport.Namespace)
@js.native
object distTypesLifecycleMod extends js.Object {
  def useIonViewDidEnter(callback: js.Function0[Unit]): Unit = js.native
  def useIonViewDidLeave(callback: js.Function0[Unit]): Unit = js.native
  def useIonViewWillEnter(callback: js.Function0[Unit]): Unit = js.native
  def useIonViewWillLeave(callback: js.Function0[Unit]): Unit = js.native
  def withIonLifeCycle(WrappedComponent: ComponentType[_]): Anon_ContextTypeProps = js.native
}

