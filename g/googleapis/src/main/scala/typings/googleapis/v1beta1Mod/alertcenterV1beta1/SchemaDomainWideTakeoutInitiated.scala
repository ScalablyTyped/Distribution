package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A takeout operation for the entire domain was initiated by an admin.
  * Derived from audit logs.
  */
trait SchemaDomainWideTakeoutInitiated extends StObject {
  
  /**
    * The email of the admin who initiated the takeout.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The takeout request ID.
    */
  var takeoutRequestId: js.UndefOr[String] = js.undefined
}
object SchemaDomainWideTakeoutInitiated {
  
  @scala.inline
  def apply(): SchemaDomainWideTakeoutInitiated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainWideTakeoutInitiated]
  }
  
  @scala.inline
  implicit class SchemaDomainWideTakeoutInitiatedMutableBuilder[Self <: SchemaDomainWideTakeoutInitiated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setTakeoutRequestId(value: String): Self = StObject.set(x, "takeoutRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeoutRequestIdUndefined: Self = StObject.set(x, "takeoutRequestId", js.undefined)
  }
}
