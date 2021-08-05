package typings.instagramPrivateApi

import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationRepositorySearchResponseMod {
  
  trait LocationRepositorySearchResponseRootObject
    extends StObject
       with StatusResponse {
    
    var rank_token: String
    
    var request_id: String
    
    var venues: js.Array[LocationRepositorySearchResponseVenuesItem]
  }
  object LocationRepositorySearchResponseRootObject {
    
    inline def apply(
      rank_token: String,
      request_id: String,
      status: String,
      venues: js.Array[LocationRepositorySearchResponseVenuesItem]
    ): LocationRepositorySearchResponseRootObject = {
      val __obj = js.Dynamic.literal(rank_token = rank_token.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], venues = venues.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationRepositorySearchResponseRootObject]
    }
    
    extension [Self <: LocationRepositorySearchResponseRootObject](x: Self) {
      
      inline def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setVenues(value: js.Array[LocationRepositorySearchResponseVenuesItem]): Self = StObject.set(x, "venues", value.asInstanceOf[js.Any])
      
      inline def setVenuesVarargs(value: LocationRepositorySearchResponseVenuesItem*): Self = StObject.set(x, "venues", js.Array(value :_*))
    }
  }
  
  trait LocationRepositorySearchResponseVenuesItem extends StObject {
    
    var address: String
    
    var external_id: String
    
    var external_id_source: String
    
    var lat: Double
    
    var lng: Double
    
    var minimum_age: Double
    
    var name: String
  }
  object LocationRepositorySearchResponseVenuesItem {
    
    inline def apply(
      address: String,
      external_id: String,
      external_id_source: String,
      lat: Double,
      lng: Double,
      minimum_age: Double,
      name: String
    ): LocationRepositorySearchResponseVenuesItem = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], external_id_source = external_id_source.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], minimum_age = minimum_age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationRepositorySearchResponseVenuesItem]
    }
    
    extension [Self <: LocationRepositorySearchResponseVenuesItem](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_id_source(value: String): Self = StObject.set(x, "external_id_source", value.asInstanceOf[js.Any])
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      inline def setMinimum_age(value: Double): Self = StObject.set(x, "minimum_age", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
