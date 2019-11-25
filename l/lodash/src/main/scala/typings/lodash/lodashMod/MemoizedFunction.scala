package typings.lodash.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// memoize
trait MemoizedFunction extends js.Object {
  var cache: MapCache
}

object MemoizedFunction {
  @scala.inline
  def apply(cache: MapCache): MemoizedFunction = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoizedFunction]
  }
}

