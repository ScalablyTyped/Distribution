package typings.jsforce

import typings.jsforce.recordMod.Record
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordStreamMod {
  
  @JSImport("jsforce/record-stream", "Parsable")
  @js.native
  open class Parsable[T] () extends RecordStream[T] {
    
    def stream(): Readable = js.native
    def stream(`type`: String): Readable = js.native
  }
  
  @JSImport("jsforce/record-stream", "RecordStream")
  @js.native
  open class RecordStream[T] () extends Transform {
    
    def filter(fn: js.Function1[/* record */ Record[T], Boolean]): RecordStream[T] = js.native
    @JSName("filter")
    def filter_Serializable(fn: js.Function1[/* record */ Record[T], Boolean]): Serializable[T] = js.native
    
    def map(fn: js.Function1[/* record */ Record[T], Record[T]]): RecordStream[T] = js.native
    @JSName("map")
    def map_Serializable(fn: js.Function1[/* record */ Record[T], Record[T]]): Serializable[T] = js.native
    
    def recordMapStream(record: Record[T]): Serializable[T] = js.native
    def recordMapStream(record: Record[T], noeval: Boolean): Serializable[T] = js.native
  }
  
  @JSImport("jsforce/record-stream", "Serializable")
  @js.native
  open class Serializable[T] () extends RecordStream[T] {
    
    def stream(): Readable = js.native
    def stream(`type`: String): Readable = js.native
    def stream(`type`: String, options: SerializeOptions): Readable = js.native
    def stream(`type`: Unit, options: SerializeOptions): Readable = js.native
  }
  
  trait CSVStreamConverterOptions extends StObject {
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var nullValue: js.UndefOr[String] = js.undefined
  }
  object CSVStreamConverterOptions {
    
    inline def apply(): CSVStreamConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVStreamConverterOptions]
    }
    
    extension [Self <: CSVStreamConverterOptions](x: Self) {
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
      
      inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    }
  }
  
  type SerializeOptions = CSVStreamConverterOptions
}
