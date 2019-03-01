package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String | scala.Double
  var source: java.lang.String
  var sourceLayer: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    source: java.lang.String,
    sourceLayer: java.lang.String = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("source")(source)
    if (sourceLayer != null) __obj.updateDynamic("sourceLayer")(sourceLayer)
    __obj.asInstanceOf[Anon_Id]
  }
}

