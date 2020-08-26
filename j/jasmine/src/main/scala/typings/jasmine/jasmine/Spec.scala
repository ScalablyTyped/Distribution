package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable3
import typings.jasmine.jasmineStrings.get
import typings.jasmine.jasmineStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec
  extends SuiteOrSpec
     with Instantiable3[/* env */ Env, /* suite */ Suite, /* description */ String, js.Any] {
  var afterCallbacks: js.Array[SpecFunction] = js.native
  var matchersClass: Matchers[_] = js.native
  var results_ : NestedResults = js.native
  var spies_ : js.Array[Spy] = js.native
  var suite: Suite = js.native
  var throwOnExpectationFailure: Boolean = js.native
  def addBeforesAndAftersToQueue(): Unit = js.native
  def addMatcherResult(result: Result): Unit = js.native
  def addMatchers(matchersPrototype: CustomMatcherFactories): Unit = js.native
  def addToQueue(block: Block): Unit = js.native
  def after(doAfter: SpecFunction): Unit = js.native
  def execute(): js.Any = js.native
  def execute(onComplete: js.UndefOr[scala.Nothing], enabled: Boolean): js.Any = js.native
  def execute(onComplete: js.Function0[Unit]): js.Any = js.native
  def execute(onComplete: js.Function0[Unit], enabled: Boolean): js.Any = js.native
  def expect(actual: js.Any): js.Any = js.native
  def explodes(): Unit = js.native
  def fail(): Unit = js.native
  def fail(e: js.Any): Unit = js.native
  def finish(): Unit = js.native
  def finish(onComplete: js.Function0[Unit]): Unit = js.native
  def finishCallback(): Unit = js.native
  def getFullName(): String = js.native
  def getMatchersClass_(): Matchers[_] = js.native
  def getResult(): js.Any = js.native
  def log(arguments: js.Any): js.Any = js.native
  def removeAllSpies(): Unit = js.native
  def results(): NestedResults = js.native
  def runs(func: SpecFunction): Spec = js.native
  def spyOn(obj: js.Any, methodName: String, ignoreMethodDoesntExist: Boolean): Spy = js.native
  def spyOnAllFunctions(`object`: js.Any): Spy = js.native
  def spyOnProperty(`object`: js.Any, property: String): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_get(`object`: js.Any, property: String, accessType: get): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_set(`object`: js.Any, property: String, accessType: set): Spy = js.native
  def waits(timeout: Double): Spec = js.native
  def waitsFor(latchFunction: SpecFunction): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: js.UndefOr[scala.Nothing], timeout: Double): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: String): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: String, timeout: Double): Spec = js.native
}

