package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.anon.Context
import typings.heremaps.anon.Isolines
import typings.heremaps.anon.Items
import typings.heremaps.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
trait ServiceResult
  extends /* key */ StringDictionary[js.Any] {
  var Response: js.UndefOr[Isolines] = js.undefined
  var response: js.UndefOr[Language] = js.undefined
  var results: js.UndefOr[Items] = js.undefined
  var search: js.UndefOr[Context] = js.undefined
}

object ServiceResult {
  @scala.inline
  def apply(
    Response: Isolines = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    response: Language = null,
    results: Items = null,
    search: Context = null
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

