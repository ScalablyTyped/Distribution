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

object beginDigitizeOptions {
  @scala.inline
  def apply(
    shapeType: java.lang.String,
    circleEndAction: /* circle */ mapsjsLib.mapsjsMod.geometryNs.polygon => scala.Unit = null,
    envelopeEndAction: /* env */ envelope => scala.Unit = null,
    geometryStyle: geometryStyle = null,
    key: java.lang.String = null,
    leavePath: js.UndefOr[scala.Boolean] = js.undefined,
    nodeMoveAction: (/* x */ scala.Double, /* y */ scala.Double, /* actionType */ java.lang.String) => _ = null,
    nodeTapAndHoldAction: (/* setIdx */ scala.Double, /* idx */ scala.Double) => scala.Boolean = null,
    shapeChangeAction: () => scala.Unit = null,
    styledGeometry: styledGeometry = null,
    suppressNodeAdd: js.UndefOr[scala.Boolean] = js.undefined
  ): beginDigitizeOptions = {
    val __obj = js.Dynamic.literal(shapeType = shapeType)
    if (circleEndAction != null) __obj.updateDynamic("circleEndAction")(js.Any.fromFunction1(circleEndAction))
    if (envelopeEndAction != null) __obj.updateDynamic("envelopeEndAction")(js.Any.fromFunction1(envelopeEndAction))
    if (geometryStyle != null) __obj.updateDynamic("geometryStyle")(geometryStyle)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(leavePath)) __obj.updateDynamic("leavePath")(leavePath)
    if (nodeMoveAction != null) __obj.updateDynamic("nodeMoveAction")(js.Any.fromFunction3(nodeMoveAction))
    if (nodeTapAndHoldAction != null) __obj.updateDynamic("nodeTapAndHoldAction")(js.Any.fromFunction2(nodeTapAndHoldAction))
    if (shapeChangeAction != null) __obj.updateDynamic("shapeChangeAction")(js.Any.fromFunction0(shapeChangeAction))
    if (styledGeometry != null) __obj.updateDynamic("styledGeometry")(styledGeometry)
    if (!js.isUndefined(suppressNodeAdd)) __obj.updateDynamic("suppressNodeAdd")(suppressNodeAdd)
    __obj.asInstanceOf[beginDigitizeOptions]
  }
}

