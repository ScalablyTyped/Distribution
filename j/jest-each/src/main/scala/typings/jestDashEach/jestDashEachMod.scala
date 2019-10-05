package typings.jestDashEach

import typings.jestDashEach.jestDashEachMod.JestEach.AsyncCallback
import typings.jestDashEach.jestDashEachMod.JestEach.DescribeFn
import typings.jestDashEach.jestDashEachMod.JestEach.DescribeObj
import typings.jestDashEach.jestDashEachMod.JestEach.ReturnType
import typings.jestDashEach.jestDashEachMod.JestEach.SyncCallback
import typings.jestDashEach.jestDashEachMod.JestEach.TestCallback
import typings.jestDashEach.jestDashEachMod.JestEach.TestFn
import typings.jestDashEach.jestDashEachMod.JestEach.TestObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each", JSImport.Namespace)
@js.native
object jestDashEachMod extends js.Object {
  @js.native
  object JestEach extends js.Object {
    @js.native
    trait DescribeObj extends js.Object {
      @JSName("only")
      var only_Original: DescribeFn = js.native
      @JSName("skip")
      var skip_Original: DescribeFn = js.native
      def apply(name: String, fn: SyncCallback): Unit = js.native
      def only(name: String, fn: SyncCallback): Unit = js.native
      def skip(name: String, fn: SyncCallback): Unit = js.native
    }
    
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
    
    @js.native
    trait TestObj extends js.Object {
      @JSName("only")
      var only_Original: TestFn = js.native
      @JSName("skip")
      var skip_Original: TestFn = js.native
      def apply(name: String, fn: TestCallback): Unit = js.native
      def only(name: String, fn: TestCallback): Unit = js.native
      def skip(name: String, fn: TestCallback): Unit = js.native
    }
    
    type AsyncCallback = js.Function0[Unit]
    type DescribeFn = js.Function2[/* name */ String, /* fn */ SyncCallback, Unit]
    type SyncCallback = js.Function1[/* repeated */ js.Any, Unit]
    type TestCallback = SyncCallback | AsyncCallback
    type TestFn = js.Function2[/* name */ String, /* fn */ TestCallback, Unit]
  }
  
  @js.native
  object default extends js.Object {
    def apply(parameters: js.Array[js.Array[_]]): ReturnType = js.native
  }
  
}

