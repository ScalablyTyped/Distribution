package typings.hapiCatbox.mod

import typings.hapiCatbox.hapiCatboxBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiCatbox.mod.PolicyOptions[T]
  - typings.hapiCatbox.mod.DecoratedPolicyOptions[T]
*/
trait PolicyOptionVariants[T] extends js.Object

object PolicyOptionVariants {
  @scala.inline
  def PolicyOptions[T](
    dropOnError: js.UndefOr[Boolean] = js.undefined,
    expiresAt: String = null,
    expiresIn: js.UndefOr[Double] = js.undefined,
    generateFunc: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[T] = null,
    generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[Boolean] = js.undefined,
    generateTimeout: Double | `false` = null,
    pendingGenerateTimeout: js.UndefOr[Double] = js.undefined,
    staleIn: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double]) = null,
    staleTimeout: js.UndefOr[Double] = js.undefined
  ): PolicyOptionVariants[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError.get.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(js.Any.fromFunction2(generateFunc))
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError.get.asInstanceOf[js.Any])
    if (generateTimeout != null) __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingGenerateTimeout)) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.get.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (!js.isUndefined(staleTimeout)) __obj.updateDynamic("staleTimeout")(staleTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyOptionVariants[T]]
  }
  @scala.inline
  def DecoratedPolicyOptions[T](
    dropOnError: js.UndefOr[Boolean] = js.undefined,
    expiresAt: String = null,
    expiresIn: js.UndefOr[Double] = js.undefined,
    generateFunc: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[T] = null,
    generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[Boolean] = js.undefined,
    generateTimeout: Double | `false` = null,
    getDecoratedValue: js.UndefOr[Boolean] = js.undefined,
    pendingGenerateTimeout: js.UndefOr[Double] = js.undefined,
    staleIn: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double]) = null,
    staleTimeout: js.UndefOr[Double] = js.undefined
  ): PolicyOptionVariants[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError.get.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(js.Any.fromFunction2(generateFunc))
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError.get.asInstanceOf[js.Any])
    if (generateTimeout != null) __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(getDecoratedValue)) __obj.updateDynamic("getDecoratedValue")(getDecoratedValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingGenerateTimeout)) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.get.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (!js.isUndefined(staleTimeout)) __obj.updateDynamic("staleTimeout")(staleTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyOptionVariants[T]]
  }
}

