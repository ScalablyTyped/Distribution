package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine NetworkInterface resource. Identical to the
  * NetworkInterface on the corresponding Compute Engine resource.
  */
trait SchemaNetworkInterface extends StObject {
  
  /**
    * An array of configurations for this interface. This specifies how this
    * interface is configured to interact with other network services.
    */
  var accessConfigs: js.UndefOr[js.Array[SchemaAccessConfig]] = js.undefined
  
  /**
    * Name the Network resource to which this interface applies.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * An optional IPV4 internal network address to assign to the instance for
    * this network interface.
    */
  var networkIp: js.UndefOr[String] = js.undefined
}
object SchemaNetworkInterface {
  
  @scala.inline
  def apply(): SchemaNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInterface]
  }
  
  @scala.inline
  implicit class SchemaNetworkInterfaceMutableBuilder[Self <: SchemaNetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessConfigs(value: js.Array[SchemaAccessConfig]): Self = StObject.set(x, "accessConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessConfigsUndefined: Self = StObject.set(x, "accessConfigs", js.undefined)
    
    @scala.inline
    def setAccessConfigsVarargs(value: SchemaAccessConfig*): Self = StObject.set(x, "accessConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIp(value: String): Self = StObject.set(x, "networkIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIpUndefined: Self = StObject.set(x, "networkIp", js.undefined)
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
