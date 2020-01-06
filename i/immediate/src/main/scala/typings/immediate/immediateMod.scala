package typings.immediate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immediate", JSImport.Namespace)
@js.native
object immediateMod extends js.Object {
  def apply[TArgs /* <: js.Array[_] */](
    task: js.Function1[/* args */ TArgs, Unit],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
}

