package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOptionalColor extends StObject {
  
  /**
    * If set, this will be used as an opaque color. If unset, this represents a transparent color.
    */
  var opaqueColor: js.UndefOr[SchemaOpaqueColor] = js.undefined
}
object SchemaOptionalColor {
  
  inline def apply(): SchemaOptionalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptionalColor]
  }
  
  extension [Self <: SchemaOptionalColor](x: Self) {
    
    inline def setOpaqueColor(value: SchemaOpaqueColor): Self = StObject.set(x, "opaqueColor", value.asInstanceOf[js.Any])
    
    inline def setOpaqueColorUndefined: Self = StObject.set(x, "opaqueColor", js.undefined)
  }
}
