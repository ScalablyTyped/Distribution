package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Geometry object.
  */
trait SchemaGeometry extends StObject {
  
  /**
    * The list of geometries in this geometry collection.
    */
  var geometries: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var geometry: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Type: A collection of geometries.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGeometry {
  
  inline def apply(): SchemaGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeometry]
  }
  
  extension [Self <: SchemaGeometry](x: Self) {
    
    inline def setGeometries(value: js.Array[js.Any]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: js.Any*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    inline def setGeometry(value: js.Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
