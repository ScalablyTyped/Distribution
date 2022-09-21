package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhysicalDistancing extends StObject {
  
  /**
    * Common areas arranged to maintain physical distancing.
    */
  var commonAreasPhysicalDistancingArranged: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Common areas physical distancing arranged exception.
    */
  var commonAreasPhysicalDistancingArrangedException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Physical distancing required.
    */
  var physicalDistancingRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Physical distancing required exception.
    */
  var physicalDistancingRequiredException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Safety dividers at front desk and other locations.
    */
  var safetyDividers: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Safety dividers exception.
    */
  var safetyDividersException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Guest occupancy limited within shared facilities.
    */
  var sharedAreasLimitedOccupancy: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Shared areas limited occupancy exception.
    */
  var sharedAreasLimitedOccupancyException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Private spaces designated in spa and wellness areas.
    */
  var wellnessAreasHavePrivateSpaces: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Wellness areas have private spaces exception.
    */
  var wellnessAreasHavePrivateSpacesException: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhysicalDistancing {
  
  inline def apply(): SchemaPhysicalDistancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhysicalDistancing]
  }
  
  extension [Self <: SchemaPhysicalDistancing](x: Self) {
    
    inline def setCommonAreasPhysicalDistancingArranged(value: Boolean): Self = StObject.set(x, "commonAreasPhysicalDistancingArranged", value.asInstanceOf[js.Any])
    
    inline def setCommonAreasPhysicalDistancingArrangedException(value: String): Self = StObject.set(x, "commonAreasPhysicalDistancingArrangedException", value.asInstanceOf[js.Any])
    
    inline def setCommonAreasPhysicalDistancingArrangedExceptionNull: Self = StObject.set(x, "commonAreasPhysicalDistancingArrangedException", null)
    
    inline def setCommonAreasPhysicalDistancingArrangedExceptionUndefined: Self = StObject.set(x, "commonAreasPhysicalDistancingArrangedException", js.undefined)
    
    inline def setCommonAreasPhysicalDistancingArrangedNull: Self = StObject.set(x, "commonAreasPhysicalDistancingArranged", null)
    
    inline def setCommonAreasPhysicalDistancingArrangedUndefined: Self = StObject.set(x, "commonAreasPhysicalDistancingArranged", js.undefined)
    
    inline def setPhysicalDistancingRequired(value: Boolean): Self = StObject.set(x, "physicalDistancingRequired", value.asInstanceOf[js.Any])
    
    inline def setPhysicalDistancingRequiredException(value: String): Self = StObject.set(x, "physicalDistancingRequiredException", value.asInstanceOf[js.Any])
    
    inline def setPhysicalDistancingRequiredExceptionNull: Self = StObject.set(x, "physicalDistancingRequiredException", null)
    
    inline def setPhysicalDistancingRequiredExceptionUndefined: Self = StObject.set(x, "physicalDistancingRequiredException", js.undefined)
    
    inline def setPhysicalDistancingRequiredNull: Self = StObject.set(x, "physicalDistancingRequired", null)
    
    inline def setPhysicalDistancingRequiredUndefined: Self = StObject.set(x, "physicalDistancingRequired", js.undefined)
    
    inline def setSafetyDividers(value: Boolean): Self = StObject.set(x, "safetyDividers", value.asInstanceOf[js.Any])
    
    inline def setSafetyDividersException(value: String): Self = StObject.set(x, "safetyDividersException", value.asInstanceOf[js.Any])
    
    inline def setSafetyDividersExceptionNull: Self = StObject.set(x, "safetyDividersException", null)
    
    inline def setSafetyDividersExceptionUndefined: Self = StObject.set(x, "safetyDividersException", js.undefined)
    
    inline def setSafetyDividersNull: Self = StObject.set(x, "safetyDividers", null)
    
    inline def setSafetyDividersUndefined: Self = StObject.set(x, "safetyDividers", js.undefined)
    
    inline def setSharedAreasLimitedOccupancy(value: Boolean): Self = StObject.set(x, "sharedAreasLimitedOccupancy", value.asInstanceOf[js.Any])
    
    inline def setSharedAreasLimitedOccupancyException(value: String): Self = StObject.set(x, "sharedAreasLimitedOccupancyException", value.asInstanceOf[js.Any])
    
    inline def setSharedAreasLimitedOccupancyExceptionNull: Self = StObject.set(x, "sharedAreasLimitedOccupancyException", null)
    
    inline def setSharedAreasLimitedOccupancyExceptionUndefined: Self = StObject.set(x, "sharedAreasLimitedOccupancyException", js.undefined)
    
    inline def setSharedAreasLimitedOccupancyNull: Self = StObject.set(x, "sharedAreasLimitedOccupancy", null)
    
    inline def setSharedAreasLimitedOccupancyUndefined: Self = StObject.set(x, "sharedAreasLimitedOccupancy", js.undefined)
    
    inline def setWellnessAreasHavePrivateSpaces(value: Boolean): Self = StObject.set(x, "wellnessAreasHavePrivateSpaces", value.asInstanceOf[js.Any])
    
    inline def setWellnessAreasHavePrivateSpacesException(value: String): Self = StObject.set(x, "wellnessAreasHavePrivateSpacesException", value.asInstanceOf[js.Any])
    
    inline def setWellnessAreasHavePrivateSpacesExceptionNull: Self = StObject.set(x, "wellnessAreasHavePrivateSpacesException", null)
    
    inline def setWellnessAreasHavePrivateSpacesExceptionUndefined: Self = StObject.set(x, "wellnessAreasHavePrivateSpacesException", js.undefined)
    
    inline def setWellnessAreasHavePrivateSpacesNull: Self = StObject.set(x, "wellnessAreasHavePrivateSpaces", null)
    
    inline def setWellnessAreasHavePrivateSpacesUndefined: Self = StObject.set(x, "wellnessAreasHavePrivateSpaces", js.undefined)
  }
}
