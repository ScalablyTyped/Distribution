package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaText extends StObject {
  
  /**
    * The text content to be displayed.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How the text content is formatted.
    */
  var format: js.UndefOr[String | Null] = js.undefined
}
object SchemaText {
  
  inline def apply(): SchemaText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaText]
  }
  
  extension [Self <: SchemaText](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
