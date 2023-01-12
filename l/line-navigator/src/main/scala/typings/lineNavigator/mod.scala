package typings.lineNavigator

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("line-navigator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LineNavigator {
    def this(file: String) = this()
    /**
      * Creates an instance of LineNavigator.
      * @param file HTML5 File for client side or a string with file path for server side.
      * @param [options]
      */
    def this(file: File) = this()
    def this(file: String, options: Options) = this()
    def this(file: File, options: Options) = this()
    
    /* CompleteClass */
    override def find(regex: js.RegExp, indexToStartWith: Double, callback: FindCallback): Unit = js.native
    
    /* CompleteClass */
    override def findAll(regex: js.RegExp, indexToStartWith: Double, limit: Double, callback: FindAllCallback): Unit = js.native
    
    /* CompleteClass */
    override def readLines(indexToStartWith: Double, numberOfLines: Double, callback: ReadLinesCallback): Unit = js.native
    
    /* CompleteClass */
    override def readSomeLines(indexToStartWith: Double, callback: ReadLinesCallback): Unit = js.native
  }
  
  type FindAllCallback = js.Function4[
    /* err */ Any, 
    /* index */ Double, 
    /* limitHit */ js.UndefOr[Boolean], 
    /* results */ js.UndefOr[js.Array[FindAllResult]], 
    Unit
  ]
  
  trait FindAllResult
    extends StObject
       with FindMatch {
    
    var index: String
  }
  object FindAllResult {
    
    inline def apply(index: String, length: Double, line: String, offset: Double): FindAllResult = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindAllResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindAllResult] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type FindCallback = js.Function3[/* err */ Any, /* index */ js.UndefOr[Double], /* match */ js.UndefOr[FindMatch], Unit]
  
  trait FindMatch extends StObject {
    
    var length: Double
    
    var line: String
    
    var offset: Double
  }
  object FindMatch {
    
    inline def apply(length: Double, line: String, offset: Double): FindMatch = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindMatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindMatch] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineNavigator extends StObject {
    
    def find(regex: js.RegExp, indexToStartWith: Double, callback: FindCallback): Unit
    
    def findAll(regex: js.RegExp, indexToStartWith: Double, limit: Double, callback: FindAllCallback): Unit
    
    def readLines(indexToStartWith: Double, numberOfLines: Double, callback: ReadLinesCallback): Unit
    
    def readSomeLines(indexToStartWith: Double, callback: ReadLinesCallback): Unit
  }
  object LineNavigator {
    
    inline def apply(
      find: (js.RegExp, Double, FindCallback) => Unit,
      findAll: (js.RegExp, Double, Double, FindAllCallback) => Unit,
      readLines: (Double, Double, ReadLinesCallback) => Unit,
      readSomeLines: (Double, ReadLinesCallback) => Unit
    ): LineNavigator = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction3(find), findAll = js.Any.fromFunction4(findAll), readLines = js.Any.fromFunction3(readLines), readSomeLines = js.Any.fromFunction2(readSomeLines))
      __obj.asInstanceOf[LineNavigator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineNavigator] (val x: Self) extends AnyVal {
      
      inline def setFind(value: (js.RegExp, Double, FindCallback) => Unit): Self = StObject.set(x, "find", js.Any.fromFunction3(value))
      
      inline def setFindAll(value: (js.RegExp, Double, Double, FindAllCallback) => Unit): Self = StObject.set(x, "findAll", js.Any.fromFunction4(value))
      
      inline def setReadLines(value: (Double, Double, ReadLinesCallback) => Unit): Self = StObject.set(x, "readLines", js.Any.fromFunction3(value))
      
      inline def setReadSomeLines(value: (Double, ReadLinesCallback) => Unit): Self = StObject.set(x, "readSomeLines", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Size of chunk
      * @default 4096
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Encoding
      * @default 'utf8'
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Return error when line is longer than chunkSize, otherwise it will be threated as several lines.
      * @default false
      */
    var throwOnLongLines: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setThrowOnLongLines(value: Boolean): Self = StObject.set(x, "throwOnLongLines", value.asInstanceOf[js.Any])
      
      inline def setThrowOnLongLinesUndefined: Self = StObject.set(x, "throwOnLongLines", js.undefined)
    }
  }
  
  type ReadLinesCallback = js.Function5[
    /* err */ Any, 
    /* index */ Double, 
    /* lines */ js.UndefOr[js.Array[String]], 
    /* isEof */ js.UndefOr[Boolean], 
    /* progress */ js.UndefOr[Double], 
    Unit
  ]
}
