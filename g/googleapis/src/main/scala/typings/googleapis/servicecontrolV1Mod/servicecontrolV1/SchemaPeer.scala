package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines attributes for a node that handles a network request.
  * The node can be either a service or an application that sends, forwards, or
  * receives the request. Service peers should fill in the `service`,
  * `principal`, and `labels` as appropriate.
  */
@js.native
trait SchemaPeer extends js.Object {
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
  implicit class SchemaPeerOps[Self <: SchemaPeer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPrincipal(value: String): Self = this.set("principal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

