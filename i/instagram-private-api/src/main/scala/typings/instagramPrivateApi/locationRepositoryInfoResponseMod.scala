package typings.instagramPrivateApi

import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationRepositoryInfoResponseMod {
  
  @js.native
  trait LocationRepositoryInfoResponseLocation extends StObject {
    
    var address: String = js.native
    
    var city: String = js.native
    
    var external_source: String = js.native
    
    var facebook_places_id: Double = js.native
    
    var lat: Double = js.native
    
    var lng: Double = js.native
    
    var name: String = js.native
    
    var pk: Double = js.native
    
    var short_name: String = js.native
  }
  object LocationRepositoryInfoResponseLocation {
    
    @scala.inline
    def apply(
      address: String,
      city: String,
      external_source: String,
      facebook_places_id: Double,
      lat: Double,
      lng: Double,
      name: String,
      pk: Double,
      short_name: String
    ): LocationRepositoryInfoResponseLocation = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationRepositoryInfoResponseLocation]
    }
    
    @scala.inline
    implicit class LocationRepositoryInfoResponseLocationMutableBuilder[Self <: LocationRepositoryInfoResponseLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacebook_places_id(value: Double): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationRepositoryInfoResponseRootObject extends StatusResponse {
    
    var location: LocationRepositoryInfoResponseLocation = js.native
  }
  object LocationRepositoryInfoResponseRootObject {
    
    @scala.inline
    def apply(location: LocationRepositoryInfoResponseLocation, status: String): LocationRepositoryInfoResponseRootObject = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationRepositoryInfoResponseRootObject]
    }
    
    @scala.inline
    implicit class LocationRepositoryInfoResponseRootObjectMutableBuilder[Self <: LocationRepositoryInfoResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LocationRepositoryInfoResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
