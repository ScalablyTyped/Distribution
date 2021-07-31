package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Experimental service configuration. These configuration options can only be
  * used by whitelisted users.
  */
trait SchemaExperimental extends StObject {
  
  /**
    * Authorization configuration.
    */
  var authorization: js.UndefOr[SchemaAuthorizationConfig] = js.undefined
}
object SchemaExperimental {
  
  @scala.inline
  def apply(): SchemaExperimental = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExperimental]
  }
  
  @scala.inline
  implicit class SchemaExperimentalMutableBuilder[Self <: SchemaExperimental] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: SchemaAuthorizationConfig): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
  }
}
