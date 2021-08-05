package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.StateACL> */
trait PartialStateACL extends StObject {
  
  var `object`: js.UndefOr[Double] = js.undefined
  
  var owner: js.UndefOr[String] = js.undefined
  
  var ownerGroup: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[Double] = js.undefined
}
object PartialStateACL {
  
  inline def apply(): PartialStateACL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateACL]
  }
  
  extension [Self <: PartialStateACL](x: Self) {
    
    inline def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerGroup(value: String): Self = StObject.set(x, "ownerGroup", value.asInstanceOf[js.Any])
    
    inline def setOwnerGroupUndefined: Self = StObject.set(x, "ownerGroup", js.undefined)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
