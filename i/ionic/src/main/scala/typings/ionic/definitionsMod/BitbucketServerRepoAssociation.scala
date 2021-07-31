package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.bitbucket_server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerRepoAssociation
  extends StObject
     with RepoAssociationBase
     with RepoAssociation {
  
  var id: Double
  
  var `type`: bitbucket_server
}
object BitbucketServerRepoAssociation {
  
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String, id: Double): BitbucketServerRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bitbucket_server")
    __obj.asInstanceOf[BitbucketServerRepoAssociation]
  }
  
  @scala.inline
  implicit class BitbucketServerRepoAssociationMutableBuilder[Self <: BitbucketServerRepoAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bitbucket_server): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
