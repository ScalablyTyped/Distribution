package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for network diagnostics reported for a client.
  */
trait SchemaNetworkDiagnostics extends StObject {
  
  /**
    * The Android network subtype.
    */
  var androidNetworkSubtype: js.UndefOr[Double] = js.undefined
  
  /**
    * The Android network type.
    */
  var androidNetworkType: js.UndefOr[Double] = js.undefined
  
  /**
    * iOS network type as defined in Reachability.h.
    */
  var iosNetworkType: js.UndefOr[Double] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#networkDiagnostics.
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
    * The amount of time in milliseconds it took for the client to establish a
    * connection with the XMPP server.
    */
  var registrationLatencyMillis: js.UndefOr[Double] = js.undefined
}
object SchemaNetworkDiagnostics {
  
  @scala.inline
  def apply(): SchemaNetworkDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkDiagnostics]
  }
  
  @scala.inline
  implicit class SchemaNetworkDiagnosticsMutableBuilder[Self <: SchemaNetworkDiagnostics] (val x: Self) extends AnyVal {
    
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
    def setRegistrationLatencyMillis(value: Double): Self = StObject.set(x, "registrationLatencyMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationLatencyMillisUndefined: Self = StObject.set(x, "registrationLatencyMillis", js.undefined)
  }
}
