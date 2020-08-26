package typings.intlMessageformat.mod

import typings.intlMessageformat.intlMessageformatNumbers.`0`
import typings.intlMessageformat.intlMessageformatNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intlMessageformat.mod.NumberSkeleton
  - typings.intlMessageformat.mod.DateTimeSkeleton
*/
trait Skeleton extends js.Object

object Skeleton {
  @scala.inline
  def NumberSkeleton(tokens: js.Array[NumberSkeletonToken], `type`: `0`): Skeleton = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
  @scala.inline
  def DateTimeSkeleton(pattern: String, `type`: `1`): Skeleton = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
}

