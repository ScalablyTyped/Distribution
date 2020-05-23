package typings.koaRatelimitLru.mod

import typings.koaRatelimitLru.anon.Remaining
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  val duration: js.UndefOr[Double] = js.undefined
  val errorMessage: js.UndefOr[String] = js.undefined
  val headers: js.UndefOr[Remaining] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val max: js.UndefOr[Double] = js.undefined
  val prefix: js.UndefOr[String] = js.undefined
   // lru-cache ?
  val rate: js.UndefOr[Double] = js.undefined
  val store: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    errorMessage: String = null,
    headers: Remaining = null,
    id: String = null,
    max: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    rate: js.UndefOr[Double] = js.undefined,
    store: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

