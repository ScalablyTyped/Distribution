package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A backend rule provides configuration for an individual API element.
  */
@js.native
trait SchemaBackendRule extends StObject {
  
  /**
    * The address of the API backend.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * The number of seconds to wait for a response from a request.  The default
    * deadline for gRPC is infinite (no deadline) and HTTP requests is 5
    * seconds.
    */
  var deadline: js.UndefOr[Double] = js.native
  
  /**
    * The JWT audience is used when generating a JWT id token for the backend.
    */
  var jwtAudience: js.UndefOr[String] = js.native
  
  /**
    * Minimum deadline in seconds needed for this method. Calls having deadline
    * value lower than this will be rejected.
    */
  var minDeadline: js.UndefOr[Double] = js.native
  
  /**
    * The number of seconds to wait for the completion of a long running
    * operation. The default is no deadline.
    */
  var operationDeadline: js.UndefOr[Double] = js.native
  
  var pathTranslation: js.UndefOr[String] = js.native
  
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}
object SchemaBackendRule {
  
  @scala.inline
  def apply(): SchemaBackendRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendRule]
  }
  
  @scala.inline
  implicit class SchemaBackendRuleMutableBuilder[Self <: SchemaBackendRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    
    @scala.inline
    def setJwtAudience(value: String): Self = StObject.set(x, "jwtAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwtAudienceUndefined: Self = StObject.set(x, "jwtAudience", js.undefined)
    
    @scala.inline
    def setMinDeadline(value: Double): Self = StObject.set(x, "minDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDeadlineUndefined: Self = StObject.set(x, "minDeadline", js.undefined)
    
    @scala.inline
    def setOperationDeadline(value: Double): Self = StObject.set(x, "operationDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationDeadlineUndefined: Self = StObject.set(x, "operationDeadline", js.undefined)
    
    @scala.inline
    def setPathTranslation(value: String): Self = StObject.set(x, "pathTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathTranslationUndefined: Self = StObject.set(x, "pathTranslation", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
