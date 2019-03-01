package typings
package howlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConeInnerAngle extends js.Object {
  var coneInnerAngle: js.UndefOr[scala.Double] = js.undefined
  var coneOuterAngle: js.UndefOr[scala.Double] = js.undefined
  var coneOuterGain: js.UndefOr[scala.Double] = js.undefined
  var distanceModel: howlerLib.howlerLibStrings.inverse | howlerLib.howlerLibStrings.linear
  var maxDistance: scala.Double
  var panningModel: howlerLib.howlerLibStrings.HRTF | howlerLib.howlerLibStrings.equalpower
  var refDistance: scala.Double
  var rolloffFactor: scala.Double
}

object Anon_ConeInnerAngle {
  @scala.inline
  def apply(
    distanceModel: howlerLib.howlerLibStrings.inverse | howlerLib.howlerLibStrings.linear,
    maxDistance: scala.Double,
    panningModel: howlerLib.howlerLibStrings.HRTF | howlerLib.howlerLibStrings.equalpower,
    refDistance: scala.Double,
    rolloffFactor: scala.Double,
    coneInnerAngle: scala.Int | scala.Double = null,
    coneOuterAngle: scala.Int | scala.Double = null,
    coneOuterGain: scala.Int | scala.Double = null
  ): Anon_ConeInnerAngle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distanceModel")(distanceModel.asInstanceOf[js.Any])
    __obj.updateDynamic("maxDistance")(maxDistance)
    __obj.updateDynamic("panningModel")(panningModel.asInstanceOf[js.Any])
    __obj.updateDynamic("refDistance")(refDistance)
    __obj.updateDynamic("rolloffFactor")(rolloffFactor)
    if (coneInnerAngle != null) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.asInstanceOf[js.Any])
    if (coneOuterAngle != null) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.asInstanceOf[js.Any])
    if (coneOuterGain != null) __obj.updateDynamic("coneOuterGain")(coneOuterGain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConeInnerAngle]
  }
}

