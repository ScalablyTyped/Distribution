package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a location entry.
  */
@js.native
trait SchemaUserLocation extends StObject {
  
  /**
    * Textual location. This is most useful for display purposes to concisely
    * describe the location. For example, &quot;Mountain View, CA&quot;,
    * &quot;Near Seattle&quot;, &quot;US-NYC-9TH 9A209A&quot;.
    */
  var area: js.UndefOr[String] = js.native
  
  /**
    * Building Identifier.
    */
  var buildingId: js.UndefOr[String] = js.native
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  
  /**
    * Most specific textual code of individual desk location.
    */
  var deskCode: js.UndefOr[String] = js.native
  
  /**
    * Floor name/number.
    */
  var floorName: js.UndefOr[String] = js.native
  
  /**
    * Floor section. More specific location within the floor. For example, if a
    * floor is divided into sections &quot;A&quot;, &quot;B&quot;, and
    * &quot;C&quot;, this field would identify one of those values.
    */
  var floorSection: js.UndefOr[String] = js.native
  
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example location could be of types default and desk. In addition to
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have &quot;custom&quot; as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaUserLocation {
  
  @scala.inline
  def apply(): SchemaUserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserLocation]
  }
  
  @scala.inline
  implicit class SchemaUserLocationMutableBuilder[Self <: SchemaUserLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    @scala.inline
    def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    @scala.inline
    def setDeskCode(value: String): Self = StObject.set(x, "deskCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeskCodeUndefined: Self = StObject.set(x, "deskCode", js.undefined)
    
    @scala.inline
    def setFloorName(value: String): Self = StObject.set(x, "floorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorNameUndefined: Self = StObject.set(x, "floorName", js.undefined)
    
    @scala.inline
    def setFloorSection(value: String): Self = StObject.set(x, "floorSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorSectionUndefined: Self = StObject.set(x, "floorSection", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
