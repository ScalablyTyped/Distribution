package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedPort extends StObject {
  
  /** The name for this named port. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[String] = js.native
  
  /** The port number, which can be a value between 1 and 65535. */
  var port: js.UndefOr[Double] = js.native
}
object NamedPort {
  
  @scala.inline
  def apply(): NamedPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedPort]
  }
  
  @scala.inline
  implicit class NamedPortMutableBuilder[Self <: NamedPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
