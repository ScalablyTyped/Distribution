package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information required for a TCP uptime check request.
  */
@js.native
trait SchemaTcpCheck extends StObject {
  
  /**
    * The port to the page to run the check against. Will be combined with host
    * (specified within the MonitoredResource) to construct the full URL.
    * Required.
    */
  var port: js.UndefOr[Double] = js.native
}
object SchemaTcpCheck {
  
  @scala.inline
  def apply(): SchemaTcpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTcpCheck]
  }
  
  @scala.inline
  implicit class SchemaTcpCheckMutableBuilder[Self <: SchemaTcpCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
