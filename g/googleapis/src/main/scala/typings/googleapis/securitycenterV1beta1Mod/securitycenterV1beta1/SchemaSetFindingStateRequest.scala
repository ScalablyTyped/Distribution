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
  
  @scala.inline
  def apply(): SchemaSetFindingStateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetFindingStateRequest]
  }
  
  @scala.inline
  implicit class SchemaSetFindingStateRequestMutableBuilder[Self <: SchemaSetFindingStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
