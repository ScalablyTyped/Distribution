package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessibleUserCount extends js.Object {
  var onEnd: js.UndefOr[
    js.Function2[
      /* accessibleUserCount */ scala.Double, 
      /* key */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function2[
      /* accessibleUserCount */ scala.Double, 
      /* key */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_AccessibleUserCount {
  @scala.inline
  def apply(
    onEnd: (/* accessibleUserCount */ scala.Double, /* key */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onStart: (/* accessibleUserCount */ scala.Double, /* key */ js.UndefOr[java.lang.String]) => scala.Unit = null
  ): Anon_AccessibleUserCount = {
    val __obj = js.Dynamic.literal()
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction2(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    __obj.asInstanceOf[Anon_AccessibleUserCount]
  }
}

