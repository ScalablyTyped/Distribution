package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCms extends js.Object {
  var cms: String
}

object AnonCms {
  @scala.inline
  def apply(cms: String): AnonCms = {
    val __obj = js.Dynamic.literal(cms = cms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCms]
  }
}

