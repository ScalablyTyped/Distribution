package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var clearInterval: scala.Unit = js.native
  var clearTimeout: scala.Unit = js.native
  var currentSpec: Spec = js.native
  var matchersClass: Matchers[_] = js.native
  var setInterval: js.Any = js.native
  var setTimeout: js.Any = js.native
  var updateInterval: scala.Double = js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): scala.Unit = js.native
  def addMatchers(matchers: CustomMatcherFactories): scala.Unit = js.native
  def addReporter(reporter: CustomReporter): scala.Unit = js.native
  def addReporter(reporter: Reporter): scala.Unit = js.native
  def afterAll(afterAllFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit]): scala.Unit = js.native
  def afterAll(afterAllFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  def afterEach(afterEachFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit]): scala.Unit = js.native
  def afterEach(afterEachFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  def allowRespy(allow: scala.Boolean): scala.Unit = js.native
  def beforeAll(beforeAllFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit]): scala.Unit = js.native
  def beforeAll(beforeAllFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit]): scala.Unit = js.native
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function1[/* done */ jasmineLib.DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  def clearReporters(): scala.Unit = js.native
  def `compareObjects_`(
    a: js.Any,
    b: js.Any,
    mismatchKeys: js.Array[java.lang.String],
    mismatchValues: js.Array[java.lang.String]
  ): scala.Boolean = js.native
  def `compareRegExps_`(
    a: stdLib.RegExp,
    b: stdLib.RegExp,
    mismatchKeys: js.Array[java.lang.String],
    mismatchValues: js.Array[java.lang.String]
  ): scala.Boolean = js.native
  def `contains_`(haystack: js.Any, needle: js.Any): scala.Boolean = js.native
  def currentRunner(): Runner = js.native
  def describe(description: java.lang.String, specDefinitions: js.Function0[scala.Unit]): Suite = js.native
  def `equals_`(
    a: js.Any,
    b: js.Any,
    mismatchKeys: js.Array[java.lang.String],
    mismatchValues: js.Array[java.lang.String]
  ): scala.Boolean = js.native
  def execute(): scala.Unit = js.native
  def it(description: java.lang.String, func: js.Function0[scala.Unit]): Spec = js.native
  def nextSpecId(): scala.Double = js.native
  def provideFallbackReporter(reporter: Reporter): scala.Unit = js.native
  def randomTests(): scala.Boolean = js.native
  def randomizeTests(b: scala.Boolean): scala.Unit = js.native
  def seed(seed: java.lang.String): java.lang.String | scala.Double = js.native
  def seed(seed: scala.Double): java.lang.String | scala.Double = js.native
  def specFilter(spec: Spec): scala.Boolean = js.native
  def throwOnExpectationFailure(value: scala.Boolean): scala.Unit = js.native
  def throwingExpectationFailures(): scala.Boolean = js.native
  def version(): js.Any = js.native
  def versionString(): java.lang.String = js.native
  def xdescribe(desc: java.lang.String, specDefinitions: js.Function0[scala.Unit]): XSuite = js.native
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: java.lang.String, func: js.Function0[scala.Unit]): XSpec = js.native
}

