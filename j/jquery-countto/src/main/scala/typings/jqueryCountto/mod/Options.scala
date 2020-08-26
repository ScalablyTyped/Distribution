package typings.jqueryCountto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  from :number,   to :number,   speed :number,   refreshInterval :number,   decimals :number, formatter (value : number, options : jquery-countto.jquery-countto.Options): string, onUpdate (value : number): void, onComplete (value : number): void}> */
@js.native
trait Options extends js.Object {
  var decimals: js.UndefOr[Double] = js.native
  var formatter: js.UndefOr[js.Function2[/* value */ Double, /* options */ this.type, String]] = js.native
  var from: js.UndefOr[Double] = js.native
  var onComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var refreshInterval: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var to: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setFormatter(value: (/* value */ Double, Options) => String): Self = this.set("formatter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setOnComplete(value: /* value */ Double => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnUpdate(value: /* value */ Double => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshInterval: Self = this.set("refreshInterval", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

