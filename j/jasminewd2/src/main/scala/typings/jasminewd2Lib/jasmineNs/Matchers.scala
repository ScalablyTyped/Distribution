package typings
package jasminewd2Lib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  def toBe(expected: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBe(expected: js.Any, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: scala.Double, precision: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: scala.Double, precision: js.Any, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: stdLib.Promise[scala.Double]): stdLib.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: stdLib.Promise[scala.Double], precision: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: stdLib.Promise[scala.Double], precision: js.Any, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeDefined(): stdLib.Promise[scala.Unit] = js.native
  def toBeDefined(expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeFalsy(): stdLib.Promise[scala.Unit] = js.native
  def toBeFalsy(expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: scala.Double, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: stdLib.Promise[scala.Double]): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: stdLib.Promise[scala.Double], expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: scala.Double, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: stdLib.Promise[scala.Double]): stdLib.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: stdLib.Promise[scala.Double], expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: scala.Double, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: stdLib.Promise[scala.Double]): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: stdLib.Promise[scala.Double], expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: scala.Double, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: stdLib.Promise[scala.Double]): stdLib.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: stdLib.Promise[scala.Double], expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeNaN(): stdLib.Promise[scala.Unit] = js.native
  def toBeNull(): stdLib.Promise[scala.Unit] = js.native
  def toBeNull(expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeTruthy(): stdLib.Promise[scala.Unit] = js.native
  def toBeTruthy(expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toBeUndefined(): stdLib.Promise[scala.Unit] = js.native
  def toBeUndefined(expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toContain(expected: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toContain(expected: js.Any, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toEqual(expected: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toEqual(expected: js.Any, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toHaveBeenCalled(): stdLib.Promise[scala.Unit] = js.native
  def toHaveBeenCalledTimes(expected: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def toHaveBeenCalledTimes(expected: stdLib.Promise[scala.Double]): stdLib.Promise[scala.Unit] = js.native
  def toHaveBeenCalledWith(params: js.Any*): stdLib.Promise[scala.Unit] = js.native
  def toMatch(expected: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def toMatch(expected: java.lang.String, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toMatch(expected: stdLib.Promise[java.lang.String | stdLib.RegExp]): stdLib.Promise[scala.Unit] = js.native
  def toMatch(expected: stdLib.Promise[java.lang.String | stdLib.RegExp], expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toMatch(expected: stdLib.RegExp): stdLib.Promise[scala.Unit] = js.native
  def toMatch(expected: stdLib.RegExp, expectationFailOutput: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toThrow(): stdLib.Promise[scala.Unit] = js.native
  def toThrow(expected: js.Any): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (stdLib.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ]
  ): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (stdLib.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ],
    message: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (stdLib.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ],
    message: stdLib.Promise[java.lang.String | stdLib.RegExp]
  ): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (stdLib.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ],
    message: stdLib.RegExp
  ): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(message: stdLib.Promise[java.lang.String | stdLib.RegExp]): stdLib.Promise[scala.Unit] = js.native
  def toThrowError(message: stdLib.RegExp): stdLib.Promise[scala.Unit] = js.native
}

