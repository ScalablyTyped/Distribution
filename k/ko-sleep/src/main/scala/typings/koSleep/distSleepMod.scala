package typings.koSleep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSleepMod {
  
  inline def apply(time: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(time: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("ko-sleep/dist/sleep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
