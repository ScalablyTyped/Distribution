package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataExternalServerResponseGET extends js.Object {
  var data: js.UndefOr[knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json] = js.undefined
  var method: js.UndefOr[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiLibStrings.GET | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiLibStrings.POST
  ] = js.undefined
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

object Anon_DataExternalServerResponseGET {
  @scala.inline
  def apply(
    data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json = null,
    method: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiLibStrings.GET | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiLibStrings.POST = null,
    onFailure: js.Function2[
      /* responseData */ java.lang.String, 
      /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse, 
      scala.Unit
    ] = null,
    onSuccess: js.Function2[
      /* responseData */ java.lang.String, 
      /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse, 
      scala.Unit
    ] = null
  ): Anon_DataExternalServerResponseGET = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[Anon_DataExternalServerResponseGET]
  }
}

