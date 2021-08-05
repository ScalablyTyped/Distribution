package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A backend rule provides configuration for an individual API element.
  */
trait SchemaBackendRule extends StObject {
  
  /**
    * The address of the API backend.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seconds to wait for a response from a request.  The default
    * deadline for gRPC is infinite (no deadline) and HTTP requests is 5
    * seconds.
    */
  var deadline: js.UndefOr[Double] = js.undefined
  
  /**
    * The JWT audience is used when generating a JWT id token for the backend.
    */
  var jwtAudience: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum deadline in seconds needed for this method. Calls having deadline
    * value lower than this will be rejected.
    */
  var minDeadline: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of seconds to wait for the completion of a long running
    * operation. The default is no deadline.
    */
  var operationDeadline: js.UndefOr[Double] = js.undefined
  
  var pathTranslation: js.UndefOr[String] = js.undefined
  
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}
object SchemaBackendRule {
  
  inline def apply(): SchemaBackendRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendRule]
  }
  
  extension [Self <: SchemaBackendRule](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    
    inline def setJwtAudience(value: String): Self = StObject.set(x, "jwtAudience", value.asInstanceOf[js.Any])
    
    inline def setJwtAudienceUndefined: Self = StObject.set(x, "jwtAudience", js.undefined)
    
    inline def setMinDeadline(value: Double): Self = StObject.set(x, "minDeadline", value.asInstanceOf[js.Any])
    
    inline def setMinDeadlineUndefined: Self = StObject.set(x, "minDeadline", js.undefined)
    
    inline def setOperationDeadline(value: Double): Self = StObject.set(x, "operationDeadline", value.asInstanceOf[js.Any])
    
    inline def setOperationDeadlineUndefined: Self = StObject.set(x, "operationDeadline", js.undefined)
    
    inline def setPathTranslation(value: String): Self = StObject.set(x, "pathTranslation", value.asInstanceOf[js.Any])
    
    inline def setPathTranslationUndefined: Self = StObject.set(x, "pathTranslation", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
