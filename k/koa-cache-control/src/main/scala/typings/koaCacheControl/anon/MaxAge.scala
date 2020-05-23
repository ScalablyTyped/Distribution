package typings.koaCacheControl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAge extends js.Object {
  var maxAge: js.UndefOr[Double] = js.undefined
  var mustRevalidate: js.UndefOr[Boolean] = js.undefined
  var noCache: js.UndefOr[Boolean] = js.undefined
  var noStore: js.UndefOr[Boolean] = js.undefined
  var noTransform: js.UndefOr[Boolean] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
  var public: js.UndefOr[Boolean] = js.undefined
  var sMaxAge: js.UndefOr[Double] = js.undefined
  var staleIfError: js.UndefOr[Double] = js.undefined
  var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
}

object MaxAge {
  @scala.inline
  def apply(
    maxAge: js.UndefOr[Double] = js.undefined,
    mustRevalidate: js.UndefOr[Boolean] = js.undefined,
    noCache: js.UndefOr[Boolean] = js.undefined,
    noStore: js.UndefOr[Boolean] = js.undefined,
    noTransform: js.UndefOr[Boolean] = js.undefined,
    `private`: js.UndefOr[Boolean] = js.undefined,
    public: js.UndefOr[Boolean] = js.undefined,
    sMaxAge: js.UndefOr[Double] = js.undefined,
    staleIfError: js.UndefOr[Double] = js.undefined,
    staleWhileRevalidate: js.UndefOr[Double] = js.undefined
  ): MaxAge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mustRevalidate)) __obj.updateDynamic("mustRevalidate")(mustRevalidate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noStore)) __obj.updateDynamic("noStore")(noStore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noTransform)) __obj.updateDynamic("noTransform")(noTransform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sMaxAge)) __obj.updateDynamic("sMaxAge")(sMaxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staleIfError)) __obj.updateDynamic("staleIfError")(staleIfError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staleWhileRevalidate)) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAge]
  }
}

