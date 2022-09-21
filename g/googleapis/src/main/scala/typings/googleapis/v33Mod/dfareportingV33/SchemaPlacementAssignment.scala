package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlacementAssignment extends StObject {
  
  /**
    * Whether this placement assignment is active. When true, the placement will be included in the ad's rotation.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * ID of the placement to be assigned. This is a required field.
    */
  var placementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the placement. This is a read-only, auto-generated field.
    */
  var placementIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Whether the placement to be assigned requires SSL. This is a read-only field that is auto-generated when the ad is inserted or updated.
    */
  var sslRequired: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPlacementAssignment {
  
  inline def apply(): SchemaPlacementAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementAssignment]
  }
  
  extension [Self <: SchemaPlacementAssignment](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "placementIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdDimensionValueUndefined: Self = StObject.set(x, "placementIdDimensionValue", js.undefined)
    
    inline def setPlacementIdNull: Self = StObject.set(x, "placementId", null)
    
    inline def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    inline def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    inline def setSslRequiredNull: Self = StObject.set(x, "sslRequired", null)
    
    inline def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
  }
}
