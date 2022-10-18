package typings.libp2pInterfaceDht.mod

import typings.libp2pInterfaceDht.libp2pInterfaceDhtStrings.VALUE
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueEvent
  extends StObject
     with QueryEvent {
  
  var from: PeerId
  
  var name: VALUE
  
  var `type`: typings.libp2pInterfaceDht.mod.EventTypes.VALUE
  
  var value: js.typedarray.Uint8Array
}
object ValueEvent {
  
  inline def apply(
    from: PeerId,
    `type`: typings.libp2pInterfaceDht.mod.EventTypes.VALUE,
    value: js.typedarray.Uint8Array
  ): ValueEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueEvent]
  }
  
  extension [Self <: ValueEvent](x: Self) {
    
    inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setName(value: VALUE): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pInterfaceDht.mod.EventTypes.VALUE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
