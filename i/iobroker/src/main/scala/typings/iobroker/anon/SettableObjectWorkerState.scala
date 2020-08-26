package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.state
import typings.iobroker.mod.global.ioBroker.ObjectField
import typings.iobroker.mod.global.ioBroker.SettableObject
import typings.iobroker.mod.global.ioBroker.StateACL
import typings.iobroker.mod.global.ioBroker.StateCommon
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker.<global>.ioBroker.SettableObjectWorker<iobroker.iobroker.<global>.ioBroker.StateObject> */
@js.native
trait SettableObjectWorkerState extends SettableObject {
  var _id: js.UndefOr[String] = js.native
  var acl: js.UndefOr[StateACL] = js.native
  var common: StateCommon = js.native
  var encryptedNative: js.UndefOr[js.Array[String]] = js.native
  var enums: js.UndefOr[Record[String, String]] = js.native
  var from: js.UndefOr[String] = js.native
  var native: Record[String, ObjectField] = js.native
  var protectedNative: js.UndefOr[js.Array[String]] = js.native
  var ts: js.UndefOr[Double] = js.native
  var `type`: state = js.native
}

object SettableObjectWorkerState {
  @scala.inline
  def apply(common: StateCommon, native: Record[String, ObjectField], `type`: state): SettableObjectWorkerState = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObjectWorkerState]
  }
  @scala.inline
  implicit class SettableObjectWorkerStateOps[Self <: SettableObjectWorkerState] (val x: Self) extends AnyVal {
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
    def setCommon(value: StateCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: Record[String, ObjectField]): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: state): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    @scala.inline
    def setAcl(value: StateACL): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
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
    def setProtectedNativeVarargs(value: String*): Self = this.set("protectedNative", js.Array(value :_*))
    @scala.inline
    def setProtectedNative(value: js.Array[String]): Self = this.set("protectedNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectedNative: Self = this.set("protectedNative", js.undefined)
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
  }
  
}

