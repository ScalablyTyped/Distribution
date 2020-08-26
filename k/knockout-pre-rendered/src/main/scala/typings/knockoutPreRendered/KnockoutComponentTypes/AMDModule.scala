package typings.knockoutPreRendered.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// common AMD type
@js.native
trait AMDModule extends js.Object {
  var require: String = js.native
}

object AMDModule {
  @scala.inline
  def apply(require: String): AMDModule = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[AMDModule]
  }
  @scala.inline
  implicit class AMDModuleOps[Self <: AMDModule] (val x: Self) extends AnyVal {
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
    def setRequire(value: String): Self = this.set("require", value.asInstanceOf[js.Any])
  }
  
}

