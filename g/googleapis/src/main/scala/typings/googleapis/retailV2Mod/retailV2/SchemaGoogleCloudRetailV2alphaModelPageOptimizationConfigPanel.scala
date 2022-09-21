package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel extends StObject {
  
  /**
    * Required. The candidates to consider on the panel. Limit = 10.
    */
  var candidates: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate]] = js.undefined
  
  /**
    * Required. The default candidate. If the model fails at serving time, we fall back to the default.
    */
  var defaultCandidate: js.UndefOr[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate] = js.undefined
  
  /**
    * Optional. The name to display for the panel.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel](x: Self) {
    
    inline def setCandidates(value: js.Array[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate*): Self = StObject.set(x, "candidates", js.Array(value*))
    
    inline def setDefaultCandidate(value: SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate): Self = StObject.set(x, "defaultCandidate", value.asInstanceOf[js.Any])
    
    inline def setDefaultCandidateUndefined: Self = StObject.set(x, "defaultCandidate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
