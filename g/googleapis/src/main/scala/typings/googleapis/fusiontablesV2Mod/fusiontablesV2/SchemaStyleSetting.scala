package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a complete StyleSettings object. The primary key is a
  * combination of the tableId and a styleId.
  */
@js.native
trait SchemaStyleSetting extends StObject {
  
  /**
    * The kind of item this is. A StyleSetting contains the style definitions
    * for points, lines, and polygons in a table. Since a table can have any
    * one or all of them, a style definition can have point, line and polygon
    * style definitions.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Style definition for points in the table.
    */
  var markerOptions: js.UndefOr[SchemaPointStyle] = js.native
  
  /**
    * Optional name for the style setting.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Style definition for polygons in the table.
    */
  var polygonOptions: js.UndefOr[SchemaPolygonStyle] = js.native
  
  /**
    * Style definition for lines in the table.
    */
  var polylineOptions: js.UndefOr[SchemaLineStyle] = js.native
  
  /**
    * Identifier for the style setting (unique only within tables).
    */
  var styleId: js.UndefOr[Double] = js.native
  
  /**
    * Identifier for the table.
    */
  var tableId: js.UndefOr[String] = js.native
}
object SchemaStyleSetting {
  
  @scala.inline
  def apply(): SchemaStyleSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStyleSetting]
  }
  
  @scala.inline
  implicit class SchemaStyleSettingMutableBuilder[Self <: SchemaStyleSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMarkerOptions(value: SchemaPointStyle): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPolygonOptions(value: SchemaPolygonStyle): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    @scala.inline
    def setPolylineOptions(value: SchemaLineStyle): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    @scala.inline
    def setStyleId(value: Double): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleIdUndefined: Self = StObject.set(x, "styleId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
