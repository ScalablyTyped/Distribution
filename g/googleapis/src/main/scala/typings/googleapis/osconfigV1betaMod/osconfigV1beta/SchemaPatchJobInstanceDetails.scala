package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPatchJobInstanceDetails extends StObject {
  
  /**
    * The number of times the agent that the agent attempts to apply the patch.
    */
  var attemptCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the patch fails, this field provides the reason.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier for the instance. This identifier is defined by the server.
    */
  var instanceSystemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The instance name in the form `projects/x/zones/x/instances/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current state of instance patch.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaPatchJobInstanceDetails {
  
  inline def apply(): SchemaPatchJobInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchJobInstanceDetails]
  }
  
  extension [Self <: SchemaPatchJobInstanceDetails](x: Self) {
    
    inline def setAttemptCount(value: String): Self = StObject.set(x, "attemptCount", value.asInstanceOf[js.Any])
    
    inline def setAttemptCountNull: Self = StObject.set(x, "attemptCount", null)
    
    inline def setAttemptCountUndefined: Self = StObject.set(x, "attemptCount", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setInstanceSystemId(value: String): Self = StObject.set(x, "instanceSystemId", value.asInstanceOf[js.Any])
    
    inline def setInstanceSystemIdNull: Self = StObject.set(x, "instanceSystemId", null)
    
    inline def setInstanceSystemIdUndefined: Self = StObject.set(x, "instanceSystemId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
