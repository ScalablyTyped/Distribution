package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjParseError extends StObject {
  
  /**
    * The type of problem found (required).
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ending character index at which the problem was found.
    */
  var endIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The file path in which the problem was found.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text of the line. Note that this may be truncated if the line was very long. This may not include the error if it occurs after line truncation.
    */
  var line: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line number at which the problem was found.
    */
  var lineNumber: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The starting character index at which the problem was found.
    */
  var startIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaObjParseError {
  
  inline def apply(): SchemaObjParseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjParseError]
  }
  
  extension [Self <: SchemaObjParseError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexNull: Self = StObject.set(x, "endIndex", null)
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
