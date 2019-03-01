package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteParams
  extends /* key */ org.scalablytyped.runtime.NumberDictionary[java.lang.String | scala.Double]
     with /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]

object RouteParams {
  @scala.inline
  def apply(
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[java.lang.String | scala.Double] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = null
  ): RouteParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteParams]
  }
}

