package typings
package matterDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Uses
  extends /* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var uses: js.UndefOr[js.Array[matterDashJsLib.matterDashJsMod.Plugin | java.lang.String]] = js.undefined
}

object Anon_Uses {
  @scala.inline
  def apply(
    StringDictionary: /* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    uses: js.Array[matterDashJsLib.matterDashJsMod.Plugin | java.lang.String] = null
  ): Anon_Uses = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[Anon_Uses]
  }
}

