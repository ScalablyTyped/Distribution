package typings.massive.massiveMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecomposeOptions
  extends /* foreignTable */ StringDictionary[DecomposeOptions | js.Any] {
  var columns: js.UndefOr[js.Array[String] | AnyObject[String]] = js.undefined
  var pk: String
}

object DecomposeOptions {
  @scala.inline
  def apply(
    pk: String,
    StringDictionary: /* foreignTable */ StringDictionary[DecomposeOptions | js.Any] = null,
    columns: js.Array[String] | AnyObject[String] = null
  ): DecomposeOptions = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposeOptions]
  }
}

