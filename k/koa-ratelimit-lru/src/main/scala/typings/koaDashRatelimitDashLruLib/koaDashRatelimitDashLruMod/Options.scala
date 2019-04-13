package typings
package koaDashRatelimitDashLruLib.koaDashRatelimitDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  val duration: js.UndefOr[scala.Double] = js.undefined
  val errorMessage: js.UndefOr[java.lang.String] = js.undefined
  val headers: js.UndefOr[koaDashRatelimitDashLruLib.Anon_Remaining] = js.undefined
  val id: js.UndefOr[java.lang.String] = js.undefined
  val max: js.UndefOr[scala.Double] = js.undefined
  val prefix: js.UndefOr[java.lang.String] = js.undefined
   // lru-cache ?
  val rate: js.UndefOr[scala.Double] = js.undefined
  val store: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    errorMessage: java.lang.String = null,
    headers: koaDashRatelimitDashLruLib.Anon_Remaining = null,
    id: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    rate: scala.Int | scala.Double = null,
    store: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (id != null) __obj.updateDynamic("id")(id)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[Options]
  }
}

