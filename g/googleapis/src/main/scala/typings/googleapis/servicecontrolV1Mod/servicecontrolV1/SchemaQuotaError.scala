package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents error information for QuotaOperation.
  */
trait SchemaQuotaError extends StObject {
  
  /**
    * Error code.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Free-form text that provides details on the cause of the error.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Subject to whom this error applies. See the specific enum for more
    * details on this field. For example, &quot;clientip:&lt;ip address of
    * client&gt;&quot; or &quot;project:&lt;Google developer project
    * id&gt;&quot;.
    */
  var subject: js.UndefOr[String] = js.undefined
}
object SchemaQuotaError {
  
  @scala.inline
  def apply(): SchemaQuotaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaError]
  }
  
  @scala.inline
  implicit class SchemaQuotaErrorMutableBuilder[Self <: SchemaQuotaError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
