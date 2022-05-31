package typings.ityped

import typings.ityped.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ityped {
    
    @JSGlobal("ityped")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(element: String, config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
