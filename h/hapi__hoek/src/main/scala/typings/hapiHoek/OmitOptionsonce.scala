package typings.hapiHoek

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@hapi/hoek.@hapi/hoek.contain.Options, 'once'> */
trait OmitOptionsonce extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var only: js.UndefOr[Boolean] = js.undefined
  var part: js.UndefOr[Boolean] = js.undefined
  var symbols: js.UndefOr[Boolean] = js.undefined
}

object OmitOptionsonce {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    only: js.UndefOr[Boolean] = js.undefined,
    part: js.UndefOr[Boolean] = js.undefined,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): OmitOptionsonce = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(part)) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitOptionsonce]
  }
}

