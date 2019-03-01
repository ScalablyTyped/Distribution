package typings
package koaDashCacheDashControlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAge extends js.Object {
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var mustRevalidate: js.UndefOr[scala.Boolean] = js.undefined
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  var noStore: js.UndefOr[scala.Boolean] = js.undefined
  var noTransform: js.UndefOr[scala.Boolean] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var sMaxAge: js.UndefOr[scala.Double] = js.undefined
  var staleIfError: js.UndefOr[scala.Double] = js.undefined
  var staleWhileRevalidate: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxAge {
  @scala.inline
  def apply(
    maxAge: scala.Int | scala.Double = null,
    mustRevalidate: js.UndefOr[scala.Boolean] = js.undefined,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    noStore: js.UndefOr[scala.Boolean] = js.undefined,
    noTransform: js.UndefOr[scala.Boolean] = js.undefined,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    sMaxAge: scala.Int | scala.Double = null,
    staleIfError: scala.Int | scala.Double = null,
    staleWhileRevalidate: scala.Int | scala.Double = null
  ): Anon_MaxAge = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(mustRevalidate)) __obj.updateDynamic("mustRevalidate")(mustRevalidate)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (!js.isUndefined(noStore)) __obj.updateDynamic("noStore")(noStore)
    if (!js.isUndefined(noTransform)) __obj.updateDynamic("noTransform")(noTransform)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (sMaxAge != null) __obj.updateDynamic("sMaxAge")(sMaxAge.asInstanceOf[js.Any])
    if (staleIfError != null) __obj.updateDynamic("staleIfError")(staleIfError.asInstanceOf[js.Any])
    if (staleWhileRevalidate != null) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxAge]
  }
}

