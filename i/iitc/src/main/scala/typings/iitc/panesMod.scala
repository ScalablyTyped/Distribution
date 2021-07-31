package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panesMod {
  
  object global {
    
    @JSGlobal("currentPane")
    @js.native
    def currentPane: String = js.native
    @scala.inline
    def currentPane_=(x: String): Unit = js.Dynamic.global.updateDynamic("currentPane")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hideall(): Unit = js.Dynamic.global.applyDynamic("hideall")().asInstanceOf[Unit]
    
    @scala.inline
    def show(id: String): Unit = js.Dynamic.global.applyDynamic("show")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
