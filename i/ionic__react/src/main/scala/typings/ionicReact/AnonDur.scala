package typings.ionicReact

import typings.ionicReact.ionicReactNumbers.`0`
import typings.ionicReact.ionicReactNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDur extends js.Object {
  var dur: js.UndefOr[Double] = js.undefined
  var playTo: js.UndefOr[`0` | `1`] = js.undefined
  var step: Double
}

object AnonDur {
  @scala.inline
  def apply(step: Double, dur: Int | Double = null, playTo: `0` | `1` = null): AnonDur = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (dur != null) __obj.updateDynamic("dur")(dur.asInstanceOf[js.Any])
    if (playTo != null) __obj.updateDynamic("playTo")(playTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDur]
  }
}

