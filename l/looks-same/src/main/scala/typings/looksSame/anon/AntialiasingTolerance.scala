package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntialiasingTolerance extends js.Object {
  var antialiasingTolerance: js.UndefOr[Double] = js.undefined
}

object AntialiasingTolerance {
  @scala.inline
  def apply(antialiasingTolerance: js.UndefOr[Double] = js.undefined): AntialiasingTolerance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialiasingTolerance)) __obj.updateDynamic("antialiasingTolerance")(antialiasingTolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntialiasingTolerance]
  }
}

