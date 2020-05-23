package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelPot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPotSealed extends js.Object {
  var onPotSealed: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Unit]] = js.undefined
  var payoutTimeoutMinutes: js.UndefOr[Double] = js.undefined
  var shouldSealPot: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Boolean]] = js.undefined
}

object OnPotSealed {
  @scala.inline
  def apply(
    onPotSealed: /* pot */ KnuddelPot => Unit = null,
    payoutTimeoutMinutes: js.UndefOr[Double] = js.undefined,
    shouldSealPot: /* pot */ KnuddelPot => Boolean = null
  ): OnPotSealed = {
    val __obj = js.Dynamic.literal()
    if (onPotSealed != null) __obj.updateDynamic("onPotSealed")(js.Any.fromFunction1(onPotSealed))
    if (!js.isUndefined(payoutTimeoutMinutes)) __obj.updateDynamic("payoutTimeoutMinutes")(payoutTimeoutMinutes.get.asInstanceOf[js.Any])
    if (shouldSealPot != null) __obj.updateDynamic("shouldSealPot")(js.Any.fromFunction1(shouldSealPot))
    __obj.asInstanceOf[OnPotSealed]
  }
}

