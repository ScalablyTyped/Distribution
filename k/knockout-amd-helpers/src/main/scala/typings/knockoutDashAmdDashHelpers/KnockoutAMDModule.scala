package typings.knockoutDashAmdDashHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutAMDModule extends js.Object {
  var baseDir: String
  var disposeMethod: String
  var initializer: String
  var templateProperty: String
}

object KnockoutAMDModule {
  @scala.inline
  def apply(baseDir: String, disposeMethod: String, initializer: String, templateProperty: String): KnockoutAMDModule = {
    val __obj = js.Dynamic.literal(baseDir = baseDir, disposeMethod = disposeMethod, initializer = initializer, templateProperty = templateProperty)
  
    __obj.asInstanceOf[KnockoutAMDModule]
  }
}

