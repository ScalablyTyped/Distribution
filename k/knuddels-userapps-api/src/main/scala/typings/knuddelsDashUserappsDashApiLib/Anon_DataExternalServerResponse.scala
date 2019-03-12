package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataExternalServerResponse extends js.Object {
  var data: js.UndefOr[knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json] = js.undefined
  var onFailure: js.UndefOr[
    js.Function2[
      /* responseData */ java.lang.String, 
      /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[
      /* responseData */ java.lang.String, 
      /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_DataExternalServerResponse {
  @scala.inline
  def apply(
    data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json = null,
    onFailure: (/* responseData */ java.lang.String, /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse) => scala.Unit = null,
    onSuccess: (/* responseData */ java.lang.String, /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse) => scala.Unit = null
  ): Anon_DataExternalServerResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    __obj.asInstanceOf[Anon_DataExternalServerResponse]
  }
}

