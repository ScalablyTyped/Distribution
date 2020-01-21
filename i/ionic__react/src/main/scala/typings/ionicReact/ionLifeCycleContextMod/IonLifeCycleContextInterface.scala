package typings.ionicReact.ionLifeCycleContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonLifeCycleContextInterface extends js.Object {
  def ionViewDidEnter(): Unit
  def ionViewDidLeave(): Unit
  def ionViewWillEnter(): Unit
  def ionViewWillLeave(): Unit
  def onIonViewDidEnter(callback: js.Function0[Unit]): Unit
  def onIonViewDidLeave(callback: js.Function0[Unit]): Unit
  def onIonViewWillEnter(callback: js.Function0[Unit]): Unit
  def onIonViewWillLeave(callback: js.Function0[Unit]): Unit
}

object IonLifeCycleContextInterface {
  @scala.inline
  def apply(
    ionViewDidEnter: () => Unit,
    ionViewDidLeave: () => Unit,
    ionViewWillEnter: () => Unit,
    ionViewWillLeave: () => Unit,
    onIonViewDidEnter: js.Function0[Unit] => Unit,
    onIonViewDidLeave: js.Function0[Unit] => Unit,
    onIonViewWillEnter: js.Function0[Unit] => Unit,
    onIonViewWillLeave: js.Function0[Unit] => Unit
  ): IonLifeCycleContextInterface = {
    val __obj = js.Dynamic.literal(ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter), ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave), ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter), ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave), onIonViewDidEnter = js.Any.fromFunction1(onIonViewDidEnter), onIonViewDidLeave = js.Any.fromFunction1(onIonViewDidLeave), onIonViewWillEnter = js.Any.fromFunction1(onIonViewWillEnter), onIonViewWillLeave = js.Any.fromFunction1(onIonViewWillLeave))
  
    __obj.asInstanceOf[IonLifeCycleContextInterface]
  }
}

