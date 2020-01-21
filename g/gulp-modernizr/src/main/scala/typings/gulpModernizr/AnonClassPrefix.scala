package typings.gulpModernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassPrefix extends js.Object {
  var classPrefix: String
  var enableClasses: Boolean
  var enableJSClass: Boolean
}

object AnonClassPrefix {
  @scala.inline
  def apply(classPrefix: String, enableClasses: Boolean, enableJSClass: Boolean): AnonClassPrefix = {
    val __obj = js.Dynamic.literal(classPrefix = classPrefix.asInstanceOf[js.Any], enableClasses = enableClasses.asInstanceOf[js.Any], enableJSClass = enableJSClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassPrefix]
  }
}

