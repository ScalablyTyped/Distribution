package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalDeviceGrant extends StObject {
  
  /**
    * Type of channel used.
    */
  var channelType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The expiration time of the grant.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transmission frequency range.
    */
  var frequencyRange: js.UndefOr[SchemaSasPortalFrequencyRange] = js.undefined
  
  /**
    * Grant Id.
    */
  var grantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transmit expiration time of the last heartbeat.
    */
  var lastHeartbeatTransmitExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum Equivalent Isotropically Radiated Power (EIRP) permitted by the grant. The maximum EIRP is in units of dBm/MHz. The value of `maxEirp` represents the average (RMS) EIRP that would be measured by the procedure defined in FCC part 96.41(e)(3).
    */
  var maxEirp: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The DPA move lists on which this grant appears.
    */
  var moveList: js.UndefOr[js.Array[SchemaSasPortalDpaMoveList]] = js.undefined
  
  /**
    * State of the grant.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the grant is suspended, the reason(s) for suspension.
    */
  var suspensionReason: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSasPortalDeviceGrant {
  
  inline def apply(): SchemaSasPortalDeviceGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalDeviceGrant]
  }
  
  extension [Self <: SchemaSasPortalDeviceGrant](x: Self) {
    
    inline def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeNull: Self = StObject.set(x, "channelType", null)
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setFrequencyRange(value: SchemaSasPortalFrequencyRange): Self = StObject.set(x, "frequencyRange", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRangeUndefined: Self = StObject.set(x, "frequencyRange", js.undefined)
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdNull: Self = StObject.set(x, "grantId", null)
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "grantId", js.undefined)
    
    inline def setLastHeartbeatTransmitExpireTime(value: String): Self = StObject.set(x, "lastHeartbeatTransmitExpireTime", value.asInstanceOf[js.Any])
    
    inline def setLastHeartbeatTransmitExpireTimeNull: Self = StObject.set(x, "lastHeartbeatTransmitExpireTime", null)
    
    inline def setLastHeartbeatTransmitExpireTimeUndefined: Self = StObject.set(x, "lastHeartbeatTransmitExpireTime", js.undefined)
    
    inline def setMaxEirp(value: Double): Self = StObject.set(x, "maxEirp", value.asInstanceOf[js.Any])
    
    inline def setMaxEirpNull: Self = StObject.set(x, "maxEirp", null)
    
    inline def setMaxEirpUndefined: Self = StObject.set(x, "maxEirp", js.undefined)
    
    inline def setMoveList(value: js.Array[SchemaSasPortalDpaMoveList]): Self = StObject.set(x, "moveList", value.asInstanceOf[js.Any])
    
    inline def setMoveListUndefined: Self = StObject.set(x, "moveList", js.undefined)
    
    inline def setMoveListVarargs(value: SchemaSasPortalDpaMoveList*): Self = StObject.set(x, "moveList", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuspensionReason(value: js.Array[String]): Self = StObject.set(x, "suspensionReason", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonNull: Self = StObject.set(x, "suspensionReason", null)
    
    inline def setSuspensionReasonUndefined: Self = StObject.set(x, "suspensionReason", js.undefined)
    
    inline def setSuspensionReasonVarargs(value: String*): Self = StObject.set(x, "suspensionReason", js.Array(value*))
  }
}
