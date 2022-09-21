package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaRuleRedirectAction extends StObject {
  
  /**
    * URL must have length equal or less than 2000 characters.
    */
  var redirectUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaRuleRedirectAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaRuleRedirectAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaRuleRedirectAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaRuleRedirectAction](x: Self) {
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriNull: Self = StObject.set(x, "redirectUri", null)
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
