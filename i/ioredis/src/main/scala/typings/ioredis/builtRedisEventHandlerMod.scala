package typings.ioredis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtRedisEventHandlerMod {
  
  @JSImport("ioredis/built/redis/event_handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeHandler(self: Any): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeHandler")(self.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def connectHandler(self: Any): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHandler")(self.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def errorHandler(self: Any): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(self.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, Unit]]
  
  inline def readyHandler(self: Any): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("readyHandler")(self.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
