package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteInfo extends js.Object {
  var totalSpecsDefined: scala.Double
}

object SuiteInfo {
  @scala.inline
  def apply(totalSpecsDefined: scala.Double): SuiteInfo = {
    val __obj = js.Dynamic.literal(totalSpecsDefined = totalSpecsDefined)
  
    __obj.asInstanceOf[SuiteInfo]
  }
}

