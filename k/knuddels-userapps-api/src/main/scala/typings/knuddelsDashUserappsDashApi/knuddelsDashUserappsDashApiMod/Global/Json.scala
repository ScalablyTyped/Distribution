package typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod.Global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod.JsonData
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._JsonData
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json
  extends /* x */ StringDictionary[js.UndefOr[JsonData]]
     with _JsonData
     with _KnuddelsEvent

object Json {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.UndefOr[JsonData]] = null): Json = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Json]
  }
}

