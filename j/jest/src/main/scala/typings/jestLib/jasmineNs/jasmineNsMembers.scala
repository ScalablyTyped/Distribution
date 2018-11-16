package typings
package jestLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmineNsMembers extends js.Object {
  var DEFAULT_TIMEOUT_INTERVAL: scala.Double = js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): scala.Unit = js.native
  def addMatchers(matchers: CustomMatcherFactories): scala.Unit = js.native
  def any(aclass: js.Any): Any = js.native
  def anything(): Any = js.native
  def arrayContaining(sample: js.Array[_]): ArrayContaining = js.native
  def clock(): Clock = js.native
  def createSpy(): Spy = js.native
  def createSpy(name: java.lang.String): Spy = js.native
  def createSpy(name: java.lang.String, originalFn: js.Function1[/* repeated */js.Any, _]): Spy = js.native
  def createSpyObj(baseName: java.lang.String, methodNames: js.Array[_]): js.Any = js.native
  @JSName("createSpyObj")
  def createSpyObj_TT[T](baseName: java.lang.String, methodNames: js.Array[_]): T = js.native
  def objectContaining(sample: js.Any): ObjectContaining = js.native
  def pp(value: js.Any): java.lang.String = js.native
  def stringMatching(value: java.lang.String): Any = js.native
  def stringMatching(value: stdLib.RegExp): Any = js.native
}

