package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message containing information required to activate Dashboard SSO feature.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1DashboardClient extends StObject {
  
  /**
    * The id of the Oauth client that the dashboard will use.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A URI for the service dashboard. Validated by the OAuth token server when
    * the dashboard requests a token.
    */
  var redirect_uri: js.UndefOr[String] = js.native
  
  /**
    * A secret for the dashboard client.
    */
  var secret: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudServicebrokerV1alpha1DashboardClient {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1DashboardClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1DashboardClient]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1DashboardClientMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1alpha1DashboardClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
