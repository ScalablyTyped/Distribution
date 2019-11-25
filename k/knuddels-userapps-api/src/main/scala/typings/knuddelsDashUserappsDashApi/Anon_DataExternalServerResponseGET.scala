package typings.knuddelsDashUserappsDashApi

import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.ExternalServerResponse
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Json
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiStrings.GET
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataExternalServerResponseGET extends js.Object {
  var data: js.UndefOr[Json] = js.undefined
  var method: js.UndefOr[GET | POST] = js.undefined
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
}

object Anon_DataExternalServerResponseGET {
  @scala.inline
  def apply(
    data: Json = null,
    method: GET | POST = null,
    onFailure: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit = null,
    onSuccess: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit = null
  ): Anon_DataExternalServerResponseGET = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    __obj.asInstanceOf[Anon_DataExternalServerResponseGET]
  }
}

