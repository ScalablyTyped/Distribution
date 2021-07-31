package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for room leave diagnostics.
  */
trait SchemaRoomLeaveDiagnostics extends StObject {
  
  /**
    * Android network subtype.
    * http://developer.android.com/reference/android/net/NetworkInfo.html#getSubtype()
    */
  var androidNetworkSubtype: js.UndefOr[Double] = js.undefined
  
  /**
    * Android network type.
    * http://developer.android.com/reference/android/net/NetworkInfo.html#getType()
    */
  var androidNetworkType: js.UndefOr[Double] = js.undefined
  
  /**
    * iOS network type as defined in Reachability.h.
    */
  var iosNetworkType: js.UndefOr[Double] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomLeaveDiagnostics.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The MCC+MNC code for the client&#39;s network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperator()
    * On iOS, see:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html
    */
  var networkOperatorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the carrier of the client&#39;s network connection. On
    * Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName()
    * On iOS:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
    */
  var networkOperatorName: js.UndefOr[String] = js.undefined
  
  /**
    * Diagnostics about all peer sessions.
    */
  var peerSession: js.UndefOr[js.Array[SchemaPeerSessionDiagnostics]] = js.undefined
  
  /**
    * Whether or not sockets were used.
    */
  var socketsUsed: js.UndefOr[Boolean] = js.undefined
}
object SchemaRoomLeaveDiagnostics {
  
  @scala.inline
  def apply(): SchemaRoomLeaveDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomLeaveDiagnostics]
  }
  
  @scala.inline
  implicit class SchemaRoomLeaveDiagnosticsMutableBuilder[Self <: SchemaRoomLeaveDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidNetworkSubtype(value: Double): Self = StObject.set(x, "androidNetworkSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidNetworkSubtypeUndefined: Self = StObject.set(x, "androidNetworkSubtype", js.undefined)
    
    @scala.inline
    def setAndroidNetworkType(value: Double): Self = StObject.set(x, "androidNetworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidNetworkTypeUndefined: Self = StObject.set(x, "androidNetworkType", js.undefined)
    
    @scala.inline
    def setIosNetworkType(value: Double): Self = StObject.set(x, "iosNetworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosNetworkTypeUndefined: Self = StObject.set(x, "iosNetworkType", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworkOperatorCode(value: String): Self = StObject.set(x, "networkOperatorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOperatorCodeUndefined: Self = StObject.set(x, "networkOperatorCode", js.undefined)
    
    @scala.inline
    def setNetworkOperatorName(value: String): Self = StObject.set(x, "networkOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOperatorNameUndefined: Self = StObject.set(x, "networkOperatorName", js.undefined)
    
    @scala.inline
    def setPeerSession(value: js.Array[SchemaPeerSessionDiagnostics]): Self = StObject.set(x, "peerSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerSessionUndefined: Self = StObject.set(x, "peerSession", js.undefined)
    
    @scala.inline
    def setPeerSessionVarargs(value: SchemaPeerSessionDiagnostics*): Self = StObject.set(x, "peerSession", js.Array(value :_*))
    
    @scala.inline
    def setSocketsUsed(value: Boolean): Self = StObject.set(x, "socketsUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketsUsedUndefined: Self = StObject.set(x, "socketsUsed", js.undefined)
  }
}
