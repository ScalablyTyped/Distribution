package typings.magicmirrorModule

import org.scalablytyped.runtime.StringDictionary
import typings.magicmirrorModule.anon.ThisTypeNonNullableNodeHe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable:no-single-declare-module */
object nodeHelperMod {
  
  @JSImport("node_helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(`object`: ThisTypeNonNullableNodeHe): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait NodeHelperModule
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val expressApp: Any
    
    // Subclassable methods
    def init(): Unit
    
    val io: Any
    
    val name: String
    
    val path: String
    
    val requiresVersion: String
    
    def sendSocketNotification(notification: String, payload: Any): Unit
    
    def socketNotificationReceived(notification: String, payload: Any): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object NodeHelperModule {
    
    inline def apply(
      expressApp: Any,
      init: () => Unit,
      io: Any,
      name: String,
      path: String,
      requiresVersion: String,
      sendSocketNotification: (String, Any) => Unit,
      socketNotificationReceived: (String, Any) => Unit,
      start: () => Unit,
      stop: () => Unit
    ): NodeHelperModule = {
      val __obj = js.Dynamic.literal(expressApp = expressApp.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), io = io.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requiresVersion = requiresVersion.asInstanceOf[js.Any], sendSocketNotification = js.Any.fromFunction2(sendSocketNotification), socketNotificationReceived = js.Any.fromFunction2(socketNotificationReceived), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[NodeHelperModule]
    }
    
    extension [Self <: NodeHelperModule](x: Self) {
      
      inline def setExpressApp(value: Any): Self = StObject.set(x, "expressApp", value.asInstanceOf[js.Any])
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setIo(value: Any): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRequiresVersion(value: String): Self = StObject.set(x, "requiresVersion", value.asInstanceOf[js.Any])
      
      inline def setSendSocketNotification(value: (String, Any) => Unit): Self = StObject.set(x, "sendSocketNotification", js.Any.fromFunction2(value))
      
      inline def setSocketNotificationReceived(value: (String, Any) => Unit): Self = StObject.set(x, "socketNotificationReceived", js.Any.fromFunction2(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
