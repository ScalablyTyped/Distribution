package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomBiddingAlgorithm extends StObject {
  
  /**
    * Immutable. The unique ID of the advertiser that owns the custom bidding algorithm.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID of the custom bidding algorithm. Assigned by the system.
    */
  var customBiddingAlgorithmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The status of custom bidding algorithm.
    */
  var customBiddingAlgorithmState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The type of custom bidding algorithm.
    */
  var customBiddingAlgorithmType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the custom bidding algorithm. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls whether or not the custom bidding algorithm can be used as a bidding strategy. Accepted values are: * `ENTITY_STATUS_ACTIVE` * `ENTITY_STATUS_ARCHIVED`
    */
  var entityStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of custom bidding model readiness for each advertiser who has access. This field may only include the state of the queried advertiser if the algorithm [`owner`](/display-video/api/reference/rest/v1/customBiddingAlgorithms#CustomBiddingAlgorithm.FIELDS.oneof_owner) is a partner and is being retrieved using an advertiser [`accessor`](/display-video/api/reference/rest/v1/customBiddingAlgorithms/list#body.QUERY_PARAMETERS.oneof_accessor).
    */
  var modelReadiness: js.UndefOr[js.Array[SchemaCustomBiddingModelReadinessState]] = js.undefined
  
  /**
    * Output only. The resource name of the custom bidding algorithm.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The unique ID of the partner that owns the custom bidding algorithm.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IDs of the advertisers who have access to this algorithm. If advertiser_id is set, this field will only consist of that value. This field will not be set if the algorithm [`owner`](/display-video/api/reference/rest/v1/customBiddingAlgorithms#CustomBiddingAlgorithm.FIELDS.oneof_owner) is a partner and is being retrieved using an advertiser [`accessor`](/display-video/api/reference/rest/v1/customBiddingAlgorithms/list#body.QUERY_PARAMETERS.oneof_accessor).
    */
  var sharedAdvertiserIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCustomBiddingAlgorithm {
  
  inline def apply(): SchemaCustomBiddingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomBiddingAlgorithm]
  }
  
  extension [Self <: SchemaCustomBiddingAlgorithm](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCustomBiddingAlgorithmId(value: String): Self = StObject.set(x, "customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmIdNull: Self = StObject.set(x, "customBiddingAlgorithmId", null)
    
    inline def setCustomBiddingAlgorithmIdUndefined: Self = StObject.set(x, "customBiddingAlgorithmId", js.undefined)
    
    inline def setCustomBiddingAlgorithmState(value: String): Self = StObject.set(x, "customBiddingAlgorithmState", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmStateNull: Self = StObject.set(x, "customBiddingAlgorithmState", null)
    
    inline def setCustomBiddingAlgorithmStateUndefined: Self = StObject.set(x, "customBiddingAlgorithmState", js.undefined)
    
    inline def setCustomBiddingAlgorithmType(value: String): Self = StObject.set(x, "customBiddingAlgorithmType", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmTypeNull: Self = StObject.set(x, "customBiddingAlgorithmType", null)
    
    inline def setCustomBiddingAlgorithmTypeUndefined: Self = StObject.set(x, "customBiddingAlgorithmType", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusNull: Self = StObject.set(x, "entityStatus", null)
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setModelReadiness(value: js.Array[SchemaCustomBiddingModelReadinessState]): Self = StObject.set(x, "modelReadiness", value.asInstanceOf[js.Any])
    
    inline def setModelReadinessUndefined: Self = StObject.set(x, "modelReadiness", js.undefined)
    
    inline def setModelReadinessVarargs(value: SchemaCustomBiddingModelReadinessState*): Self = StObject.set(x, "modelReadiness", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setSharedAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "sharedAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setSharedAdvertiserIdsNull: Self = StObject.set(x, "sharedAdvertiserIds", null)
    
    inline def setSharedAdvertiserIdsUndefined: Self = StObject.set(x, "sharedAdvertiserIds", js.undefined)
    
    inline def setSharedAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "sharedAdvertiserIds", js.Array(value*))
  }
}
