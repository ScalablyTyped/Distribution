package typings
package macrotaskLib.macrotaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("macrotask", JSImport.Namespace)
@js.native
object macrotaskModMembers extends js.Object {
  def clear(cancel: CancelToken): scala.Unit = js.native
  def run[TArgs /* <: js.Array[_] */](
    task: js.Function1[/* args */ TArgs, scala.Unit],
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): CancelToken = js.native
}

