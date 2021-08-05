package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the status of the Deidentify operation.
  */
trait SchemaDeidentifyErrorDetails extends StObject {
  
  /**
    * Number of resources failed to process.
    */
  var failureResourceCount: js.UndefOr[String] = js.undefined
  
  /**
    * Number of stores failed to process.
    */
  var failureStoreCount: js.UndefOr[String] = js.undefined
  
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.undefined
  
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.undefined
}
object SchemaDeidentifyErrorDetails {
  
  inline def apply(): SchemaDeidentifyErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyErrorDetails]
  }
  
  extension [Self <: SchemaDeidentifyErrorDetails](x: Self) {
    
    inline def setFailureResourceCount(value: String): Self = StObject.set(x, "failureResourceCount", value.asInstanceOf[js.Any])
    
    inline def setFailureResourceCountUndefined: Self = StObject.set(x, "failureResourceCount", js.undefined)
    
    inline def setFailureStoreCount(value: String): Self = StObject.set(x, "failureStoreCount", value.asInstanceOf[js.Any])
    
    inline def setFailureStoreCountUndefined: Self = StObject.set(x, "failureStoreCount", js.undefined)
    
    inline def setSuccessResourceCount(value: String): Self = StObject.set(x, "successResourceCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessResourceCountUndefined: Self = StObject.set(x, "successResourceCount", js.undefined)
    
    inline def setSuccessStoreCount(value: String): Self = StObject.set(x, "successStoreCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessStoreCountUndefined: Self = StObject.set(x, "successStoreCount", js.undefined)
  }
}
