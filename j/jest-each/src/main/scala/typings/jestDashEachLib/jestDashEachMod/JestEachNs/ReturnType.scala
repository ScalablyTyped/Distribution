package typings
package jestDashEachLib.jestDashEachMod.JestEachNs

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
  def describe(name: java.lang.String, fn: SyncCallback): scala.Unit = js.native
  def fdescribe(name: java.lang.String, fn: SyncCallback): scala.Unit = js.native
  def fit(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
  def it(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
  def test(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
  def xdescribe(name: java.lang.String, fn: SyncCallback): scala.Unit = js.native
  def xit(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
  def xtest(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
}

