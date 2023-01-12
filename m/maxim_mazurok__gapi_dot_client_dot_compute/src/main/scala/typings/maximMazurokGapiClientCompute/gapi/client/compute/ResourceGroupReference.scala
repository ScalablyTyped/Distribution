package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceGroupReference extends StObject {
  
  /** A URI referencing one of the instance groups or network endpoint groups listed in the backend service. */
  var group: js.UndefOr[String] = js.undefined
}
object ResourceGroupReference {
  
  inline def apply(): ResourceGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceGroupReference] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
