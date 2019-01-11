package typings
package macrotaskLib.macrotaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("macrotask", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(cancel: macrotaskLib.macrotaskMod.CancelToken): scala.Unit = js.native
  def run[TArgs /* <: js.Array[_] */](
    task: js.Function1[/* args */ TArgs, scala.Unit],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): macrotaskLib.macrotaskMod.CancelToken = js.native
}

