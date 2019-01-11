package typings
package jestLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object ^ extends js.Object {
  var DEFAULT_TIMEOUT_INTERVAL: scala.Double = js.native
  def addCustomEqualityTester(equalityTester: jestLib.jasmineNs.CustomEqualityTester): scala.Unit = js.native
  def addMatchers(matchers: jestLib.jasmineNs.CustomMatcherFactories): scala.Unit = js.native
  def any(aclass: js.Any): jestLib.jasmineNs.Any = js.native
  def anything(): jestLib.jasmineNs.Any = js.native
  def arrayContaining(sample: js.Array[_]): jestLib.jasmineNs.ArrayContaining = js.native
  def clock(): jestLib.jasmineNs.Clock = js.native
  def createSpy(): jestLib.jasmineNs.Spy = js.native
  def createSpy(name: java.lang.String): jestLib.jasmineNs.Spy = js.native
  def createSpy(name: java.lang.String, originalFn: js.Function1[/* repeated */ js.Any, _]): jestLib.jasmineNs.Spy = js.native
  def createSpyObj(baseName: java.lang.String, methodNames: js.Array[_]): js.Any = js.native
  @JSName("createSpyObj")
  def createSpyObj_TT[T](baseName: java.lang.String, methodNames: js.Array[_]): T = js.native
  def objectContaining(sample: js.Any): jestLib.jasmineNs.ObjectContaining = js.native
  def pp(value: js.Any): java.lang.String = js.native
  def stringMatching(value: java.lang.String): jestLib.jasmineNs.Any = js.native
  def stringMatching(value: stdLib.RegExp): jestLib.jasmineNs.Any = js.native
}

