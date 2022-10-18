package typings.interactjsTypes

import typings.interactjsTypes.coreScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsPluginMod {
  
  object default {
    
    @JSImport("@interactjs/actions/plugin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/actions/plugin", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    inline def install(scope: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
