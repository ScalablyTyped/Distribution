package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRepoSource extends StObject {
  
  /** The full resource name of the bitbucket server config. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{id}`. */
  var bitbucketServerConfig: js.UndefOr[String] = js.undefined
  
  /**
    * The full resource name of the github enterprise config. Format: `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`.
    * `projects/{project}/githubEnterpriseConfigs/{id}`.
    */
  var githubEnterpriseConfig: js.UndefOr[String] = js.undefined
  
  /** The branch or tag to use. Must start with "refs/" (required). */
  var ref: js.UndefOr[String] = js.undefined
  
  /** See RepoType below. */
  var repoType: js.UndefOr[String] = js.undefined
  
  /** The URI of the repo. Either uri or repository can be specified and is required. */
  var uri: js.UndefOr[String] = js.undefined
}
object GitRepoSource {
  
  inline def apply(): GitRepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitRepoSource]
  }
  
  extension [Self <: GitRepoSource](x: Self) {
    
    inline def setBitbucketServerConfig(value: String): Self = StObject.set(x, "bitbucketServerConfig", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigUndefined: Self = StObject.set(x, "bitbucketServerConfig", js.undefined)
    
    inline def setGithubEnterpriseConfig(value: String): Self = StObject.set(x, "githubEnterpriseConfig", value.asInstanceOf[js.Any])
    
    inline def setGithubEnterpriseConfigUndefined: Self = StObject.set(x, "githubEnterpriseConfig", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRepoType(value: String): Self = StObject.set(x, "repoType", value.asInstanceOf[js.Any])
    
    inline def setRepoTypeUndefined: Self = StObject.set(x, "repoType", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
