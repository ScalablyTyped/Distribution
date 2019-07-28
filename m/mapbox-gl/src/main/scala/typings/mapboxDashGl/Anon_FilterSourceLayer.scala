package typings.mapboxDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterSourceLayer extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var sourceLayer: js.UndefOr[String] = js.undefined
}

object Anon_FilterSourceLayer {
  @scala.inline
  def apply(filter: js.Array[_] = null, sourceLayer: String = null): Anon_FilterSourceLayer = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (sourceLayer != null) __obj.updateDynamic("sourceLayer")(sourceLayer)
    __obj.asInstanceOf[Anon_FilterSourceLayer]
  }
}

