package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PACData extends StObject {
  
  var color: String | Null
  
  var indent: Double | Null
  
  var italics: Boolean
  
  var row: Double
  
  var underline: Boolean
}
object PACData {
  
  inline def apply(italics: Boolean, row: Double, underline: Boolean): PACData = {
    val __obj = js.Dynamic.literal(italics = italics.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], color = null, indent = null)
    __obj.asInstanceOf[PACData]
  }
  
  extension [Self <: PACData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentNull: Self = StObject.set(x, "indent", null)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
  }
}
