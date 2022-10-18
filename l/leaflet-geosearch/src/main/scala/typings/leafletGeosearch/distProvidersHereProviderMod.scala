package typings.leafletGeosearch

import org.scalablytyped.runtime.StringDictionary
import typings.leafletGeosearch.anon.CountryCode
import typings.leafletGeosearch.anon.FieldScore
import typings.leafletGeosearch.anon.Id
import typings.leafletGeosearch.anon.Value
import typings.leafletGeosearch.distProvidersProviderMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersHereProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/hereProvider", JSImport.Default)
  @js.native
  open class default () extends HereProvider
  
  @js.native
  trait HereProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    var searchUrl: String = js.native
  }
  
  trait RawResult extends StObject {
    
    var access: js.Array[LatLng]
    
    var address: CountryCode
    
    var categories: js.Array[Id]
    
    var contacts: js.Array[StringDictionary[js.Array[Value]]]
    
    var id: String
    
    var position: LatLng
    
    var resultType: String
    
    var scoring: FieldScore
    
    var title: String
  }
  object RawResult {
    
    inline def apply(
      access: js.Array[LatLng],
      address: CountryCode,
      categories: js.Array[Id],
      contacts: js.Array[StringDictionary[js.Array[Value]]],
      id: String,
      position: LatLng,
      resultType: String,
      scoring: FieldScore,
      title: String
    ): RawResult = {
      val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any], scoring = scoring.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    extension [Self <: RawResult](x: Self) {
      
      inline def setAccess(value: js.Array[LatLng]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      inline def setAccessVarargs(value: LatLng*): Self = StObject.set(x, "access", js.Array(value*))
      
      inline def setAddress(value: CountryCode): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: js.Array[Id]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: Id*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setContacts(value: js.Array[StringDictionary[js.Array[Value]]]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setContactsVarargs(value: StringDictionary[js.Array[Value]]*): Self = StObject.set(x, "contacts", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: LatLng): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setResultType(value: String): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
      
      inline def setScoring(value: FieldScore): Self = StObject.set(x, "scoring", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var items: js.Array[RawResult]
  }
  object RequestResult {
    
    inline def apply(items: js.Array[RawResult]): RequestResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    extension [Self <: RequestResult](x: Self) {
      
      inline def setItems(value: js.Array[RawResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: RawResult*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
