package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeOptimizationConfiguration extends StObject {
  
  /**
    * ID of this creative optimization config. This field is auto-generated when the campaign is inserted or updated. It can be null for existing campaigns.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this creative optimization config. This is a required field and must be less than 129 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of optimization activities associated with this configuration.
    */
  var optimizationActivitys: js.UndefOr[js.Array[SchemaOptimizationActivity]] = js.undefined
  
  /**
    * Optimization model for this configuration.
    */
  var optimizationModel: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeOptimizationConfiguration {
  
  inline def apply(): SchemaCreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeOptimizationConfiguration]
  }
  
  extension [Self <: SchemaCreativeOptimizationConfiguration](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptimizationActivitys(value: js.Array[SchemaOptimizationActivity]): Self = StObject.set(x, "optimizationActivitys", value.asInstanceOf[js.Any])
    
    inline def setOptimizationActivitysUndefined: Self = StObject.set(x, "optimizationActivitys", js.undefined)
    
    inline def setOptimizationActivitysVarargs(value: SchemaOptimizationActivity*): Self = StObject.set(x, "optimizationActivitys", js.Array(value*))
    
    inline def setOptimizationModel(value: String): Self = StObject.set(x, "optimizationModel", value.asInstanceOf[js.Any])
    
    inline def setOptimizationModelNull: Self = StObject.set(x, "optimizationModel", null)
    
    inline def setOptimizationModelUndefined: Self = StObject.set(x, "optimizationModel", js.undefined)
  }
}
