package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fbsearchRepositoryPlacesResponseMod {
  
  trait FbsearchRepositoryPlacesResponseHeaderMedia extends StObject
  
  trait FbsearchRepositoryPlacesResponseItemsItem extends StObject {
    
    var header_media: FbsearchRepositoryPlacesResponseHeaderMedia
    
    var location: FbsearchRepositoryPlacesResponseLocation
    
    var media_bundles: js.Array[js.Any]
    
    var subtitle: String
    
    var title: String
  }
  object FbsearchRepositoryPlacesResponseItemsItem {
    
    inline def apply(
      header_media: FbsearchRepositoryPlacesResponseHeaderMedia,
      location: FbsearchRepositoryPlacesResponseLocation,
      media_bundles: js.Array[js.Any],
      subtitle: String,
      title: String
    ): FbsearchRepositoryPlacesResponseItemsItem = {
      val __obj = js.Dynamic.literal(header_media = header_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], media_bundles = media_bundles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryPlacesResponseItemsItem]
    }
    
    extension [Self <: FbsearchRepositoryPlacesResponseItemsItem](x: Self) {
      
      inline def setHeader_media(value: FbsearchRepositoryPlacesResponseHeaderMedia): Self = StObject.set(x, "header_media", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: FbsearchRepositoryPlacesResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMedia_bundles(value: js.Array[js.Any]): Self = StObject.set(x, "media_bundles", value.asInstanceOf[js.Any])
      
      inline def setMedia_bundlesVarargs(value: js.Any*): Self = StObject.set(x, "media_bundles", js.Array(value :_*))
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait FbsearchRepositoryPlacesResponseLocation extends StObject {
    
    var address: String
    
    var city: String
    
    var external_source: String
    
    var facebook_places_id: Double
    
    var lat: Double
    
    var lng: Double
    
    var name: String
    
    var pk: Double
    
    var short_name: String
  }
  object FbsearchRepositoryPlacesResponseLocation {
    
    inline def apply(
      address: String,
      city: String,
      external_source: String,
      facebook_places_id: Double,
      lat: Double,
      lng: Double,
      name: String,
      pk: Double,
      short_name: String
    ): FbsearchRepositoryPlacesResponseLocation = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryPlacesResponseLocation]
    }
    
    extension [Self <: FbsearchRepositoryPlacesResponseLocation](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
      
      inline def setFacebook_places_id(value: Double): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FbsearchRepositoryPlacesResponseRootObject extends StObject {
    
    var has_more: Boolean
    
    var items: js.Array[FbsearchRepositoryPlacesResponseItemsItem]
    
    var rank_token: String
    
    var status: String
  }
  object FbsearchRepositoryPlacesResponseRootObject {
    
    inline def apply(
      has_more: Boolean,
      items: js.Array[FbsearchRepositoryPlacesResponseItemsItem],
      rank_token: String,
      status: String
    ): FbsearchRepositoryPlacesResponseRootObject = {
      val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryPlacesResponseRootObject]
    }
    
    extension [Self <: FbsearchRepositoryPlacesResponseRootObject](x: Self) {
      
      inline def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[FbsearchRepositoryPlacesResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: FbsearchRepositoryPlacesResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
