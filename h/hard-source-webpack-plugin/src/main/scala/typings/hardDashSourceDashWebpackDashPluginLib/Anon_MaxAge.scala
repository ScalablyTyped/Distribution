package typings
package hardDashSourceDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAge extends js.Object {
  var maxAge: scala.Double
  var sizeThreshold: scala.Double
}

object Anon_MaxAge {
  @scala.inline
  def apply(maxAge: scala.Double, sizeThreshold: scala.Double): Anon_MaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxAge")(maxAge)
    __obj.updateDynamic("sizeThreshold")(sizeThreshold)
    __obj.asInstanceOf[Anon_MaxAge]
  }
}

