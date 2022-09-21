package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtrudedArea extends StObject {
  
  /**
    * The area representing the footprint of the extruded area.
    */
  var area: js.UndefOr[SchemaArea] = js.undefined
  
  /**
    * The z-value in local tile coordinates where the extruded area ends.
    */
  var maxZ: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The z-value in local tile coordinates where the extruded area begins. This is non-zero for extruded areas that begin off the ground. For example, a building with a skybridge may have an extruded area component with a non-zero min_z.
    */
  var minZ: js.UndefOr[Double | Null] = js.undefined
}
object SchemaExtrudedArea {
  
  inline def apply(): SchemaExtrudedArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtrudedArea]
  }
  
  extension [Self <: SchemaExtrudedArea](x: Self) {
    
    inline def setArea(value: SchemaArea): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setMaxZ(value: Double): Self = StObject.set(x, "maxZ", value.asInstanceOf[js.Any])
    
    inline def setMaxZNull: Self = StObject.set(x, "maxZ", null)
    
    inline def setMaxZUndefined: Self = StObject.set(x, "maxZ", js.undefined)
    
    inline def setMinZ(value: Double): Self = StObject.set(x, "minZ", value.asInstanceOf[js.Any])
    
    inline def setMinZNull: Self = StObject.set(x, "minZ", null)
    
    inline def setMinZUndefined: Self = StObject.set(x, "minZ", js.undefined)
  }
}
