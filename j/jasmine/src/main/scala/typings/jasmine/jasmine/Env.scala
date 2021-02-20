package typings.jasmine.jasmine

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends StObject {
  
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
  
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  
  def addReporter(reporter: CustomReporter): Unit = js.native
  def addReporter(reporter: Reporter): Unit = js.native
  
  def afterAll(afterAllFunction: ImplementationCallback): Unit = js.native
  def afterAll(afterAllFunction: ImplementationCallback, timeout: Double): Unit = js.native
  
  def afterEach(afterEachFunction: ImplementationCallback): Unit = js.native
  def afterEach(afterEachFunction: ImplementationCallback, timeout: Double): Unit = js.native
  
  def allowRespy(allow: Boolean): Unit = js.native
  
  def beforeAll(beforeAllFunction: ImplementationCallback): Unit = js.native
  def beforeAll(beforeAllFunction: ImplementationCallback, timeout: Double): Unit = js.native
  
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: ImplementationCallback): Unit = js.native
  def beforeEach(beforeEachFunction: ImplementationCallback, timeout: Double): Unit = js.native
  
  def clearReporters(): Unit = js.native
  
  def compareObjects_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  
  def compareRegExps_(a: RegExp, b: RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  
  def configure(configuration: EnvConfiguration): Unit = js.native
  
  def contains_(haystack: js.Any, needle: js.Any): Boolean = js.native
  
  def currentRunner(): Runner = js.native
  
  var currentSpec: Spec = js.native
  
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite = js.native
  
  def equals_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  
  def execute(): Unit = js.native
  
  def it(description: String, func: js.Function0[Unit]): Spec = js.native
  
  var matchersClass: Matchers[_] = js.native
  
  def nextSpecId(): Double = js.native
  
  def provideFallbackReporter(reporter: Reporter): Unit = js.native
  
  def randomTests(): Boolean = js.native
  
  /**
    * @deprecated Use random option in {@link jasmine.Env.configure} instead.
    */
  def randomizeTests(b: Boolean): Unit = js.native
  
  /**
    * @deprecated Use seed option in {@link jasmine.Env.configure} instead.
    */
  def seed(seed: String): String | Double = js.native
  def seed(seed: Double): String | Double = js.native
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SpecResult.
    * @since 3.6.0
    */
  def setSpecProperty(key: String, value: js.Any): Unit = js.native
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SuiteResult.
    * @since 3.6.0
    */
  def setSuiteProperty(key: String, value: js.Any): Unit = js.native
  
  def specFilter(spec: Spec): Boolean = js.native
  
  /**
    * @deprecated Use failFast option in {@link jasmine.Env.configure} instead.
    */
  def stopOnSpecFailure(value: Boolean): Unit = js.native
  
  /**
    * @deprecated Use oneFailurePerSpec option in {@link jasmine.Env.configure} instead.
    */
  def throwOnExpectationFailure(value: Boolean): Unit = js.native
  
  def throwingExpectationFailures(): Boolean = js.native
  
  def version(): js.Any = js.native
  
  def versionString(): String = js.native
  
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite = js.native
  
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec = js.native
}
