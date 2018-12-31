package typings
package immediateLib.immediateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immediate", JSImport.Namespace)
@js.native
object immediateModMembers extends js.Object {
  def apply[TArgs /* <: js.Array[_] */](
    task: js.Function1[/* args */ TArgs, scala.Unit],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): scala.Unit = js.native
}

