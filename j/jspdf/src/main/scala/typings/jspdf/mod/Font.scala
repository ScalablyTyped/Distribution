package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var encoding: String
  
  var fontName: String
  
  var fontStyle: String
  
  var id: Double
  
  var isStandardFont: Boolean
  
  var metadata: Any
  
  var objectNumber: Double
  
  var postScriptName: String
}
object Font {
  
  inline def apply(
    encoding: String,
    fontName: String,
    fontStyle: String,
    id: Double,
    isStandardFont: Boolean,
    metadata: Any,
    objectNumber: Double,
    postScriptName: String
  ): Font = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isStandardFont = isStandardFont.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], objectNumber = objectNumber.asInstanceOf[js.Any], postScriptName = postScriptName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsStandardFont(value: Boolean): Self = StObject.set(x, "isStandardFont", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObjectNumber(value: Double): Self = StObject.set(x, "objectNumber", value.asInstanceOf[js.Any])
    
    inline def setPostScriptName(value: String): Self = StObject.set(x, "postScriptName", value.asInstanceOf[js.Any])
  }
}
