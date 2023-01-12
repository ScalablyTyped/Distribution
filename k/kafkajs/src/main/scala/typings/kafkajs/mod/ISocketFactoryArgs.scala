package typings.kafkajs.mod

import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISocketFactoryArgs extends StObject {
  
  var host: String
  
  def onConnect(): Unit
  
  var port: Double
  
  var ssl: ConnectionOptions
}
object ISocketFactoryArgs {
  
  inline def apply(host: String, onConnect: () => Unit, port: Double, ssl: ConnectionOptions): ISocketFactoryArgs = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], onConnect = js.Any.fromFunction0(onConnect), port = port.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISocketFactoryArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISocketFactoryArgs] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOnConnect(value: () => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction0(value))
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
  }
}
