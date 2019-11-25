package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.Anon_Context
import typings.heremaps.Anon_Isolines
import typings.heremaps.Anon_Items
import typings.heremaps.Anon_Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
trait ServiceResult
  extends /* key */ StringDictionary[js.Any] {
  var Response: js.UndefOr[Anon_Isolines] = js.undefined
  var response: js.UndefOr[Anon_Language] = js.undefined
  var results: js.UndefOr[Anon_Items] = js.undefined
  var search: js.UndefOr[Anon_Context] = js.undefined
}

object ServiceResult {
  @scala.inline
  def apply(
    Response: Anon_Isolines = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    response: Anon_Language = null,
    results: Anon_Items = null,
    search: Anon_Context = null
  ): ServiceResult = {
    val __obj = js.Dynamic.literal()
    if (Response != null) __obj.updateDynamic("Response")(Response.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceResult]
  }
}

