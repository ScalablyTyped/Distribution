package typings.jest.jestMod.jest

import typings.std.Record
import typings.std.RegExp
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
  def apply[T](actual: T): JestMatchers[T] = js.native
  /**
    * Adds a module to format application-specific data structures for serialization.
    */
  def addSnapshotSerializer(serializer: SnapshotSerializerPlugin): Unit = js.native
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
    *
    * Optionally, you can provide a type for the elements via a generic.
    */
  def arrayContaining[E](arr: js.Array[E]): js.Any = js.native
  /**
    * Verifies that a certain number of assertions are called during a test.
    * This is often useful when testing asynchronous code, in order to
    * make sure that assertions in a callback actually got called.
    */
  def assertions(num: Double): Unit = js.native
  /**
    * You can use `expect.extend` to add your own matchers to Jest.
    */
  def extend(obj: ExpectExtendMap): Unit = js.native
  def getState(): MatcherState with (Record[String, _]) = js.native
  /**
    * Verifies that at least one assertion is called during a test.
    * This is often useful when testing asynchronous code, in order to
    * make sure that assertions in a callback actually got called.
    */
  def hasAssertions(): Unit = js.native
  /**
    * Matches any object that recursively matches the provided keys.
    * This is often handy in conjunction with other asymmetric matchers.
    *
    * Optionally, you can provide a type for the object via a generic.
    * This ensures that the object contains the desired structure.
    */
  def objectContaining[E](obj: E): js.Any = js.native
  def setState(state: js.Object): Unit = js.native
  /**
    * Matches any received string that contains the exact expected string
    */
  def stringContaining(str: String): js.Any = js.native
  /**
    * Matches any string that contains the exact provided string
    */
  def stringMatching(str: String): js.Any = js.native
  def stringMatching(str: RegExp): js.Any = js.native
}

