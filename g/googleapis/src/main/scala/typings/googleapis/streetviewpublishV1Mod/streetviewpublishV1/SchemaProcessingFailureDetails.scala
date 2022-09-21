package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProcessingFailureDetails extends StObject {
  
  /**
    * See GpsDataGapFailureDetails.
    */
  var gpsDataGapDetails: js.UndefOr[SchemaGpsDataGapFailureDetails] = js.undefined
  
  /**
    * See ImuDataGapFailureDetails.
    */
  var imuDataGapDetails: js.UndefOr[SchemaImuDataGapFailureDetails] = js.undefined
  
  /**
    * See InsufficientGpsFailureDetails.
    */
  var insufficientGpsDetails: js.UndefOr[SchemaInsufficientGpsFailureDetails] = js.undefined
  
  /**
    * See NotOutdoorsFailureDetails.
    */
  var notOutdoorsDetails: js.UndefOr[SchemaNotOutdoorsFailureDetails] = js.undefined
}
object SchemaProcessingFailureDetails {
  
  inline def apply(): SchemaProcessingFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProcessingFailureDetails]
  }
  
  extension [Self <: SchemaProcessingFailureDetails](x: Self) {
    
    inline def setGpsDataGapDetails(value: SchemaGpsDataGapFailureDetails): Self = StObject.set(x, "gpsDataGapDetails", value.asInstanceOf[js.Any])
    
    inline def setGpsDataGapDetailsUndefined: Self = StObject.set(x, "gpsDataGapDetails", js.undefined)
    
    inline def setImuDataGapDetails(value: SchemaImuDataGapFailureDetails): Self = StObject.set(x, "imuDataGapDetails", value.asInstanceOf[js.Any])
    
    inline def setImuDataGapDetailsUndefined: Self = StObject.set(x, "imuDataGapDetails", js.undefined)
    
    inline def setInsufficientGpsDetails(value: SchemaInsufficientGpsFailureDetails): Self = StObject.set(x, "insufficientGpsDetails", value.asInstanceOf[js.Any])
    
    inline def setInsufficientGpsDetailsUndefined: Self = StObject.set(x, "insufficientGpsDetails", js.undefined)
    
    inline def setNotOutdoorsDetails(value: SchemaNotOutdoorsFailureDetails): Self = StObject.set(x, "notOutdoorsDetails", value.asInstanceOf[js.Any])
    
    inline def setNotOutdoorsDetailsUndefined: Self = StObject.set(x, "notOutdoorsDetails", js.undefined)
  }
}
