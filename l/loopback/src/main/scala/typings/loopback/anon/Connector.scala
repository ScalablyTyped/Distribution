package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connector extends StObject {
  
  var connector: Any
  
  var properties: js.UndefOr[Any] = js.undefined
}
object Connector {
  
  inline def apply(connector: Any): Connector = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
  
  extension [Self <: Connector](x: Self) {
    
    inline def setConnector(value: Any): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
