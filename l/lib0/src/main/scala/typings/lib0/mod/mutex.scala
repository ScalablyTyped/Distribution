package typings.lib0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutex {
  
  @JSImport("lib0", "mutex")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMutex(): typings.lib0.mutexMod.mutex = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[typings.lib0.mutexMod.mutex]
}
