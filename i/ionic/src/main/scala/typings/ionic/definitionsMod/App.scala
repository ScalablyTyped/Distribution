package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var association: js.UndefOr[Null | AppAssociation] = js.undefined
  
  var id: String
  
  var name: String
  
  @JSName("org")
  var org_ : Null | Org
  
  var repo_url: js.UndefOr[String] = js.undefined
  
  var slug: String
}
object App {
  
  inline def apply(id: String, name: String, slug: String): App = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(null)
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setAssociation(value: AppAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationNull: Self = StObject.set(x, "association", null)
    
    inline def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: Org): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Null: Self = StObject.set(x, "org", null)
    
    inline def setRepo_url(value: String): Self = StObject.set(x, "repo_url", value.asInstanceOf[js.Any])
    
    inline def setRepo_urlUndefined: Self = StObject.set(x, "repo_url", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
