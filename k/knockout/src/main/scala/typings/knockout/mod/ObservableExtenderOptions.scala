package typings.knockout.mod

import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<knockout.knockout.ExtendersOptions<T>> */
@js.native
trait ObservableExtenderOptions[T] extends js.Object {
  var deferred: js.UndefOr[`true`] = js.native
  @JSName("notify")
  var notify_FObservableExtenderOptions: js.UndefOr[always | js.Any] = js.native
  var rateLimit: js.UndefOr[Double | RateLimitOptions] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var trackArrayChanges: js.UndefOr[`true` | CompareArraysOptions] = js.native
}

object ObservableExtenderOptions {
  @scala.inline
  def apply[T](): ObservableExtenderOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableExtenderOptions[T]]
  }
  @scala.inline
  implicit class ObservableExtenderOptionsOps[Self <: ObservableExtenderOptions[_], T] (val x: Self with ObservableExtenderOptions[T]) extends AnyVal {
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
    def setDeferred(value: `true`): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    @scala.inline
    def setNotify(value: always | js.Any): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    @scala.inline
    def setRateLimit(value: Double | RateLimitOptions): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setTrackArrayChanges(value: `true` | CompareArraysOptions): Self = this.set("trackArrayChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackArrayChanges: Self = this.set("trackArrayChanges", js.undefined)
  }
  
}

