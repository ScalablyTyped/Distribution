package typings
package jasminewd2Lib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  def toBe(expected: js.Any): js.Promise[scala.Unit] = js.native
  def toBe(expected: js.Any, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: js.Promise[scala.Double]): js.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: js.Promise[scala.Double], precision: js.Any): js.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: js.Promise[scala.Double], precision: js.Any, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: scala.Double): js.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: scala.Double, precision: js.Any): js.Promise[scala.Unit] = js.native
  def toBeCloseTo(expected: scala.Double, precision: js.Any, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeDefined(): js.Promise[scala.Unit] = js.native
  def toBeDefined(expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeFalsy(): js.Promise[scala.Unit] = js.native
  def toBeFalsy(expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: js.Promise[scala.Double]): js.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: js.Promise[scala.Double], expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: scala.Double): js.Promise[scala.Unit] = js.native
  def toBeGreaterThan(expected: scala.Double, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: js.Promise[scala.Double]): js.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: js.Promise[scala.Double], expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: scala.Double): js.Promise[scala.Unit] = js.native
  def toBeGreaterThanOrEqual(expected: scala.Double, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: js.Promise[scala.Double]): js.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: js.Promise[scala.Double], expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: scala.Double): js.Promise[scala.Unit] = js.native
  def toBeLessThan(expected: scala.Double, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: js.Promise[scala.Double]): js.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: js.Promise[scala.Double], expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: scala.Double): js.Promise[scala.Unit] = js.native
  def toBeLessThanOrEqual(expected: scala.Double, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeNaN(): js.Promise[scala.Unit] = js.native
  def toBeNull(): js.Promise[scala.Unit] = js.native
  def toBeNull(expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeTruthy(): js.Promise[scala.Unit] = js.native
  def toBeTruthy(expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toBeUndefined(): js.Promise[scala.Unit] = js.native
  def toBeUndefined(expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toContain(expected: js.Any): js.Promise[scala.Unit] = js.native
  def toContain(expected: js.Any, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toEqual(expected: js.Any): js.Promise[scala.Unit] = js.native
  def toEqual(expected: js.Any, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toHaveBeenCalled(): js.Promise[scala.Unit] = js.native
  def toHaveBeenCalledTimes(expected: js.Promise[scala.Double]): js.Promise[scala.Unit] = js.native
  def toHaveBeenCalledTimes(expected: scala.Double): js.Promise[scala.Unit] = js.native
  def toHaveBeenCalledWith(params: js.Any*): js.Promise[scala.Unit] = js.native
  def toMatch(expected: java.lang.String): js.Promise[scala.Unit] = js.native
  def toMatch(expected: java.lang.String, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toMatch(expected: js.Promise[java.lang.String | stdLib.RegExp]): js.Promise[scala.Unit] = js.native
  def toMatch(expected: js.Promise[java.lang.String | stdLib.RegExp], expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toMatch(expected: stdLib.RegExp): js.Promise[scala.Unit] = js.native
  def toMatch(expected: stdLib.RegExp, expectationFailOutput: js.Any): js.Promise[scala.Unit] = js.native
  def toThrow(): js.Promise[scala.Unit] = js.native
  def toThrow(expected: js.Any): js.Promise[scala.Unit] = js.native
  def toThrowError(): js.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (js.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ]
  ): js.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (js.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ],
    message: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (js.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ],
    message: js.Promise[java.lang.String | stdLib.RegExp]
  ): js.Promise[scala.Unit] = js.native
  def toThrowError(
    expected: ScalablyTyped.runtime.Instantiable1[
      /* args (repeated) */ js.Any, 
      stdLib.Error | (js.Promise[ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, stdLib.Error]])
    ],
    message: stdLib.RegExp
  ): js.Promise[scala.Unit] = js.native
  def toThrowError(message: java.lang.String): js.Promise[scala.Unit] = js.native
  def toThrowError(message: js.Promise[java.lang.String | stdLib.RegExp]): js.Promise[scala.Unit] = js.native
  def toThrowError(message: stdLib.RegExp): js.Promise[scala.Unit] = js.native
}

