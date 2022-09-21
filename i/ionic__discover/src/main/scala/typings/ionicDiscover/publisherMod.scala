package typings.ionicDiscover

import org.scalablytyped.runtime.StringDictionary
import typings.ionicDiscover.ionicDiscoverStrings.error
import typings.node.dgramMod.Socket
import typings.node.eventsMod.EventEmitter
import typings.node.osMod.NetworkInterfaceInfo
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherMod {
  
  @JSImport("@ionic/discover/dist/publisher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/discover/dist/publisher", "Publisher")
  @js.native
  open class Publisher protected ()
    extends EventEmitter
       with IPublisherEventEmitter {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
    
    /* protected */ def buildMessage(ip: String): PublisherMessage = js.native
    
    /* protected */ var client: js.UndefOr[Socket] = js.native
    
    var commPort: js.UndefOr[Double] = js.native
    
    /* protected */ def getInterfaces(): js.Array[Interface] = js.native
    
    val id: String = js.native
    
    var interfaces: js.UndefOr[js.Array[Interface]] = js.native
    
    /* protected */ var interval: Double = js.native
    
    var name: String = js.native
    
    var namespace: String = js.native
    
    /* CompleteClass */
    @JSName("on")
    override def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    val path: /* "/" */ String = js.native
    
    var port: Double = js.native
    
    var running: Boolean = js.native
    
    /* protected */ def sayHello(): Unit = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    /* protected */ var timer: js.UndefOr[Timer] = js.native
  }
  
  inline def computeBroadcastAddress(address: String, netmask: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBroadcastAddress")(address.asInstanceOf[js.Any], netmask.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def newSilentPublisher(namespace: String, name: String, port: Double): Publisher = (^.asInstanceOf[js.Dynamic].applyDynamic("newSilentPublisher")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Publisher]
  
  inline def prepareInterfaces(interfaces: StringDictionary[js.Array[NetworkInterfaceInfo]]): js.Array[Interface] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareInterfaces")(interfaces.asInstanceOf[js.Any]).asInstanceOf[js.Array[Interface]]
  
  trait IPublisherEventEmitter extends StObject {
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type
  }
  object IPublisherEventEmitter {
    
    inline def apply(on: (error, js.Function1[/* err */ js.Error, Unit]) => IPublisherEventEmitter): IPublisherEventEmitter = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[IPublisherEventEmitter]
    }
    
    extension [Self <: IPublisherEventEmitter](x: Self) {
      
      inline def setOn(value: (error, js.Function1[/* err */ js.Error, Unit]) => IPublisherEventEmitter): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait Interface extends StObject {
    
    var address: String
    
    var broadcast: String
  }
  object Interface {
    
    inline def apply(address: String, broadcast: String): Interface = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interface]
    }
    
    extension [Self <: Interface](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBroadcast(value: String): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublisherMessage extends StObject {
    
    var commPort: js.UndefOr[Double] = js.undefined
    
    var host: String
    
    var id: String
    
    var ip: String
    
    var name: String
    
    var nspace: String
    
    var path: String
    
    var port: Double
    
    var t: Double
  }
  object PublisherMessage {
    
    inline def apply(
      host: String,
      id: String,
      ip: String,
      name: String,
      nspace: String,
      path: String,
      port: Double,
      t: Double
    ): PublisherMessage = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nspace = nspace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublisherMessage]
    }
    
    extension [Self <: PublisherMessage](x: Self) {
      
      inline def setCommPort(value: Double): Self = StObject.set(x, "commPort", value.asInstanceOf[js.Any])
      
      inline def setCommPortUndefined: Self = StObject.set(x, "commPort", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNspace(value: String): Self = StObject.set(x, "nspace", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}
