package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Apps Domain membership.
  */
trait SchemaDomainMembership extends StObject {
  
  /**
    * True if the person is in the viewer&#39;s Google Apps domain.
    */
  var inViewerDomain: js.UndefOr[Boolean] = js.undefined
}
object SchemaDomainMembership {
  
  @scala.inline
  def apply(): SchemaDomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMembership]
  }
  
  @scala.inline
  implicit class SchemaDomainMembershipMutableBuilder[Self <: SchemaDomainMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInViewerDomain(value: Boolean): Self = StObject.set(x, "inViewerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInViewerDomainUndefined: Self = StObject.set(x, "inViewerDomain", js.undefined)
  }
}
