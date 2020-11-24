package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerPort represents a network port in a single container.
  */
@js.native
trait SchemaContainerPort extends js.Object {
  
  /**
    * Number of port to expose on the pod&#39;s IP address. This must be a
    * valid port number, 0 &lt; x &lt; 65536.
    */
  var containerPort: js.UndefOr[Double] = js.native
  
  /**
    * What host IP to bind the external port to. +optional
    */
  var hostIP: js.UndefOr[String] = js.native
  
  /**
    * Number of port to expose on the host. If specified, this must be a valid
    * port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must
    * match ContainerPort. Most containers do not need this. +optional
    */
  var hostPort: js.UndefOr[Double] = js.native
  
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod.
    * Each named port in a pod must have a unique name. Name for the port that
    * can be referred to by services. +optional
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Protocol for port. Must be UDP or TCP. Defaults to &quot;TCP&quot;.
    * +optional
    */
  var protocol: js.UndefOr[String] = js.native
}
object SchemaContainerPort {
  
  @scala.inline
  def apply(): SchemaContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerPort]
  }
  
  @scala.inline
  implicit class SchemaContainerPortOps[Self <: SchemaContainerPort] (val x: Self) extends AnyVal {
    
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
    def setContainerPort(value: Double): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPort: Self = this.set("containerPort", js.undefined)
    
    @scala.inline
    def setHostIP(value: String): Self = this.set("hostIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostIP: Self = this.set("hostIP", js.undefined)
    
    @scala.inline
    def setHostPort(value: Double): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPort: Self = this.set("hostPort", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
}
