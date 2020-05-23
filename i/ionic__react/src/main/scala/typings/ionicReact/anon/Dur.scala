package typings.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dur extends js.Object {
  var dur: js.UndefOr[Double] = js.undefined
  var playTo: js.UndefOr[
    typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1`
  ] = js.undefined
  var step: Double
}

object Dur {
  @scala.inline
  def apply(
    step: Double,
    dur: js.UndefOr[Double] = js.undefined,
    playTo: typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1` = null
  ): Dur = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (!js.isUndefined(dur)) __obj.updateDynamic("dur")(dur.get.asInstanceOf[js.Any])
    if (playTo != null) __obj.updateDynamic("playTo")(playTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dur]
  }
}

