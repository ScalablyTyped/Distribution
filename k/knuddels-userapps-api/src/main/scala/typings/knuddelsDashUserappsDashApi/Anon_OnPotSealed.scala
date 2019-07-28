package typings.knuddelsDashUserappsDashApi

import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod.Global.KnuddelPot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnPotSealed extends js.Object {
  var onPotSealed: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Unit]] = js.undefined
  var payoutTimeoutMinutes: js.UndefOr[Double] = js.undefined
  var shouldSealPot: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Boolean]] = js.undefined
}

object Anon_OnPotSealed {
  @scala.inline
  def apply(
    onPotSealed: /* pot */ KnuddelPot => Unit = null,
    payoutTimeoutMinutes: Int | Double = null,
    shouldSealPot: /* pot */ KnuddelPot => Boolean = null
  ): Anon_OnPotSealed = {
    val __obj = js.Dynamic.literal()
    if (onPotSealed != null) __obj.updateDynamic("onPotSealed")(js.Any.fromFunction1(onPotSealed))
    if (payoutTimeoutMinutes != null) __obj.updateDynamic("payoutTimeoutMinutes")(payoutTimeoutMinutes.asInstanceOf[js.Any])
    if (shouldSealPot != null) __obj.updateDynamic("shouldSealPot")(js.Any.fromFunction1(shouldSealPot))
    __obj.asInstanceOf[Anon_OnPotSealed]
  }
}

