package typings.libp2pInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object startableMod {
  
  @JSImport("@libp2p/interfaces/startable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isStartable(obj: Any): /* is @libp2p/interfaces.@libp2p/interfaces/dist/src/startable.Startable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStartable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interfaces.@libp2p/interfaces/dist/src/startable.Startable */ Boolean]
  
  inline def start(objs: Any*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
  
  inline def stop(objs: Any*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
}
