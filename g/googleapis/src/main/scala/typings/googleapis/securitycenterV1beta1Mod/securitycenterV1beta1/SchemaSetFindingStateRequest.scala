package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for updating a finding&#39;s state.
  */
trait SchemaSetFindingStateRequest extends StObject {
  
  /**
    * The time at which the updated state takes effect.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The desired State of the finding.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaSetFindingStateRequest {
  
  inline def apply(): SchemaSetFindingStateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetFindingStateRequest]
  }
  
  extension [Self <: SchemaSetFindingStateRequest](x: Self) {
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
