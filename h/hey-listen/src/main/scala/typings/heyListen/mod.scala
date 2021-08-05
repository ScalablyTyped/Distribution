package typings.heyListen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hey-listen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hey-listen", "invariant")
  @js.native
  def invariant: DevMessage = js.native
  inline def invariant_=(x: DevMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invariant")(x.asInstanceOf[js.Any])
  
  @JSImport("hey-listen", "warning")
  @js.native
  def warning: DevMessage = js.native
  inline def warning_=(x: DevMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  
  type DevMessage = js.Function2[/* check */ Boolean, /* message */ String, Unit]
}
