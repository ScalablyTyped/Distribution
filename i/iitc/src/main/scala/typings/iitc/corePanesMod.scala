package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePanesMod {
  
  object global {
    
    @JSGlobal("currentPane")
    @js.native
    def currentPane: String = js.native
    inline def currentPane_=(x: String): Unit = js.Dynamic.global.updateDynamic("currentPane")(x.asInstanceOf[js.Any])
    
    inline def hideall(): Unit = js.Dynamic.global.applyDynamic("hideall")().asInstanceOf[Unit]
    
    inline def show(id: String): Unit = js.Dynamic.global.applyDynamic("show")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
