package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message defines attributes for a node that handles a network request.
  * The node can be either a service or an application that sends, forwards, or
  * receives the request. Service peers should fill in the `service`,
  * `principal`, and `labels` as appropriate.
  */
trait SchemaPeer extends StObject {
  
  /**
    * The IP address of the peer.
    */
  var ip: js.UndefOr[String] = js.undefined
  
  /**
    * The labels associated with the peer.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The network port of the peer.
    */
  var port: js.UndefOr[String] = js.undefined
  
  /**
    * The identity of this peer. Similar to `Request.auth.principal`, but
    * relative to the peer instead of the request. For example, the idenity
    * associated with a load balancer that forwared the request.
    */
  var principal: js.UndefOr[String] = js.undefined
  
  /**
    * The CLDR country/region code associated with the above IP address. If the
    * IP address is private, the `region_code` should reflect the physical
    * location where this peer is running.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical service name of the peer.  NOTE: different systems may have
    * different service naming schemes.
    */
  var service: js.UndefOr[String] = js.undefined
}
object SchemaPeer {
  
  inline def apply(): SchemaPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeer]
  }
  
  extension [Self <: SchemaPeer](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
