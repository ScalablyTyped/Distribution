package typings.ipfsCoreTypes.distSrcDhtMod

import typings.ipfsCoreTypes.ipfsCoreTypesStrings.VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueEvent
  extends StObject
     with QueryEvent {
  
  var name: VALUE
  
  var `type`: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.VALUE
  
  var value: js.typedarray.Uint8Array
}
object ValueEvent {
  
  inline def apply(`type`: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.VALUE, value: js.typedarray.Uint8Array): ValueEvent = {
    val __obj = js.Dynamic.literal(name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueEvent]
  }
  
  extension [Self <: ValueEvent](x: Self) {
    
    inline def setName(value: VALUE): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.VALUE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
