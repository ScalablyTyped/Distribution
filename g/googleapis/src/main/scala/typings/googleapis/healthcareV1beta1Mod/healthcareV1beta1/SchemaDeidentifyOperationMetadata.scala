package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeidentifyOperationMetadata extends StObject {
  
  /**
    * Details about the FHIR store to write the output to.
    */
  var fhirOutput: js.UndefOr[SchemaFhirOutput] = js.undefined
}
object SchemaDeidentifyOperationMetadata {
  
  inline def apply(): SchemaDeidentifyOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyOperationMetadata]
  }
  
  extension [Self <: SchemaDeidentifyOperationMetadata](x: Self) {
    
    inline def setFhirOutput(value: SchemaFhirOutput): Self = StObject.set(x, "fhirOutput", value.asInstanceOf[js.Any])
    
    inline def setFhirOutputUndefined: Self = StObject.set(x, "fhirOutput", js.undefined)
  }
}
