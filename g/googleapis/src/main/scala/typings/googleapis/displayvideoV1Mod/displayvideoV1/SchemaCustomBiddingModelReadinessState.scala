package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomBiddingModelReadinessState extends StObject {
  
  /**
    * The unique ID of the relevant advertiser.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The readiness state of custom bidding model.
    */
  var readinessState: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomBiddingModelReadinessState {
  
  inline def apply(): SchemaCustomBiddingModelReadinessState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomBiddingModelReadinessState]
  }
  
  extension [Self <: SchemaCustomBiddingModelReadinessState](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setReadinessState(value: String): Self = StObject.set(x, "readinessState", value.asInstanceOf[js.Any])
    
    inline def setReadinessStateNull: Self = StObject.set(x, "readinessState", null)
    
    inline def setReadinessStateUndefined: Self = StObject.set(x, "readinessState", js.undefined)
  }
}
