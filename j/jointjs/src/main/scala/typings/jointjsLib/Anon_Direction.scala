package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var direction: js.UndefOr[jointjsLib.jointjsMod.diaNs.Direction] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    direction: jointjsLib.jointjsMod.diaNs.Direction = null
  ): Anon_Direction = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[Anon_Direction]
  }
}

