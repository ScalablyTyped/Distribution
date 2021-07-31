package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides error messages for the failing services.
  */
trait SchemaEnableFailure extends StObject {
  
  /**
    * An error message describing why the service could not be enabled.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The service id of a service that could not be enabled.
    */
  var serviceId: js.UndefOr[String] = js.undefined
}
object SchemaEnableFailure {
  
  @scala.inline
  def apply(): SchemaEnableFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnableFailure]
  }
  
  @scala.inline
  implicit class SchemaEnableFailureMutableBuilder[Self <: SchemaEnableFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
