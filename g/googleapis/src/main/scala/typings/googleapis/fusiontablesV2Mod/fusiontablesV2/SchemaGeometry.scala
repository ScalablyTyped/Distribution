package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Geometry object.
  */
@js.native
trait SchemaGeometry extends StObject {
  
  /**
    * The list of geometries in this geometry collection.
    */
  var geometries: js.UndefOr[js.Array[_]] = js.native
  
  var geometry: js.UndefOr[js.Any] = js.native
  
  /**
    * Type: A collection of geometries.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGeometry {
  
  @scala.inline
  def apply(): SchemaGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeometry]
  }
  
  @scala.inline
  implicit class SchemaGeometryMutableBuilder[Self <: SchemaGeometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometries(value: js.Array[_]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    @scala.inline
    def setGeometriesVarargs(value: js.Any*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setGeometry(value: js.Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
