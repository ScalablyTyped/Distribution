package typings
package atMaterialDashUiCoreLib.stylesTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ java.lang.String | js.Array[java.lang.String], 
      /* options */ js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.Anon_Delay]], 
      java.lang.String
    ]
  ] = js.undefined
  var duration: js.UndefOr[stdLib.Partial[Duration]] = js.undefined
  var easing: js.UndefOr[stdLib.Partial[Easing]] = js.undefined
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ scala.Double, scala.Double]] = js.undefined
}

object TransitionsOptions {
  @scala.inline
  def apply(
    create: js.Function2[
      /* props */ java.lang.String | js.Array[java.lang.String], 
      /* options */ js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.Anon_Delay]], 
      java.lang.String
    ] = null,
    duration: stdLib.Partial[Duration] = null,
    easing: stdLib.Partial[Easing] = null,
    getAutoHeightDuration: js.Function1[/* height */ scala.Double, scala.Double] = null
  ): TransitionsOptions = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (getAutoHeightDuration != null) __obj.updateDynamic("getAutoHeightDuration")(getAutoHeightDuration)
    __obj.asInstanceOf[TransitionsOptions]
  }
}

