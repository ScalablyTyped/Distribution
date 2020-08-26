package typings.gulpModernizr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPrefix extends js.Object {
  var classPrefix: String = js.native
  var enableClasses: Boolean = js.native
  var enableJSClass: Boolean = js.native
}

object ClassPrefix {
  @scala.inline
  def apply(classPrefix: String, enableClasses: Boolean, enableJSClass: Boolean): ClassPrefix = {
    val __obj = js.Dynamic.literal(classPrefix = classPrefix.asInstanceOf[js.Any], enableClasses = enableClasses.asInstanceOf[js.Any], enableJSClass = enableJSClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrefix]
  }
  @scala.inline
  implicit class ClassPrefixOps[Self <: ClassPrefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassPrefix(value: String): Self = this.set("classPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableClasses(value: Boolean): Self = this.set("enableClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableJSClass(value: Boolean): Self = this.set("enableJSClass", value.asInstanceOf[js.Any])
  }
  
}

