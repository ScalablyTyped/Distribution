package typings
package lilDashUriLib.lilDashUriMod.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Map of query string keys and values
  */
trait QueryString
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]

object QueryString {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null
  ): QueryString = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[QueryString]
  }
}

