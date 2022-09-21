package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBfdPacket extends StObject {
  
  /**
    * The Authentication Present bit of the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var authenticationPresent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The Control Plane Independent bit of the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var controlPlaneIndependent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The demand bit of the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var demand: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The diagnostic code specifies the local system's reason for the last change in session state. This allows remote systems to determine the reason that the previous session failed, for example. These diagnostic codes are specified in section 4.1 of RFC5880
    */
  var diagnostic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Final bit of the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var `final`: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The length of the BFD Control packet in bytes. This is specified in section 4.1 of RFC5880
    */
  var length: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Required Min Echo RX Interval value in the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var minEchoRxIntervalMs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Required Min RX Interval value in the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var minRxIntervalMs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Desired Min TX Interval value in the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var minTxIntervalMs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The detection time multiplier of the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var multiplier: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The multipoint bit of the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var multipoint: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The My Discriminator value in the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var myDiscriminator: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Poll bit of the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var poll: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The current BFD session state as seen by the transmitting system. These states are specified in section 4.1 of RFC5880
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version number of the BFD protocol, as specified in section 4.1 of RFC5880.
    */
  var version: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Your Discriminator value in the BFD packet. This is specified in section 4.1 of RFC5880
    */
  var yourDiscriminator: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBfdPacket {
  
  inline def apply(): SchemaBfdPacket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBfdPacket]
  }
  
  extension [Self <: SchemaBfdPacket](x: Self) {
    
    inline def setAuthenticationPresent(value: Boolean): Self = StObject.set(x, "authenticationPresent", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationPresentNull: Self = StObject.set(x, "authenticationPresent", null)
    
    inline def setAuthenticationPresentUndefined: Self = StObject.set(x, "authenticationPresent", js.undefined)
    
    inline def setControlPlaneIndependent(value: Boolean): Self = StObject.set(x, "controlPlaneIndependent", value.asInstanceOf[js.Any])
    
    inline def setControlPlaneIndependentNull: Self = StObject.set(x, "controlPlaneIndependent", null)
    
    inline def setControlPlaneIndependentUndefined: Self = StObject.set(x, "controlPlaneIndependent", js.undefined)
    
    inline def setDemand(value: Boolean): Self = StObject.set(x, "demand", value.asInstanceOf[js.Any])
    
    inline def setDemandNull: Self = StObject.set(x, "demand", null)
    
    inline def setDemandUndefined: Self = StObject.set(x, "demand", js.undefined)
    
    inline def setDiagnostic(value: String): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticNull: Self = StObject.set(x, "diagnostic", null)
    
    inline def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
    
    inline def setFinal(value: Boolean): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    inline def setFinalNull: Self = StObject.set(x, "final", null)
    
    inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMinEchoRxIntervalMs(value: Double): Self = StObject.set(x, "minEchoRxIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setMinEchoRxIntervalMsNull: Self = StObject.set(x, "minEchoRxIntervalMs", null)
    
    inline def setMinEchoRxIntervalMsUndefined: Self = StObject.set(x, "minEchoRxIntervalMs", js.undefined)
    
    inline def setMinRxIntervalMs(value: Double): Self = StObject.set(x, "minRxIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setMinRxIntervalMsNull: Self = StObject.set(x, "minRxIntervalMs", null)
    
    inline def setMinRxIntervalMsUndefined: Self = StObject.set(x, "minRxIntervalMs", js.undefined)
    
    inline def setMinTxIntervalMs(value: Double): Self = StObject.set(x, "minTxIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setMinTxIntervalMsNull: Self = StObject.set(x, "minTxIntervalMs", null)
    
    inline def setMinTxIntervalMsUndefined: Self = StObject.set(x, "minTxIntervalMs", js.undefined)
    
    inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierNull: Self = StObject.set(x, "multiplier", null)
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setMultipoint(value: Boolean): Self = StObject.set(x, "multipoint", value.asInstanceOf[js.Any])
    
    inline def setMultipointNull: Self = StObject.set(x, "multipoint", null)
    
    inline def setMultipointUndefined: Self = StObject.set(x, "multipoint", js.undefined)
    
    inline def setMyDiscriminator(value: Double): Self = StObject.set(x, "myDiscriminator", value.asInstanceOf[js.Any])
    
    inline def setMyDiscriminatorNull: Self = StObject.set(x, "myDiscriminator", null)
    
    inline def setMyDiscriminatorUndefined: Self = StObject.set(x, "myDiscriminator", js.undefined)
    
    inline def setPoll(value: Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    inline def setPollNull: Self = StObject.set(x, "poll", null)
    
    inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setYourDiscriminator(value: Double): Self = StObject.set(x, "yourDiscriminator", value.asInstanceOf[js.Any])
    
    inline def setYourDiscriminatorNull: Self = StObject.set(x, "yourDiscriminator", null)
    
    inline def setYourDiscriminatorUndefined: Self = StObject.set(x, "yourDiscriminator", js.undefined)
  }
}
