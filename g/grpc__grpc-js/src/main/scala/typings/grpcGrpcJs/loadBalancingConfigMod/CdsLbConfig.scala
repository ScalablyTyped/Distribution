package typings.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CdsLbConfig extends StObject {
  
  var cluster: String = js.native
}
object CdsLbConfig {
  
  @scala.inline
  def apply(cluster: String): CdsLbConfig = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdsLbConfig]
  }
  
  @scala.inline
  implicit class CdsLbConfigMutableBuilder[Self <: CdsLbConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
  }
}
