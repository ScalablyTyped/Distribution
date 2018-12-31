package typings
package atMaterialDashUiCoreLib.stylesTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ java.lang.String | js.Array[java.lang.String], 
      /* options */ js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.Anon_Easing]], 
      java.lang.String
    ]
  ] = js.undefined
  var duration: js.UndefOr[stdLib.Partial[Duration]] = js.undefined
  var easing: js.UndefOr[stdLib.Partial[Easing]] = js.undefined
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ scala.Double, scala.Double]] = js.undefined
}

