package typings.jestTypes

import typings.jestTypes.globalMod.ItConcurrentBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConcurrent extends js.Object {
  var concurrent: js.UndefOr[ItConcurrentBase] = js.undefined
}

object AnonConcurrent {
  @scala.inline
  def apply(
    concurrent: (/* testName */ String, /* testFn */ js.Function0[js.Promise[js.Any]], /* timeout */ js.UndefOr[Double]) => Unit = null
  ): AnonConcurrent = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(js.Any.fromFunction3(concurrent))
    __obj.asInstanceOf[AnonConcurrent]
  }
}

