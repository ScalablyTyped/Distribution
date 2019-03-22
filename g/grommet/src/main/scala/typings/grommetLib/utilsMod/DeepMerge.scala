package typings
package grommetLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepMerge extends js.Object {
  def apply[T /* <: js.Object */, S /* <: js.Array[js.Object] */](
    target: T,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param sources because its type S is not an array type */ sources: S
  ): T with (/* import warning: ImportType.apply Failed type conversion: S[number] */ js.Any) = js.native
}

