package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec
  extends SuiteOrSpec
     with org.scalablytyped.runtime.Instantiable3[/* env */ Env, /* suite */ Suite, /* description */ java.lang.String, js.Any] {
  var afterCallbacks: js.Array[SpecFunction] = js.native
  var matchersClass: Matchers[_] = js.native
  var results_ : NestedResults = js.native
  var spies_ : js.Array[Spy] = js.native
  var suite: Suite = js.native
  var throwOnExpectationFailure: scala.Boolean = js.native
  def addBeforesAndAftersToQueue(): scala.Unit = js.native
  def addMatcherResult(result: Result): scala.Unit = js.native
  def addMatchers(matchersPrototype: CustomMatcherFactories): scala.Unit = js.native
  def addToQueue(block: Block): scala.Unit = js.native
  def after(doAfter: SpecFunction): scala.Unit = js.native
  def execute(): js.Any = js.native
  def execute(onComplete: js.Function0[scala.Unit]): js.Any = js.native
  def execute(onComplete: js.Function0[scala.Unit], enabled: scala.Boolean): js.Any = js.native
  def expect(actual: js.Any): js.Any = js.native
  def explodes(): scala.Unit = js.native
  def fail(): scala.Unit = js.native
  def fail(e: js.Any): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def finish(onComplete: js.Function0[scala.Unit]): scala.Unit = js.native
  def finishCallback(): scala.Unit = js.native
  def getFullName(): java.lang.String = js.native
  def getMatchersClass_(): Matchers[_] = js.native
  def getResult(): js.Any = js.native
  def log(arguments: js.Any): js.Any = js.native
  def removeAllSpies(): scala.Unit = js.native
  def results(): NestedResults = js.native
  def runs(func: SpecFunction): Spec = js.native
  def spyOn(obj: js.Any, methodName: java.lang.String, ignoreMethodDoesntExist: scala.Boolean): Spy = js.native
  def spyOnAllFunctions(`object`: js.Any): Spy = js.native
  def spyOnProperty(`object`: js.Any, property: java.lang.String): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_get(`object`: js.Any, property: java.lang.String, accessType: jasmineLib.jasmineLibStrings.get): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_set(`object`: js.Any, property: java.lang.String, accessType: jasmineLib.jasmineLibStrings.set): Spy = js.native
  def waits(timeout: scala.Double): Spec = js.native
  def waitsFor(latchFunction: SpecFunction): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: java.lang.String): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: java.lang.String, timeout: scala.Double): Spec = js.native
}

