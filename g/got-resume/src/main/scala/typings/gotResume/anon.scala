package typings.gotResume

import typings.gotResume.mod.Progress
import typings.gotResume.mod.TimeoutSpec
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined got-resume.got-resume.ToFileOptions & std.Partial<got-resume.got-resume.WithUrl> */
  trait ToFileOptionsPartialWithU extends StObject {
    
    /**
      * Promise implementation to use.
      *
      * @default Bluebird v2
      */
    var Promise: js.UndefOr[Any] = js.undefined
    
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
    var backoff: js.UndefOr[js.Function2[/* attempt */ Double, /* transfer */ this.type, Double]] = js.undefined
    
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
      * Handler for `progress` event.
      */
    var onProgress: js.UndefOr[js.Function1[/* progress */ Progress, Unit]] = js.undefined
    
    /**
      * Handler for `response` event.
      */
    var onResponse: js.UndefOr[js.Function1[/* res */ IncomingMessage, Unit]] = js.undefined
    
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
          /* transfer */ this.type, 
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
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ToFileOptionsPartialWithU {
    
    inline def apply(): ToFileOptionsPartialWithU = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToFileOptionsPartialWithU]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToFileOptionsPartialWithU] (val x: Self) extends AnyVal {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setAttemptsTotal(value: Double): Self = StObject.set(x, "attemptsTotal", value.asInstanceOf[js.Any])
      
      inline def setAttemptsTotalUndefined: Self = StObject.set(x, "attemptsTotal", js.undefined)
      
      inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      inline def setBackoff(value: (/* attempt */ Double, ToFileOptionsPartialWithU) => Double): Self = StObject.set(x, "backoff", js.Any.fromFunction2(value))
      
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
      
      inline def setOnProgress(value: /* progress */ Progress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnResponse(value: /* res */ IncomingMessage => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
      
      inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      inline def setPre(
        value: ToFileOptionsPartialWithU => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Promise<void> */ Any
      ): Self = StObject.set(x, "pre", js.Any.fromFunction1(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setPromise(value: Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setTimeout(value: Double | TimeoutSpec): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
