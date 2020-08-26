package typings.loadableComponent.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultImportedComponent[Props] extends js.Object {
  var default: ComponentType[Props] = js.native
}

object DefaultImportedComponent {
  @scala.inline
  def apply[Props](default: ComponentType[Props]): DefaultImportedComponent[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultImportedComponent[Props]]
  }
  @scala.inline
  implicit class DefaultImportedComponentOps[Self <: DefaultImportedComponent[_], Props] (val x: Self with DefaultImportedComponent[Props]) extends AnyVal {
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
    def setDefault(value: ComponentType[Props]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
  
}

