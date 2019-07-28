package typings.jestDashEach.jestDashEachMod.JestEachNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnType extends js.Object {
  @JSName("describe")
  var describe_Original: DescribeObj = js.native
  @JSName("fdescribe")
  var fdescribe_Original: DescribeFn = js.native
  @JSName("fit")
  var fit_Original: TestFn = js.native
  @JSName("it")
  var it_Original: TestObj = js.native
  @JSName("test")
  var test_Original: TestObj = js.native
  @JSName("xdescribe")
  var xdescribe_Original: DescribeFn = js.native
  @JSName("xit")
  var xit_Original: TestFn = js.native
  @JSName("xtest")
  var xtest_Original: TestFn = js.native
  def describe(name: String, fn: SyncCallback): Unit = js.native
  def fdescribe(name: String, fn: SyncCallback): Unit = js.native
  def fit(name: String, fn: TestCallback): Unit = js.native
  def it(name: String, fn: TestCallback): Unit = js.native
  def test(name: String, fn: TestCallback): Unit = js.native
  def xdescribe(name: String, fn: SyncCallback): Unit = js.native
  def xit(name: String, fn: TestCallback): Unit = js.native
  def xtest(name: String, fn: TestCallback): Unit = js.native
}

