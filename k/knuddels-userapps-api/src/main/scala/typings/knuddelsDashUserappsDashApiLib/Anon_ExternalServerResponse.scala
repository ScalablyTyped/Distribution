package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalServerResponse extends js.Object {
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

object Anon_ExternalServerResponse {
  @scala.inline
  def apply(
    onFailure: (/* responseData */ java.lang.String, /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse) => scala.Unit = null,
    onSuccess: (/* responseData */ java.lang.String, /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse) => scala.Unit = null
  ): Anon_ExternalServerResponse = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    __obj.asInstanceOf[Anon_ExternalServerResponse]
  }
}

