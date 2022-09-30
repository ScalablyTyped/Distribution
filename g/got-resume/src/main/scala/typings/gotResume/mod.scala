package typings.gotResume

import typings.gotResume.anon.ToFileOptionsPartialWithU
import typings.gotResume.gotResumeStrings.GotResumeCancelError
import typings.gotResume.gotResumeStrings.GotResumeError
import typings.gotResume.gotResumeStrings.GotResumeOptionsError
import typings.gotResume.gotResumeStrings.GotResumePreError
import typings.gotResume.gotResumeStrings.GotResumeTransferError
import typings.gotResume.gotResumeStrings.end
import typings.gotResume.gotResumeStrings.error
import typings.gotResume.gotResumeStrings.progress
import typings.gotResume.gotResumeStrings.response
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: TransferOptionsWithUrl): TransferStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[TransferStream]
  /**
    * Use [`got`](https://www.npmjs.com/package/got) to make an HTTP request with automatic retries for network errors.
    *
    * Designed for downloading large files. If transfer fails part-way through, will retry, resuming from point where
    * previous attempt finished, using HTTP range headers.
    *
    * @param url URL.
    * @param options Options object.
    *
    * @example
    * import gotResume = require('got-resume');
    * import fs from 'fs';
    *
    * const stream = gotResume('http://google.com/');
    * stream.pipe(fs.createWriteStream('foo.html'));
    *
    * stream.on('error', err => console.log('Failed!'));
    * stream.on('end', () => console.log('Finished!'));
    */
  inline def apply(url: String): TransferStream = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[TransferStream]
  inline def apply(url: String, options: TransferOptions): TransferStream = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransferStream]
  
  @JSImport("got-resume", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "CancelError")
  @js.native
  open class CancelError () extends StObject {
    
    var name: GotResumeCancelError = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "Error")
  @js.native
  open class Error () extends StObject {
    
    var name: GotResumeError = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "OptionsError")
  @js.native
  open class OptionsError () extends StObject {
    
    var name: GotResumeOptionsError = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "PreError")
  @js.native
  open class PreError () extends StObject {
    
    var name: GotResumePreError = js.native
  }
  
  @JSImport("got-resume", "Transfer")
  @js.native
  open class Transfer protected () extends StObject {
    def this(options: ToFileOptions) = this()
    
    var attempt: Double = js.native
    
    var attemptTotal: Double = js.native
    
    def cancel(): Unit = js.native
    
    var cancelled: Boolean = js.native
    
    /** Error occurred during transfer. */
    var err: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any
      ] = js.native
    
    var etag: js.UndefOr[String] = js.native
    
    def failed(
      err: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any,
      empty: Boolean
    ): Unit = js.native
    
    def fatal(): Unit = js.native
    
    def get(): Unit = js.native
    
    var gotOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotOptions<string | null> */ Any = js.native
    
    var idleTimeout: js.UndefOr[Double] = js.native
    
    var lastMod: js.UndefOr[String] = js.native
    
    /** Length of options passed to constructor. */
    var length: js.UndefOr[Double] = js.native
    
    def log(args: Any*): Unit = js.native
    
    /** Options passed to constructor. */
    var options: ToFileOptionsPartialWithU = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    /** Promise returned from `options.pre`. */
    var prePromise: js.UndefOr[typings.bluebird.mod.^[Unit]] = js.native
    
    /** `got` stream request. */
    var req: js.UndefOr[ClientRequest] = js.native
    
    var requestEventFired: Boolean = js.native
    
    /** `got` stream response. */
    var res: js.UndefOr[IncomingMessage] = js.native
    
    def start(): Unit = js.native
    
    /** Output stream. */
    var stream: TransferStream = js.native
    
    var total: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    /** Timeout. */
    var waitTimer: js.UndefOr[Double] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "TransferError")
  @js.native
  open class TransferError () extends StObject {
    
    var name: GotResumeTransferError = js.native
  }
  
  inline def toFile(path: String, options: ToFileOptionsWithUrl): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  /**
    * Fetch URL and stream to file.
    * Return Promise. Promise resolves/reject once request is complete
    * (successfully or unsuccessfully) and file is closed.
    *
    * Promise only resolves (or rejects in case of an error) once transfer is ended and output file is closed.
    *
    * Promise is a Bluebird v2 promise. Bluebird v2 is used due to its cancellation feature.
    *
    * @param path File path to write to.
    * @param url URL.
    * @param options Options object (as per stream method).
    *
    * @example
    * import gotResume = require('got-resume');
    *
    * gotResume.toFile('google.html', 'http://google.com/')
    *   .then(() => console.log('Finished!'))
    *   .catch(err => console.log('Failed!'));
    */
  inline def toFile(path: String, url: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def toFile(path: String, url: String, options: ToFileOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  trait Progress extends StObject {
    
    var total: Double
    
    var transferred: Double
  }
  object Progress {
    
    inline def apply(total: Double, transferred: Double): Progress = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeoutSpec extends StObject {
    
    var connect: js.UndefOr[Double] = js.undefined
    
    var idle: js.UndefOr[Double] = js.undefined
    
    var lookup: js.UndefOr[Double] = js.undefined
    
    var request: js.UndefOr[Double] = js.undefined
    
    var response: js.UndefOr[Double] = js.undefined
    
    var secureConnect: js.UndefOr[Double] = js.undefined
    
    var send: js.UndefOr[Double] = js.undefined
    
    var socket: js.UndefOr[Double] = js.undefined
  }
  object TimeoutSpec {
    
    inline def apply(): TimeoutSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeoutSpec]
    }
    
    extension [Self <: TimeoutSpec](x: Self) {
      
      inline def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
      
      inline def setLookup(value: Double): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setSecureConnect(value: Double): Self = StObject.set(x, "secureConnect", value.asInstanceOf[js.Any])
      
      inline def setSecureConnectUndefined: Self = StObject.set(x, "secureConnect", js.undefined)
      
      inline def setSend(value: Double): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
      
      inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
      
      inline def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait ToFileOptions
    extends StObject
       with TransferOptions {
    
    /**
      * Promise implementation to use.
      *
      * @default Bluebird v2
      */
    var Promise: js.UndefOr[Any] = js.undefined
    
    /**
      * Handler for `progress` event.
      */
    var onProgress: js.UndefOr[js.Function1[/* progress */ Progress, Unit]] = js.undefined
    
    /**
      * Handler for `response` event.
      */
    var onResponse: js.UndefOr[js.Function1[/* res */ IncomingMessage, Unit]] = js.undefined
  }
  object ToFileOptions {
    
    inline def apply(): ToFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToFileOptions]
    }
    
    extension [Self <: ToFileOptions](x: Self) {
      
      inline def setOnProgress(value: /* progress */ Progress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnResponse(value: /* res */ IncomingMessage => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
      
      inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      inline def setPromise(value: Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
  
  trait ToFileOptionsWithUrl
    extends StObject
       with ToFileOptions
       with WithUrl
  object ToFileOptionsWithUrl {
    
    inline def apply(url: String): ToFileOptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToFileOptionsWithUrl]
    }
  }
  
  trait TransferOptions extends StObject {
    
    /**
      * Max number of attempts in a row yielding no data (i.e. failed connection, empty response) before aborting.
      *
      * Set to `0` for no limit.
      *
      * @default 10
      *
      * @example
      * import gotResume = require('got-resume');
      *
      * const stream = gotResume('http://google.com/', { attempts: 0 });
      */
    var attempts: js.UndefOr[Double] = js.undefined
    
    /**
      * Max number of total attempts before aborting.
      *
      * Set to `0` for no limit.
      *
      * @default 0
      */
    var attemptsTotal: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to determine wait in milliseconds before retry.
      *
      * If function returns `false`, the transfer is aborted. If using this mechanism,
      * `options.attempts` should be set to `0` so it does not interfere.
      *
      * If not provided, default backoff function starts with 1000ms and doubles each time:
      *
      * ```
      * (attempt) => return Math.pow(2, attempt - 1) * 1000
      * ```
      *
      * @param attempt Attempt number for current chunk (reset to zero when a new chunk is successfully received).
      * @param transfer The internal `Transfer` object.
      */
    var backoff: js.UndefOr[js.Function2[/* attempt */ Double, /* transfer */ Transfer, Double]] = js.undefined
    
    /**
      * Options to pass to `got`. See [got documentation](https://www.npmjs.com/package/got) for
      * details.
      *
      * @example
      * import gotResume = require('got-resume');
      *
      * const stream = gotResume('http://google.com/', { got: { method: 'POST' } });
      */
    var got: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotOptions<string | null> */ Any
      ] = js.undefined
    
    /**
      * Length of response expected in bytes. If `undefined`, `length` will be determined
      * from HTTP `content-length` header.
      *
      * If server does not provide `content-length` header, and `options.length` is not set,
      * transfer will be considered complete when first successful response completes.
      *
      * If `options.length` is set, only that number of bytes will be fetched (i.e. file
      * will be truncated).
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to receive logging information e.g. HTTP responses.
      *
      * @example
      * import gotResume = require('got-resume');
      *
      * const stream = gotResume('http://google.com/', { log: console.log });
      */
    var log: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /**
      * Set to `true` if you require the length of the transfer to be retrieved at start of the
      * transfer.
      *
      * Explanation: By default `got` will use transfer encoding (e.g. gzip). This makes the
      * `content-length` HTTP header unreliable. Setting `options.needLength` disables encoding
      * so length should be retrieved accurately (if server provides it).
      *
      * @default false
      */
    var needLength: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of bytes at start of resource to skip.
      *
      * NB Number of bytes to be streamed is `length - offset`. i.e. `length` is actually not
      * length of response, but end of range, e.g. `{offset: 5, length: 10}` will stream 5 bytes.
      *
      * @default 0
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * An async function that is run before each chunk request. Request will commence once
      * returned promise resolves.
      *
      * Useful where some authentication requires being set up before the transfer HTTP request,
      * or where resource has a different URL each time (e.g. some file transfer services).
      *
      * @param transfer Then internal `Transfer` object. To set URL for next chunk, `pre` should
      * set `transfer.url`. To alter `got` options, `pre` should set `transfer.gotOptions`.
      *
      * @example
      * import gotResume = require('got-resume');
      *
      * const stream = gotResume({
      *   url: 'http://google.com/',
      *   pre: (transfer) => {
      *     transfer.gotOptions.headers['user-agent'] = 'Stealth 2.0';
      *     return Promise.resolve();
      *   }
      * });
      */
    var pre: js.UndefOr[
        js.Function1[
          /* transfer */ Transfer, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Promise<void> */ Any
        ]
      ] = js.undefined
    
    /**
      * Timeout in milliseconds.
      *
      * To disable timeouts, set to `null`.
      *
      * Timeout is for each chunk, not the whole tranfer. After a timeout, the transfer will
      * retry until max attempts are exhausted.
      *
      * `timeout` can also be an object specifying timeouts for different parts of the
      * request/response cycle individually. The timeouts will be set for all properties that
      * are provided, the ones that are omitted will remain `undefined`.
      *
      * All above timeout options are passed to [`got`](https://www.npmjs.com/package/got)
      * (see [here](https://www.npmjs.com/package/got#timeout)), except for `idle`. `idle` is
      * time to wait before aborting chunk if transfer stalls (no data received in specifie
      * time).
      *
      * @default 5000
      *
      * @example
      * import gotResume = require('got-resume');
      *
      * const stream = gotResume({
      *   url: 'http://google.com/',
      *   timeout: {
      *     lookup: 1000,
      *     connect: 1000,
      *     secureConnect: 1000,
      *     socket: 1000,
      *     response: 1000,
      *     send: 1000,
      *     request: undefined,
      *     idle: 10000
      *   }
      * });
      */
    var timeout: js.UndefOr[Double | TimeoutSpec | Null] = js.undefined
    
    /**
      * Transform stream through which download stream is passed before being returned.
      *
      * @example
      * import gotResume = require('got-resume');
      * import zlib from 'zlib';
      *
      * await gotResume.toFile(
      *   'google.html.gz',
      *   'http://google.com/',
      *   { transform: zlib.createGzip() }
      * );
      */
    var transform: js.UndefOr[Transform] = js.undefined
  }
  object TransferOptions {
    
    inline def apply(): TransferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferOptions]
    }
    
    extension [Self <: TransferOptions](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setAttemptsTotal(value: Double): Self = StObject.set(x, "attemptsTotal", value.asInstanceOf[js.Any])
      
      inline def setAttemptsTotalUndefined: Self = StObject.set(x, "attemptsTotal", js.undefined)
      
      inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      inline def setBackoff(value: (/* attempt */ Double, /* transfer */ Transfer) => Double): Self = StObject.set(x, "backoff", js.Any.fromFunction2(value))
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setGot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotOptions<string | null> */ Any
      ): Self = StObject.set(x, "got", value.asInstanceOf[js.Any])
      
      inline def setGotUndefined: Self = StObject.set(x, "got", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setNeedLength(value: Boolean): Self = StObject.set(x, "needLength", value.asInstanceOf[js.Any])
      
      inline def setNeedLengthUndefined: Self = StObject.set(x, "needLength", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPre(
        value: /* transfer */ Transfer => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Promise<void> */ Any
      ): Self = StObject.set(x, "pre", js.Any.fromFunction1(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setTimeout(value: Double | TimeoutSpec): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait TransferOptionsWithUrl
    extends StObject
       with TransferOptions
       with WithUrl
  object TransferOptionsWithUrl {
    
    inline def apply(url: String): TransferOptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferOptionsWithUrl]
    }
  }
  
  @js.native
  trait TransferStream extends PassThrough {
    
    /**
      * Emitted when transfer completes.
      *
      * **NB** Is also emitted after error event if transfer fails.
      */
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Any]): TransferStream = js.native
    /**
      * Emitted with a `TransferError` on stream when transfer fails and has exhausted retries.
      */
    @JSName("addListener")
    def addListener_error(
      event: error,
      listener: js.Function1[
          /* error */ TransferError | CancelError | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any), 
          Any
        ]
    ): TransferStream = js.native
    /**
      * Emitted when data received.
      */
    @JSName("addListener")
    def addListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Any]): TransferStream = js.native
    /**
      * Emitted when first HTTP request made to server.
      *
      * **NB** Not emitted again for each retry HTTP request. You cannot abort the transfer
      * with `request.abort()` as the request may be finished if a retry has happened.
      *
      * Useful for e.g. determining length of transfer.
      *
      * @example
      * import gotResume = require('got-resume');
      *
      * const stream = gotResume('http://google.com/');
      * stream.on('response', res => console.log('Length: ', stream.transfer.length));
      */
    @JSName("addListener")
    def addListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Any]): TransferStream = js.native
    
    /**
      * Calling `.cancel()` will abort the transfer and cause the stream to emit an `error`
      * event with a `CancelError`.
      *
      * If the transfer is complete before `.cancel()` is called, no `error` event will be
      * emitted.
      *
      * If `options.pre` function is supplied and `.cancel()` is called while `options.pre` is
      * running, `.cancel()` method on the promise returned by `options.pre` will be called if
      * it exists. Otherwise the transfer will abort once the promise resolves.
      */
    def cancel(): Unit = js.native
    
    @JSName("off")
    def off_end(event: end, listener: js.Function0[Any]): TransferStream = js.native
    @JSName("off")
    def off_error(
      event: error,
      listener: js.Function1[
          /* error */ TransferError | CancelError | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any), 
          Any
        ]
    ): TransferStream = js.native
    @JSName("off")
    def off_progress(event: progress, listener: js.Function1[/* progress */ Progress, Any]): TransferStream = js.native
    @JSName("off")
    def off_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Any]): TransferStream = js.native
    
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Any]): TransferStream = js.native
    @JSName("on")
    def on_error(
      event: error,
      listener: js.Function1[
          /* error */ TransferError | CancelError | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any), 
          Any
        ]
    ): TransferStream = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* progress */ Progress, Any]): TransferStream = js.native
    @JSName("on")
    def on_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Any]): TransferStream = js.native
    
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Any]): TransferStream = js.native
    @JSName("once")
    def once_error(
      event: error,
      listener: js.Function1[
          /* error */ TransferError | CancelError | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any), 
          Any
        ]
    ): TransferStream = js.native
    @JSName("once")
    def once_progress(event: progress, listener: js.Function1[/* progress */ Progress, Any]): TransferStream = js.native
    @JSName("once")
    def once_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Any]): TransferStream = js.native
    
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Any]): TransferStream = js.native
    @JSName("prependListener")
    def prependListener_error(
      event: error,
      listener: js.Function1[
          /* error */ TransferError | CancelError | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any), 
          Any
        ]
    ): TransferStream = js.native
    @JSName("prependListener")
    def prependListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Any]): TransferStream = js.native
    @JSName("prependListener")
    def prependListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Any]): TransferStream = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Any]): TransferStream = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(
      event: error,
      listener: js.Function1[
          /* error */ TransferError | CancelError | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any), 
          Any
        ]
    ): TransferStream = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Any]): TransferStream = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Any]): TransferStream = js.native
    
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Any]): TransferStream = js.native
    @JSName("removeListener")
    def removeListener_error(
      event: error,
      listener: js.Function1[
          /* error */ TransferError | CancelError | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ Any), 
          Any
        ]
    ): TransferStream = js.native
    @JSName("removeListener")
    def removeListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Any]): TransferStream = js.native
    @JSName("removeListener")
    def removeListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Any]): TransferStream = js.native
    
    /**
      * Parent `Transfer` object.
      */
    var transfer: Transfer = js.native
  }
  
  trait WithUrl extends StObject {
    
    /**
      * Alternative way to provide URL.
      *
      * @example
      * import gotResume = require('got-resume');
      *
      * const stream = gotResume({ url: 'http://google.com/' });
      */
    var url: String
  }
  object WithUrl {
    
    inline def apply(url: String): WithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithUrl]
    }
    
    extension [Self <: WithUrl](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
