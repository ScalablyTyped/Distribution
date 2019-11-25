package typings.ibmDashMobilefirst.WL.Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsideOutsideOptions extends js.Object {
  /**
    * confidenceLevel can be 'low', 'medium', 'high'
    */
  var confidenceLevel: String
}

object InsideOutsideOptions {
  @scala.inline
  def apply(confidenceLevel: String): InsideOutsideOptions = {
    val __obj = js.Dynamic.literal(confidenceLevel = confidenceLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsideOutsideOptions]
  }
}

