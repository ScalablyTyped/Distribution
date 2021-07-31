package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggestion by the service to the worker to dynamically split the
  * WorkItem.
  */
trait SchemaApproximateSplitRequest extends StObject {
  
  /**
    * A fraction at which to split the work item, from 0.0 (beginning of the
    * input) to 1.0 (end of the input).
    */
  var fractionConsumed: js.UndefOr[Double] = js.undefined
  
  /**
    * The fraction of the remainder of work to split the work item at, from 0.0
    * (split at the current position) to 1.0 (end of the input).
    */
  var fractionOfRemainder: js.UndefOr[Double] = js.undefined
  
  /**
    * A Position at which to split the work item.
    */
  var position: js.UndefOr[SchemaPosition] = js.undefined
}
object SchemaApproximateSplitRequest {
  
  @scala.inline
  def apply(): SchemaApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateSplitRequest]
  }
  
  @scala.inline
  implicit class SchemaApproximateSplitRequestMutableBuilder[Self <: SchemaApproximateSplitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFractionConsumed(value: Double): Self = StObject.set(x, "fractionConsumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionConsumedUndefined: Self = StObject.set(x, "fractionConsumed", js.undefined)
    
    @scala.inline
    def setFractionOfRemainder(value: Double): Self = StObject.set(x, "fractionOfRemainder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionOfRemainderUndefined: Self = StObject.set(x, "fractionOfRemainder", js.undefined)
    
    @scala.inline
    def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
