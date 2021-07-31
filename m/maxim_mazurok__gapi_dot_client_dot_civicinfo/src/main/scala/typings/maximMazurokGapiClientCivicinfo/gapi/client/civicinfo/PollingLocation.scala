package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollingLocation extends StObject {
  
  /** The address of the location. */
  var address: js.UndefOr[SimpleAddressType] = js.undefined
  
  /** The last date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var endDate: js.UndefOr[String] = js.undefined
  
  /** Latitude of the location, in degrees north of the equator. Note this field may not be available for some locations. */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** Longitude of the location, in degrees east of the Prime Meridian. Note this field may not be available for some locations. */
  var longitude: js.UndefOr[Double] = js.undefined
  
  /** The name of the early vote site or drop off location. This field is not populated for polling locations. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Notes about this location (e.g. accessibility ramp or entrance to use). */
  var notes: js.UndefOr[String] = js.undefined
  
  /** A description of when this location is open. */
  var pollingHours: js.UndefOr[String] = js.undefined
  
  /** A list of sources for this location. If multiple sources are listed the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  
  /** The first date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var startDate: js.UndefOr[String] = js.undefined
  
  /** The services provided by this early vote site or drop off location. This field is not populated for polling locations. */
  var voterServices: js.UndefOr[String] = js.undefined
}
object PollingLocation {
  
  @scala.inline
  def apply(): PollingLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollingLocation]
  }
  
  @scala.inline
  implicit class PollingLocationMutableBuilder[Self <: PollingLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: SimpleAddressType): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPollingHours(value: String): Self = StObject.set(x, "pollingHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingHoursUndefined: Self = StObject.set(x, "pollingHours", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setVoterServices(value: String): Self = StObject.set(x, "voterServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoterServicesUndefined: Self = StObject.set(x, "voterServices", js.undefined)
  }
}
