package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message defines attributes for a node that handles a network request.
  * The node can be either a service or an application that sends, forwards, or
  * receives the request. Service peers should fill in the `service`,
  * `principal`, and `labels` as appropriate.
  */
@js.native
trait SchemaPeer extends StObject {
  
  /**
    * The IP address of the peer.
    */
  var ip: js.UndefOr[String] = js.native
  
  /**
    * The labels associated with the peer.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The network port of the peer.
    */
  var port: js.UndefOr[String] = js.native
  
  /**
    * The identity of this peer. Similar to `Request.auth.principal`, but
    * relative to the peer instead of the request. For example, the idenity
    * associated with a load balancer that forwared the request.
    */
  var principal: js.UndefOr[String] = js.native
  
  /**
    * The CLDR country/region code associated with the above IP address. If the
    * IP address is private, the `region_code` should reflect the physical
    * location where this peer is running.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * The canonical service name of the peer.  NOTE: different systems may have
    * different service naming schemes.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaPeer {
  
  @scala.inline
  def apply(): SchemaPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeer]
  }
  
  @scala.inline
  implicit class SchemaPeerMutableBuilder[Self <: SchemaPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
