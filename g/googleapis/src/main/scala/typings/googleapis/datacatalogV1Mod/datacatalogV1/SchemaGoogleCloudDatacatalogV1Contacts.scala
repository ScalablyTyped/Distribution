package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1Contacts extends StObject {
  
  /**
    * The list of contact people for the entry.
    */
  var people: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1ContactsPerson]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1Contacts {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1Contacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1Contacts]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1Contacts](x: Self) {
    
    inline def setPeople(value: js.Array[SchemaGoogleCloudDatacatalogV1ContactsPerson]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    inline def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    inline def setPeopleVarargs(value: SchemaGoogleCloudDatacatalogV1ContactsPerson*): Self = StObject.set(x, "people", js.Array(value*))
  }
}
