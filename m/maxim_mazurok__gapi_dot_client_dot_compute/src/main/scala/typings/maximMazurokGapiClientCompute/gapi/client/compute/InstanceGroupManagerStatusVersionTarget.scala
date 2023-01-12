package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagerStatusVersionTarget extends StObject {
  
  /**
    * [Output Only] A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are
    * specified by version field on Instance Group Manager.
    */
  var isReached: js.UndefOr[Boolean] = js.undefined
}
object InstanceGroupManagerStatusVersionTarget {
  
  inline def apply(): InstanceGroupManagerStatusVersionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatusVersionTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupManagerStatusVersionTarget] (val x: Self) extends AnyVal {
    
    inline def setIsReached(value: Boolean): Self = StObject.set(x, "isReached", value.asInstanceOf[js.Any])
    
    inline def setIsReachedUndefined: Self = StObject.set(x, "isReached", js.undefined)
  }
}
