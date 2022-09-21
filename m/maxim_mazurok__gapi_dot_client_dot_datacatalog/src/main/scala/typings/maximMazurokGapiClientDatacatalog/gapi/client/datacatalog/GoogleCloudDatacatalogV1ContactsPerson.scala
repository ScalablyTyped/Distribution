package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ContactsPerson extends StObject {
  
  /** Designation of the person, for example, Data Steward. */
  var designation: js.UndefOr[String] = js.undefined
  
  /** Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`. */
  var email: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1ContactsPerson {
  
  inline def apply(): GoogleCloudDatacatalogV1ContactsPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ContactsPerson]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ContactsPerson](x: Self) {
    
    inline def setDesignation(value: String): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
