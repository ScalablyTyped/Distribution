package typings.lineByLine

import typings.lineByLine.lineByLineStrings.ascii
import typings.lineByLine.lineByLineStrings.base64
import typings.lineByLine.lineByLineStrings.binary
import typings.lineByLine.lineByLineStrings.end
import typings.lineByLine.lineByLineStrings.error
import typings.lineByLine.lineByLineStrings.hex
import typings.lineByLine.lineByLineStrings.latin1
import typings.lineByLine.lineByLineStrings.line
import typings.lineByLine.lineByLineStrings.ucs2
import typings.lineByLine.lineByLineStrings.utf16le
import typings.lineByLine.lineByLineStrings.utf8
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("line-by-line", JSImport.Namespace)
  @js.native
  class ^ protected () extends LineByLineReader {
    /**
      * Constructs a new `LineByLineReader` from a path to a file.
      * @param filePath The path to the file to read.
      * @param options Optional. The options used when constructing the new `LineByLineReader` object.
      */
    def this(filePath: String) = this()
    /**
      * Constructs a new `LineByLineReader` from a readable stream.
      * @param stream The stream to read.
      * @param options Optional. The options used when constructing the new `LineByLineReader` object.
      */
    def this(stream: Readable) = this()
    def this(filePath: String, options: LineByLineReaderFileOptions) = this()
    def this(stream: Readable, options: LineByLineReaderOptions) = this()
  }
  
  @js.native
  trait LineByLineReader extends EventEmitter {
    
    /**
      * Stops emitting "line" events, closes the file or stream, and emits the "end" event.
      */
    def close(): Unit = js.native
    
    /**
      * Emitted if all lines are read.
      * @param event
      * @param listener
      */
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    /**
      * Emitted if an error occured.
      * @param event
      * @param listener A listener that receives the error object.
      */
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    /**
      * Emitted on every line read.
      * @param event
      * @param listener A listener that receives the line without the line terminator.
      */
    @JSName("on")
    def on_line(event: line, listener: js.Function1[/* line */ String, Unit]): this.type = js.native
    
    /**
      * Call this method to stop emitting "line" events.
      */
    def pause(): Unit = js.native
    
    /**
      * After calling this method, "line" events get emitted again.
      */
    def resume(): Unit = js.native
  }
  
  @js.native
  trait LineByLineReaderFileOptions extends LineByLineReaderOptions {
    
    /** The `end` position in bytes to read from the file. */
    var end: js.UndefOr[Double] = js.native
    
    /** The `start` position in bytes to read from the file. */
    var start: js.UndefOr[Double] = js.native
  }
  object LineByLineReaderFileOptions {
    
    @scala.inline
    def apply(): LineByLineReaderFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineByLineReaderFileOptions]
    }
    
    @scala.inline
    implicit class LineByLineReaderFileOptionsMutableBuilder[Self <: LineByLineReaderFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait LineByLineReaderOptions extends StObject {
    
    /** The encoding to use. */
    var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex] = js.native
    
    /** If set to true, empty lines do not emit the "line" event. */
    var skipEmptyLines: js.UndefOr[Boolean] = js.native
  }
  object LineByLineReaderOptions {
    
    @scala.inline
    def apply(): LineByLineReaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineByLineReaderOptions]
    }
    
    @scala.inline
    implicit class LineByLineReaderOptionsMutableBuilder[Self <: LineByLineReaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setSkipEmptyLines(value: Boolean): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
    }
  }
}
