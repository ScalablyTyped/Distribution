package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementAssignment extends StObject {
  
  /** Whether this placement assignment is active. When true, the placement will be included in the ad's rotation. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** ID of the placement to be assigned. This is a required field. */
  var placementId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the placement. This is a read-only, auto-generated field. */
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Whether the placement to be assigned requires SSL. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslRequired: js.UndefOr[Boolean] = js.undefined
}
object PlacementAssignment {
  
  inline def apply(): PlacementAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementAssignment]
  }
  
  extension [Self <: PlacementAssignment](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "placementIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdDimensionValueUndefined: Self = StObject.set(x, "placementIdDimensionValue", js.undefined)
    
    inline def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    inline def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    inline def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
  }
}
