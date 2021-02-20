package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the errors to be returned in
  * google.api.servicecontrol.v1.CheckResponse.check_errors.
  */
@js.native
trait SchemaCheckError extends StObject {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Free-form text providing details on the error cause of the error.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * Contains public information about the check error. If available,
    * `status.code` will be non zero and client can propagate it out as public
    * error.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * Subject to whom this error applies. See the specific code enum for more
    * details on this field. For example:     - “project:&lt;project-id or
    * project-number&gt;”     - “folder:&lt;folder-id&gt;”     -
    * “organization:&lt;organization-id&gt;”
    */
  var subject: js.UndefOr[String] = js.native
}
object SchemaCheckError {
  
  @scala.inline
  def apply(): SchemaCheckError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckError]
  }
  
  @scala.inline
  implicit class SchemaCheckErrorMutableBuilder[Self <: SchemaCheckError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
