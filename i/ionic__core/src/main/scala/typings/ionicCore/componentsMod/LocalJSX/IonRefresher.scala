package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.refresherInterfaceMod.RefresherEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRefresher extends js.Object {
  /**
    * Time it takes to close the refresher. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var closeDuration: js.UndefOr[String] = js.native
  /**
    * If `true`, the refresher will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Emitted while the user is pulling down the content and exposing the refresher.
    */
  var onIonPull: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the user lets go of the content and has pulled down further than the `pullMin` or pulls the content down and exceeds the pullMax. Updates the refresher state to `refreshing`. The `complete()` method should be called when the async operation has completed.
    */
  var onIonRefresh: js.UndefOr[js.Function1[/* event */ CustomEvent[RefresherEventDetail], Unit]] = js.native
  /**
    * Emitted when the user begins to start pulling down.
    */
  var onIonStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.  Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var pullFactor: js.UndefOr[Double] = js.native
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`. Does not apply when  the refresher content uses a spinner, enabling the native refresher.
    */
  var pullMax: js.UndefOr[Double] = js.native
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var pullMin: js.UndefOr[Double] = js.native
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var snapbackDuration: js.UndefOr[String] = js.native
}

object IonRefresher {
  @scala.inline
  def apply(): IonRefresher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRefresher]
  }
  @scala.inline
  implicit class IonRefresherOps[Self <: IonRefresher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloseDuration(value: String): Self = this.set("closeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDuration: Self = this.set("closeDuration", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnIonPull(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonPull", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonPull: Self = this.set("onIonPull", js.undefined)
    @scala.inline
    def setOnIonRefresh(value: /* event */ CustomEvent[RefresherEventDetail] => Unit): Self = this.set("onIonRefresh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonRefresh: Self = this.set("onIonRefresh", js.undefined)
    @scala.inline
    def setOnIonStart(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonStart: Self = this.set("onIonStart", js.undefined)
    @scala.inline
    def setPullFactor(value: Double): Self = this.set("pullFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullFactor: Self = this.set("pullFactor", js.undefined)
    @scala.inline
    def setPullMax(value: Double): Self = this.set("pullMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullMax: Self = this.set("pullMax", js.undefined)
    @scala.inline
    def setPullMin(value: Double): Self = this.set("pullMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullMin: Self = this.set("pullMin", js.undefined)
    @scala.inline
    def setSnapbackDuration(value: String): Self = this.set("snapbackDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapbackDuration: Self = this.set("snapbackDuration", js.undefined)
  }
  
}

