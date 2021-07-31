package typings.jsplumb.mod

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionMadeEventInfo extends StObject {
  
  var connection: Connection
  
  var source: HTMLDivElement
  
  var sourceEndpoint: Endpoint
  
  var sourceId: String
  
  var target: HTMLDivElement
  
  var targetEndpoint: Endpoint
  
  var targetId: String
}
object ConnectionMadeEventInfo {
  
  @scala.inline
  def apply(
    connection: Connection,
    source: HTMLDivElement,
    sourceEndpoint: Endpoint,
    sourceId: String,
    target: HTMLDivElement,
    targetEndpoint: Endpoint,
    targetId: String
  ): ConnectionMadeEventInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceEndpoint = sourceEndpoint.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetEndpoint = targetEndpoint.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionMadeEventInfo]
  }
  
  @scala.inline
  implicit class ConnectionMadeEventInfoMutableBuilder[Self <: ConnectionMadeEventInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: HTMLDivElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEndpoint(value: Endpoint): Self = StObject.set(x, "sourceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLDivElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEndpoint(value: Endpoint): Self = StObject.set(x, "targetEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
