package typings.iobroker.mod.global.ioBroker

import typings.iobroker.anon.PartialOtherCommon
import typings.iobroker.iobrokerStrings.folder
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<iobroker.iobroker.<global>.ioBroker.FolderObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>> */
@js.native
trait PartialFolderObject extends PartialObject {
  var _id: js.UndefOr[String] = js.native
  var acl: js.UndefOr[ObjectACL] = js.native
  var common: js.UndefOr[PartialOtherCommon] = js.native
  var enums: js.UndefOr[Record[String, String]] = js.native
  var native: js.UndefOr[Record[String, ObjectField]] = js.native
  var `type`: js.UndefOr[folder] = js.native
}

object PartialFolderObject {
  @scala.inline
  def apply(): PartialFolderObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFolderObject]
  }
  @scala.inline
  implicit class PartialFolderObjectOps[Self <: PartialFolderObject] (val x: Self) extends AnyVal {
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    @scala.inline
    def setAcl(value: ObjectACL): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setCommon(value: PartialOtherCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    @scala.inline
    def setEnums(value: Record[String, String]): Self = this.set("enums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    @scala.inline
    def setNative(value: Record[String, ObjectField]): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setType(value: folder): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

