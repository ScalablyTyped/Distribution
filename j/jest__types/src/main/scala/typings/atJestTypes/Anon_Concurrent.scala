package typings.atJestTypes

import typings.atJestTypes.buildGlobalMod.ItConcurrentBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Concurrent extends js.Object {
  var concurrent: js.UndefOr[ItConcurrentBase] = js.undefined
}

object Anon_Concurrent {
  @scala.inline
  def apply(concurrent: ItConcurrentBase = null): Anon_Concurrent = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent)
    __obj.asInstanceOf[Anon_Concurrent]
  }
}

