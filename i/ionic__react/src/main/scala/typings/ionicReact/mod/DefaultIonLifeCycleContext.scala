package typings.ionicReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.ionicReact.anon.ComponentCanBeDestroyed
import typings.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "DefaultIonLifeCycleContext")
@js.native
class DefaultIonLifeCycleContext () extends ComponentCanBeDestroyed {
  /* CompleteClass */
  override var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback] = js.native
  /* CompleteClass */
  override var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
  /* CompleteClass */
  override var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback] = js.native
  /* CompleteClass */
  override var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
  /* CompleteClass */
  override def componentCanBeDestroyed(): Unit = js.native
  /* CompleteClass */
  override def ionViewDidEnter(): Unit = js.native
  /* CompleteClass */
  override def ionViewDidLeave(): Unit = js.native
  /* CompleteClass */
  override def ionViewWillEnter(): Unit = js.native
  /* CompleteClass */
  override def ionViewWillLeave(): Unit = js.native
  /* CompleteClass */
  override def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def onIonViewDidEnter(callback: LifeCycleCallback): Unit = js.native
  /* CompleteClass */
  override def onIonViewDidLeave(callback: LifeCycleCallback): Unit = js.native
  /* CompleteClass */
  override def onIonViewWillEnter(callback: LifeCycleCallback): Unit = js.native
  /* CompleteClass */
  override def onIonViewWillLeave(callback: LifeCycleCallback): Unit = js.native
}

@JSImport("@ionic/react", "DefaultIonLifeCycleContext")
@js.native
object DefaultIonLifeCycleContext extends Instantiable0[ComponentCanBeDestroyed]

