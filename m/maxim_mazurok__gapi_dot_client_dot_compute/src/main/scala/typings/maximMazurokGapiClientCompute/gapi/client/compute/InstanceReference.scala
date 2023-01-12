package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceReference extends StObject {
  
  /** The URL for a specific instance. @required compute.instancegroups.addInstances/removeInstances */
  var instance: js.UndefOr[String] = js.undefined
}
object InstanceReference {
  
  inline def apply(): InstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceReference] (val x: Self) extends AnyVal {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
