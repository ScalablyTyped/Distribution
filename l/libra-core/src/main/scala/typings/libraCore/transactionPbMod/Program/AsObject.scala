package typings.libraCore.transactionPbMod.Program

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var argumentsList: js.Array[typings.libraCore.transactionPbMod.TransactionArgument.AsObject] = js.native
  var code: Uint8Array | String = js.native
  var modulesList: js.Array[Uint8Array | String] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    argumentsList: js.Array[typings.libraCore.transactionPbMod.TransactionArgument.AsObject],
    code: Uint8Array | String,
    modulesList: js.Array[Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(argumentsList = argumentsList.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], modulesList = modulesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setArgumentsListVarargs(value: typings.libraCore.transactionPbMod.TransactionArgument.AsObject*): Self = this.set("argumentsList", js.Array(value :_*))
    @scala.inline
    def setArgumentsList(value: js.Array[typings.libraCore.transactionPbMod.TransactionArgument.AsObject]): Self = this.set("argumentsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Uint8Array | String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setModulesListVarargs(value: (Uint8Array | String)*): Self = this.set("modulesList", js.Array(value :_*))
    @scala.inline
    def setModulesList(value: js.Array[Uint8Array | String]): Self = this.set("modulesList", value.asInstanceOf[js.Any])
  }
  
}

