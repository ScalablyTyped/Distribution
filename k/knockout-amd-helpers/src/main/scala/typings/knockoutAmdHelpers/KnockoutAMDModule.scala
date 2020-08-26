package typings.knockoutAmdHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutAMDModule extends js.Object {
  var baseDir: String = js.native
  var disposeMethod: String = js.native
  var initializer: String = js.native
  var templateProperty: String = js.native
}

object KnockoutAMDModule {
  @scala.inline
  def apply(baseDir: String, disposeMethod: String, initializer: String, templateProperty: String): KnockoutAMDModule = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], disposeMethod = disposeMethod.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], templateProperty = templateProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDModule]
  }
  @scala.inline
  implicit class KnockoutAMDModuleOps[Self <: KnockoutAMDModule] (val x: Self) extends AnyVal {
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisposeMethod(value: String): Self = this.set("disposeMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitializer(value: String): Self = this.set("initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateProperty(value: String): Self = this.set("templateProperty", value.asInstanceOf[js.Any])
  }
  
}

