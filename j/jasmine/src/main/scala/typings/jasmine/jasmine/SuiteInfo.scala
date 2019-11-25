package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteInfo extends js.Object {
  var totalSpecsDefined: Double
}

object SuiteInfo {
  @scala.inline
  def apply(totalSpecsDefined: Double): SuiteInfo = {
    val __obj = js.Dynamic.literal(totalSpecsDefined = totalSpecsDefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuiteInfo]
  }
}

