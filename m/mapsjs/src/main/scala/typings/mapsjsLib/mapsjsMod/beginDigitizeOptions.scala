package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait beginDigitizeOptions extends js.Object {
  var circleEndAction: js.UndefOr[js.Function1[/* circle */ mapsjsLib.mapsjsMod.geometryNs.polygon, scala.Unit]] = js.undefined
  var envelopeEndAction: js.UndefOr[js.Function1[/* env */ envelope, scala.Unit]] = js.undefined
  var geometryStyle: js.UndefOr[geometryStyle] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var leavePath: js.UndefOr[scala.Boolean] = js.undefined
  var nodeMoveAction: js.UndefOr[
    js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* actionType */ java.lang.String, _]
  ] = js.undefined
  var nodeTapAndHoldAction: js.UndefOr[js.Function2[/* setIdx */ scala.Double, /* idx */ scala.Double, scala.Boolean]] = js.undefined
  var shapeChangeAction: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var shapeType: java.lang.String
  var styledGeometry: js.UndefOr[styledGeometry] = js.undefined
  var suppressNodeAdd: js.UndefOr[scala.Boolean] = js.undefined
}

