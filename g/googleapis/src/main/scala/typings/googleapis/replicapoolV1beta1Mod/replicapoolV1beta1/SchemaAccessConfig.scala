package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine network accessConfig. Identical to the accessConfig on
  * corresponding Compute Engine resource.
  */
trait SchemaAccessConfig extends StObject {
  
  /**
    * Name of this access configuration.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An external IP address associated with this instance.
    */
  var natIp: js.UndefOr[String] = js.undefined
  
  /**
    * Type of this access configuration file. Currently only ONE_TO_ONE_NAT is
    * supported.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaAccessConfig {
  
  @scala.inline
  def apply(): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessConfig]
  }
  
  @scala.inline
  implicit class SchemaAccessConfigMutableBuilder[Self <: SchemaAccessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNatIp(value: String): Self = StObject.set(x, "natIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatIpUndefined: Self = StObject.set(x, "natIp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
