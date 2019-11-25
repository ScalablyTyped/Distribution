package typings.grommet.utilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepMerge extends js.Object {
  def apply[T /* <: js.Object */, S /* <: js.Array[js.Object] */](
    target: T,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param sources because its type S is not an array type */ sources: S
  ): T with (/* import warning: importer.ImportType#apply Failed type conversion: S[number] */ js.Any) = js.native
}

@JSImport("grommet/utils", "deepMerge")
@js.native
object deepMerge extends TopLevel[DeepMerge]

