package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of an error resulting from parsing an OBJ file
  */
@js.native
trait SchemaObjParseError extends StObject {
  
  /**
    * The type of problem found (required).
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * The ending character index at which the problem was found.
    */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * The file path in which the problem was found.
    */
  var filePath: js.UndefOr[String] = js.native
  
  /**
    * The text of the line. Note that this may be truncated if the line was
    * very long. This may not include the error if it occurs after line
    * truncation.
    */
  var line: js.UndefOr[String] = js.native
  
  /**
    * Line number at which the problem was found.
    */
  var lineNumber: js.UndefOr[Double] = js.native
  
  /**
    * The starting character index at which the problem was found.
    */
  var startIndex: js.UndefOr[Double] = js.native
}
object SchemaObjParseError {
  
  @scala.inline
  def apply(): SchemaObjParseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjParseError]
  }
  
  @scala.inline
  implicit class SchemaObjParseErrorMutableBuilder[Self <: SchemaObjParseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
