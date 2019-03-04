package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLayout
  extends Layout
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `type`: java.lang.String
}

object CustomLayout {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CustomLayout]
  }
}

