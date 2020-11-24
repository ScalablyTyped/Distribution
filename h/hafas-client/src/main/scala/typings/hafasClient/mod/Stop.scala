package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stop is a single small point or structure at which vehicles stop.
  * A stop always belongs to a station. It may for example be a sign, a basic shelter or a railway platform.
  */
@js.native
trait Stop extends js.Object {
  
  var distance: js.UndefOr[Double] = js.native
  
  var entrances: js.UndefOr[js.Array[Location]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ids: js.UndefOr[Ids] = js.native
  
  var isMeta: js.UndefOr[Boolean] = js.native
  
  var lines: js.UndefOr[js.Array[Line]] = js.native
  
  var loadFactor: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var products: js.UndefOr[Products] = js.native
  
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.native
  
  var transitAuthority: js.UndefOr[String] = js.native
  
  var `type`: stop = js.native
}
object Stop {
  
  @scala.inline
  def apply(`type`: stop): Stop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stop]
  }
  
  @scala.inline
  implicit class StopOps[Self <: Stop] (val x: Self) extends AnyVal {
    
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
    def setType(value: stop): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIds(value: Ids): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setIsMeta(value: Boolean): Self = this.set("isMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMeta: Self = this.set("isMeta", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: Line*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[Line]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setLoadFactor(value: String): Self = this.set("loadFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadFactor: Self = this.set("loadFactor", js.undefined)
    
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
    def setReisezentrumOpeningHours(value: ReisezentrumOpeningHours): Self = this.set("reisezentrumOpeningHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReisezentrumOpeningHours: Self = this.set("reisezentrumOpeningHours", js.undefined)
    
    @scala.inline
    def setTransitAuthority(value: String): Self = this.set("transitAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitAuthority: Self = this.set("transitAuthority", js.undefined)
  }
}
