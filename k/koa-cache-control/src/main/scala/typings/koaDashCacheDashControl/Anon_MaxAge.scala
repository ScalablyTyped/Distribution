package typings.koaDashCacheDashControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAge extends js.Object {
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

object Anon_MaxAge {
  @scala.inline
  def apply(
    maxAge: Int | Double = null,
    mustRevalidate: js.UndefOr[Boolean] = js.undefined,
    noCache: js.UndefOr[Boolean] = js.undefined,
    noStore: js.UndefOr[Boolean] = js.undefined,
    noTransform: js.UndefOr[Boolean] = js.undefined,
    `private`: js.UndefOr[Boolean] = js.undefined,
    public: js.UndefOr[Boolean] = js.undefined,
    sMaxAge: Int | Double = null,
    staleIfError: Int | Double = null,
    staleWhileRevalidate: Int | Double = null
  ): Anon_MaxAge = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(mustRevalidate)) __obj.updateDynamic("mustRevalidate")(mustRevalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.asInstanceOf[js.Any])
    if (!js.isUndefined(noStore)) __obj.updateDynamic("noStore")(noStore.asInstanceOf[js.Any])
    if (!js.isUndefined(noTransform)) __obj.updateDynamic("noTransform")(noTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (sMaxAge != null) __obj.updateDynamic("sMaxAge")(sMaxAge.asInstanceOf[js.Any])
    if (staleIfError != null) __obj.updateDynamic("staleIfError")(staleIfError.asInstanceOf[js.Any])
    if (staleWhileRevalidate != null) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxAge]
  }
}

