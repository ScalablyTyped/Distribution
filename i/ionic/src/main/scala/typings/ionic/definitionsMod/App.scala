package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  var association: js.UndefOr[Null | AppAssociation] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  @JSName("org")
  var org_ : Null | Org = js.native
  
  var repo_url: js.UndefOr[String] = js.native
  
  var slug: String = js.native
}
object App {
  
  @scala.inline
  def apply(id: String, name: String, slug: String): App = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: AppAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationNull: Self = StObject.set(x, "association", null)
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: Org): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_Null: Self = StObject.set(x, "org", null)
    
    @scala.inline
    def setRepo_url(value: String): Self = StObject.set(x, "repo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo_urlUndefined: Self = StObject.set(x, "repo_url", js.undefined)
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
