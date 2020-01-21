package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.AnonContext
import typings.heremaps.AnonIsolines
import typings.heremaps.AnonItems
import typings.heremaps.AnonLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
trait ServiceResult
  extends /* key */ StringDictionary[js.Any] {
  var Response: js.UndefOr[AnonIsolines] = js.undefined
  var response: js.UndefOr[AnonLanguage] = js.undefined
  var results: js.UndefOr[AnonItems] = js.undefined
  var search: js.UndefOr[AnonContext] = js.undefined
}

object ServiceResult {
  @scala.inline
  def apply(
    Response: AnonIsolines = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    response: AnonLanguage = null,
    results: AnonItems = null,
    search: AnonContext = null
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

