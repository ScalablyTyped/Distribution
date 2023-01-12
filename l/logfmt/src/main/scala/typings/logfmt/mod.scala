package typings.logfmt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.logfmt.anon.ContentType
import typings.logfmt.anon.Contentlength
import typings.logfmt.anon.Delimiter
import typings.logfmt.anon.End
import typings.node.NodeJS.ReadWriteStream
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("logfmt", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Logfmt
  @JSImport("logfmt", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LogfmtStatic = js.native
  
  type HTTPHandler = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Any
  ]
  
  @js.native
  trait Logfmt extends StObject {
    
    def bodyParser(): HTTPHandler = js.native
    def bodyParser(options: ContentType): HTTPHandler = js.native
    
    def bodyParserStream(): HTTPHandler = js.native
    def bodyParserStream(options: ContentType): HTTPHandler = js.native
    
    def error(err: js.Error): Unit = js.native
    def error(err: js.Error, id: String): Unit = js.native
    
    def log(): Unit = js.native
    def log(data: js.Object): Unit = js.native
    def log(data: js.Object, stream: WritableStream): Unit = js.native
    def log(data: Unit, stream: WritableStream): Unit = js.native
    
    var maxErrorLines: Double = js.native
    
    def namespace(data: js.Object): Logfmt = js.native
    
    def parse(line: String): js.Object = js.native
    
    def requestLogger(): HTTPHandler = js.native
    def requestLogger(formatter: RequestLoggerFormatter): HTTPHandler = js.native
    def requestLogger(options: Unit, formatter: RequestLoggerFormatter): HTTPHandler = js.native
    def requestLogger(options: RequestLoggerOptions): HTTPHandler = js.native
    def requestLogger(options: RequestLoggerOptions, formatter: RequestLoggerFormatter): HTTPHandler = js.native
    @JSName("requestLogger")
    var requestLogger_Original: RequestLogger = js.native
    
    var stream: WritableStream = js.native
    
    def streamParser(): ReadWriteStream = js.native
    def streamParser(options: End): ReadWriteStream = js.native
    
    def streamStringify(): ReadWriteStream = js.native
    def streamStringify(options: Delimiter): ReadWriteStream = js.native
    
    def stringify(data: js.Object): String = js.native
    
    def time(): Logfmt = js.native
    def time(label: String): Logfmt = js.native
  }
  
  @js.native
  trait LogfmtStatic
    extends StObject
       with Logfmt
       with Instantiable0[Logfmt]
  
  @js.native
  trait RequestLogger extends StObject {
    
    def apply(): HTTPHandler = js.native
    def apply(formatter: RequestLoggerFormatter): HTTPHandler = js.native
    def apply(options: Unit, formatter: RequestLoggerFormatter): HTTPHandler = js.native
    def apply(options: RequestLoggerOptions): HTTPHandler = js.native
    def apply(options: RequestLoggerOptions, formatter: RequestLoggerFormatter): HTTPHandler = js.native
    
    def commonFormatter(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Contentlength = js.native
  }
  
  type RequestLoggerFormatter = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], js.Object]
  
  trait RequestLoggerOptions extends StObject {
    
    var elapsed: js.UndefOr[String] = js.undefined
    
    var immediate: js.UndefOr[Boolean] = js.undefined
  }
  object RequestLoggerOptions {
    
    inline def apply(): RequestLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestLoggerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestLoggerOptions] (val x: Self) extends AnyVal {
      
      inline def setElapsed(value: String): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setElapsedUndefined: Self = StObject.set(x, "elapsed", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    }
  }
  
  trait WritableStream extends StObject {
    
    def write(data: String): Unit
  }
  object WritableStream {
    
    inline def apply(write: String => Unit): WritableStream = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[WritableStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WritableStream] (val x: Self) extends AnyVal {
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type _To = js.Object & LogfmtStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & LogfmtStatic = ^
}
