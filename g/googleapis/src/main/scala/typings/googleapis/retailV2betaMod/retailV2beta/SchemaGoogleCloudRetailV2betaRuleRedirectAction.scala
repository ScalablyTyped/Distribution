package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRuleRedirectAction extends StObject {
  
  /**
    * URL must have length equal or less than 2000 characters.
    */
  var redirectUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRuleRedirectAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRuleRedirectAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRuleRedirectAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRuleRedirectAction](x: Self) {
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriNull: Self = StObject.set(x, "redirectUri", null)
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
