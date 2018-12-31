package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockInstance[T] extends js.Object {
  /** Provides access to the mock's metadata */
  var mock: MockContext[T] = js.native
  /** Returns the mock name string set by calling `mockFn.mockName(value)`. */
  def getMockName(): java.lang.String = js.native
  /**
    * Resets all information stored in the mockFn.mock.calls and mockFn.mock.instances arrays.
    *
    * Often this is useful when you want to clean up a mock's usage data between two assertions.
    *
    * Beware that `mockClear` will replace `mockFn.mock`, not just `mockFn.mock.calls` and `mockFn.mock.instances`.
    * You should therefore avoid assigning mockFn.mock to other variables, temporary or not, to make sure you
    * don't access stale data.
    */
  def mockClear(): scala.Unit = js.native
  /**
    * Accepts a function that should be used as the implementation of the mock. The mock itself will still record
    * all calls that go into and instances that come from itself – the only difference is that the implementation
    * will also be executed when the mock is called.
    *
    * Note: `jest.fn(implementation)` is a shorthand for `jest.fn().mockImplementation(implementation)`.
    */
  def mockImplementation(): Mock[T] = js.native
  def mockImplementation(fn: js.Function1[/* repeated */ js.Any, _]): Mock[T] = js.native
  /**
    * Accepts a function that will be used as an implementation of the mock for one call to the mocked function.
    * Can be chained so that multiple function calls produce different results.
    *
    * @example
    *
    * const myMockFn = jest
    *   .fn()
    *    .mockImplementationOnce(cb => cb(null, true))
    *    .mockImplementationOnce(cb => cb(null, false));
    *
    * myMockFn((err, val) => console.log(val)); // true
    *
    * myMockFn((err, val) => console.log(val)); // false
    */
  def mockImplementationOnce(fn: js.Function1[/* repeated */ js.Any, _]): Mock[T] = js.native
  /** Sets the name of the mock`. */
  def mockName(name: java.lang.String): Mock[T] = js.native
  /**
    * Simple sugar function for: `jest.fn().mockImplementation(() => Promise.reject(value));`
    *
    * @example
    *
    * test('async test', async () => {
    *   const asyncMock = jest.fn().mockRejectedValue(new Error('Async error'));
    *
    *   await asyncMock(); // throws "Async error"
    * });
    */
  def mockRejectedValue(value: js.Any): Mock[T] = js.native
  /**
    * Simple sugar function for: `jest.fn().mockImplementationOnce(() => Promise.reject(value));`
    *
    * @example
    *
    * test('async test', async () => {
    *  const asyncMock = jest
    *    .fn()
    *    .mockResolvedValueOnce('first call')
    *    .mockRejectedValueOnce(new Error('Async error'));
    *
    *  await asyncMock(); // first call
    *  await asyncMock(); // throws "Async error"
    * });
    *
    */
  def mockRejectedValueOnce(value: js.Any): Mock[T] = js.native
  /**
    * Resets all information stored in the mock, including any initial implementation and mock name given.
    *
    * This is useful when you want to completely restore a mock back to its initial state.
    *
    * Beware that `mockReset` will replace `mockFn.mock`, not just `mockFn.mock.calls` and `mockFn.mock.instances`.
    * You should therefore avoid assigning mockFn.mock to other variables, temporary or not, to make sure you
    * don't access stale data.
    */
  def mockReset(): scala.Unit = js.native
  /**
    * Simple sugar function for: `jest.fn().mockImplementation(() => Promise.resolve(value));`
    */
  def mockResolvedValue(value: js.Any): Mock[T] = js.native
  /**
    * Simple sugar function for: `jest.fn().mockImplementationOnce(() => Promise.resolve(value));`
    *
    * @example
    *
    * test('async test', async () => {
    *  const asyncMock = jest
    *    .fn()
    *    .mockResolvedValue('default')
    *    .mockResolvedValueOnce('first call')
    *    .mockResolvedValueOnce('second call');
    *
    *  await asyncMock(); // first call
    *  await asyncMock(); // second call
    *  await asyncMock(); // default
    *  await asyncMock(); // default
    * });
    *
    */
  def mockResolvedValueOnce(value: js.Any): Mock[T] = js.native
  /**
    * Does everything that `mockFn.mockReset()` does, and also restores the original (non-mocked) implementation.
    *
    * This is useful when you want to mock functions in certain test cases and restore the original implementation in others.
    *
    * Beware that `mockFn.mockRestore` only works when mock was created with `jest.spyOn`. Thus you have to take care of restoration
    * yourself when manually assigning `jest.fn()`.
    *
    * The [`restoreMocks`](https://jestjs.io/docs/en/configuration.html#restoremocks-boolean) configuration option is available
    * to restore mocks automatically between tests.
    */
  def mockRestore(): scala.Unit = js.native
  /**
    * Just a simple sugar function for:
    *
    * @example
    *
    *   jest.fn(function() {
    *     return this;
    *   });
    */
  def mockReturnThis(): Mock[T] = js.native
  /**
    * Accepts a value that will be returned whenever the mock function is called.
    *
    * @example
    *
    * const mock = jest.fn();
    * mock.mockReturnValue(42);
    * mock(); // 42
    * mock.mockReturnValue(43);
    * mock(); // 43
    */
  def mockReturnValue(value: js.Any): Mock[T] = js.native
  /**
    * Accepts a value that will be returned for one call to the mock function. Can be chained so that
    * successive calls to the mock function return different values. When there are no more
    * `mockReturnValueOnce` values to use, calls will return a value specified by `mockReturnValue`.
    *
    * @example
    *
    * const myMockFn = jest.fn()
    *   .mockReturnValue('default')
    *   .mockReturnValueOnce('first call')
    *   .mockReturnValueOnce('second call');
    *
    * // 'first call', 'second call', 'default', 'default'
    * console.log(myMockFn(), myMockFn(), myMockFn(), myMockFn());
    *
    */
  def mockReturnValueOnce(value: js.Any): Mock[T] = js.native
}

