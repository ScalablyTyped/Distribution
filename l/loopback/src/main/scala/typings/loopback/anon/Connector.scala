package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connector extends StObject {
  
  var connector: js.Any
  
  var properties: js.UndefOr[js.Any] = js.undefined
}
object Connector {
  
  @scala.inline
  def apply(connector: js.Any): Connector = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
  
  @scala.inline
  implicit class ConnectorMutableBuilder[Self <: Connector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnector(value: js.Any): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
