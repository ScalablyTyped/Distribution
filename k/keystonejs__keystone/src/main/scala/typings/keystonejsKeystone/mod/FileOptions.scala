package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait FileOptions extends BaseFieldOptions {
  var adapter: js.UndefOr[js.Any] = js.native
  var route: js.UndefOr[String] = js.native
}

object FileOptions {
  @scala.inline
  def apply(`type`: FieldType): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
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
    def setAdapter(value: js.Any): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
  }
  
}

