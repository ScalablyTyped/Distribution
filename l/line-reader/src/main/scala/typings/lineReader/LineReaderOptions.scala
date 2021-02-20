package typings.lineReader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineReaderOptions extends StObject {
  
  var bufferSize: js.UndefOr[Double] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var separator: js.UndefOr[js.Any] = js.native
}
object LineReaderOptions {
  
  @scala.inline
  def apply(): LineReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineReaderOptions]
  }
  
  @scala.inline
  implicit class LineReaderOptionsMutableBuilder[Self <: LineReaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setSeparator(value: js.Any): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
