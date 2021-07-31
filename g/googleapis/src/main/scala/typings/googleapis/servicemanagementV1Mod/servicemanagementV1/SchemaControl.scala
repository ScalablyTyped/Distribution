package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Selects and configures the service controller used by the service.  The
  * service controller handles features like abuse, quota, billing, logging,
  * monitoring, etc.
  */
trait SchemaControl extends StObject {
  
  /**
    * The service control environment to use. If empty, no control plane
    * feature (like quota and billing) will be enabled.
    */
  var environment: js.UndefOr[String] = js.undefined
}
object SchemaControl {
  
  @scala.inline
  def apply(): SchemaControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaControl]
  }
  
  @scala.inline
  implicit class SchemaControlMutableBuilder[Self <: SchemaControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
