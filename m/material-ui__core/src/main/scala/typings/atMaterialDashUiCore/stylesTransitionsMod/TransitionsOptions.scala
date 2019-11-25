package typings.atMaterialDashUiCore.stylesTransitionsMod

import typings.atMaterialDashUiCore.PartialDuration
import typings.atMaterialDashUiCore.PartialEasing
import typings.atMaterialDashUiCore.Partialdurationnumberstringeasingstringdelaynumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ String | js.Array[String], 
      /* options */ js.UndefOr[Partialdurationnumberstringeasingstringdelaynumber], 
      String
    ]
  ] = js.undefined
  var duration: js.UndefOr[PartialDuration] = js.undefined
  var easing: js.UndefOr[PartialEasing] = js.undefined
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ Double, Double]] = js.undefined
}

object TransitionsOptions {
  @scala.inline
  def apply(
    create: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partialdurationnumberstringeasingstringdelaynumber]) => String = null,
    duration: PartialDuration = null,
    easing: PartialEasing = null,
    getAutoHeightDuration: /* height */ Double => Double = null
  ): TransitionsOptions = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (getAutoHeightDuration != null) __obj.updateDynamic("getAutoHeightDuration")(js.Any.fromFunction1(getAutoHeightDuration))
    __obj.asInstanceOf[TransitionsOptions]
  }
}

