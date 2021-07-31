package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceReference extends StObject {
  
  /** The unique identifier of the Compute Engine instance. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** The user-friendly name of the Compute Engine instance. */
  var instanceName: js.UndefOr[String] = js.undefined
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
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
  }
}
