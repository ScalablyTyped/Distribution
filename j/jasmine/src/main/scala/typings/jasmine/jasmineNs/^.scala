package typings.jasmine.jasmineNs

import typings.std.Partial
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object ^ extends js.Object {
  /**
    * Default number of milliseconds Jasmine will wait for an asynchronous spec to complete.
    */
  var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var HtmlReporter: typings.jasmine.jasmineNs.HtmlReporter = js.native
  var HtmlSpecFilter: typings.jasmine.jasmineNs.HtmlSpecFilter = js.native
  /**
    * Maximum number of array elements to display when pretty printing objects.
    * This will also limit the number of keys and values displayed for an object.
    * Elements past this number will be ellipised.
    */
  var MAX_PRETTY_PRINT_ARRAY_LENGTH: Double = js.native
  /**
    * Maximum number of charasters to display when pretty printing objects.
    * Characters past this number will be ellipised.
    */
  var MAX_PRETTY_PRINT_CHARS: Double = js.native
  /**
    * Maximum object depth the pretty printer will print to.
    * Set this to a lower value to speed up pretty printing if you have large objects.
    */
  var MAX_PRETTY_PRINT_DEPTH: Double = js.native
  var matchersUtil: MatchersUtil = js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  def any(aclass: js.Any): Any = js.native
  def anything(): Any = js.native
  def arrayContaining[T](sample: ArrayLike[T]): ArrayContaining[T] = js.native
  def arrayWithExactContents[T](sample: ArrayLike[T]): ArrayContaining[T] = js.native
  def clock(): Clock = js.native
  def createSpy(): Spy = js.native
  def createSpy(name: String): Spy = js.native
  def createSpy(name: String, originalFn: js.Function): Spy = js.native
  def createSpyObj(baseName: String, methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
  def createSpyObj(methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
  @JSName("createSpyObj")
  def createSpyObj_T_SpyObj[T](baseName: String, methodNames: SpyObjMethodNames[T]): SpyObj[T] = js.native
  @JSName("createSpyObj")
  def createSpyObj_T_SpyObj[T](methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): SpyObj[T] = js.native
  /**
    * That will succeed if the actual value being compared is empty.
    * @since 3.1.0
    */
  def empty(): Empty = js.native
  /**
    * That will succeed if the actual value being compared is  `null`, `undefined`, `0`, `false` or anything falsey.
    * @since 3.1.0
    */
  def falsy(): Falsy = js.native
  def formatErrorMsg(domain: String, usage: String): js.Function1[/* msg */ String, String] = js.native
  def getEnv(): Env = js.native
  /**
    * That will succeed if the actual value being compared is not empty.
    * @since 3.1.0
    */
  def notEmpty(): NotEmpty = js.native
  def objectContaining[T](sample: Partial[T]): ObjectContaining[T] = js.native
  def pp(value: js.Any): String = js.native
  def stringMatching(str: String): Any = js.native
  def stringMatching(str: RegExp): Any = js.native
  /**
    * That will succeed if the actual value being compared is `true` or anything truthy.
    * @since 3.1.0
    */
  def truthy(): Truthy = js.native
}

