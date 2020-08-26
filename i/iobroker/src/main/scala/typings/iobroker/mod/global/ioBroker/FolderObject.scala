package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.folder
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderObject
  extends BaseObject
     with AnyObject {
  // Nothing is set in stone here, so start with allowing every property
  @JSName("common")
  var common_FolderObject: OtherCommon = js.native
  @JSName("type")
  var type_FolderObject: folder = js.native
}

object FolderObject {
  @scala.inline
  def apply(_id: String, common: OtherCommon, native: Record[String, ObjectField], `type`: folder): FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderObject]
  }
  @scala.inline
  implicit class FolderObjectOps[Self <: FolderObject] (val x: Self) extends AnyVal {
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
    def setCommon(value: OtherCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: folder): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

