package typings.interactjsTypes

import typings.interactjsTypes.anon.AutoStartbeforestart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoStartDragAxisMod {
  
  object default {
    
    @JSImport("@interactjs/auto-start/dragAxis", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/auto-start/dragAxis", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/auto-start/dragAxis", "default.listeners")
    @js.native
    def listeners: AutoStartbeforestart = js.native
    inline def listeners_=(x: AutoStartbeforestart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listeners")(x.asInstanceOf[js.Any])
  }
}
