package typings.leafletEditable.mod.Map

import typings.leafletEditable.mod.EditOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: js.UndefOr[EditOptions] = js.native
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: js.UndefOr[Boolean] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setEditOptions(value: EditOptions): Self = this.set("editOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditOptions: Self = this.set("editOptions", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
  }
  
}

