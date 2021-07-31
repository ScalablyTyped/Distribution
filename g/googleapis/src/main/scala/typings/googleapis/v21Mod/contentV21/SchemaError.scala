package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error returned by the API.
  */
trait SchemaError extends StObject {
  
  /**
    * The domain of the error.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the error.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The error code.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaError {
  
  @scala.inline
  def apply(): SchemaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaError]
  }
  
  @scala.inline
  implicit class SchemaErrorMutableBuilder[Self <: SchemaError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
