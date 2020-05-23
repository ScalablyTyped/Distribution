package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestFn
import typings.jestTypes.circusMod.TestMode
import typings.jestTypes.circusMod.TestName
import typings.jestTypes.globalMod.DoneFn
import typings.jestTypes.jestTypesStrings.add_test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends Event {
  var asyncError: typings.std.Error
  var fn: js.UndefOr[TestFn] = js.undefined
  var mode: js.UndefOr[TestMode] = js.undefined
  var name: add_test
  var testName: TestName
  var timeout: js.UndefOr[Double] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    asyncError: typings.std.Error,
    name: add_test,
    testName: TestName,
    fn: /* done */ js.UndefOr[DoneFn] => js.UndefOr[js.Promise[js.Any] | Unit] = null,
    mode: TestMode = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Mode = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction1(fn))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

