package typings.matterJs

import org.scalablytyped.runtime.StringDictionary
import typings.matterJs.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUses
  extends /* _ */ StringDictionary[js.Any] {
  var uses: js.UndefOr[js.Array[Plugin | String]] = js.undefined
}

object AnonUses {
  @scala.inline
  def apply(StringDictionary: /* _ */ StringDictionary[js.Any] = null, uses: js.Array[Plugin | String] = null): AnonUses = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUses]
  }
}

