package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextPosition extends StObject {
  
  /**
    * Horizontal alignment setting for the piece of text.
    */
  var horizontalAlignment: js.UndefOr[String | Null] = js.undefined
}
object SchemaTextPosition {
  
  inline def apply(): SchemaTextPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextPosition]
  }
  
  extension [Self <: SchemaTextPosition](x: Self) {
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
