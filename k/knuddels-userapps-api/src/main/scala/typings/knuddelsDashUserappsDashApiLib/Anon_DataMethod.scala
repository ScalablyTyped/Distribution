package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DataMethod extends js.Object {
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

