package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecomposeOptions
  extends /* foreignTable */ org.scalablytyped.runtime.StringDictionary[DecomposeOptions | js.Any] {
  var columns: js.UndefOr[js.Array[java.lang.String] | AnyObject[java.lang.String]] = js.undefined
  var pk: java.lang.String
}

object DecomposeOptions {
  @scala.inline
  def apply(
    pk: java.lang.String,
    StringDictionary: /* foreignTable */ org.scalablytyped.runtime.StringDictionary[DecomposeOptions | js.Any] = null,
    columns: js.Array[java.lang.String] | AnyObject[java.lang.String] = null
  ): DecomposeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pk")(pk)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposeOptions]
  }
}

