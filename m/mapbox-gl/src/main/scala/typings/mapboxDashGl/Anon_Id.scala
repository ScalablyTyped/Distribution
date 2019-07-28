package typings.mapboxDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String | Double
  var source: String
  var sourceLayer: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: String | Double, source: String, sourceLayer: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source)
    if (sourceLayer != null) __obj.updateDynamic("sourceLayer")(sourceLayer)
    __obj.asInstanceOf[Anon_Id]
  }
}

