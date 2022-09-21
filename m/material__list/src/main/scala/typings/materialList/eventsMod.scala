package typings.materialList

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@material/list/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def preventDefaultEvent(evt: KeyboardEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefaultEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
