package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OperationMetadata provides information about the operation execution.
  * Returned in the long-running operation&#39;s metadata field.
  */
trait SchemaOperationMetadata extends StObject {
  
  /**
    * The name of the API method that initiated the operation.
    */
  var apiMethodName: js.UndefOr[String] = js.undefined
  
  var counter: js.UndefOr[SchemaProgressCounter] = js.undefined
  
  /**
    * The time at which the operation was created by the API.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which execution was completed.
    */
  var endTime: js.UndefOr[String] = js.undefined
}
object SchemaOperationMetadata {
  
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataMutableBuilder[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiMethodName(value: String): Self = StObject.set(x, "apiMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMethodNameUndefined: Self = StObject.set(x, "apiMethodName", js.undefined)
    
    @scala.inline
    def setCounter(value: SchemaProgressCounter): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
  }
}
