package typings.karmaJasmine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jasmine.jasmine.EnvConfiguration & {  timeoutInterval :number | undefined} */
@js.native
trait EnvConfigurationtimeoutIn extends js.Object {
  var Promise: js.UndefOr[js.Function] = js.native
  var failFast: js.UndefOr[Boolean] = js.native
  var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.native
  var hideDisabled: js.UndefOr[Boolean] = js.native
  var oneFailurePerSpec: js.UndefOr[Boolean] = js.native
  var random: js.UndefOr[Boolean] = js.native
  var seed: js.UndefOr[Double] = js.native
  var specFilter: js.UndefOr[js.Function] = js.native
  /** @deprecated undocumented to be removed */
  var timeoutInterval: js.UndefOr[Double] = js.native
}

object EnvConfigurationtimeoutIn {
  @scala.inline
  def apply(): EnvConfigurationtimeoutIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvConfigurationtimeoutIn]
  }
  @scala.inline
  implicit class EnvConfigurationtimeoutInOps[Self <: EnvConfigurationtimeoutIn] (val x: Self) extends AnyVal {
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
    def setPromise(value: js.Function): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    @scala.inline
    def setFailFast(value: Boolean): Self = this.set("failFast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailFast: Self = this.set("failFast", js.undefined)
    @scala.inline
    def setFailSpecWithNoExpectations(value: Boolean): Self = this.set("failSpecWithNoExpectations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailSpecWithNoExpectations: Self = this.set("failSpecWithNoExpectations", js.undefined)
    @scala.inline
    def setHideDisabled(value: Boolean): Self = this.set("hideDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabled: Self = this.set("hideDisabled", js.undefined)
    @scala.inline
    def setOneFailurePerSpec(value: Boolean): Self = this.set("oneFailurePerSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneFailurePerSpec: Self = this.set("oneFailurePerSpec", js.undefined)
    @scala.inline
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def setSpecFilter(value: js.Function): Self = this.set("specFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecFilter: Self = this.set("specFilter", js.undefined)
    @scala.inline
    def setTimeoutInterval(value: Double): Self = this.set("timeoutInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInterval: Self = this.set("timeoutInterval", js.undefined)
  }
  
}

