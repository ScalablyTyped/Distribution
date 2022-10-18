package typings.interactjsTypes.anon

import typings.interactjsTypes.coreScopeMod.ListenerMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var map: ListenerMap
}
object Id {
  
  inline def apply(id: String, map: ListenerMap): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMap(value: ListenerMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
