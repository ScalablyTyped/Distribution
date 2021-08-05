package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message containing information required to activate Dashboard SSO feature.
  */
trait SchemaGoogleCloudServicebrokerV1beta1DashboardClient extends StObject {
  
  /**
    * The id of the Oauth client that the dashboard will use.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A URI for the service dashboard. Validated by the OAuth token server when
    * the dashboard requests a token.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
  
  /**
    * A secret for the dashboard client.
    */
  var secret: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1beta1DashboardClient {
  
  inline def apply(): SchemaGoogleCloudServicebrokerV1beta1DashboardClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1DashboardClient]
  }
  
  extension [Self <: SchemaGoogleCloudServicebrokerV1beta1DashboardClient](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
