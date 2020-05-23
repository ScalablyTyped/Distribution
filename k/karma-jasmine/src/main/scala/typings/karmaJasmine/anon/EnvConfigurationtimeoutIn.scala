package typings.karmaJasmine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jasmine.jasmine.EnvConfiguration & {  timeoutInterval ? :number} */
trait EnvConfigurationtimeoutIn extends js.Object {
  var Promise: js.UndefOr[js.Function] = js.undefined
  var failFast: js.UndefOr[Boolean] = js.undefined
  var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.undefined
  var hideDisabled: js.UndefOr[Boolean] = js.undefined
  var oneFailurePerSpec: js.UndefOr[Boolean] = js.undefined
  var random: js.UndefOr[Boolean] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
  var specFilter: js.UndefOr[js.Function] = js.undefined
  /** @deprecated undocumented to be removed */
  var timeoutInterval: js.UndefOr[Double] = js.undefined
}

object EnvConfigurationtimeoutIn {
  @scala.inline
  def apply(
    Promise: js.Function = null,
    failFast: js.UndefOr[Boolean] = js.undefined,
    failSpecWithNoExpectations: js.UndefOr[Boolean] = js.undefined,
    hideDisabled: js.UndefOr[Boolean] = js.undefined,
    oneFailurePerSpec: js.UndefOr[Boolean] = js.undefined,
    random: js.UndefOr[Boolean] = js.undefined,
    seed: js.UndefOr[Double] = js.undefined,
    specFilter: js.Function = null,
    timeoutInterval: js.UndefOr[Double] = js.undefined
  ): EnvConfigurationtimeoutIn = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(failFast)) __obj.updateDynamic("failFast")(failFast.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failSpecWithNoExpectations)) __obj.updateDynamic("failSpecWithNoExpectations")(failSpecWithNoExpectations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabled)) __obj.updateDynamic("hideDisabled")(hideDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oneFailurePerSpec)) __obj.updateDynamic("oneFailurePerSpec")(oneFailurePerSpec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    if (specFilter != null) __obj.updateDynamic("specFilter")(specFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutInterval)) __obj.updateDynamic("timeoutInterval")(timeoutInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvConfigurationtimeoutIn]
  }
}

