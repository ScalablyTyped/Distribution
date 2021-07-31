package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthStatus extends StObject {
  
  /**
    * Health state of the instance.
    */
  var healthState: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the instance resource.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address represented by this resource.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The port on the instance.
    */
  var port: js.UndefOr[Double] = js.undefined
}
object SchemaHealthStatus {
  
  @scala.inline
  def apply(): SchemaHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthStatus]
  }
  
  @scala.inline
  implicit class SchemaHealthStatusMutableBuilder[Self <: SchemaHealthStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
