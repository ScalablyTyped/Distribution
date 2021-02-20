package typings.gotResume

import typings.got.mod.GotOptions
import typings.gotResume.gotResumeStrings.GotResumeCancelError
import typings.gotResume.gotResumeStrings.GotResumeError
import typings.gotResume.gotResumeStrings.GotResumeOptionsError
import typings.gotResume.gotResumeStrings.GotResumePreError
import typings.gotResume.gotResumeStrings.GotResumeTransferError
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Transform
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("got-resume", JSImport.Namespace)
  @js.native
  def apply(options: TransferOptions): TransferStream = js.native
  /**
    * Fetch URL with retries if failure.
    * Returns stream of transfer contents.
    *
    * @param url URL (optional).
    * @param options Options object.
    */
  @JSImport("got-resume", JSImport.Namespace)
  @js.native
  def apply(url: String): TransferStream = js.native
  @JSImport("got-resume", JSImport.Namespace)
  @js.native
  def apply(url: String, options: TransferOptions): TransferStream = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "CancelError")
  @js.native
  class CancelError () extends StObject {
    
    var name: GotResumeCancelError = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "Error")
  @js.native
  class Error () extends StObject {
    
    var name: GotResumeError = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "OptionsError")
  @js.native
  class OptionsError () extends StObject {
    
    var name: GotResumeOptionsError = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("got-resume", "PreError")
  @js.native
  class PreError () extends StObject {
    
    var name: GotResumePreError = js.native
  }
  
  @JSImport("got-resume", "Transfer")
  @js.native
  class Transfer protected () extends StObject {
    def this(options: TransferOptions) = this()
    
    var attempt: Double = js.native
    
    var attemptNumber: Double = js.native
    
    def cancel(): Unit = js.native
    
    var cancelled: Boolean = js.native
    
    /** Error occurred during transfer. */
    var err: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ js.Any
      ] = js.native
    
    var etag: js.UndefOr[String] = js.native
    
    def failed(
      err: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ js.Any,
      empty: Boolean
    ): Unit = js.native
    
    def fatal(): Unit = js.native
    
    def get(): Unit = js.native
    
    var gotOptions: GotOptions[String | Null] = js.native
    
    var lastMod: js.UndefOr[String] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    /** Length of options passed to constructor. */
    def log(args: js.Any*): Unit = js.native
    
    /** Options passed to constructor. */
    var options: TransferOptions = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    /** Promise returned from `options.pre`. */
    var prePromise: js.UndefOr[js.Promise[Unit]] = js.native
    
    /** `got` stream request. */
    var req: js.UndefOr[ClientRequest] = js.native
    
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
  class TransferError () extends StObject {
    
    var name: GotResumeTransferError = js.native
  }
  
  /**
    * Fetch URL and stream to file.
    * Return Promise. Promise resolves/reject once request is complete
    * (successfully or unsuccessfully) and file is closed.
    *
    * @param path File path to write to.
    * @param url URL.
    * @param options Options object (as per stream method).
    */
  @JSImport("got-resume", "toFile")
  @js.native
  def toFile(path: String): js.Promise[Unit] = js.native
  @JSImport("got-resume", "toFile")
  @js.native
  def toFile(path: String, options: ToFileOptions): js.Promise[Unit] = js.native
  @JSImport("got-resume", "toFile")
  @js.native
  def toFile(path: String, url: js.UndefOr[scala.Nothing], options: ToFileOptions): js.Promise[Unit] = js.native
  @JSImport("got-resume", "toFile")
  @js.native
  def toFile(path: String, url: String): js.Promise[Unit] = js.native
  @JSImport("got-resume", "toFile")
  @js.native
  def toFile(path: String, url: String, options: ToFileOptions): js.Promise[Unit] = js.native
  
  @js.native
  trait Progress extends StObject {
    
    var total: Double = js.native
    
    var transferred: Double = js.native
  }
  object Progress {
    
    @scala.inline
    def apply(total: Double, transferred: Double): Progress = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToFileOptions extends TransferOptions {
    
    /** Promise implementation to use (default: Bluebird v2). */
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    
    /** Function called with progress. */
    var onProgress: js.UndefOr[js.Function1[/* progress */ Progress, Unit]] = js.native
    
    /** Function called with HTTP response. */
    var onResponse: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  }
  object ToFileOptions {
    
    @scala.inline
    def apply(): ToFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToFileOptions]
    }
    
    @scala.inline
    implicit class ToFileOptionsMutableBuilder[Self <: ToFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnProgress(value: /* progress */ Progress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnResponse(value: /* res */ js.Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      @scala.inline
      def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
  
  @js.native
  trait TransferOptions extends StObject {
    
    /** Number of attempts to make before failing (0 for no limit). */
    var attempts: js.UndefOr[Double] = js.native
    
    /** Total number of attempts to make before failing (0 for no limit). */
    var attemptsTotal: js.UndefOr[Double] = js.native
    
    /**
      * Function called with `backoff(attempt, transfer)` and should return milliseconds to wait
      * before next attempt.
      */
    var backoff: js.UndefOr[js.Function2[/* attempt */ Double, /* transfer */ Transfer, Double]] = js.native
    
    /** Options to pass to `got` module. */
    var got: js.UndefOr[GotOptions[String | Null]] = js.native
    
    /**
      * Length of transfer
      * (NB is actually range end - does not take into account options.offset).
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Function to call with logging information. */
    var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    /** `true` to disable gzip encoding on first request in order to get length. */
    var needLength: js.UndefOr[Boolean] = js.native
    
    /** Number of bytes at start of file to skip. */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * Function to call before HTTP requests. Is passed `transfer` object, should set
      * `transfer.url` and `transfer.gotOptions` and return a promise.
      */
    var pre: js.UndefOr[js.Function1[/* transfer */ Transfer, js.Promise[Unit]]] = js.native
    
    /** Transform stream to pass result through. */
    var transform: js.UndefOr[Transform] = js.native
    
    /** URL (alternative way to provide). */
    var url: js.UndefOr[String] = js.native
  }
  object TransferOptions {
    
    @scala.inline
    def apply(): TransferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferOptions]
    }
    
    @scala.inline
    implicit class TransferOptionsMutableBuilder[Self <: TransferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsTotal(value: Double): Self = StObject.set(x, "attemptsTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsTotalUndefined: Self = StObject.set(x, "attemptsTotal", js.undefined)
      
      @scala.inline
      def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      @scala.inline
      def setBackoff(value: (/* attempt */ Double, /* transfer */ Transfer) => Double): Self = StObject.set(x, "backoff", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      @scala.inline
      def setGot(value: GotOptions[String | Null]): Self = StObject.set(x, "got", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotUndefined: Self = StObject.set(x, "got", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setNeedLength(value: Boolean): Self = StObject.set(x, "needLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedLengthUndefined: Self = StObject.set(x, "needLength", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPre(value: /* transfer */ Transfer => js.Promise[Unit]): Self = StObject.set(x, "pre", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait TransferStream extends PassThrough {
    
    /** Cancel the stream. */
    def cancel(): Unit = js.native
    
    /** Parent `Transfer` object. */
    var transfer: Transfer = js.native
  }
}
