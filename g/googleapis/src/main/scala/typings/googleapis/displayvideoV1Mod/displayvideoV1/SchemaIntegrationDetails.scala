package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntegrationDetails extends StObject {
  
  /**
    * Additional details of the entry in string format. Must be UTF-8 encoded with a length of no more than 1000 characters.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An external identifier to be associated with the entry. The integration code will show up together with the entry in many places in the system, for example, reporting. Must be UTF-8 encoded with a length of no more than 500 characters.
    */
  var integrationCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaIntegrationDetails {
  
  inline def apply(): SchemaIntegrationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegrationDetails]
  }
  
  extension [Self <: SchemaIntegrationDetails](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setIntegrationCode(value: String): Self = StObject.set(x, "integrationCode", value.asInstanceOf[js.Any])
    
    inline def setIntegrationCodeNull: Self = StObject.set(x, "integrationCode", null)
    
    inline def setIntegrationCodeUndefined: Self = StObject.set(x, "integrationCode", js.undefined)
  }
}
