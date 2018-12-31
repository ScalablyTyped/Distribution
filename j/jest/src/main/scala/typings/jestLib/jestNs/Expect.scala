package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `expect` function is used every time you want to test a value.
  * You will rarely call `expect` by itself.
  */
@js.native
trait Expect extends js.Object {
  var not: InverseAsymmetricMatchers = js.native
  /**
    * The `expect` function is used every time you want to test a value.
    * You will rarely call `expect` by itself.
    *
    * @param actual The value to apply matchers against.
    */
  def apply[T](actual: T): Matchers[T] = js.native
  /**
    * Adds a module to format application-specific data structures for serialization.
    */
  def addSnapshotSerializer(serializer: SnapshotSerializerPlugin): scala.Unit = js.native
  /**
    * Matches anything that was created with the given constructor.
    * You can use it inside `toEqual` or `toBeCalledWith` instead of a literal value.
    *
    * @example
    *
    * function randocall(fn) {
    *   return fn(Math.floor(Math.random() * 6 + 1));
    * }
    *
    * test('randocall calls its callback with a number', () => {
    *   const mock = jest.fn();
    *   randocall(mock);
    *   expect(mock).toBeCalledWith(expect.any(Number));
    * });
    */
  def any(classType: js.Any): js.Any = js.native
  /**
    * Matches anything but null or undefined. You can use it inside `toEqual` or `toBeCalledWith` instead
    * of a literal value. For example, if you want to check that a mock function is called with a
    * non-null argument:
    *
    * @example
    *
    * test('map calls its argument with a non-null argument', () => {
    *   const mock = jest.fn();
    *   [1].map(x => mock(x));
    *   expect(mock).toBeCalledWith(expect.anything());
    * });
    *
    */
  def anything(): js.Any = js.native
  /**
    * Matches any array made up entirely of elements in the provided array.
    * You can use it inside `toEqual` or `toBeCalledWith` instead of a literal value.
    */
  def arrayContaining(arr: js.Array[_]): js.Any = js.native
  /**
    * Verifies that a certain number of assertions are called during a test.
    * This is often useful when testing asynchronous code, in order to
    * make sure that assertions in a callback actually got called.
    */
  def assertions(num: scala.Double): scala.Unit = js.native
  /**
    * You can use `expect.extend` to add your own matchers to Jest.
    */
  def extend(obj: ExpectExtendMap): scala.Unit = js.native
  /**
    * Verifies that at least one assertion is called during a test.
    * This is often useful when testing asynchronous code, in order to
    * make sure that assertions in a callback actually got called.
    */
  def hasAssertions(): scala.Unit = js.native
  /**
    * Matches any object that recursively matches the provided keys.
    * This is often handy in conjunction with other asymmetric matchers.
    */
  def objectContaining(obj: js.Object): js.Any = js.native
  /**
    * Matches any received string that contains the exact expected string
    */
  def stringContaining(str: java.lang.String): js.Any = js.native
  /**
    * Matches any string that contains the exact provided string
    */
  def stringMatching(str: java.lang.String): js.Any = js.native
  def stringMatching(str: stdLib.RegExp): js.Any = js.native
}

