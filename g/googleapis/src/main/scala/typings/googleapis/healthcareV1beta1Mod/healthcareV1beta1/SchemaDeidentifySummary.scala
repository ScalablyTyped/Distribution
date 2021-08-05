package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a detailed summary of the Deidentify operation.
  */
trait SchemaDeidentifySummary extends StObject {
  
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.undefined
  
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.undefined
}
object SchemaDeidentifySummary {
  
  inline def apply(): SchemaDeidentifySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifySummary]
  }
  
  extension [Self <: SchemaDeidentifySummary](x: Self) {
    
    inline def setSuccessResourceCount(value: String): Self = StObject.set(x, "successResourceCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessResourceCountUndefined: Self = StObject.set(x, "successResourceCount", js.undefined)
    
    inline def setSuccessStoreCount(value: String): Self = StObject.set(x, "successStoreCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessStoreCountUndefined: Self = StObject.set(x, "successStoreCount", js.undefined)
  }
}
