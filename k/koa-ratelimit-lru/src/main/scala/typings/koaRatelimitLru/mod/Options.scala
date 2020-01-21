package typings.koaRatelimitLru.mod

import typings.koaRatelimitLru.AnonRemaining
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  val duration: js.UndefOr[Double] = js.undefined
  val errorMessage: js.UndefOr[String] = js.undefined
  val headers: js.UndefOr[AnonRemaining] = js.undefined
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
    duration: Int | Double = null,
    errorMessage: String = null,
    headers: AnonRemaining = null,
    id: String = null,
    max: Int | Double = null,
    prefix: String = null,
    rate: Int | Double = null,
    store: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

