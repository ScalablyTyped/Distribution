package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers[T] extends StObject {
  
  /**
    * Invert the matcher following this expect.
    */
  var not: Matchers[T] = js.native
  
  /**
    * Expect the actual value to be `===` to the expected value.
    *
    * @param expected The expected value to compare against.
    * @example
    * expect(thing).toBe(realThing);
    */
  def toBe(expected: Expected[T]): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBe(expected: Expected[T], expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeCloseTo(expected: Double): Unit = js.native
  def toBeCloseTo(expected: Double, precision: scala.Any): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeCloseTo(expected: Double, precision: scala.Any, expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeDefined(): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeDefined(expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeFalse(): Unit = js.native
  
  def toBeFalsy(): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeFalsy(expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeGreaterThan(expected: Double): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeGreaterThan(expected: Double, expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeGreaterThanOrEqual(expected: Double): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeGreaterThanOrEqual(expected: Double, expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeInstanceOf(expected: Constructor): Unit = js.native
  
  def toBeLessThan(expected: Double): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeLessThan(expected: Double, expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeLessThanOrEqual(expected: Double): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeLessThanOrEqual(expected: Double, expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeNaN(): Unit = js.native
  
  def toBeNegativeInfinity(): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeNegativeInfinity(expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeNull(): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeNull(expectationFailOutput: scala.Any): Unit = js.native
  
  def toBePositiveInfinity(): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBePositiveInfinity(expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeTrue(): Unit = js.native
  
  def toBeTruthy(): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeTruthy(expectationFailOutput: scala.Any): Unit = js.native
  
  def toBeUndefined(): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeUndefined(expectationFailOutput: scala.Any): Unit = js.native
  
  def toContain(expected: scala.Any): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toContain(expected: scala.Any, expectationFailOutput: scala.Any): Unit = js.native
  
  /**
    * Expect the actual value to be equal to the expected, using deep equality comparison.
    * @param expected Expected value.
    * @example
    * expect(bigObject).toEqual({ "foo": ['bar', 'baz'] });
    */
  def toEqual(expected: Expected[T]): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toEqual(expected: Expected[T], expectationFailOutput: scala.Any): Unit = js.native
  
  def toHaveBeenCalled(): Unit = js.native
  
  def toHaveBeenCalledBefore(expected: Func): Unit = js.native
  
  def toHaveBeenCalledOnceWith(params: scala.Any*): Unit = js.native
  
  def toHaveBeenCalledTimes(expected: Double): Unit = js.native
  
  def toHaveBeenCalledWith(params: scala.Any*): Unit = js.native
  
  /**
    * Expect the actual value to be a DOM element that has the expected class.
    * @since 3.0.0
    * @param expected The class name to test for.
    * @example
    * var el = document.createElement('div');
    * el.className = 'foo bar baz';
    * expect(el).toHaveClass('bar');
    */
  def toHaveClass(expected: String): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toHaveClass(expected: String, expectationFailOutput: scala.Any): Unit = js.native
  
  /**
    * Expect the actual size to be equal to the expected, using array-like
    * length or object keys size.
    * @since 3.6.0
    * @param expected The expected size
    * @example
    * array = [1,2];
    * expect(array).toHaveSize(2);
    */
  def toHaveSize(expected: Double): Unit = js.native
  
  /**
    * {@link expect} the actual (a {@link SpyObj}) spies to have been called.
    * @since 4.1.0
    * @example
    * expect(mySpyObj).toHaveSpyInteractions();
    * expect(mySpyObj).not.toHaveSpyInteractions();
    */
  def toHaveSpyInteractions(): Unit = js.native
  
  /**
    * Expect the actual value to match a regular expression.
    * @param expected Value to look for in the string.
    * @example
    * expect("my string").toMatch(/string$/);
    * expect("other string").toMatch("her");
    */
  def toMatch(expected: String): Unit = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toMatch(expected: String, expectationFailOutput: scala.Any): Unit = js.native
  def toMatch(expected: js.RegExp): Unit = js.native
  def toMatch(expected: js.RegExp, expectationFailOutput: scala.Any): Unit = js.native
  
  def toThrow(): Unit = js.native
  def toThrow(expected: scala.Any): Unit = js.native
  
  def toThrowError(): Unit = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error]): Unit = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error], message: String): Unit = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error], message: js.RegExp): Unit = js.native
  def toThrowError(expected: Unit, message: String): Unit = js.native
  def toThrowError(expected: Unit, message: js.RegExp): Unit = js.native
  def toThrowError(message: String): Unit = js.native
  def toThrowError(message: js.RegExp): Unit = js.native
  
  def toThrowMatching(predicate: js.Function1[/* thrown */ scala.Any, Boolean]): Unit = js.native
  
  /**
    * Add some context for an expect.
    * @param message Additional context to show when the matcher fails
    * @checkReturnValue see https://tsetse.info/check-return-value
    */
  def withContext(message: String): Matchers[T] = js.native
}
