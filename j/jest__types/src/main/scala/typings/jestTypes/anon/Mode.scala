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

@js.native
trait Mode extends Event {
  var asyncError: typings.std.Error = js.native
  var fn: js.UndefOr[TestFn] = js.native
  var mode: js.UndefOr[TestMode] = js.native
  var name: add_test = js.native
  var testName: TestName = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Mode {
  @scala.inline
  def apply(asyncError: typings.std.Error, name: add_test, testName: TestName): Mode = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsyncError(value: typings.std.Error): Self = this.set("asyncError", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: add_test): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestName(value: TestName): Self = this.set("testName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: /* done */ js.UndefOr[DoneFn] => js.UndefOr[js.Promise[js.Any] | Unit]): Self = this.set("fn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setMode(value: TestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

