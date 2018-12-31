package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T]
  extends org.scalablytyped.runtime.Instantiable3[/* env */ Env, /* actual */ T, /* spec */ Env, js.Any]
     with org.scalablytyped.runtime.Instantiable4[/* env */ Env, /* actual */ T, /* spec */ Env, /* isNot */ scala.Boolean, js.Any] {
  @JSName("Any")
  var Any_Original: Any = js.native
  var actual: T = js.native
  var env: Env = js.native
  var isNot: js.UndefOr[scala.Boolean] = js.native
  var not: Matchers[T] = js.native
  var spec: Env = js.native
  def Any(params: js.Any*): js.Any = js.native
  def message(): js.Any = js.native
  /**
    *
    * @param expected the actual value to be === to the expected value.
    * @param expectationFailOutput
    * @returns {}
    */
  def toBe(expected: Expected[T]): scala.Boolean = js.native
  def toBe(expected: Expected[T], expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeCloseTo(expected: scala.Double): scala.Boolean = js.native
  def toBeCloseTo(expected: scala.Double, precision: js.Any): scala.Boolean = js.native
  def toBeCloseTo(expected: scala.Double, precision: js.Any, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeDefined(): scala.Boolean = js.native
  def toBeDefined(expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeFalsy(): scala.Boolean = js.native
  def toBeFalsy(expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeGreaterThan(expected: scala.Double): scala.Boolean = js.native
  def toBeGreaterThan(expected: scala.Double, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeGreaterThanOrEqual(expected: scala.Double): scala.Boolean = js.native
  def toBeGreaterThanOrEqual(expected: scala.Double, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeLessThan(expected: scala.Double): scala.Boolean = js.native
  def toBeLessThan(expected: scala.Double, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeLessThanOrEqual(expected: scala.Double): scala.Boolean = js.native
  def toBeLessThanOrEqual(expected: scala.Double, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeNaN(): scala.Boolean = js.native
  def toBeNegativeInfinity(): scala.Boolean = js.native
  def toBeNegativeInfinity(expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeNull(): scala.Boolean = js.native
  def toBeNull(expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBePositiveInfinity(): scala.Boolean = js.native
  def toBePositiveInfinity(expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeTruthy(): scala.Boolean = js.native
  def toBeTruthy(expectationFailOutput: js.Any): scala.Boolean = js.native
  def toBeUndefined(): scala.Boolean = js.native
  def toBeUndefined(expectationFailOutput: js.Any): scala.Boolean = js.native
  def toContain(expected: js.Any): scala.Boolean = js.native
  def toContain(expected: js.Any, expectationFailOutput: js.Any): scala.Boolean = js.native
  /**
    *
    * @param expected the actual value to be equal to the expected, using deep equality comparison.
    * @param expectationFailOutput
    * @returns {}
    */
  def toEqual(expected: Expected[T]): scala.Boolean = js.native
  def toEqual(expected: Expected[T], expectationFailOutput: js.Any): scala.Boolean = js.native
  def toHaveBeenCalled(): scala.Boolean = js.native
  def toHaveBeenCalledBefore(expected: Spy): scala.Boolean = js.native
  def toHaveBeenCalledTimes(expected: scala.Double): scala.Boolean = js.native
  def toHaveBeenCalledWith(params: js.Any*): scala.Boolean = js.native
  def toHaveClass(expected: js.Any): scala.Boolean = js.native
  def toHaveClass(expected: js.Any, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toMatch(expected: java.lang.String): scala.Boolean = js.native
  def toMatch(expected: java.lang.String, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toMatch(expected: stdLib.RegExp): scala.Boolean = js.native
  def toMatch(expected: stdLib.RegExp, expectationFailOutput: js.Any): scala.Boolean = js.native
  def toThrow(): scala.Boolean = js.native
  def toThrow(expected: js.Any): scala.Boolean = js.native
  def toThrowError(): scala.Boolean = js.native
  def toThrowError(expected: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]): scala.Boolean = js.native
  def toThrowError(
    expected: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error],
    message: java.lang.String
  ): scala.Boolean = js.native
  def toThrowError(
    expected: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error],
    message: stdLib.RegExp
  ): scala.Boolean = js.native
  def toThrowError(message: java.lang.String): scala.Boolean = js.native
  def toThrowError(message: stdLib.RegExp): scala.Boolean = js.native
  def toThrowMatching(predicate: js.Function1[/* thrown */ js.Any, scala.Boolean]): scala.Boolean = js.native
  /**
    * Add some context for an expect.
    * @param message - Additional context to show when the matcher fails
    */
  def withContext(message: java.lang.String): Matchers[T] = js.native
}

