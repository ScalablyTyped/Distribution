package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure to describe the error encountered during batch operation on one
  * resource. This is used both for sample errors in operation response, and
  * for format of errors in error reports.
  */
trait SchemaErrorDetail extends StObject {
  
  /**
    * The status of the error.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The identifier of the resource.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object SchemaErrorDetail {
  
  @scala.inline
  def apply(): SchemaErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorDetail]
  }
  
  @scala.inline
  implicit class SchemaErrorDetailMutableBuilder[Self <: SchemaErrorDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
