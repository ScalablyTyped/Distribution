package typings.jestJasmine2.typesMod

import typings.jestJasmine2.spyStrategyMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait Spy extends js.Object {
  var and: default = js.native
  var calls: typings.jestJasmine2.callTrackerMod.default = js.native
  var restoreObjectToOriginalState: js.UndefOr[js.Function0[Unit]] = js.native
  def apply(args: js.Any*): js.Any = js.native
}

