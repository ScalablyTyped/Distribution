package typings.jsonDashFormDashData.jsonDashFormDashDataMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidJSON
  extends /* key */ StringDictionary[ValidJSON | ValidJSONValue | js.Array[ValidJSONValue] | FileList]

object ValidJSON {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[ValidJSON | ValidJSONValue | js.Array[ValidJSONValue] | FileList] = null
  ): ValidJSON = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValidJSON]
  }
}

