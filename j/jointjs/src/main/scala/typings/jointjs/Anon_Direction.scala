package typings.jointjs

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.diaNs.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction
  extends /* key */ StringDictionary[js.Any] {
  var direction: js.UndefOr[Direction] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, direction: Direction = null): Anon_Direction = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[Anon_Direction]
  }
}

