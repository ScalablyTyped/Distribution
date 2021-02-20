package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptionsCompression extends StObject {
  
  var minBytes: Double = js.native
}
object ServerOptionsCompression {
  
  @scala.inline
  def apply(minBytes: Double): ServerOptionsCompression = {
    val __obj = js.Dynamic.literal(minBytes = minBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptionsCompression]
  }
  
  @scala.inline
  implicit class ServerOptionsCompressionMutableBuilder[Self <: ServerOptionsCompression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinBytes(value: Double): Self = StObject.set(x, "minBytes", value.asInstanceOf[js.Any])
  }
}
