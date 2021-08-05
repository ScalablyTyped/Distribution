package typings.lineReader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineReaderOptions extends StObject {
  
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var separator: js.UndefOr[js.Any] = js.undefined
}
object LineReaderOptions {
  
  inline def apply(): LineReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineReaderOptions]
  }
  
  extension [Self <: LineReaderOptions](x: Self) {
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setSeparator(value: js.Any): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
