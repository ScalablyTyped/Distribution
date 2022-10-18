package typings.lib0.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutex {
  
  @JSImport("lib0/dist", "mutex")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMutex(): typings.lib0.distMutexMod.mutex = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[typings.lib0.distMutexMod.mutex]
}
