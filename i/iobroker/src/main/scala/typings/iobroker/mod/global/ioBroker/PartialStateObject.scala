package typings.iobroker.mod.global.ioBroker

import typings.iobroker.anon.PartialStateACL
import typings.iobroker.anon.PartialStateCommon
import typings.iobroker.iobrokerStrings.state
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Omit<iobroker.iobroker.<global>.ioBroker.StateObject, 'common' | 'acl'>> */
@js.native
trait PartialStateObject extends PartialObject {
  var _id: js.UndefOr[String] = js.native
  var acl: js.UndefOr[PartialStateACL] = js.native
  var common: js.UndefOr[PartialStateCommon] = js.native
  var encryptedNative: js.UndefOr[js.Array[String]] = js.native
  var enums: js.UndefOr[Record[String, String]] = js.native
  var from: js.UndefOr[String] = js.native
  var native: js.UndefOr[Record[String, ObjectField]] = js.native
  var protectedNative: js.UndefOr[js.Array[String]] = js.native
  var ts: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[state] = js.native
}

object PartialStateObject {
  @scala.inline
  def apply(): PartialStateObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateObject]
  }
  @scala.inline
  implicit class PartialStateObjectOps[Self <: PartialStateObject] (val x: Self) extends AnyVal {
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
    def setAcl(value: PartialStateACL): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setCommon(value: PartialStateCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    @scala.inline
    def setEncryptedNativeVarargs(value: String*): Self = this.set("encryptedNative", js.Array(value :_*))
    @scala.inline
    def setEncryptedNative(value: js.Array[String]): Self = this.set("encryptedNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptedNative: Self = this.set("encryptedNative", js.undefined)
    @scala.inline
    def setEnums(value: Record[String, String]): Self = this.set("enums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setNative(value: Record[String, ObjectField]): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setProtectedNativeVarargs(value: String*): Self = this.set("protectedNative", js.Array(value :_*))
    @scala.inline
    def setProtectedNative(value: js.Array[String]): Self = this.set("protectedNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectedNative: Self = this.set("protectedNative", js.undefined)
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
    @scala.inline
    def setType(value: state): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

