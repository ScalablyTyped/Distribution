package typings.highland

import typings.highland.Highland.MappingHint
import typings.highland.Highland.Nil
import typings.highland.Highland.OnFinished
import typings.highland.Highland.Stream
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Highland: the high-level streams library
  *
  * Highland may be freely distributed under the Apache 2.0 license.
  * https://github.com/caolan/highland
  * Copyright (c) Caolan McMahon
  *
  */
@js.native
trait HighlandStatic extends StObject {
  
  /**
    * The Stream constructor, accepts an array of values or a generator function
    * as an optional argument. This is typically the entry point to the Highland
    * APIs, providing a convenient way of chaining calls together.
    *
    * **Arrays -** Streams created from Arrays will emit each value of the Array
    * and then emit a [nil](#nil) value to signal the end of the Stream.
    *
    * **Generators -** These are functions which provide values for the Stream.
    * They are lazy and can be infinite, they can also be asynchronous (for
    * example, making a HTTP request). You emit values on the Stream by calling
    * `push(err, val)`, much like a standard Node.js callback. Once it has been
    * called, the generator function will not be called again unless you call
    * `next()`. This call to `next()` will signal you've finished processing the
    * current data and allow for the generator function to be called again. If the
    * Stream is still being consumed the generator function will then be called
    * again.
    *
    * You can also redirect a generator Stream by passing a new source Stream
    * to read from to next. For example: `next(other_stream)` - then any subsequent
    * calls will be made to the new source.
    *
    * **Node Readable Stream -** Pass in a Node Readable Stream object to wrap
    * it with the Highland API. Reading from the resulting Highland Stream will
    * begin piping the data from the Node Stream to the Highland Stream.
    *
    * A stream constructed in this way relies on `Readable#pipe` to end the
    * Highland Stream once there is no more data. Not all Readable Streams do
    * this. For example, `IncomingMessage` will only emit `close` when the client
    * aborts communications and will *not* properly call `end`. In this case, you
    * can provide an optional `onFinished` function with the signature
    * `onFinished(readable, callback)` as the second argument.
    *
    * This function will be passed the Readable and a callback that should called
    * when the Readable ends. If the Readable ended from an error, the error
    * should be passed as the first argument to the callback. `onFinished` should
    * bind to whatever listener is necessary to detect the Readable's completion.
    * If the callback is called multiple times, only the first invocation counts.
    * If the callback is called *after* the Readable has already ended (e.g., the
    * `pipe` method already called `end`), it will be ignored.
    *
    * The `onFinished` function may optionally return one of the following:
    *
    * - A cleanup function that will be called when the stream ends. It should
    * unbind any listeners that were added.
    * - An object with the following optional properties:
    *    - `onDestroy` - the cleanup function.
    *    - `continueOnError` - Whether or not to continue the stream when an
    *      error is passed to the callback. Set this to `true` if the Readable
    *      may continue to emit values after errors. Default: `false`.
    *
    * See [this issue](https://github.com/caolan/highland/issues/490) for a
    * discussion on why Highland cannot reliably detect stream completion for
    * all implementations and why the `onFinished` function is required.
    *
    * **EventEmitter / jQuery Elements -** Pass in both an event name and an
    * event emitter as the two arguments to the constructor and the first
    * argument emitted to the event handler will be written to the new Stream.
    *
    * You can pass a mapping hint as the third argument, which specifies how
    * event arguments are pushed into the stream. If no mapping hint is provided,
    * only the first value emitted with the event to the will be pushed onto the
    * Stream.
    *
    * If `mappingHint` is a number, an array of that length will be pushed onto
    * the stream, containing exactly that many parameters from the event. If it's
    * an array, it's used as keys to map the arguments into an object which is
    * pushed to the tream. If it is a function, it's called with the event
    * arguments, and the returned value is pushed.
    *
    * **Promise -** Accepts an ES6 / jQuery style promise and returns a
    * Highland Stream which will emit a single value (or an error). In case you use
    * [bluebird cancellation](http://bluebirdjs.com/docs/api/cancellation.html) Highland Stream will be empty for a cancelled promise.
    *
    * **Iterator -** Accepts an ES6 style iterator that implements the [iterator protocol](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_.22iterator.22_protocol):
    * yields all the values from the iterator using its `next()` method and terminates when the
    * iterator's done value returns true. If the iterator's `next()` method throws, the exception will be emitted as an error,
    * and the stream will be ended with no further calls to `next()`.
    *
    * **Iterable -** Accepts an object that implements the [iterable protocol](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_.22iterable.22_protocol),
    * i.e., contains a method that returns an object that conforms to the iterator protocol. The stream will use the
    * iterator defined in the `Symbol.iterator` property of the iterable object to generate emitted values.
    *
    * @id _(source)
    * @section Stream Objects
    * @name _(source)
    * @param {Array | Function | Iterator | Iterable | Promise | Readable Stream | String} source - (optional) source to take values from from
    * @param {Function} onFinished - (optional) a function that detects when the readable completes. Second argument. Only valid if `source` is a Readable.
    * @param {EventEmitter | jQuery Element} eventEmitter - (optional) An event emitter. Second argument. Only valid if `source` is a String.
    * @param {Array | Function | Number} mappingHint - (optional) how to pass the
    * arguments to the callback. Only valid if `source` is a String.
    * @api public
    */
  def apply[R](): Stream[R] = js.native
  def apply[R](source: String, eventEmitter: EventEmitter): Stream[R] = js.native
  def apply[R](source: String, eventEmitter: EventEmitter, mappingHint: MappingHint): Stream[R] = js.native
  def apply[R](source: js.Array[R]): Stream[R] = js.native
  def apply[R](
    source: js.Function2[
      /* push */ js.Function2[/* err */ Error | Null, /* x */ js.UndefOr[R | Nil], Unit], 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ): Stream[R] = js.native
  // moar (promise for everything?)
  def apply[R](source: js.Thenable[R | Stream[R]]): Stream[R] = js.native
  def apply[R](source: Stream[R]): Stream[R] = js.native
  def apply[R](source: ReadableStream): Stream[R] = js.native
  def apply[R](source: ReadableStream, onFinished: OnFinished): Stream[R] = js.native
  def apply[R](source: Iterable[R]): Stream[R] = js.native
  def apply[R](source: Iterator[R, js.Any, Unit]): Stream[R] = js.native
  
  def add(a: Double): js.Function1[/* b */ Double, Double] = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // OPERATORS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Add two values. Can be partially applied.
    *
    * @id add
    * @section Operators
    * @name _.add(a, b)
    * @api public
    */
  def add(a: Double, b: Double): Double = js.native
  
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // FUNCTIONS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Creates a composite function, which is the application of function1 to
    * the results of function2. You can pass an arbitrary number of arguments
    * and have them composed. This means you can't partially apply the compose
    * function itself.
    *
    * @id compose
    * @name compose(fn1, fn2, ...)
    * @section Functions
    * @api public
    */
  def compose(functions: js.Function*): js.Function = js.native
  
  /**
    * Transforms a function with specific arity (all arguments must be
    * defined) in a way that it can be called as a chain of functions until
    * the arguments list is saturated.
    *
    * This function is not itself curryable.
    *
    * @id curry
    * @name curry(fn, [*arguments])
    * @section Functions
    * @param {Function} fn - the function to curry
    * @param args.. - any number of arguments to pre-apply to the function
    * @returns Function
    * @api public
    */
  def curry(fn: js.Function, args: js.Any*): js.Function = js.native
  
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // OBJECTS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Extends one object with the properties of another. **Note:** The
    * arguments are in the reverse order of other libraries such as
    * underscore. This is so it follows the convention of other functions in
    * this library and so you can more meaningfully partially apply it.
    *
    * @id extend
    * @section Objects
    * @name _.extend(a, b)
    * @param {Object} a - the properties to extend b with
    * @param {Object} b - the original object to extend
    * @api public
    */
  def extend(extensions: js.Object, target: js.Object): js.Object = js.native
  def extend(target: js.Object): js.Function1[/* extensions */ js.Object, js.Object] = js.native
  
  /**
    * Evaluates the function `fn` with the argument positions swapped. Only
    * works with functions that accept two arguments.
    *
    * @id flip
    * @name flip(fn, [x, y])
    * @section Functions
    * @param {Function} f - function to flip argument application for
    * @param x - parameter to apply to the right hand side of f
    * @param y - parameter to apply to the left hand side of f
    * @api public
    */
  def flip(fn: js.Function, args: js.Any*): js.Function = js.native
  
  def get(prop: String): js.Function1[/* obj */ js.Object, js.Object] = js.native
  /**
    * Returns a property from an object.
    *
    * @id get
    * @section Objects
    * @name _.get(prop, obj)
    * @param {String} prop - the property to return
    * @param {Object} obj - the object to read properties from
    * @api public
    */
  def get(prop: String, obj: js.Object): String = js.native
  
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // UTILS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Returns true if `x` is the end of stream marker.
    *
    * @id isNil
    * @section Streams
    * @name _.isNil(x)
    * @param x - the object to test
    * @api public
    */
  def isNil[R](x: R): /* is highland.Highland.Nil */ Boolean = js.native
  def isNil[R](x: Nil): /* is highland.Highland.Nil */ Boolean = js.native
  
  /**
    * Returns true if `x` is a Highland Stream.
    *
    * @id isStream
    * @section Streams
    * @name _.isStream(x)
    * @param x - the object to test
    * @api public
    */
  def isStream(x: js.Any): /* is highland.Highland.Stream<any> */ Boolean = js.native
  
  def isStreamError(x: js.Any): /* is highland.Highland.Stream<any> */ Boolean = js.native
  
  def isStreamRedirect(x: js.Any): /* is highland.Highland.Stream<any> */ Boolean = js.native
  
  /**
    * Returns keys from an Object as a Stream.
    *
    * @id keys
    * @section Objects
    * @name _.keys(obj)
    * @param {Object} obj - the object to return keys from
    * @api public
    */
  def keys(obj: js.Object): Stream[String] = js.native
  
  /**
    * Logs values to the console, a simple wrapper around `console.log` that
    * it suitable for passing to other functions by reference without having to
    * call `bind`.
    *
    * @id log
    * @section Utils
    * @name _.log(args..)
    * @api public
    */
  def log(x: js.Any, args: js.Any*): Unit = js.native
  
  /**
    * Same as `curry` but with a specific number of arguments. This can be
    * useful when functions do not explicitly define all its parameters.
    *
    * This function is not itself curryable.
    *
    * @id ncurry
    * @name ncurry(n, fn, [args...])
    * @section Functions
    * @param {Number} n - the number of arguments to wait for before apply fn
    * @param {Function} fn - the function to curry
    * @param args... - any number of arguments to pre-apply to the function
    * @returns Function
    * @api public
    */
  def ncurry(n: Double, fn: js.Function, args: js.Any*): js.Function = js.native
  
  /**
    * The end of stream marker. This is sent along the data channel of a Stream
    * to tell consumers that the Stream has ended. See the following map code for
    * an example of detecting the end of a Stream:
    *
    * @id nil
    * @section Streams
    * @name _.nil
    * @api public
    */
  var nil: Nil = js.native
  
  /**
    * Perform logical negation on a value. If `x` is truthy then returns false,
    * otherwise returns true.
    *
    * @id not
    * @section Operators
    * @name _.not(x)
    * @param x - the value to negate
    * @api public
    *
    * _.not(true)   // => false
    * _.not(false)  // => true
    */
  def not[R](x: js.Any): Boolean = js.native
  
  def pairs(obj: js.Array[js.Any]): Stream[js.Array[js.Any]] = js.native
  /**
    * Returns key/value pairs for an Object as a Stream. Reads properties
    * lazily, so if you don't read from all keys on an object, not
    * all properties will be read from (may have an effect where getters
    * are used).
    *
    * @id pairs
    * @section Objects
    * @name _.pairs(obj)
    * @param {Object} obj - the object to return key/value pairs from
    * @api public
    */
  def pairs(obj: js.Object): Stream[js.Array[js.Any]] = js.native
  
  /**
    * Partially applies the function (regardless of whether it has had curry
    * called on it). This will always postpone execution until at least the next
    * call of the partially applied function.
    *
    * @id partial
    * @name partial(fn, args...)
    * @section Functions
    * @param {Function} fn - function to partial apply
    * @param args... - the arguments to apply to the function
    * @api public
    */
  def partial(fn: js.Function, args: js.Any*): js.Function = js.native
  
  /**
    * The reversed version of compose. Where arguments are in the order of
    * application.
    *
    * @id seq
    * @name seq(fn1, fn2, ...)
    * @section Functions
    * @api public
    */
  def seq(functions: js.Function*): js.Function = js.native
  
  def set(prop: String, `val`: js.Any): js.Function1[/* obj */ js.Object, js.Object] = js.native
  /**
    * Updates a property on an object, returning the updated object.
    *
    * @id set
    * @section Objects
    * @name _.set(prop, value, obj)
    * @param {String} prop - the property to return
    * @param value - the value to set the property to
    * @param {Object} obj - the object to set properties on
    * @api public
    */
  def set(prop: String, `val`: js.Any, obj: js.Object): js.Object = js.native
  
  /**
    * Returns values from an Object as a Stream. Reads properties
    * lazily, so if you don't read from all keys on an object, not
    * all properties will be read from (may have an effect where getters
    * are used).
    *
    * @id values
    * @section Objects
    * @name _.values(obj)
    * @param {Object} obj - the object to return values from
    * @api public
    */
  def values(obj: js.Object): Stream[js.Any] = js.native
  
  /**
    * Wraps a node-style async function which accepts a callback, transforming
    * it to a function which accepts the same arguments minus the callback and
    * returns a Highland Stream instead. The wrapped function keeps its context,
    * so you can safely use it as a method without binding (see the second
    * example below).
    *
    * wrapCallback also accepts an optional mappingHint, which specifies how
    * callback arguments are pushed to the stream. This can be used to handle
    * non-standard callback protocols that pass back more than one value.
    *
    * mappingHint can be a function, number, or array. See the documentation on
    * EventEmitter Stream Objects for details on the mapping hint. If
    * mappingHint is a function, it will be called with all but the first
    * argument that is passed to the callback. The first is still assumed to be
    * the error argument.
    *
    * @id wrapCallback
    * @section Utils
    * @name _.wrapCallback(f)
    * @param {Function} f - the node-style function to wrap
    * @param {Array | Function | Number} [mappingHint] - how to pass the arguments to the callback
    * @api public
    */
  def wrapCallback(f: js.Function): js.Function1[/* repeated */ js.Any, Stream[js.Any]] = js.native
  def wrapCallback(f: js.Function, mappingHint: MappingHint): js.Function1[/* repeated */ js.Any, Stream[js.Any]] = js.native
}
