package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of the operation.
  */
trait SchemaClusterOperationStatus extends StObject {
  
  /**
    * Output only. A message containing any operation metadata details.
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A message containing the detailed operation state.
    */
  var innerState: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A message containing the operation state.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.undefined
}
object SchemaClusterOperationStatus {
  
  @scala.inline
  def apply(): SchemaClusterOperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperationStatus]
  }
  
  @scala.inline
  implicit class SchemaClusterOperationStatusMutableBuilder[Self <: SchemaClusterOperationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setInnerState(value: String): Self = StObject.set(x, "innerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerStateUndefined: Self = StObject.set(x, "innerState", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateStartTime(value: String): Self = StObject.set(x, "stateStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateStartTimeUndefined: Self = StObject.set(x, "stateStartTime", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
