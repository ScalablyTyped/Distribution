package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSize extends StObject {
  
  /**
    * The height of the object.
    */
  var height: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The width of the object.
    */
  var width: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaSize {
  
  inline def apply(): SchemaSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSize]
  }
  
  extension [Self <: SchemaSize](x: Self) {
    
    inline def setHeight(value: SchemaDimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
