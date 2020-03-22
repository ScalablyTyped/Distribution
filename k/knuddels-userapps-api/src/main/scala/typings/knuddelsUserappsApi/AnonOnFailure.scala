package typings.knuddelsUserappsApi

import typings.knuddelsUserappsApi.mod._Global_.ExternalServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnFailure extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
}

object AnonOnFailure {
  @scala.inline
  def apply(
    onFailure: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit = null,
    onSuccess: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit = null
  ): AnonOnFailure = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    __obj.asInstanceOf[AnonOnFailure]
  }
}

