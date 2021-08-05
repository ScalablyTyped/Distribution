package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The shading of a paragraph.
  */
trait SchemaShading extends StObject {
  
  /**
    * The background color of this paragraph shading.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.undefined
}
object SchemaShading {
  
  inline def apply(): SchemaShading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShading]
  }
  
  extension [Self <: SchemaShading](x: Self) {
    
    inline def setBackgroundColor(value: SchemaOptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
