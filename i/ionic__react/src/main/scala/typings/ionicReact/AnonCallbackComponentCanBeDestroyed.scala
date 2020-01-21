package typings.ionicReact

import typings.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallbackComponentCanBeDestroyed extends js.Object {
  var componentCanBeDestroyedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback]
  var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback]
  var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback]
  var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback]
  def componentCanBeDestroyed(): Unit
  def ionViewDidEnter(): Unit
  def ionViewDidLeave(): Unit
  def ionViewWillEnter(): Unit
  def ionViewWillLeave(): Unit
  def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit
  def onIonViewDidEnter(callback: LifeCycleCallback): Unit
  def onIonViewDidLeave(callback: LifeCycleCallback): Unit
  def onIonViewWillEnter(callback: LifeCycleCallback): Unit
  def onIonViewWillLeave(callback: LifeCycleCallback): Unit
}

object AnonCallbackComponentCanBeDestroyed {
  @scala.inline
  def apply(
    componentCanBeDestroyed: () => Unit,
    ionViewDidEnter: () => Unit,
    ionViewDidEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewDidLeave: () => Unit,
    ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback],
    ionViewWillEnter: () => Unit,
    ionViewWillEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewWillLeave: () => Unit,
    ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback],
    onComponentCanBeDestroyed: js.Function0[Unit] => Unit,
    onIonViewDidEnter: LifeCycleCallback => Unit,
    onIonViewDidLeave: LifeCycleCallback => Unit,
    onIonViewWillEnter: LifeCycleCallback => Unit,
    onIonViewWillLeave: LifeCycleCallback => Unit,
    componentCanBeDestroyedCallback: () => Unit = null
  ): AnonCallbackComponentCanBeDestroyed = {
    val __obj = js.Dynamic.literal(componentCanBeDestroyed = js.Any.fromFunction0(componentCanBeDestroyed), ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter), ionViewDidEnterCallbacks = ionViewDidEnterCallbacks.asInstanceOf[js.Any], ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave), ionViewDidLeaveCallbacks = ionViewDidLeaveCallbacks.asInstanceOf[js.Any], ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter), ionViewWillEnterCallbacks = ionViewWillEnterCallbacks.asInstanceOf[js.Any], ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave), ionViewWillLeaveCallbacks = ionViewWillLeaveCallbacks.asInstanceOf[js.Any], onComponentCanBeDestroyed = js.Any.fromFunction1(onComponentCanBeDestroyed), onIonViewDidEnter = js.Any.fromFunction1(onIonViewDidEnter), onIonViewDidLeave = js.Any.fromFunction1(onIonViewDidLeave), onIonViewWillEnter = js.Any.fromFunction1(onIonViewWillEnter), onIonViewWillLeave = js.Any.fromFunction1(onIonViewWillLeave))
    if (componentCanBeDestroyedCallback != null) __obj.updateDynamic("componentCanBeDestroyedCallback")(js.Any.fromFunction0(componentCanBeDestroyedCallback))
    __obj.asInstanceOf[AnonCallbackComponentCanBeDestroyed]
  }
}

