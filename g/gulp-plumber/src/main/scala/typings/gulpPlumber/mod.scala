package typings.gulpPlumber

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-plumber", JSImport.Namespace)
  @js.native
  val ^ : GulpPlumber = js.native
  
  /** an error handler function to be attached to the stream on('error') */
  type ErrorHandlerFunction = js.Function1[/* error */ js.Any, Unit]
  
  /** Prevent pipe breaking caused by errors from gulp plugins */
  /** Prevent pipe breaking caused by errors from gulp plugins */
  @js.native
  trait GulpPlumber extends StObject {
    
    /**
      * Returns Stream, that fixes pipe methods on Streams that are next in pipeline.
      * 
      * @param options Sets options as described in the Options interface
      */
    def apply(): ReadWriteStream = js.native
    /**
      * Returns Stream, that fixes pipe methods on Streams that are next in pipeline.
      * 
      * @param errorHandler the function to be attached to the stream on('error')
      */
    def apply(errorHandler: ErrorHandlerFunction): ReadWriteStream = js.native
    def apply(options: Options): ReadWriteStream = js.native
    
    /** returns default behaviour for pipeline after it was piped */
    def stop(): ReadWriteStream = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /** 
      * Handle errors in underlying streams and output them to console. Default true.
      * If function passed, it will be attached to stream on('error')
      * If false passed, error handler will not be attached
      * If undefined passed, default error handler will be attached
      */
    var errorHandler: js.UndefOr[ErrorHandlerFunction | Boolean] = js.native
    
    /** Monkeypatch pipe functions in underlying streams in pipeline. Default true. */
    var inherit: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorHandler(value: ErrorHandlerFunction | Boolean): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorHandlerFunction1(value: /* error */ js.Any => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    }
  }
  
  type _To = GulpPlumber
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpPlumber = ^
}
