package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackground extends StObject {
  
  /**
    * The background color.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.undefined
}
object SchemaBackground {
  
  inline def apply(): SchemaBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackground]
  }
  
  extension [Self <: SchemaBackground](x: Self) {
    
    inline def setColor(value: SchemaOptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
