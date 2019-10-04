package typings.jasmine.jasmineNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var currentSpec: Spec = js.native
  var matchersClass: Matchers[_] = js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  def addReporter(reporter: CustomReporter): Unit = js.native
  def addReporter(reporter: Reporter): Unit = js.native
  def afterAll(afterAllFunction: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def afterAll(afterAllFunction: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  def afterEach(afterEachFunction: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def afterEach(afterEachFunction: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  def allowRespy(allow: Boolean): Unit = js.native
  def beforeAll(beforeAllFunction: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def beforeAll(beforeAllFunction: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def beforeEach(beforeEachFunction: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  def clearReporters(): Unit = js.native
  def compareObjects_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  def compareRegExps_(a: RegExp, b: RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  def contains_(haystack: js.Any, needle: js.Any): Boolean = js.native
  def currentRunner(): Runner = js.native
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite = js.native
  def equals_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  def execute(): Unit = js.native
  def it(description: String, func: js.Function0[Unit]): Spec = js.native
  def nextSpecId(): Double = js.native
  def provideFallbackReporter(reporter: Reporter): Unit = js.native
  def randomTests(): Boolean = js.native
  def randomizeTests(b: Boolean): Unit = js.native
  def seed(seed: String): String | Double = js.native
  def seed(seed: Double): String | Double = js.native
  def specFilter(spec: Spec): Boolean = js.native
  def throwOnExpectationFailure(value: Boolean): Unit = js.native
  def throwingExpectationFailures(): Boolean = js.native
  def version(): js.Any = js.native
  def versionString(): String = js.native
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite = js.native
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec = js.native
}

