package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eventable extends StObject {
  
  var eventable: typings.interactjsTypes.coreEventableMod.Eventable
  
  var node: typings.std.Node
  
  var props: StringDictionary[Any]
}
object Eventable {
  
  inline def apply(
    eventable: typings.interactjsTypes.coreEventableMod.Eventable,
    node: typings.std.Node,
    props: StringDictionary[Any]
  ): Eventable = {
    val __obj = js.Dynamic.literal(eventable = eventable.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventable]
  }
  
  extension [Self <: Eventable](x: Self) {
    
    inline def setEventable(value: typings.interactjsTypes.coreEventableMod.Eventable): Self = StObject.set(x, "eventable", value.asInstanceOf[js.Any])
    
    inline def setNode(value: typings.std.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setProps(value: StringDictionary[Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
