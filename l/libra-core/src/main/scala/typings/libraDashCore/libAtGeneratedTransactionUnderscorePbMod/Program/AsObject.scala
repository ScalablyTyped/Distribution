package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.Program

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var argumentsList: js.Array[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.AsObject
  ]
  var code: Uint8Array | String
  var modulesList: js.Array[Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(
    argumentsList: js.Array[
      typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.AsObject
    ],
    code: Uint8Array | String,
    modulesList: js.Array[Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(argumentsList = argumentsList.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], modulesList = modulesList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

