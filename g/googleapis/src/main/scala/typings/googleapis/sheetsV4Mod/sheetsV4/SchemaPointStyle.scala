package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPointStyle extends StObject {
  
  /**
    * The point shape. If empty or unspecified, a default shape is used.
    */
  var shape: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The point size. If empty, a default size is used.
    */
  var size: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPointStyle {
  
  inline def apply(): SchemaPointStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointStyle]
  }
  
  extension [Self <: SchemaPointStyle](x: Self) {
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeNull: Self = StObject.set(x, "shape", null)
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
