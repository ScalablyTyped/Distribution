package typings
package ibmDashMobilefirstLib.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsideOutsideOptions extends js.Object {
  /**
    * confidenceLevel can be 'low', 'medium', 'high'
    */
  var confidenceLevel: java.lang.String
}

object InsideOutsideOptions {
  @scala.inline
  def apply(confidenceLevel: java.lang.String): InsideOutsideOptions = {
    val __obj = js.Dynamic.literal(confidenceLevel = confidenceLevel)
  
    __obj.asInstanceOf[InsideOutsideOptions]
  }
}

