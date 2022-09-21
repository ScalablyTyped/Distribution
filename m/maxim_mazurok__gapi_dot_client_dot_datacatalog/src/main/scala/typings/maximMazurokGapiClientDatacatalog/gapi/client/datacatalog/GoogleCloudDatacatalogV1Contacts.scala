package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1Contacts extends StObject {
  
  /** The list of contact people for the entry. */
  var people: js.UndefOr[js.Array[GoogleCloudDatacatalogV1ContactsPerson]] = js.undefined
}
object GoogleCloudDatacatalogV1Contacts {
  
  inline def apply(): GoogleCloudDatacatalogV1Contacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1Contacts]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1Contacts](x: Self) {
    
    inline def setPeople(value: js.Array[GoogleCloudDatacatalogV1ContactsPerson]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    inline def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    inline def setPeopleVarargs(value: GoogleCloudDatacatalogV1ContactsPerson*): Self = StObject.set(x, "people", js.Array(value*))
  }
}
