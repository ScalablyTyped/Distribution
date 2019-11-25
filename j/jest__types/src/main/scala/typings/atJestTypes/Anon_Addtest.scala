package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.add_test
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.TestFn
import typings.atJestTypes.buildCircusMod.TestMode
import typings.atJestTypes.buildCircusMod.TestName
import typings.atJestTypes.buildGlobalMod.DoneFn
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addtest extends Event {
  var asyncError: Error
  var fn: js.UndefOr[TestFn] = js.undefined
  var mode: js.UndefOr[TestMode] = js.undefined
  var name: add_test
  var testName: TestName
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Addtest {
  @scala.inline
  def apply(
    asyncError: Error,
    name: add_test,
    testName: TestName,
    fn: /* done */ js.UndefOr[DoneFn] => js.UndefOr[js.Promise[js.Any] | Unit] = null,
    mode: TestMode = null,
    timeout: Int | Double = null
  ): Anon_Addtest = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction1(fn))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Addtest]
  }
}

