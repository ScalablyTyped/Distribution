package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderError extends StObject {
  
  var column: Double
  
  var extract: js.Array[String]
  
  var filename: String
  
  var index: Double
  
  var line: Double
  
  var message: String
  
  var `type`: String
}
object RenderError {
  
  inline def apply(
    column: Double,
    extract: js.Array[String],
    filename: String,
    index: Double,
    line: Double,
    message: String,
    `type`: String
  ): RenderError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderError] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setExtract(value: js.Array[String]): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractVarargs(value: String*): Self = StObject.set(x, "extract", js.Array(value*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
