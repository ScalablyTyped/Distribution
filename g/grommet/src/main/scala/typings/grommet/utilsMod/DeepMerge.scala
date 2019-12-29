package typings.grommet.utilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepMerge extends js.Object {
  def apply[T /* <: js.Object */, S /* <: js.Object */](target: T, source: S): T with S = js.native
}

@JSImport("grommet/utils", "deepMerge")
@js.native
object deepMerge extends TopLevel[DeepMerge]

