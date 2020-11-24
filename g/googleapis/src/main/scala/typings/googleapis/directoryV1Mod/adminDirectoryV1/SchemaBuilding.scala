package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Building object in Directory API.
  */
@js.native
trait SchemaBuilding extends js.Object {
  
  /**
    * The postal address of the building. See PostalAddress for details. Note
    * that only a single address line and region code are required.
    */
  var address: js.UndefOr[SchemaBuildingAddress] = js.native
  
  /**
    * Unique identifier for the building. The maximum length is 100 characters.
    */
  var buildingId: js.UndefOr[String] = js.native
  
  /**
    * The building name as seen by users in Calendar. Must be unique for the
    * customer. For example, &quot;NYC-CHEL&quot;. The maximum length is 100
    * characters.
    */
  var buildingName: js.UndefOr[String] = js.native
  
  /**
    * The geographic coordinates of the center of the building, expressed as
    * latitude and longitude in decimal degrees.
    */
  var coordinates: js.UndefOr[SchemaBuildingCoordinates] = js.native
  
  /**
    * A brief description of the building. For example, &quot;Chelsea
    * Market&quot;.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  
  /**
    * The display names for all floors in this building. The floors are
    * expected to be sorted in ascending order, from lowest floor to highest
    * floor. For example, [&quot;B2&quot;, &quot;B1&quot;, &quot;L&quot;,
    * &quot;1&quot;, &quot;2&quot;, &quot;2M&quot;, &quot;3&quot;,
    * &quot;PH&quot;] Must contain at least one entry.
    */
  var floorNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaBuilding {
  
  @scala.inline
  def apply(): SchemaBuilding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuilding]
  }
  
  @scala.inline
  implicit class SchemaBuildingOps[Self <: SchemaBuilding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: SchemaBuildingAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBuildingId(value: String): Self = this.set("buildingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildingId: Self = this.set("buildingId", js.undefined)
    
    @scala.inline
    def setBuildingName(value: String): Self = this.set("buildingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildingName: Self = this.set("buildingName", js.undefined)
    
    @scala.inline
    def setCoordinates(value: SchemaBuildingCoordinates): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtags(value: String): Self = this.set("etags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtags: Self = this.set("etags", js.undefined)
    
    @scala.inline
    def setFloorNamesVarargs(value: String*): Self = this.set("floorNames", js.Array(value :_*))
    
    @scala.inline
    def setFloorNames(value: js.Array[String]): Self = this.set("floorNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorNames: Self = this.set("floorNames", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
