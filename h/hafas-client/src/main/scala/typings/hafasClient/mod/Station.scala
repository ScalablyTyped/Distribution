package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.station
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A station is a larger building or area that can be identified by a name.
  * It is usually represented by a single node on a public transport map.
  * Whereas a stop usually specifies a location, a station often is a broader area
  * that may span across multiple levels or buildings.
  */
@js.native
trait Station extends js.Object {
  
  var distance: js.UndefOr[Double] = js.native
  
  var entrances: js.UndefOr[js.Array[Location]] = js.native
  
  var facilities: js.UndefOr[Facilities] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isMeta: js.UndefOr[Boolean] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var products: js.UndefOr[Products] = js.native
  
  /** region ids */
  var regions: js.UndefOr[js.Array[String]] = js.native
  
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.native
  
  var station: js.UndefOr[Station] = js.native
  
  var stops: js.UndefOr[js.Array[Station | Stop | Location]] = js.native
  
  var transitAuthority: js.UndefOr[String] = js.native
  
  var `type`: station = js.native
}
object Station {
  
  @scala.inline
  def apply(`type`: station): Station = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Station]
  }
  
  @scala.inline
  implicit class StationOps[Self <: Station] (val x: Self) extends AnyVal {
    
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
    def setType(value: station): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setEntrancesVarargs(value: Location*): Self = this.set("entrances", js.Array(value :_*))
    
    @scala.inline
    def setEntrances(value: js.Array[Location]): Self = this.set("entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrances: Self = this.set("entrances", js.undefined)
    
    @scala.inline
    def setFacilities(value: Facilities): Self = this.set("facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacilities: Self = this.set("facilities", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsMeta(value: Boolean): Self = this.set("isMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMeta: Self = this.set("isMeta", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProducts(value: Products): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setReisezentrumOpeningHours(value: ReisezentrumOpeningHours): Self = this.set("reisezentrumOpeningHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReisezentrumOpeningHours: Self = this.set("reisezentrumOpeningHours", js.undefined)
    
    @scala.inline
    def setStation(value: Station): Self = this.set("station", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStation: Self = this.set("station", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: (Station | Stop | Location)*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[Station | Stop | Location]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    
    @scala.inline
    def setTransitAuthority(value: String): Self = this.set("transitAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitAuthority: Self = this.set("transitAuthority", js.undefined)
  }
}
