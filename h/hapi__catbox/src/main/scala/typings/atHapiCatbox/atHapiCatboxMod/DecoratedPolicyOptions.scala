package typings.atHapiCatbox.atHapiCatboxMod

import typings.atHapiCatbox.atHapiCatboxBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atHapiCatbox.atHapiCatboxMod.PolicyOptionVariants because Already inherited */ trait DecoratedPolicyOptions[T] extends PolicyOptions[T] {
  /**
    * @default false
    */
  var getDecoratedValue: js.UndefOr[Boolean] = js.undefined
}

object DecoratedPolicyOptions {
  @scala.inline
  def apply[T](
    dropOnError: js.UndefOr[Boolean] = js.undefined,
    expiresAt: String = null,
    expiresIn: Int | Double = null,
    generateFunc: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[T] = null,
    generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[Boolean] = js.undefined,
    generateTimeout: Double | `false` = null,
    getDecoratedValue: js.UndefOr[Boolean] = js.undefined,
    pendingGenerateTimeout: Int | Double = null,
    staleIn: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double]) = null,
    staleTimeout: Int | Double = null
  ): DecoratedPolicyOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(js.Any.fromFunction2(generateFunc))
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError.asInstanceOf[js.Any])
    if (generateTimeout != null) __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(getDecoratedValue)) __obj.updateDynamic("getDecoratedValue")(getDecoratedValue.asInstanceOf[js.Any])
    if (pendingGenerateTimeout != null) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (staleTimeout != null) __obj.updateDynamic("staleTimeout")(staleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedPolicyOptions[T]]
  }
}

