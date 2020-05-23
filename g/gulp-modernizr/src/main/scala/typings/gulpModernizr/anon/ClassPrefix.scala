package typings.gulpModernizr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassPrefix extends js.Object {
  var classPrefix: String
  var enableClasses: Boolean
  var enableJSClass: Boolean
}

object ClassPrefix {
  @scala.inline
  def apply(classPrefix: String, enableClasses: Boolean, enableJSClass: Boolean): ClassPrefix = {
    val __obj = js.Dynamic.literal(classPrefix = classPrefix.asInstanceOf[js.Any], enableClasses = enableClasses.asInstanceOf[js.Any], enableJSClass = enableJSClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrefix]
  }
}

