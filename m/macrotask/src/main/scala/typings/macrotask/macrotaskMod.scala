package typings.macrotask

import typings.macrotask.macrotaskMod.CancelToken
import typings.macrotask.macrotaskStrings.imaginary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("macrotask", JSImport.Namespace)
@js.native
object macrotaskMod extends js.Object {
  @js.native
  class CancelToken () extends js.Object {
    // needed for TS to not accept just any object, only instances of CancelToken
    var __cancel__prop: imaginary = js.native
  }
  
  def clear(cancel: CancelToken): Unit = js.native
  def run[TArgs /* <: js.Array[_] */](
    task: js.Function1[/* args */ TArgs, Unit],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): CancelToken = js.native
}

