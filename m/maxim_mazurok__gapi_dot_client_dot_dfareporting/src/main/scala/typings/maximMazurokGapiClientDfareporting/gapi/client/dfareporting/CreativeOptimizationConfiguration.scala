package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeOptimizationConfiguration extends StObject {
  
  /** ID of this creative optimization config. This field is auto-generated when the campaign is inserted or updated. It can be null for existing campaigns. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Name of this creative optimization config. This is a required field and must be less than 129 characters long. */
  var name: js.UndefOr[String] = js.undefined
  
  /** List of optimization activities associated with this configuration. */
  var optimizationActivitys: js.UndefOr[js.Array[OptimizationActivity]] = js.undefined
  
  /** Optimization model for this configuration. */
  var optimizationModel: js.UndefOr[String] = js.undefined
}
object CreativeOptimizationConfiguration {
  
  inline def apply(): CreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeOptimizationConfiguration]
  }
  
  extension [Self <: CreativeOptimizationConfiguration](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptimizationActivitys(value: js.Array[OptimizationActivity]): Self = StObject.set(x, "optimizationActivitys", value.asInstanceOf[js.Any])
    
    inline def setOptimizationActivitysUndefined: Self = StObject.set(x, "optimizationActivitys", js.undefined)
    
    inline def setOptimizationActivitysVarargs(value: OptimizationActivity*): Self = StObject.set(x, "optimizationActivitys", js.Array(value :_*))
    
    inline def setOptimizationModel(value: String): Self = StObject.set(x, "optimizationModel", value.asInstanceOf[js.Any])
    
    inline def setOptimizationModelUndefined: Self = StObject.set(x, "optimizationModel", js.undefined)
  }
}
