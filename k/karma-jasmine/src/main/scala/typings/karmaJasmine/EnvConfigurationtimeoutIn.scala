package typings.karmaJasmine

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
    seed: Int | Double = null,
    specFilter: js.Function = null,
    timeoutInterval: Int | Double = null
  ): EnvConfigurationtimeoutIn = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(failFast)) __obj.updateDynamic("failFast")(failFast.asInstanceOf[js.Any])
    if (!js.isUndefined(failSpecWithNoExpectations)) __obj.updateDynamic("failSpecWithNoExpectations")(failSpecWithNoExpectations.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabled)) __obj.updateDynamic("hideDisabled")(hideDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(oneFailurePerSpec)) __obj.updateDynamic("oneFailurePerSpec")(oneFailurePerSpec.asInstanceOf[js.Any])
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (specFilter != null) __obj.updateDynamic("specFilter")(specFilter.asInstanceOf[js.Any])
    if (timeoutInterval != null) __obj.updateDynamic("timeoutInterval")(timeoutInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvConfigurationtimeoutIn]
  }
}

