package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.github
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GithubRepoAssociation
  extends StObject
     with RepoAssociationBase
     with RepoAssociation {
  
  var id: Double
  
  var `type`: github
}
object GithubRepoAssociation {
  
  inline def apply(clone_url: String, full_name: String, html_url: String, id: Double): GithubRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("github")
    __obj.asInstanceOf[GithubRepoAssociation]
  }
  
  extension [Self <: GithubRepoAssociation](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: github): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
