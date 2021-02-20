package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.github
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GithubRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  
  var id: Double = js.native
  
  var `type`: github = js.native
}
object GithubRepoAssociation {
  
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String, id: Double, `type`: github): GithubRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubRepoAssociation]
  }
  
  @scala.inline
  implicit class GithubRepoAssociationMutableBuilder[Self <: GithubRepoAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: github): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
