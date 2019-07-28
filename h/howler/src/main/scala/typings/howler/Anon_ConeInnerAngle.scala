package typings.howler

import typings.howler.howlerStrings.HRTF
import typings.howler.howlerStrings.equalpower
import typings.howler.howlerStrings.inverse
import typings.howler.howlerStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConeInnerAngle extends js.Object {
  var coneInnerAngle: js.UndefOr[Double] = js.undefined
  var coneOuterAngle: js.UndefOr[Double] = js.undefined
  var coneOuterGain: js.UndefOr[Double] = js.undefined
  var distanceModel: inverse | linear
  var maxDistance: Double
  var panningModel: HRTF | equalpower
  var refDistance: Double
  var rolloffFactor: Double
}

object Anon_ConeInnerAngle {
  @scala.inline
  def apply(
    distanceModel: inverse | linear,
    maxDistance: Double,
    panningModel: HRTF | equalpower,
    refDistance: Double,
    rolloffFactor: Double,
    coneInnerAngle: Int | Double = null,
    coneOuterAngle: Int | Double = null,
    coneOuterGain: Int | Double = null
  ): Anon_ConeInnerAngle = {
    val __obj = js.Dynamic.literal(distanceModel = distanceModel.asInstanceOf[js.Any], maxDistance = maxDistance, panningModel = panningModel.asInstanceOf[js.Any], refDistance = refDistance, rolloffFactor = rolloffFactor)
    if (coneInnerAngle != null) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.asInstanceOf[js.Any])
    if (coneOuterAngle != null) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.asInstanceOf[js.Any])
    if (coneOuterGain != null) __obj.updateDynamic("coneOuterGain")(coneOuterGain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConeInnerAngle]
  }
}

