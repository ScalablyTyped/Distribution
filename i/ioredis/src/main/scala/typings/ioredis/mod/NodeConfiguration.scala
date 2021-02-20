package typings.ioredis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConfiguration extends StObject {
  
  var host: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
}
object NodeConfiguration {
  
  @scala.inline
  def apply(): NodeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfiguration]
  }
  
  @scala.inline
  implicit class NodeConfigurationMutableBuilder[Self <: NodeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
