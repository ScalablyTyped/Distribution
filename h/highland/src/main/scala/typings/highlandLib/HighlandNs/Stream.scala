package typings
package highlandLib.HighlandNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
/**
	 * Actual Stream constructor wrapped the the main exported function
	 */
@js.native
trait Stream[R]
  extends nodeLib.NodeJSNs.EventEmitter {
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // TRANSFORMS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  		 * Adds a value to the end of a Stream.
  		 *
  		 * @id append
  		 * @section Streams
  		 * @name Stream.append(y)
  		 * @param y - the value to append to the Stream
  		 * @api public
  		 */
  def append(y: R): Stream[R] = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // CONSUMPTION
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  		 * Applies results from a Stream as arguments to a function
  		 *
  		 * @id apply
  		 * @section Streams
  		 * @name Stream.apply(f)
  		 * @param {Function} f - the function to apply arguments to
  		 * @api public
  		 */
  // TODO what to do here?
  @JSName("apply")
  def apply(f: js.Function): scala.Unit = js.native
  /**
  		 * Takes one Stream and batches incoming data into arrays of given length
  		 *
  		 * @id batch
  		 * @section Transforms
  		 * @name Stream.batch(n)
  		 * @param {Number} n - length of the array to batch
  		 * @api public
  		 *
  		 * _([1, 2, 3, 4, 5]).batch(2)  // => [1, 2], [3, 4], [5]
  		 */
  def batch(n: scala.Double): Stream[js.Array[R]] = js.native
  /**
  		 * Takes one Stream and batches incoming data within a maximum time frame
  		 * into arrays of a maximum length.
  		 *
  		 * @id batchWithTimeOrCount
  		 * @section Transforms
  		 * @name Stream.batchWithTimeOrCount(ms, n)
  		 * @param {Number} ms - the maximum milliseconds to buffer a batch
  		 * @param {Number} n - the maximum length of the array to batch
  		 * @api public
  		 *
  		 * _(function (push) {
  		 *     push(1);
  		 *     push(2);
  		 *     push(3);
  		 *     setTimeout(push, 20, 4);
  		 * }).batchWithTimeOrCount(10, 2)
  		 *
  		 * // => [1, 2], [3], [4]
  		 */
  def batchWithTimeOrCount(ms: scala.Double, n: scala.Double): Stream[js.Array[R]] = js.native
  /**
  		 * Groups all values into an Array and passes down the stream as a single
  		 * data event. This is a bit like doing [toArray](#toArray), but instead
  		 * of accepting a callback and causing a *thunk*, it passes the value on.
  		 *
  		 * @id collect
  		 * @section Streams
  		 * @name Stream.collect()
  		 * @api public
  		 */
  def collect(): Stream[js.Array[R]] = js.native
  /**
  		 * Filters a Stream to drop all non-truthy values.
  		 *
  		 * @id compact
  		 * @section Streams
  		 * @name Stream.compact()
  		 * @api public
  		 */
  def compact(): Stream[R] = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // HIGHER-ORDER STREAMS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  		 * Concatenates a Stream to the end of this Stream.
  		 *
  		 * Be aware that in the top-level export, the args may be in the reverse
  		 * order to what you'd expect `_([a], [b]) => [b, a]`, as this follows the
  		 * convention of other top-level exported functions which do `x` to `y`.
  		 *
  		 * @id concat
  		 * @section Streams
  		 * @name Stream.concat(ys)
  		 * @params {Stream | Array} ys - the values to concatenate onto this Stream
  		 * @api public
  		 */
  def concat(ys: Stream[R]): Stream[R] = js.native
  def concat(ys: js.Array[R]): Stream[R] = js.native
  /**
  		 * Consumes values from a Stream (once resumed) and returns a new Stream for
  		 * you to optionally push values onto using the provided push / next functions.
  		 *
  		 * This function forms the basis of many higher-level Stream operations.
  		 * It will not cause a paused stream to immediately resume, but behaves more
  		 * like a 'through' stream, handling values as they are read.
  		 *
  		 * @id consume
  		 * @section Streams
  		 * @name Stream.consume(f)
  		 * @param {Function} f - the function to handle errors and values
  		 * @api public
  		 */
  def consume[U](
    f: js.Function4[
      /* err */ stdLib.Error, 
      /* x */ R | Nil, 
      /* push */ js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.UndefOr[U | Nil], scala.Unit], 
      /* next */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): Stream[U] = js.native
  /**
  		 * Holds off pushing data events downstream until there has been no more
  		 * data for `ms` milliseconds. Sends the last value that occurred before
  		 * the delay, discarding all other values.
  		 *
  		 * @id debounce
  		 * @section Streams
  		 * @name Stream.debounce(ms)
  		 * @param {Number} ms - the milliseconds to wait before sending data
  		 * @api public
  		 */
  def debounce(ms: scala.Double): Stream[R] = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // STREAM OBJECTS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  		 * Destroys a stream by unlinking it from any consumers and sources. This will
  		 * stop all consumers from receiving events from this stream and removes this
  		 * stream as a consumer of any source stream.
  		 *
  		 * This function calls end() on the stream and unlinks it from any piped-to streams.
  		 *
  		 * @id pipe
  		 * @section Streams
  		 * @name Stream.destroy()
  		 * @api public
  		 */
  def destroy(): scala.Unit = js.native
  /**
  		 * Calls a function once the Stream has ended. This method consumes the stream.
  		 * If the Stream has already ended, the function is called immediately.
  		 *
  		 * If an error from the Stream reaches this call, it will emit an `error` event
  		 * (i.e., it will call `emit('error')` on the stream being consumed).  This
  		 * event will cause an error to be thrown if unhandled.
  		 *
  		 * As a special case, it is possible to chain `done` after a call to
  		 * [each](#each) even though both methods consume the stream.
  		 *
  		 * @id done
  		 * @section Consumption
  		 * @name Stream.done(f)
  		 * @param {Function} f - the callback
  		 * @api public
  		 *
  		 * var total = 0;
  		 * _([1, 2, 3, 4]).each(function (x) {
  		 *     total += x;
  		 * }).done(function () {
  		 *     // total will be 10
  		 * });
  		 */
  def done(f: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  		 * Creates a new Stream which applies a function to each value from the source
  		 * and re-emits the source value. Useful when you want to mutate the value or
  		 * perform side effects
  		 *
  		 * @id doto
  		 * @section Transforms
  		 * @name Stream.doto(f)
  		 * @param {Function} f - the function to apply
  		 * @api public
  		 *
  		 * var appended = _([[1], [2], [3], [4]]).doto(function (x) {
  		 *     x.push(1);
  		 * });
  		 *
  		 * _([1, 2, 3]).doto(console.log)
  		 * // 1
  		 * // 2
  		 * // 3
  		 * // => 1, 2, 3
  		 */
  def doto(f: js.Function1[/* x */ R, scala.Unit]): Stream[R] = js.native
  /**
  		 * Acts as the inverse of [`take(n)`](#take) - instead of returning the first `n` values, it ignores the
  		 * first `n` values and then emits the rest. `n` must be of type `Number`, if not the whole stream will
  		 * be returned. All errors (even ones emitted before the nth value) will be emitted.
  		 *
  		 * @id drop
  		 * @section Transforms
  		 * @name Stream.drop(n)
  		 * @param {Number} n - integer representing number of values to read from source
  		 * @api public
  		 *
  		 * _([1, 2, 3, 4]).drop(2) // => 3, 4
  		 */
  def drop(n: scala.Double): Stream[R] = js.native
  /**
  		 * Iterates over every value from the Stream, calling the iterator function
  		 * on each of them. This function causes a **thunk**.
  		 *
  		 * If an error from the Stream reaches the `each` call, it will emit an
  		 * error event (which will cause it to throw if unhandled).
  		 *
  		 * @id each
  		 * @section Streams
  		 * @name Stream.each(f)
  		 * @param {Function} f - the iterator function
  		 * @api public
  		 */
  def each(f: js.Function1[/* x */ R, scala.Unit]): stdLib.Pick[Stream[R], highlandLib.highlandLibStrings.done] = js.native
  /**
  		 * Ends a Stream. This is the same as sending a [nil](#nil) value as data.
  		 * You shouldn't need to call this directly, rather it will be called by
  		 * any [Node Readable Streams](http://nodejs.org/api/stream.html#stream_class_stream_readable)
  		 * you pipe in.
  		 *
  		 * @id end
  		 * @section Streams
  		 * @name Stream.end()
  		 * @api public
  		 */
  def end(): scala.Unit = js.native
  /**
  		 * Extracts errors from a Stream and applies them to an error handler
  		 * function. Returns a new Stream with the errors removed (unless the error
  		 * handler chooses to rethrow them using `push`). Errors can also be
  		 * transformed and put back onto the Stream as values.
  		 *
  		 * @id errors
  		 * @section Streams
  		 * @name Stream.errors(f)
  		 * @param {Function} f - the function to pass all errors to
  		 * @api public
  		 */
  def errors(
    f: js.Function2[
      /* err */ stdLib.Error, 
      /* push */ js.Function2[/* err */ stdLib.Error | scala.Null, /* x */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): Stream[R] = js.native
  /**
  		 * Creates a new Stream including only the values which pass a truth test.
  		 *
  		 * @id filter
  		 * @section Streams
  		 * @name Stream.filter(f)
  		 * @param f - the truth test function
  		 * @api public
  		 */
  def filter(f: js.Function1[/* x */ R, scala.Boolean]): Stream[R] = js.native
  /**
  		 * A convenient form of filter, which returns the first object from a
  		 * Stream that passes the provided truth test
  		 *
  		 * @id find
  		 * @section Streams
  		 * @name Stream.find(f)
  		 * @param {Function} f - the truth test function which returns a Stream
  		 * @api public
  		 */
  def find(f: js.Function1[/* x */ R, scala.Boolean]): Stream[R] = js.native
  /**
  		 * A convenient form of [where](#where), which returns the first object from a
  		 * Stream that matches a set of property values. findWhere is to [where](#where) as [find](#find) is to [filter](#filter).
  		 *
  		 * @id findWhere
  		 * @section Transforms
  		 * @name Stream.findWhere(props)
  		 * @param {Object} props - the properties to match against
  		 * @api public
  		 *
  		 * var docs = [
  		 *     {type: 'blogpost', title: 'foo'},
  		 *     {type: 'blogpost', title: 'bar'},
  		 *     {type: 'comment', title: 'foo'}
  		 * ];
  		 *
  		 * _(docs).findWhere({type: 'blogpost'})
  		 * // => {type: 'blogpost', title: 'foo'}
  		 *
  		 * // example with partial application
  		 * var firstBlogpost = _.findWhere({type: 'blogpost'});
  		 *
  		 * firstBlogpost(docs)
  		 * // => {type: 'blogpost', title: 'foo'}
  		 */
  def findWhere(props: js.Object): Stream[R] = js.native
  /**
  		 * Filters using a predicate which returns a Stream. If you need to check
  		 * against an asynchronous data source when filtering a Stream, this can
  		 * be convenient. The Stream returned from the filter function should have
  		 * a Boolean as it's first value (all other values on the Stream will be
  		 * disregarded).
  		 *
  		 * @id flatFilter
  		 * @section Streams
  		 * @name Stream.flatFilter(f)
  		 * @param {Function} f - the truth test function which returns a Stream
  		 * @api public
  		 */
  def flatFilter(f: js.Function1[/* x */ R, Stream[scala.Boolean]]): Stream[R] = js.native
  /**
  		 * Creates a new Stream of values by applying each item in a Stream to an
  		 * iterator function which may return a Stream. Each item on these result
  		 * Streams are then emitted on a single output Stream.
  		 *
  		 * The same as calling `stream.map(f).flatten()`.
  		 *
  		 * @id flatMap
  		 * @section Streams
  		 * @name Stream.flatMap(f)
  		 * @param {Function} f - the iterator function
  		 * @api public
  		 */
  def flatMap[U](f: js.Function1[/* x */ R, Stream[U] | U]): Stream[U] = js.native
  def flatten(): Stream[R] = js.native
  /**
  		 * Recursively reads values from a Stream which may contain nested Streams
  		 * or Arrays. As values or errors are encountered, they are emitted on a
  		 * single output Stream.
  		 *
  		 * @id flatten
  		 * @section Streams
  		 * @name Stream.flatten()
  		 * @api public
  		 */
  @JSName("flatten")
  def flatten_U[U](): Stream[U] = js.native
  /**
  		 * Forks a stream, allowing you to add additional consumers with shared
  		 * back-pressure. A stream forked to multiple consumers will only pull values
  		 * from it's source as fast as the slowest consumer can handle them.
  		 *
  		 * @id fork
  		 * @section Streams
  		 * @name Stream.fork()
  		 * @api public
  		 */
  def fork(): Stream[R] = js.native
  /**
  		 * A convenient form of reduce, which groups items based on a function or property name
  		 *
  		 * @id group
  		 * @section Streams
  		 * @name Stream.group(f)
  		 * @param {Function|String} f - the function or property name on which to group,
  		 *                              toString() is called on the result of a function.
  		 * @api public
  		 */
  // TODO verify this
  def group(f: js.Function1[/* x */ R, java.lang.String]): Stream[org.scalablytyped.runtime.StringDictionary[js.Array[R]]] = js.native
  def group(prop: java.lang.String): Stream[org.scalablytyped.runtime.StringDictionary[js.Array[R]]] = js.native
  /**
  		 * Creates a new Stream with only the first value from the source.
  		 *
  		 * @id head
  		 * @section Streams
  		 * @name Stream.head()
  		 * @api public
  		 *
  		 * _([1, 2, 3, 4]).head() // => 1
  		 */
  def head(): Stream[R] = js.native
  /**
  		 * Calls a named method on each object from the Stream - returning
  		 * a new stream with the result of those calls.
  		 *
  		 * @id invoke
  		 * @section Streams
  		 * @name Stream.invoke(method, args)
  		 * @param {String} method - the method name to call
  		 * @param {Array} args - the arguments to call the method with
  		 * @api public
  		 */
  def invoke[U](method: java.lang.String, args: js.Array[_]): Stream[U] = js.native
  /**
  		 * Drops all values from the Stream apart from the last one (if any).
  		 *
  		 * @id last
  		 * @section Streams
  		 * @name Stream.last()
  		 * @api public
  		 */
  def last(): Stream[R] = js.native
  /**
  		 * Creates a new Stream, which when read from, only returns the last
  		 * seen value from the source. The source stream does not experience
  		 * back-pressure. Useful if you're using a Stream to model a changing
  		 * property which you need to query periodically.
  		 *
  		 * @id latest
  		 * @section Streams
  		 * @name Stream.latest()
  		 * @api public
  		 */
  def latest(): Stream[R] = js.native
  /**
  		 * Creates a new Stream of transformed values by applying a function to each
  		 * value from the source. The transformation function can be replaced with
  		 * a non-function value for convenience, and it will emit that value
  		 * for every data event on the source Stream.
  		 *
  		 * @id map
  		 * @section Streams
  		 * @name Stream.map(f)
  		 * @param f - the transformation function or value to map to
  		 * @api public
  		 */
  def map[U](f: js.Function1[/* x */ R, U]): Stream[U] = js.native
  /**
  		 * Takes a Stream of Streams and merges their values and errors into a
  		 * single new Stream. The merged stream ends when all source streams have
  		 * ended.
  		 *
  		 * Note that no guarantee is made with respect to the order in which
  		 * values for each stream end up in the merged stream. Values in the
  		 * merged stream will, however, respect the order they were emitted from
  		 * their respective streams.
  		 *
  		 * @id merge
  		 * @section Streams
  		 * @name Stream.merge()
  		 * @api public
  		 *
  		 * var txt = _(['foo.txt', 'bar.txt']).map(readFile)
  		 * var md = _(['baz.md']).map(readFile)
  		 *
  		 * _([txt, md]).merge();
  		 * // => contents of foo.txt, bar.txt and baz.txt in the order they were read
  		 */
  def merge[U](`this`: Stream[Stream[U]]): Stream[U] = js.native
  /**
  		 * Observes a stream, allowing you to handle values as they are emitted, without
  		 * adding back-pressure or causing data to be pulled from the source. This can
  		 * be useful when you are performing two related queries on a stream where one
  		 * would block the other. Just be aware that a slow observer could fill up it's
  		 * buffer and cause memory issues. Where possible, you should use [fork](#fork).
  		 *
  		 * @id observe
  		 * @section Streams
  		 * @name Stream.observe()
  		 * @api public
  		 */
  def observe(): Stream[R] = js.native
  /**
  		 * Switches source to an alternate Stream if the current Stream is empty.
  		 *
  		 * @id otherwise
  		 * @section Streams
  		 * @name Stream.otherwise(ys)
  		 * @param {Stream} ys - alternate stream to use if this stream is empty
  		 * @api public
  		 */
  def otherwise(ys: Stream[R]): Stream[R] = js.native
  /**
  		 * Takes a Stream of Streams and reads from them in parallel, buffering
  		 * the results until they can be returned to the consumer in their original
  		 * order.
  		 *
  		 * @id parallel
  		 * @section Streams
  		 * @name Stream.parallel(n)
  		 * @param {Number} n - the maximum number of concurrent reads/buffers
  		 * @api public
  		 */
  def parallel[U](`this`: Stream[Stream[U]], n: scala.Double): Stream[U] = js.native
  /**
  		 * Pauses the stream. All Highland Streams start in the paused state.
  		 *
  		 * @id pause
  		 * @section Streams
  		 * @name Stream.pause()
  		 * @api public
  		 */
  def pause(): scala.Unit = js.native
  def pipe(dest: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  /**
  		 * Pipes a Highland Stream to a [Node Writable Stream](http://nodejs.org/api/stream.html#stream_class_stream_writable)
  		 * (Highland Streams are also Node Writable Streams). This will pull all the
  		 * data from the source Highland Stream and write it to the destination,
  		 * automatically managing flow so that the destination is not overwhelmed
  		 * by a fast source.
  		 *
  		 * This function returns the destination so you can chain together pipe calls.
  		 *
  		 * @id pipe
  		 * @section Streams
  		 * @name Stream.pipe(dest)
  		 * @param {Writable Stream} dest - the destination to write all data to
  		 * @api public
  		 */
  def pipe[U](dest: Stream[U]): Stream[U] = js.native
  def pipe[U](dest: nodeLib.NodeJSNs.ReadWriteStream): Stream[U] = js.native
  /**
  		 * Retrieves values associated with a given property from all elements in
  		 * the collection.
  		 *
  		 * @id pluck
  		 * @section Streams
  		 * @name Stream.pluck(property)
  		 * @param {String} prop - the property to which values should be associated
  		 * @api public
  		 */
  def pluck[U](prop: java.lang.String): Stream[U] = js.native
  /**
  		 * Consumes a single item from the Stream. Unlike consume, this function will
  		 * not provide a new stream for you to push values onto, and it will unsubscribe
  		 * as soon as it has a single error, value or nil from the source.
  		 *
  		 * You probably won't need to use this directly, but it is used internally by
  		 * some functions in the Highland library.
  		 *
  		 * @id pull
  		 * @section Streams
  		 * @name Stream.pull(f)
  		 * @param {Function} f - the function to handle data
  		 * @api public
  		 */
  def pull(f: js.Function2[/* err */ stdLib.Error, /* x */ R, scala.Unit]): scala.Unit = js.native
  /**
  		 * Limits number of values through the stream to a maximum of number of values
  		 * per window. Errors are not limited but allowed to pass through as soon as
  		 * they are read from the source.
  		 *
  		 * @id ratelimit
  		 * @section Transforms
  		 * @name Stream.ratelimit(num, ms)
  		 * @param {Number} num - the number of operations to perform per window
  		 * @param {Number} ms - the window of time to limit the operations in (in ms)
  		 * @api public
  		 *
  		 * _([1, 2, 3, 4, 5]).ratelimit(2, 100);
  		 *
  		 * // after 0ms => 1, 2
  		 * // after 100ms => 1, 2, 3, 4
  		 * // after 200ms => 1, 2, 3, 4, 5
  		 */
  def ratelimit(num: scala.Double, ms: scala.Double): Stream[R] = js.native
  /**
  		 * Boils down a Stream to a single value. The memo is the initial state
  		 * of the reduction, and each successive step of it should be returned by
  		 * the iterator function. The iterator is passed two arguments:
  		 * the memo and the next value.
  		 *
  		 * @id reduce
  		 * @section Streams
  		 * @name Stream.reduce(memo, iterator)
  		 * @param memo - the initial state of the reduction
  		 * @param {Function} iterator - the function which reduces the values
  		 * @api public
  		 */
  // TODO: convert this to this.scan(z, f).last()
  def reduce[U](memo: U, f: js.Function2[/* memo */ U, /* x */ R, U]): Stream[U] = js.native
  /**
  		 * Same as [reduce](#reduce), but uses the first element as the initial
  		 * state instead of passing in a `memo` value.
  		 *
  		 * @id reduce1
  		 * @section Streams
  		 * @name Stream.reduce1(iterator)
  		 * @param {Function} iterator - the function which reduces the values
  		 * @api public
  		 */
  def reduce1[U](memo: U, f: js.Function2[/* memo */ U, /* x */ R, U]): Stream[U] = js.native
  /**
  		 * The inverse of [filter](#filter).
  		 *
  		 * @id reject
  		 * @section Streams
  		 * @name Stream.reject(f)
  		 * @param {Function} f - the truth test function
  		 * @api public
  		 *
  		 * var odds = _([1, 2, 3, 4]).reject(function (x) {
  		 *     return x % 2 === 0;
  		 * });
  		 */
  def reject(f: js.Function1[/* x */ R, scala.Boolean]): Stream[R] = js.native
  /**
  		 * Resumes a paused Stream. This will either read from the Stream's incoming
  		 * buffer or request more data from an upstream source.
  		 *
  		 * @id resume
  		 * @section Streams
  		 * @name Stream.resume()
  		 * @api public
  		 */
  def resume(): scala.Unit = js.native
  /**
  		 * Like [reduce](#reduce), but emits each intermediate value of the
  		 * reduction as it is calculated.
  		 *
  		 * @id scan
  		 * @section Streams
  		 * @name Stream.scan(memo, iterator)
  		 * @param memo - the initial state of the reduction
  		 * @param {Function} iterator - the function which reduces the values
  		 * @api public
  		 */
  def scan[U](memo: U, x: js.Function2[/* memo */ U, /* x */ R, U]): Stream[U] = js.native
  /**
  		 * Same as [scan](#scan), but uses the first element as the initial
  		 * state instead of passing in a `memo` value.
  		 *
  		 * @id scan1
  		 * @section Streams
  		 * @name Stream.scan1(iterator)
  		 * @param {Function} iterator - the function which reduces the values
  		 * @api public
  		 *
  		 * _([1, 2, 3, 4]).scan1(add) // => 1, 3, 6, 10
  		 */
  def scan1[U](memo: U, x: js.Function2[/* memo */ U, /* x */ R, U]): Stream[U] = js.native
  /**
  		 * Reads values from a Stream of Streams, emitting them on a Single output
  		 * Stream. This can be thought of as a flatten, just one level deep. Often
  		 * used for resolving asynchronous actions such as a HTTP request or reading
  		 * a file.
  		 *
  		 * @id sequence
  		 * @section Streams
  		 * @name Stream.sequence()
  		 * @api public
  		 */
  def sequence[U](`this`: Stream[Stream[U]]): Stream[U] = js.native
  /**
  		 * An alias for the [sequence](#sequence) method.
  		 *
  		 * @id series
  		 * @section Streams
  		 * @name Stream.series()
  		 * @api public
  		 */
  // TODO figure out typing
  def series[U](): Stream[U] = js.native
  /**
  		 * Like the [errors](#errors) method, but emits a Stream end marker after
  		 * an Error is encountered.
  		 *
  		 * @id stopOnError
  		 * @section Streams
  		 * @name Stream.stopOnError(f)
  		 * @param {Function} f - the function to handle an error
  		 * @api public
  		 */
  def stopOnError(f: js.Function1[/* err */ stdLib.Error, scala.Unit]): Stream[R] = js.native
  /**
  		 * Creates a new Stream with the first `n` values from the source.
  		 *
  		 * @id take
  		 * @section Streams
  		 * @name Stream.take(n)
  		 * @param {Number} n - integer representing number of values to read from source
  		 * @api public
  		 */
  def take(n: scala.Double): Stream[R] = js.native
  /**
  		 * An alias for the [doto](#doto) method.
  		 *
  		 * @id tap
  		 * @section Transforms
  		 * @name Stream.tap(f)
  		 * @param {Function} f - the function to apply
  		 * @api public
  		 *
  		 * _([1, 2, 3]).tap(console.log)
  		 */
  def tap(f: js.Function1[/* x */ R, scala.Unit]): Stream[R] = js.native
  /**
  		 * Ensures that only one data event is push downstream (or into the buffer)
  		 * every `ms` milliseconds, any other values are dropped.
  		 *
  		 * @id throttle
  		 * @section Streams
  		 * @name Stream.throttle(ms)
  		 * @param {Number} ms - the minimum milliseconds between each value
  		 * @api public
  		 */
  def throttle(ms: scala.Double): Stream[R] = js.native
  def through(thru: nodeLib.NodeJSNs.ReadWriteStream): Stream[_] = js.native
  /**
  		 * Transforms a stream using an arbitrary target transform.
  		 *
  		 * If `target` is a function, this transform passes the current Stream to it,
  		 * returning the result.
  		 *
  		 * If `target` is a [Duplex
  		 * Stream](https://nodejs.org/api/stream.html#stream_class_stream_duplex_1),
  		 * this transform pipes the current Stream through it. It will always return a
  		 * Highland Stream (instead of the piped to target directly as in
  		 * [pipe](#pipe)). Any errors emitted will be propagated as Highland errors.
  		 *
  		 * **TIP**: Passing a function to `through` is a good way to implement complex
  		 * reusable stream transforms. You can even construct the function dynamically
  		 * based on certain inputs. See examples below.
  		 *
  		 * @id through
  		 * @section Higher-order Streams
  		 * @name Stream.through(target)
  		 * @param {Function | Duplex Stream} target - the stream to pipe through or a
  		 * function to call.
  		 * @api public
  		 *
  		 * // This is a static complex transform.
  		 * function oddDoubler(s) {
  		 *     return s.filter(function (x) {
  		 *         return x % 2; // odd numbers only
  		 *     })
  		 *     .map(function (x) {
  		 *         return x * 2;
  		 *     });
  		 * }
  		 *
  		 * // This is a dynamically-created complex transform.
  		 * function multiplyEvens(factor) {
  		 *     return function (s) {
  		 *         return s.filter(function (x) {
  		 *             return x % 2 === 0;
  		 *         })
  		 *         .map(function (x) {
  		 *             return x * factor;
  		 *         });
  		 *     };
  		 * }
  		 *
  		 * _([1, 2, 3, 4]).through(oddDoubler); // => 2, 6
  		 *
  		 * _([1, 2, 3, 4]).through(multiplyEvens(5)); // => 10, 20
  		 *
  		 * // Can also be used with Node Through Streams
  		 * _(filenames).through(jsonParser).map(function (obj) {
  		 *     // ...
  		 * });
  		 *
  		 * // All errors will be propagated as Highland errors
  		 * _(['zz{"a": 1}']).through(jsonParser).errors(function (err) {
  		 *   console.log(err); // => SyntaxError: Unexpected token z
  		 * });
  		 */
  def through[R, U](f: js.Function1[/* x */ R, U]): U = js.native
  /**
  		 * Collects all values from a Stream into an Array and calls a function with
  		 * once with the result. This function causes a **thunk**.
  		 *
  		 * If an error from the Stream reaches the `toArray` call, it will emit an
  		 * error event (which will cause it to throw if unhandled).
  		 *
  		 * @id toArray
  		 * @section Streams
  		 * @name Stream.toArray(f)
  		 * @param {Function} f - the callback to provide the completed Array to
  		 * @api public
  		 */
  def toArray(f: js.Function1[/* arr */ js.Array[R], scala.Unit]): scala.Unit = js.native
  /**
  		 * Returns the result of a stream to a nodejs-style callback function.
  		 *
  		 * If the stream contains a single value, it will call `cb`
  		 * with the single item emitted by the stream (if present).
  		 * If the stream is empty, `cb` will be called without any arguments.
  		 * If an error is encountered in the stream, this function will stop
  		 * consumption and call `cb` with the error.
  		 * If the stream contains more than one item, it will stop consumption
  		 * and call `cb` with an error.
  		 *
  		 * @id toCallback
  		 * @section Consumption
  		 * @name Stream.toCallback(cb)
  		 * @param {Function} cb - the callback to provide the error/result to
  		 * @api public
  		 *
  		 * _([1, 2, 3, 4]).collect().toCallback(function (err, result) {
  		 *     // parameter result will be [1,2,3,4]
  		 *     // parameter err will be null
  		 * });
  		 */
  def toCallback(cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* x */ js.UndefOr[R], scala.Unit]): scala.Unit = js.native
  /**
  		 * Converts the stream to a node Readable Stream for use in methods
  		 * or pipes that depend on the native stream type.
  		 *
  		 * The options parameter can be an object passed into the [`Readable`
  		 * constructor](http://nodejs.org/api/stream.html#stream_class_stream_readable).
  		 *
  		 * @id toNodeStream
  		 * @section Consumption
  		 * @name Stream.toNodeStream(options)
  		 * @param {Object} options - (optional) [`Readable` constructor](http://nodejs.org/api/stream.html#stream_class_stream_readable) options
  		 * @api public
  		 *
  		 * _(fs.createReadStream('./abc')).toNodeStream()
  		 * _(fs.createReadStream('./abc')).toNodeStream({objectMode: false})
  		 * _([{a: 1}]).toNodeStream({objectMode: true})
  		 */
  def toNodeStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def toNodeStream(options: js.Object): nodeLib.NodeJSNs.ReadableStream = js.native
  /**
    * Converts the result of a stream to Promise.
    *
    * If the stream contains a single value, it will return
    * with the single item emitted by the stream (if present).
    * If the stream is empty, `undefined` will be returned.
    * If an error is encountered in the stream, this function will stop
    * consumption and call `cb` with the error.
    * If the stream contains more than one item, it will stop consumption
    * and reject with an error.
    *
    * @id toPromise
    * @section Consumption
    * @name Stream.toPromise(PromiseCtor)
    * @param {Function} PromiseCtor - Promises/A+ compliant constructor
    * @api public
    *
    * _([1, 2, 3, 4]).collect().toPromise(Promise).then(function (result) {
    *     // parameter result will be [1,2,3,4]
    * });
    */
  def toPromise(promiseConstructor: stdLib.PromiseConstructor): js.Thenable[R] = js.native
  /**
    * Filters out all duplicate values from the stream and keeps only the first
    * occurence of each value, using === to define equality.
    *
    * @id uniq
    * @section Streams
    * @name Stream.uniq()
    * @api public
    */
  def uniq(): Stream[R] = js.native
  /**
    * Filters out all duplicate values from the stream and keeps only the first
    * occurence of each value, using the provided function to define equality.
    *
    * @id uniqBy
    * @section Streams
    * @name Stream.uniqBy()
    * @api public
    */
  def uniqBy(f: js.Function2[/* a */ R, /* b */ R, scala.Boolean]): Stream[R] = js.native
  /**
  		 * A convenient form of filter, which returns all objects from a Stream
  		 * match a set of property values.
  		 *
  		 * @id where
  		 * @section Streams
  		 * @name Stream.where(props)
  		 * @param {Object} props - the properties to match against
  		 * @api public
  		 */
  def where(props: js.Object): Stream[R] = js.native
  /**
  		 * Writes a value to the Stream. If the Stream is paused it will go into the
  		 * Stream's incoming buffer, otherwise it will be immediately processed and
  		 * sent to the Stream's consumers (if any). Returns false if the Stream is
  		 * paused, true otherwise. This lets Node's pipe method handle back-pressure.
  		 *
  		 * You shouldn't need to call this yourself, but it may be called by Node
  		 * functions which treat Highland Streams as a [Node Writable Stream](http://nodejs.org/api/stream.html#stream_class_stream_writable).
  		 *
  		 * @id write
  		 * @section Streams
  		 * @name Stream.write(x)
  		 * @param x - the value to write to the Stream
  		 * @api public
  		 */
  def write(x: R): scala.Boolean = js.native
  def zip(ys: Stream[R]): Stream[R] = js.native
  /**
  		 * Takes two Streams and returns a Stream of corresponding pairs.
  		 *
  		 * @id zip
  		 * @section Streams
  		 * @name Stream.zip(ys)
  		 * @param {Array | Stream} ys - the other stream to combine values with
  		 * @api public
  		 */
  def zip(ys: js.Array[R]): Stream[R] = js.native
}

