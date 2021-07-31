package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppAssociation extends StObject {
  
  var repository: RepoAssociation
}
object AppAssociation {
  
  @scala.inline
  def apply(repository: RepoAssociation): AppAssociation = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAssociation]
  }
  
  @scala.inline
  implicit class AppAssociationMutableBuilder[Self <: AppAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: RepoAssociation): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
