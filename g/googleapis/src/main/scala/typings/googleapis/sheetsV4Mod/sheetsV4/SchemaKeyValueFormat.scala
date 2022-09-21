package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyValueFormat extends StObject {
  
  /**
    * Specifies the horizontal text positioning of key value. This field is optional. If not specified, default positioning is used.
    */
  var position: js.UndefOr[SchemaTextPosition] = js.undefined
  
  /**
    * Text formatting options for key value. The link field is not supported.
    */
  var textFormat: js.UndefOr[SchemaTextFormat] = js.undefined
}
object SchemaKeyValueFormat {
  
  inline def apply(): SchemaKeyValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValueFormat]
  }
  
  extension [Self <: SchemaKeyValueFormat](x: Self) {
    
    inline def setPosition(value: SchemaTextPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTextFormat(value: SchemaTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
