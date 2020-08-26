package typings.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDefinition extends js.Object {
  var directory: String = js.native
  var main: js.Any = js.native
  var options: js.Any = js.native
}

object ExtensionDefinition {
  @scala.inline
  def apply(directory: String, main: js.Any, options: js.Any): ExtensionDefinition = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDefinition]
  }
  @scala.inline
  implicit class ExtensionDefinitionOps[Self <: ExtensionDefinition] (val x: Self) extends AnyVal {
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setMain(value: js.Any): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

