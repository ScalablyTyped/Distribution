package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.ExternalServerResponse
import typings.knuddelsUserappsApi.mod.global.Json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSuccess extends js.Object {
  var data: js.UndefOr[Json] = js.undefined
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
}

object OnSuccess {
  @scala.inline
  def apply(
    data: Json = null,
    onFailure: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit = null,
    onSuccess: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit = null
  ): OnSuccess = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    __obj.asInstanceOf[OnSuccess]
  }
}

