package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingSpace extends StObject {
  
  /**
    * Which number classes are accepted by this meeting at the moment? When there is no ongoing conference, this field may change independent of the version number of the MeetingSpace.
    * When a conference starts, this field will be locked to the value at that time, and then will be unlocked again at the end of the conference.
    */
  var acceptedNumberClass: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Broadcast access information for this meeting space. */
  var broadcastAccess: js.UndefOr[BroadcastAccess] = js.undefined
  
  /**
    * Information relevant to an ongoing conference. This field will be set in responses if the client requesting the meeting space has a device in one of the JOINED, HIDDEN, or
    * MISSING_PREREQUISITES states. The field will also be set without a created device if the client requesting the meeting space is eligible to directly create a device in the JOINED
    * state without knocking, eg a same-domain joiner. Can also only be updated by clients with a device in the JOINED state.
    */
  var callInfo: js.UndefOr[CallInfo] = js.undefined
  
  /** The interop gateway access information for the meeting space. A gateway access can be used when joining conferences from non-Google equipment through an interop gateway. */
  var gatewayAccess: js.UndefOr[GatewayAccess] = js.undefined
  
  /** The SIP based access methods that can be used to join the conference. */
  var gatewaySipAccess: js.UndefOr[js.Array[GatewaySipAccess]] = js.undefined
  
  /**
    * An optional alias for the meeting space. The alias can in some cases be resolved to the meeting space, similar to the meeting code. The limitation is that the user needs to be in
    * the same meeting domain as the meeting space. See go/thor-backend/meeting-alias for more details.
    */
  var meetingAlias: js.UndefOr[String] = js.undefined
  
  /** A meeting code is a globally unique code which points to a meeting space. Note: Meeting codes may be regenerated, which will cause old meeting codes to become invalid. */
  var meetingCode: js.UndefOr[String] = js.undefined
  
  /**
    * A unique server-generated ID for the meeting space. This is the resource name of the meeting space resource and has the form `spaces/`, where is a sequence of characters in the
    * [base64url set](https://tools.ietf.org/html/rfc4648#section-5), without any `=` characters.
    */
  var meetingSpaceId: js.UndefOr[String] = js.undefined
  
  /** A URL to identify and access the meeting space. Output only. */
  var meetingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A URL that clients (e.g. Calendar) can use to show the web page with all join methods available for this meeting space. This link is also used in iOS universal links
    * and Android intents, used for opening the "More ways to join" view in the Thor mobile apps. Example: https://tel.meet/mee-ting-cod?pin=1234567891011 Here, "pin" is the universal
    * phone PIN. We include it explicitly to better support the offline case on the mobile. This is set when the meeting space has either a universal PIN or an interop PIN and clients who
    * can show a "more ways to join" button should show it whenever this field is set.
    */
  var moreJoinUrl: js.UndefOr[String] = js.undefined
  
  /** All regional phone access methods for this meeting space. Can be empty. */
  var phoneAccess: js.UndefOr[js.Array[PhoneAccess]] = js.undefined
  
  /** Settings of the meeting space. */
  var settings: js.UndefOr[Settings] = js.undefined
  
  /** A universal phone access method for this meeting space. Can be unset. */
  var universalPhoneAccess: js.UndefOr[UniversalPhoneAccess] = js.undefined
}
object MeetingSpace {
  
  inline def apply(): MeetingSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingSpace]
  }
  
  extension [Self <: MeetingSpace](x: Self) {
    
    inline def setAcceptedNumberClass(value: js.Array[String]): Self = StObject.set(x, "acceptedNumberClass", value.asInstanceOf[js.Any])
    
    inline def setAcceptedNumberClassUndefined: Self = StObject.set(x, "acceptedNumberClass", js.undefined)
    
    inline def setAcceptedNumberClassVarargs(value: String*): Self = StObject.set(x, "acceptedNumberClass", js.Array(value*))
    
    inline def setBroadcastAccess(value: BroadcastAccess): Self = StObject.set(x, "broadcastAccess", value.asInstanceOf[js.Any])
    
    inline def setBroadcastAccessUndefined: Self = StObject.set(x, "broadcastAccess", js.undefined)
    
    inline def setCallInfo(value: CallInfo): Self = StObject.set(x, "callInfo", value.asInstanceOf[js.Any])
    
    inline def setCallInfoUndefined: Self = StObject.set(x, "callInfo", js.undefined)
    
    inline def setGatewayAccess(value: GatewayAccess): Self = StObject.set(x, "gatewayAccess", value.asInstanceOf[js.Any])
    
    inline def setGatewayAccessUndefined: Self = StObject.set(x, "gatewayAccess", js.undefined)
    
    inline def setGatewaySipAccess(value: js.Array[GatewaySipAccess]): Self = StObject.set(x, "gatewaySipAccess", value.asInstanceOf[js.Any])
    
    inline def setGatewaySipAccessUndefined: Self = StObject.set(x, "gatewaySipAccess", js.undefined)
    
    inline def setGatewaySipAccessVarargs(value: GatewaySipAccess*): Self = StObject.set(x, "gatewaySipAccess", js.Array(value*))
    
    inline def setMeetingAlias(value: String): Self = StObject.set(x, "meetingAlias", value.asInstanceOf[js.Any])
    
    inline def setMeetingAliasUndefined: Self = StObject.set(x, "meetingAlias", js.undefined)
    
    inline def setMeetingCode(value: String): Self = StObject.set(x, "meetingCode", value.asInstanceOf[js.Any])
    
    inline def setMeetingCodeUndefined: Self = StObject.set(x, "meetingCode", js.undefined)
    
    inline def setMeetingSpaceId(value: String): Self = StObject.set(x, "meetingSpaceId", value.asInstanceOf[js.Any])
    
    inline def setMeetingSpaceIdUndefined: Self = StObject.set(x, "meetingSpaceId", js.undefined)
    
    inline def setMeetingUrl(value: String): Self = StObject.set(x, "meetingUrl", value.asInstanceOf[js.Any])
    
    inline def setMeetingUrlUndefined: Self = StObject.set(x, "meetingUrl", js.undefined)
    
    inline def setMoreJoinUrl(value: String): Self = StObject.set(x, "moreJoinUrl", value.asInstanceOf[js.Any])
    
    inline def setMoreJoinUrlUndefined: Self = StObject.set(x, "moreJoinUrl", js.undefined)
    
    inline def setPhoneAccess(value: js.Array[PhoneAccess]): Self = StObject.set(x, "phoneAccess", value.asInstanceOf[js.Any])
    
    inline def setPhoneAccessUndefined: Self = StObject.set(x, "phoneAccess", js.undefined)
    
    inline def setPhoneAccessVarargs(value: PhoneAccess*): Self = StObject.set(x, "phoneAccess", js.Array(value*))
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUniversalPhoneAccess(value: UniversalPhoneAccess): Self = StObject.set(x, "universalPhoneAccess", value.asInstanceOf[js.Any])
    
    inline def setUniversalPhoneAccessUndefined: Self = StObject.set(x, "universalPhoneAccess", js.undefined)
  }
}
