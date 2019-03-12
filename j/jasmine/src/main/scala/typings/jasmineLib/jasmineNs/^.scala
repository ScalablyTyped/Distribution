package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object ^ extends js.Object {
  /**
    * Default number of milliseconds Jasmine will wait for an asynchronous spec to complete.
    */
  var DEFAULT_TIMEOUT_INTERVAL: scala.Double = js.native
  var HtmlReporter: jasmineLib.jasmineNs.HtmlReporter = js.native
  var HtmlSpecFilter: jasmineLib.jasmineNs.HtmlSpecFilter = js.native
  /**
    * Maximum number of array elements to display when pretty printing objects.
    * This will also limit the number of keys and values displayed for an object.
    * Elements past this number will be ellipised.
    */
  var MAX_PRETTY_PRINT_ARRAY_LENGTH: scala.Double = js.native
  /**
    * Maximum number of charasters to display when pretty printing objects.
    * Characters past this number will be ellipised.
    */
  var MAX_PRETTY_PRINT_CHARS: scala.Double = js.native
  /**
    * Maximum object depth the pretty printer will print to.
    * Set this to a lower value to speed up pretty printing if you have large objects.
    */
  var MAX_PRETTY_PRINT_DEPTH: scala.Double = js.native
  var matchersUtil: MatchersUtil = js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): scala.Unit = js.native
  def addMatchers(matchers: CustomMatcherFactories): scala.Unit = js.native
  def any(aclass: js.Any): Any = js.native
  def anything(): Any = js.native
  def arrayContaining[T](sample: ArrayLike[T]): ArrayContaining[T] = js.native
  def arrayWithExactContents[T](sample: ArrayLike[T]): ArrayContaining[T] = js.native
  def clock(): Clock = js.native
  def createSpy(): Spy = js.native
  def createSpy(name: java.lang.String): Spy = js.native
  def createSpy(name: java.lang.String, originalFn: js.Function): Spy = js.native
  def createSpyObj(baseName: java.lang.String, methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
  def createSpyObj(methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
  @JSName("createSpyObj")
  def createSpyObj_TSpyObj[T](baseName: java.lang.String, methodNames: SpyObjMethodNames[T]): SpyObj[T] = js.native
  @JSName("createSpyObj")
  def createSpyObj_TSpyObj[T](methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): SpyObj[T] = js.native
  def formatErrorMsg(domain: java.lang.String, usage: java.lang.String): js.Function1[/* msg */ java.lang.String, java.lang.String] = js.native
  def getEnv(): Env = js.native
  def objectContaining[T](sample: stdLib.Partial[T]): ObjectContaining[T] = js.native
  def pp(value: js.Any): java.lang.String = js.native
  def stringMatching(str: java.lang.String): Any = js.native
  def stringMatching(str: stdLib.RegExp): Any = js.native
}

