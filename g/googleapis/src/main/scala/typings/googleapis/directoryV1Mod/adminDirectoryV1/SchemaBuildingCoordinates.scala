package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for coordinates of a building in Directory API.
  */
@js.native
trait SchemaBuildingCoordinates extends js.Object {
  
  /**
    * Latitude in decimal degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * Longitude in decimal degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
}
object SchemaBuildingCoordinates {
  
  @scala.inline
  def apply(): SchemaBuildingCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildingCoordinates]
  }
  
  @scala.inline
  implicit class SchemaBuildingCoordinatesOps[Self <: SchemaBuildingCoordinates] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
  }
}
