package typings.atIonicReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackComponentCanBeDestroyed extends js.Object {
  var componentCanBeDestroyedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ionViewDidEnterCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ionViewDidLeaveCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ionViewWillEnterCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ionViewWillLeaveCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  def componentCanBeDestroyed(): Unit
  def ionViewDidEnter(): Unit
  def ionViewDidLeave(): Unit
  def ionViewWillEnter(): Unit
  def ionViewWillLeave(): Unit
  def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit
  def onIonViewDidEnter(callback: js.Function0[Unit]): Unit
  def onIonViewDidLeave(callback: js.Function0[Unit]): Unit
  def onIonViewWillEnter(callback: js.Function0[Unit]): Unit
  def onIonViewWillLeave(callback: js.Function0[Unit]): Unit
}

object Anon_CallbackComponentCanBeDestroyed {
  @scala.inline
  def apply(
    componentCanBeDestroyed: () => Unit,
    ionViewDidEnter: () => Unit,
    ionViewDidLeave: () => Unit,
    ionViewWillEnter: () => Unit,
    ionViewWillLeave: () => Unit,
    onComponentCanBeDestroyed: js.Function0[Unit] => Unit,
    onIonViewDidEnter: js.Function0[Unit] => Unit,
    onIonViewDidLeave: js.Function0[Unit] => Unit,
    onIonViewWillEnter: js.Function0[Unit] => Unit,
    onIonViewWillLeave: js.Function0[Unit] => Unit,
    componentCanBeDestroyedCallback: () => Unit = null,
    ionViewDidEnterCallback: () => Unit = null,
    ionViewDidLeaveCallback: () => Unit = null,
    ionViewWillEnterCallback: () => Unit = null,
    ionViewWillLeaveCallback: () => Unit = null
  ): Anon_CallbackComponentCanBeDestroyed = {
    val __obj = js.Dynamic.literal(componentCanBeDestroyed = js.Any.fromFunction0(componentCanBeDestroyed), ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter), ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave), ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter), ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave), onComponentCanBeDestroyed = js.Any.fromFunction1(onComponentCanBeDestroyed), onIonViewDidEnter = js.Any.fromFunction1(onIonViewDidEnter), onIonViewDidLeave = js.Any.fromFunction1(onIonViewDidLeave), onIonViewWillEnter = js.Any.fromFunction1(onIonViewWillEnter), onIonViewWillLeave = js.Any.fromFunction1(onIonViewWillLeave))
    if (componentCanBeDestroyedCallback != null) __obj.updateDynamic("componentCanBeDestroyedCallback")(js.Any.fromFunction0(componentCanBeDestroyedCallback))
    if (ionViewDidEnterCallback != null) __obj.updateDynamic("ionViewDidEnterCallback")(js.Any.fromFunction0(ionViewDidEnterCallback))
    if (ionViewDidLeaveCallback != null) __obj.updateDynamic("ionViewDidLeaveCallback")(js.Any.fromFunction0(ionViewDidLeaveCallback))
    if (ionViewWillEnterCallback != null) __obj.updateDynamic("ionViewWillEnterCallback")(js.Any.fromFunction0(ionViewWillEnterCallback))
    if (ionViewWillLeaveCallback != null) __obj.updateDynamic("ionViewWillLeaveCallback")(js.Any.fromFunction0(ionViewWillLeaveCallback))
    __obj.asInstanceOf[Anon_CallbackComponentCanBeDestroyed]
  }
}

