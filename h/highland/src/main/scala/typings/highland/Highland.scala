package typings.highland

import org.scalablytyped.runtime.StringDictionary
import typings.highland.anon.End
import typings.highland.highlandStrings.done
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import typings.std.Partial
import typings.std.Pick
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Highland {
  
  trait CleanupObject extends StObject {
    
    var continueOnError: js.UndefOr[Boolean] = js.undefined
    
    var onDestroy: js.UndefOr[js.Function] = js.undefined
  }
  object CleanupObject {
    
    @scala.inline
    def apply(): CleanupObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CleanupObject]
    }
    
    @scala.inline
    implicit class CleanupObjectMutableBuilder[Self <: CleanupObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueOnErrorUndefined: Self = StObject.set(x, "continueOnError", js.undefined)
      
      @scala.inline
      def setOnDestroy(value: js.Function): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
    }
  }
  
  type MappingHint = Double | js.Array[String] | js.Function
  
  // hacky unique
  // TODO do we need this?
  trait Nil extends StObject {
    
    var Highland_NIL: Nil
  }
  object Nil {
    
    @scala.inline
    def apply(Highland_NIL: Nil): Nil = {
      val __obj = js.Dynamic.literal(Highland_NIL = Highland_NIL.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nil]
    }
    
    @scala.inline
    implicit class NilMutableBuilder[Self <: Nil] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighland_NIL(value: Nil): Self = StObject.set(x, "Highland_NIL", value.asInstanceOf[js.Any])
    }
  }
  
  type OnFinished = js.Function2[
    /* r */ ReadableStream, 
    /* cb */ js.Function1[/* repeated */ js.Any, Unit], 
    Unit | js.Function | CleanupObject
  ]
  
  trait PipeOptions extends StObject {
    
    var end: Boolean
  }
  object PipeOptions {
    
    @scala.inline
    def apply(end: Boolean): PipeOptions = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipeOptions]
    }
    
    @scala.inline
    implicit class PipeOptionsMutableBuilder[Self <: PipeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    }
  }
  
  type PipeableStream[T, R] = Stream[R]
  
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Actual Stream constructor wrapped the the main exported function
    */
  @js.native
  trait Stream[R]
    extends StObject
       with EventEmitter {
    
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
    def apply(f: js.Function): Unit = js.native
    
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
    def batch(n: Double): Stream[js.Array[R]] = js.native
    
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
    def batchWithTimeOrCount(ms: Double, n: Double): Stream[js.Array[R]] = js.native
    
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
    
    def concat(ys: js.Array[R]): Stream[R] = js.native
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
          /* err */ Error, 
          /* x */ R | Nil, 
          /* push */ js.Function2[/* err */ Error | Null, /* value */ js.UndefOr[U | Nil], Unit], 
          /* next */ js.Function0[Unit], 
          Unit
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
    def debounce(ms: Double): Stream[R] = js.native
    
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
    def destroy(): Unit = js.native
    
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
    def done(f: js.Function0[Unit]): Unit = js.native
    
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
    def doto(f: js.Function1[/* x */ R, Unit]): Stream[R] = js.native
    
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
    def drop(n: Double): Stream[R] = js.native
    
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
    def each(f: js.Function1[/* x */ R, Unit]): Pick[Stream[R], done] = js.native
    
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
    def end(): Unit = js.native
    
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
          /* err */ Error, 
          /* push */ js.Function2[/* err */ Error | Null, /* x */ js.UndefOr[R], Unit], 
          Unit
        ]
    ): Stream[R] = js.native
    
    def filter(f: js.Function1[/* x */ R, Boolean]): Stream[R] = js.native
    /**
      * Creates a new Stream including only the values which pass a truth test.
      *
      * @id filter
      * @section Streams
      * @name Stream.filter(f)
      * @param f - the truth test function
      * @api public
      */
    @JSName("filter")
    def filter_S_R[S /* <: R */](f: js.Function1[/* x */ R, /* is S */ Boolean]): Stream[S] = js.native
    
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
    def find(f: js.Function1[/* x */ R, Boolean]): Stream[R] = js.native
    
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
    def findWhere(props: Partial[R]): Stream[R] = js.native
    
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
    def flatFilter(f: js.Function1[/* x */ R, Stream[Boolean]]): Stream[R] = js.native
    
    /**
      * Creates a new Stream of values by applying each item in a Stream to an
      * iterator function which must return a (possibly empty) Stream. Each
      * item on these result Streams are then emitted on a single output Stream.
      *
      * This transform is functionally equivalent to `.map(f).sequence()`.
      *
      * @id flatMap
      * @section Streams
      * @name Stream.flatMap(f)
      * @param {Function} f - the iterator function
      * @api public
      */
    def flatMap[U](f: js.Function1[/* x */ R, Stream[U] | U]): Stream[U] = js.native
    
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
    def flatten[U /* <: Flattened[R] */](): Stream[U] = js.native
    
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
    def group(f: js.Function1[/* x */ R, String]): Stream[StringDictionary[js.Array[R]]] = js.native
    def group(prop: String): Stream[StringDictionary[js.Array[R]]] = js.native
    
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
      * Creates a new Stream with the separator interspersed between the elements of the source.
      *
      * `intersperse` is effectively the inverse of [splitBy](#splitBy).
      *
      * @id intersperse
      * @section Transforms
      * @name Stream.intersperse(sep)
      * @param {R} separator - the value to intersperse between the source elements
      * @api public
      */
    def intersperse[U](separator: U): Stream[R | U] = js.native
    
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
    def invoke[U](method: String, args: js.Array[js.Any]): Stream[U] = js.native
    
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
    def merge[U](): Stream[U] = js.native
    
    /**
      * Takes a Stream of Streams and merges their values and errors into a
      * single new Stream, limitting the number of unpaused streams that can
      * running at any one time.
      *
      * Note that no guarantee is made with respect to the order in which
      * values for each stream end up in the merged stream. Values in the
      * merged stream will, however, respect the order they were emitted from
      * their respective streams.
      *
      * @id mergeWithLimit
      * @section Higher-order Streams
      * @name Stream.mergeWithLimit(n)
      * @param {Number} n - the maximum number of streams to run in parallel
      * @api public
      *
      * var readFile = _.wrapCallback(fs.readFile);
      *
      * var txt = _(['foo.txt', 'bar.txt']).flatMap(readFile)
      * var md = _(['baz.md']).flatMap(readFile)
      * var js = _(['bosh.js']).flatMap(readFile)
      *
      * _([txt, md, js]).mergeWithLimit(2);
      * // => contents of foo.txt, bar.txt, baz.txt and bosh.js in the order
      * // they were read, but bosh.js is not read until either foo.txt and bar.txt
      * // has completely been read or baz.md has been read
      */
    def mergeWithLimit[U](n: Double): Stream[U] = js.native
    
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
    def parallel[U](n: Double): Stream[U] = js.native
    
    /**
      * Pauses the stream. All Highland Streams start in the paused state.
      *
      * @id pause
      * @section Streams
      * @name Stream.pause()
      * @api public
      */
    def pause(): Unit = js.native
    
    /**
      *
      * Retrieves copies of all elements in the collection,
      * with only the whitelisted keys. If one of the whitelisted
      * keys does not exist, it will be ignored.
      *
      * @id pick
      * @section Transforms
      * @name Stream.pick(properties)
      * @param {Array} properties - property names to white filter
      * @api public
      */
    def pick[Prop /* <: /* keyof R */ String */](props: js.Array[Prop]): Stream[Pick[R, Prop]] = js.native
    
    /**
      *
      * Retrieves copies of all the elements in the collection
      * that satisfy a given predicate. Note: When using ES3,
      * only enumerable elements are selected. Both enumerable
      * and non-enumerable elements are selected when using ES5.
      *
      * @id pickBy
      * @section Transforms
      * @name Stream.pickBy(f)
      * @param {Function} f - the predicate function
      * @api public
      */
    def pickBy[Prop /* <: /* keyof R */ String */](
      f: js.Function2[
          /* key */ Prop, 
          /* import warning: importer.ImportType#apply Failed type conversion: R[Prop] */ /* value */ js.Any, 
          Boolean
        ]
    ): Stream[Partial[R]] = js.native
    
    def pipe[U /* <: WritableStream */](dest: U): U = js.native
    def pipe[U /* <: WritableStream */](dest: U, options: End): U = js.native
    /**
      * Pipes a Highland Stream to a [Node Writable
      * Stream](http://nodejs.org/api/stream.html#stream_class_stream_writable).
      * This will pull all the data from the source Highland Stream and write it to
      * the destination, automatically managing flow so that the destination is not
      * overwhelmed by a fast source.
      *
      * Users may optionally pass an object that may contain any of these fields:
      *
      * - `end` - Ends the destination when this stream ends. Default: `true`. This
      *   option has no effect if the destination is either `process.stdout` or
      *   `process.stderr`. Those two streams are never ended.
      *
      * Like [Readable#pipe](https://nodejs.org/api/stream.html#stream_readable_pipe_destination_options),
      * this function will throw errors if there is no `error` handler installed on
      * the stream.
      *
      * This function returns the destination so you can chain together `pipe` calls.
      *
      * **NOTE**: While Highland streams created via `_()` and [pipeline](#pipeline)
      * support being piped to, it is almost never appropriate to `pipe` from a
      * Highland stream to another Highland stream. Those two cases are meant for
      * use when piping from *Node* streams. You might be tempted to use `pipe` to
      * construct reusable transforms. Do not do it. See [through](#through) for a
      * better way.
      *
      * @id pipe
      * @section Consumption
      * @name Stream.pipe(dest, options)
      * @param {Writable Stream} dest - the destination to write all data to
      * @param {Object} options - (optional) pipe options.
      * @api public
      */
    def pipe[U](dest: Stream[U]): Stream[U] = js.native
    
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
    def pluck[Prop /* <: /* keyof R */ String */](prop: Prop): Stream[
        /* import warning: importer.ImportType#apply Failed type conversion: R[Prop] */ js.Any
      ] = js.native
    def pluck[U](prop: String): Stream[U] = js.native
    
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
    def pull(f: js.Function2[/* err */ Error, /* x */ R, Unit]): Unit = js.native
    
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
    def ratelimit(num: Double, ms: Double): Stream[R] = js.native
    
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
    def reduce[U](memo: U, iterator: js.Function2[/* memo */ U, /* x */ R, U]): Stream[U] = js.native
    
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
    def reduce1[U](iterator: js.Function2[/* memo */ R | U, /* x */ R, U]): Stream[U] = js.native
    
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
    def reject(f: js.Function1[/* x */ R, Boolean]): Stream[R] = js.native
    
    /**
      * Resumes a paused Stream. This will either read from the Stream's incoming
      * buffer or request more data from an upstream source.
      *
      * @id resume
      * @section Streams
      * @name Stream.resume()
      * @api public
      */
    def resume(): Unit = js.native
    
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
    def scan[U](memo: U, iterator: js.Function2[/* memo */ U, /* x */ R, U]): Stream[U] = js.native
    
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
    def scan1[U](iterator: js.Function2[/* memo */ R | U, /* x */ R, U]): Stream[U] = js.native
    
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
    def sequence[U](): Stream[U] = js.native
    
    /**
      * An alias for the [sequence](#sequence) method.
      *
      * @id series
      * @section Streams
      * @name Stream.series()
      * @api public
      */
    def series[U](): Stream[U] = js.native
    
    /**
      * Creates a new Stream with the values from the source in the range of `start` (inclusive) to `end` (exclusive).
      * `start` and `end` must be of type `Number`, if `start` is not a `Number` it will default to `0`
      * and, likewise, `end` will default to `Infinity`: this could result in the whole stream being be
      * returned.
      *
      * @id slice
      * @section Transforms
      * @name Stream.slice(start, end)
      * @param {Number} start - integer representing index to start reading from source (inclusive)
      * @param {Number} end - integer representing index to stop reading from source (exclusive)
      * @api public
      */
    def slice(start: Double, end: Double): Stream[R] = js.native
    
    /**
      * Collects all values together then emits each value individually but in sorted order.
      * The method for sorting the elements is ascending lexical.
      *
      * @id sort
      * @section Transforms
      * @name Stream.sort()
      * @api public
      *
      * var sorted = _(['b', 'z', 'g', 'r']).sort().toArray(_.log);
      * // => ['b', 'g', 'r', 'z']
      */
    def sort(): Stream[R] = js.native
    
    /**
      * Collects all values together then emits each value individually in sorted
      * order. The method for sorting the elements is defined by the comparator
      * function supplied as a parameter.
      *
      * The comparison function takes two arguments `a` and `b` and should return
      *
      * - a negative number if `a` should sort before `b`.
      * - a positive number if `a` should sort after `b`.
      * - zero if `a` and `b` may sort in any order (i.e., they are equal).
      *
      * This function must also define a [partial
      * order](https://en.wikipedia.org/wiki/Partially_ordered_set). If it does not,
      * the resulting ordering is undefined.
      *
      * @id sortBy
      * @section Transforms
      * @name Stream.sortBy(f)
      * @param {Function} f - the comparison function
      * @api public
      */
    def sortBy(f: js.Function2[/* a */ R, /* b */ R, Double]): Stream[R] = js.native
    
    /**
      * [splitBy](#splitBy) over newlines.
      *
      * @id split
      * @section Transforms
      * @name Stream.split()
      * @api public
      */
    def split(): Stream[String] = js.native
    
    /**
      * Splits the source Stream by a separator and emits the pieces in between, much like splitting a string.
      *
      * `splitBy` is effectively the inverse of [intersperse](#intersperse).
      *
      * @id splitBy
      * @section Transforms
      * @name Stream.splitBy(sep)
      * @param {String | RegExp} sep - the separator to split on
      * @api public
      */
    def splitBy(sep: String): Stream[String] = js.native
    def splitBy(sep: RegExp): Stream[String] = js.native
    
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
    def stopOnError(f: js.Function1[/* err */ Error, Unit]): Stream[R] = js.native
    
    /**
      * Creates a new Stream with the first `n` values from the source.
      *
      * @id take
      * @section Streams
      * @name Stream.take(n)
      * @param {Number} n - integer representing number of values to read from source
      * @api public
      */
    def take(n: Double): Stream[R] = js.native
    
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
    def tap(f: js.Function1[/* x */ R, Unit]): Stream[R] = js.native
    
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
    def throttle(ms: Double): Stream[R] = js.native
    
    def through(thru: ReadWriteStream): Stream[js.Any] = js.native
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
    def through[U](f: js.Function1[/* x */ Stream[R], U]): U = js.native
    
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
    def toArray(f: js.Function1[/* arr */ js.Array[R], Unit]): Unit = js.native
    
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
    def toCallback(cb: js.Function2[/* err */ js.UndefOr[Error], /* x */ js.UndefOr[R], Unit]): Unit = js.native
    
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
    def toNodeStream(): ReadableStream = js.native
    def toNodeStream(options: js.Object): ReadableStream = js.native
    
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
    def toPromise[P /* <: js.Thenable[R] */](PromiseCtor: PConstructor[R, P]): P = js.native
    
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
    def uniqBy(f: js.Function2[/* a */ R, /* b */ R, Boolean]): Stream[R] = js.native
    
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
    def where(props: Partial[R]): Stream[R] = js.native
    
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
    def write(x: R): Boolean = js.native
    
    /**
      * Takes two Streams and returns a Stream of corresponding pairs.
      *
      * @id zip
      * @section Streams
      * @name Stream.zip(ys)
      * @param {Array | Stream} ys - the other stream to combine values with
      * @api public
      */
    def zip[U](ys: js.Array[U]): Stream[js.Tuple2[R, U]] = js.native
    def zip[U](ys: Stream[U]): Stream[js.Tuple2[R, U]] = js.native
    
    /**
      * Takes a stream and a *finite* stream of `N` streams
      * and returns a stream of the corresponding `(N+1)`-tuples.
      *
      * *Note:* This transform will be renamed `zipEach` in the next major version
      * release.
      *
      * @id zipAll
      * @section Higher-order Streams
      * @name Stream.zipAll(ys)
      * @param {Array | Stream} ys - the array of streams to combine values with
      * @api public
      */
    def zipAll[U](ys: js.Array[js.Array[U]]): Stream[js.Array[R | U]] = js.native
    def zipAll[U](ys: Stream[js.Array[U] | Stream[U]]): Stream[js.Array[R | U]] = js.native
    
    /**
      * Takes a *finite* stream of streams and returns a stream where the first
      * element from each separate stream is combined into a single data event,
      * followed by the second elements of each stream and so on until the shortest
      * input stream is exhausted.
      *
      * *Note:* This transform will be renamed `zipAll` in the next major version
      * release.
      *
      * @id zipAll0
      * @section Higher-order Streams
      * @name Stream.zipAll0()
      * @api public
      */
    def zipAll0[T](): Stream[js.Array[T]] = js.native
  }
  
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Used as an Error marker when writing to a Stream's incoming buffer
    */
  // TODO is this public?
  trait StreamError extends StObject {
    
    var error: Error
  }
  object StreamError {
    
    @scala.inline
    def apply(error: Error): StreamError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamError]
    }
    
    @scala.inline
    implicit class StreamErrorMutableBuilder[Self <: StreamError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Used as a Redirect marker when writing to a Stream's incoming buffer
    */
  // TODO is this public?
  trait StreamRedirect[R] extends StObject {
    
    var to: Stream[R]
  }
  object StreamRedirect {
    
    @scala.inline
    def apply[R](to: Stream[R]): StreamRedirect[R] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamRedirect[R]]
    }
    
    @scala.inline
    implicit class StreamRedirectMutableBuilder[Self <: StreamRedirect[?], R] (val x: Self & StreamRedirect[R]) extends AnyVal {
      
      @scala.inline
      def setTo(value: Stream[R]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
