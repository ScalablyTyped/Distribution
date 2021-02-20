package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the status of the Deidentify operation.
  */
@js.native
trait SchemaDeidentifyErrorDetails extends StObject {
  
  /**
    * Number of resources failed to process.
    */
  var failureResourceCount: js.UndefOr[String] = js.native
  
  /**
    * Number of stores failed to process.
    */
  var failureStoreCount: js.UndefOr[String] = js.native
  
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}
object SchemaDeidentifyErrorDetails {
  
  @scala.inline
  def apply(): SchemaDeidentifyErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyErrorDetails]
  }
  
  @scala.inline
  implicit class SchemaDeidentifyErrorDetailsMutableBuilder[Self <: SchemaDeidentifyErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureResourceCount(value: String): Self = StObject.set(x, "failureResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureResourceCountUndefined: Self = StObject.set(x, "failureResourceCount", js.undefined)
    
    @scala.inline
    def setFailureStoreCount(value: String): Self = StObject.set(x, "failureStoreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureStoreCountUndefined: Self = StObject.set(x, "failureStoreCount", js.undefined)
    
    @scala.inline
    def setSuccessResourceCount(value: String): Self = StObject.set(x, "successResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessResourceCountUndefined: Self = StObject.set(x, "successResourceCount", js.undefined)
    
    @scala.inline
    def setSuccessStoreCount(value: String): Self = StObject.set(x, "successStoreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessStoreCountUndefined: Self = StObject.set(x, "successStoreCount", js.undefined)
  }
}
