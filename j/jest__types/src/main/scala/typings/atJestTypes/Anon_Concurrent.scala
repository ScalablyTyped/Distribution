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
  def apply(
    concurrent: (/* testName */ String, /* testFn */ js.Function0[js.Promise[js.Any]], /* timeout */ js.UndefOr[Double]) => Unit = null
  ): Anon_Concurrent = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(js.Any.fromFunction3(concurrent))
    __obj.asInstanceOf[Anon_Concurrent]
  }
}

