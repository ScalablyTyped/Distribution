package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerRepository extends StObject {
  
  /** Link to the browse repo page on the Bitbucket Server instance. */
  var browseUri: js.UndefOr[String] = js.undefined
  
  /** Description of the repository. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Display name of the repository. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the repository. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Identifier for a repository hosted on a Bitbucket Server. */
  var repoId: js.UndefOr[BitbucketServerRepositoryId] = js.undefined
}
object BitbucketServerRepository {
  
  inline def apply(): BitbucketServerRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitbucketServerRepository]
  }
  
  extension [Self <: BitbucketServerRepository](x: Self) {
    
    inline def setBrowseUri(value: String): Self = StObject.set(x, "browseUri", value.asInstanceOf[js.Any])
    
    inline def setBrowseUriUndefined: Self = StObject.set(x, "browseUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepoId(value: BitbucketServerRepositoryId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    inline def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
  }
}
