package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a location entry.
  */
@js.native
trait SchemaUserLocation extends js.Object {
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
  implicit class SchemaUserLocationOps[Self <: SchemaUserLocation] (val x: Self) extends AnyVal {
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
    def setArea(value: String): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setBuildingId(value: String): Self = this.set("buildingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildingId: Self = this.set("buildingId", js.undefined)
    @scala.inline
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    @scala.inline
    def setDeskCode(value: String): Self = this.set("deskCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeskCode: Self = this.set("deskCode", js.undefined)
    @scala.inline
    def setFloorName(value: String): Self = this.set("floorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloorName: Self = this.set("floorName", js.undefined)
    @scala.inline
    def setFloorSection(value: String): Self = this.set("floorSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloorSection: Self = this.set("floorSection", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

