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
  var matchersUtil: jasmineLib.jasmineNs.MatchersUtil = js.native
  def addCustomEqualityTester(equalityTester: jasmineLib.jasmineNs.CustomEqualityTester): scala.Unit = js.native
  def addMatchers(matchers: jasmineLib.jasmineNs.CustomMatcherFactories): scala.Unit = js.native
  def any(aclass: js.Any): jasmineLib.jasmineNs.Any = js.native
  def anything(): jasmineLib.jasmineNs.Any = js.native
  def arrayContaining[T](sample: jasmineLib.jasmineNs.ArrayLike[T]): jasmineLib.jasmineNs.ArrayContaining[T] = js.native
  def arrayWithExactContents[T](sample: jasmineLib.jasmineNs.ArrayLike[T]): jasmineLib.jasmineNs.ArrayContaining[T] = js.native
  def clock(): jasmineLib.jasmineNs.Clock = js.native
  def createSpy(): jasmineLib.jasmineNs.Spy = js.native
  def createSpy(name: java.lang.String): jasmineLib.jasmineNs.Spy = js.native
  def createSpy(name: java.lang.String, originalFn: js.Function): jasmineLib.jasmineNs.Spy = js.native
  def createSpyObj(
    baseName: java.lang.String,
    methodNames: jasmineLib.jasmineNs.SpyObjMethodNames[js.UndefOr[scala.Nothing]]
  ): js.Any = js.native
  def createSpyObj(methodNames: jasmineLib.jasmineNs.SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
  @JSName("createSpyObj")
  def createSpyObj_TSpyObj[T](baseName: java.lang.String, methodNames: jasmineLib.jasmineNs.SpyObjMethodNames[T]): jasmineLib.jasmineNs.SpyObj[T] = js.native
  @JSName("createSpyObj")
  def createSpyObj_TSpyObj[T](methodNames: jasmineLib.jasmineNs.SpyObjMethodNames[js.UndefOr[scala.Nothing]]): jasmineLib.jasmineNs.SpyObj[T] = js.native
  def formatErrorMsg(domain: java.lang.String, usage: java.lang.String): js.Function1[/* msg */ java.lang.String, java.lang.String] = js.native
  def getEnv(): jasmineLib.jasmineNs.Env = js.native
  def objectContaining[T](sample: stdLib.Partial[T]): jasmineLib.jasmineNs.ObjectContaining[T] = js.native
  def pp(value: js.Any): java.lang.String = js.native
  def stringMatching(str: java.lang.String): jasmineLib.jasmineNs.Any = js.native
  def stringMatching(str: stdLib.RegExp): jasmineLib.jasmineNs.Any = js.native
}

