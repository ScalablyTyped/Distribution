package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerPort represents a network port in a single container.
  */
@js.native
trait SchemaContainerPort extends StObject {
  
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
  implicit class SchemaContainerPortMutableBuilder[Self <: SchemaContainerPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    @scala.inline
    def setHostIP(value: String): Self = StObject.set(x, "hostIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIPUndefined: Self = StObject.set(x, "hostIP", js.undefined)
    
    @scala.inline
    def setHostPort(value: Double): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
