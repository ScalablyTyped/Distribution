package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainMembership extends StObject {
  
  /**
    * True if the person is in the viewer's Google Workspace domain.
    */
  var inViewerDomain: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDomainMembership {
  
  inline def apply(): SchemaDomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMembership]
  }
  
  extension [Self <: SchemaDomainMembership](x: Self) {
    
    inline def setInViewerDomain(value: Boolean): Self = StObject.set(x, "inViewerDomain", value.asInstanceOf[js.Any])
    
    inline def setInViewerDomainNull: Self = StObject.set(x, "inViewerDomain", null)
    
    inline def setInViewerDomainUndefined: Self = StObject.set(x, "inViewerDomain", js.undefined)
  }
}
