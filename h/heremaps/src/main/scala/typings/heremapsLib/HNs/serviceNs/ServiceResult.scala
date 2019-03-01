package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
trait ServiceResult
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var Response: js.UndefOr[heremapsLib.Anon_Isolines] = js.undefined
  var response: js.UndefOr[heremapsLib.Anon_Language] = js.undefined
  var results: js.UndefOr[heremapsLib.Anon_Items] = js.undefined
  var search: js.UndefOr[heremapsLib.Anon_Context] = js.undefined
}

object ServiceResult {
  @scala.inline
  def apply(
    Response: heremapsLib.Anon_Isolines = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    response: heremapsLib.Anon_Language = null,
    results: heremapsLib.Anon_Items = null,
    search: heremapsLib.Anon_Context = null
  ): ServiceResult = {
    val __obj = js.Dynamic.literal()
    if (Response != null) __obj.updateDynamic("Response")(Response)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (response != null) __obj.updateDynamic("response")(response)
    if (results != null) __obj.updateDynamic("results")(results)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[ServiceResult]
  }
}

