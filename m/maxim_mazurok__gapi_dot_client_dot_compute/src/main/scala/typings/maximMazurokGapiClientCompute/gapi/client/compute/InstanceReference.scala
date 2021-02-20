package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceReference extends StObject {
  
  /** The URL for a specific instance. */
  var instance: js.UndefOr[String] = js.native
}
object InstanceReference {
  
  @scala.inline
  def apply(): InstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceReference]
  }
  
  @scala.inline
  implicit class InstanceReferenceMutableBuilder[Self <: InstanceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
