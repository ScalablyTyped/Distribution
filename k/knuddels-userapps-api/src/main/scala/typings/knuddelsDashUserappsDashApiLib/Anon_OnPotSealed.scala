package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnPotSealed extends js.Object {
  var onPotSealed: js.UndefOr[
    js.Function1[
      /* pot */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot, 
      scala.Unit
    ]
  ] = js.undefined
  var payoutTimeoutMinutes: js.UndefOr[scala.Double] = js.undefined
  var shouldSealPot: js.UndefOr[
    js.Function1[
      /* pot */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot, 
      scala.Boolean
    ]
  ] = js.undefined
}

object Anon_OnPotSealed {
  @scala.inline
  def apply(
    onPotSealed: js.Function1[
      /* pot */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot, 
      scala.Unit
    ] = null,
    payoutTimeoutMinutes: scala.Int | scala.Double = null,
    shouldSealPot: js.Function1[
      /* pot */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot, 
      scala.Boolean
    ] = null
  ): Anon_OnPotSealed = {
    val __obj = js.Dynamic.literal()
    if (onPotSealed != null) __obj.updateDynamic("onPotSealed")(onPotSealed)
    if (payoutTimeoutMinutes != null) __obj.updateDynamic("payoutTimeoutMinutes")(payoutTimeoutMinutes.asInstanceOf[js.Any])
    if (shouldSealPot != null) __obj.updateDynamic("shouldSealPot")(shouldSealPot)
    __obj.asInstanceOf[Anon_OnPotSealed]
  }
}

