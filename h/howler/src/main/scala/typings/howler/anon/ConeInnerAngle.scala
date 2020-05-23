package typings.howler.anon

import typings.howler.howlerStrings.HRTF
import typings.howler.howlerStrings.equalpower
import typings.howler.howlerStrings.inverse
import typings.howler.howlerStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConeInnerAngle extends js.Object {
  var coneInnerAngle: js.UndefOr[Double] = js.undefined
  var coneOuterAngle: js.UndefOr[Double] = js.undefined
  var coneOuterGain: js.UndefOr[Double] = js.undefined
  var distanceModel: inverse | linear
  var maxDistance: Double
  var panningModel: HRTF | equalpower
  var refDistance: Double
  var rolloffFactor: Double
}

object ConeInnerAngle {
  @scala.inline
  def apply(
    distanceModel: inverse | linear,
    maxDistance: Double,
    panningModel: HRTF | equalpower,
    refDistance: Double,
    rolloffFactor: Double,
    coneInnerAngle: js.UndefOr[Double] = js.undefined,
    coneOuterAngle: js.UndefOr[Double] = js.undefined,
    coneOuterGain: js.UndefOr[Double] = js.undefined
  ): ConeInnerAngle = {
    val __obj = js.Dynamic.literal(distanceModel = distanceModel.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], panningModel = panningModel.asInstanceOf[js.Any], refDistance = refDistance.asInstanceOf[js.Any], rolloffFactor = rolloffFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(coneInnerAngle)) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coneOuterAngle)) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coneOuterGain)) __obj.updateDynamic("coneOuterGain")(coneOuterGain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConeInnerAngle]
  }
}

