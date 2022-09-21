package typings.jsonToCsvExport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-to-csv-export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasDataFilenameDelimiterHeaders: CsvDownloadProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasDataFilenameDelimiterHeaders.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CsvDownloadProps extends StObject {
    
    var data: js.Array[Any]
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CsvDownloadProps {
    
    inline def apply(data: js.Array[Any]): CsvDownloadProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CsvDownloadProps]
    }
    
    extension [Self <: CsvDownloadProps](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    }
  }
}
