package typings.jsonFormData.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidJSON
  extends /* key */ StringDictionary[ValidJSON | ValidJSONValue | js.Array[ValidJSONValue] | FileList]

object ValidJSON {
  @scala.inline
  def apply(): ValidJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidJSON]
  }
}

