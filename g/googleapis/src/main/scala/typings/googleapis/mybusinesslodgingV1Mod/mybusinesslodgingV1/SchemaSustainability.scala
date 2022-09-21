package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSustainability extends StObject {
  
  /**
    * Energy efficiency practices implemented at the hotel.
    */
  var energyEfficiency: js.UndefOr[SchemaEnergyEfficiency] = js.undefined
  
  /**
    * Sustainability certifications the hotel has been awarded.
    */
  var sustainabilityCertifications: js.UndefOr[SchemaSustainabilityCertifications] = js.undefined
  
  /**
    * Sustainable sourcing practices implemented at the hotel.
    */
  var sustainableSourcing: js.UndefOr[SchemaSustainableSourcing] = js.undefined
  
  /**
    * Waste reduction practices implemented at the hotel.
    */
  var wasteReduction: js.UndefOr[SchemaWasteReduction] = js.undefined
  
  /**
    * Water conservation practices implemented at the hotel.
    */
  var waterConservation: js.UndefOr[SchemaWaterConservation] = js.undefined
}
object SchemaSustainability {
  
  inline def apply(): SchemaSustainability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSustainability]
  }
  
  extension [Self <: SchemaSustainability](x: Self) {
    
    inline def setEnergyEfficiency(value: SchemaEnergyEfficiency): Self = StObject.set(x, "energyEfficiency", value.asInstanceOf[js.Any])
    
    inline def setEnergyEfficiencyUndefined: Self = StObject.set(x, "energyEfficiency", js.undefined)
    
    inline def setSustainabilityCertifications(value: SchemaSustainabilityCertifications): Self = StObject.set(x, "sustainabilityCertifications", value.asInstanceOf[js.Any])
    
    inline def setSustainabilityCertificationsUndefined: Self = StObject.set(x, "sustainabilityCertifications", js.undefined)
    
    inline def setSustainableSourcing(value: SchemaSustainableSourcing): Self = StObject.set(x, "sustainableSourcing", value.asInstanceOf[js.Any])
    
    inline def setSustainableSourcingUndefined: Self = StObject.set(x, "sustainableSourcing", js.undefined)
    
    inline def setWasteReduction(value: SchemaWasteReduction): Self = StObject.set(x, "wasteReduction", value.asInstanceOf[js.Any])
    
    inline def setWasteReductionUndefined: Self = StObject.set(x, "wasteReduction", js.undefined)
    
    inline def setWaterConservation(value: SchemaWaterConservation): Self = StObject.set(x, "waterConservation", value.asInstanceOf[js.Any])
    
    inline def setWaterConservationUndefined: Self = StObject.set(x, "waterConservation", js.undefined)
  }
}
