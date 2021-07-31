package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails} */
trait OAuthIdentity extends StObject {
  
  var bitbucket_cloud: js.UndefOr[OAuthIdentityDetails] = js.undefined
  
  var bitbucket_server: js.UndefOr[OAuthIdentityDetails] = js.undefined
  
  var github: js.UndefOr[OAuthIdentityDetails] = js.undefined
}
object OAuthIdentity {
  
  @scala.inline
  def apply(): OAuthIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthIdentity]
  }
  
  @scala.inline
  implicit class OAuthIdentityMutableBuilder[Self <: OAuthIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitbucket_cloud(value: OAuthIdentityDetails): Self = StObject.set(x, "bitbucket_cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitbucket_cloudUndefined: Self = StObject.set(x, "bitbucket_cloud", js.undefined)
    
    @scala.inline
    def setBitbucket_server(value: OAuthIdentityDetails): Self = StObject.set(x, "bitbucket_server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitbucket_serverUndefined: Self = StObject.set(x, "bitbucket_server", js.undefined)
    
    @scala.inline
    def setGithub(value: OAuthIdentityDetails): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
  }
}
