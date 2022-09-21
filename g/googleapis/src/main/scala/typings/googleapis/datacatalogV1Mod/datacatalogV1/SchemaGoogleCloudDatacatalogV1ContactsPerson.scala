package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ContactsPerson extends StObject {
  
  /**
    * Designation of the person, for example, Data Steward.
    */
  var designation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
    */
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ContactsPerson {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ContactsPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ContactsPerson]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ContactsPerson](x: Self) {
    
    inline def setDesignation(value: String): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationNull: Self = StObject.set(x, "designation", null)
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
