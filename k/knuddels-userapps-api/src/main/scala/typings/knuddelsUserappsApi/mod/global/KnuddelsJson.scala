package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappsApi.mod.KnuddelsJsonData
import typings.knuddelsUserappsApi.mod._KnuddelsJsonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnuddelsJson
  extends /* x */ StringDictionary[js.UndefOr[KnuddelsJsonData]]
     with _KnuddelsJsonData

object KnuddelsJson {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.UndefOr[KnuddelsJsonData]] = null): KnuddelsJson = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnuddelsJson]
  }
}

