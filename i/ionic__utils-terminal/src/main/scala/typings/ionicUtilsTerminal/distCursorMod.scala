package typings.ionicUtilsTerminal

import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCursorMod {
  
  @JSImport("@ionic/utils-terminal/dist/cursor", "Cursor")
  @js.native
  open class Cursor () extends StObject
  /* static members */
  object Cursor {
    
    @JSImport("@ionic/utils-terminal/dist/cursor", "Cursor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/utils-terminal/dist/cursor", "Cursor._isVisible")
    @js.native
    def _isVisible: Any = js.native
    inline def _isVisible_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/utils-terminal/dist/cursor", "Cursor._listenerAttached")
    @js.native
    def _listenerAttached: Any = js.native
    inline def _listenerAttached_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_listenerAttached")(x.asInstanceOf[js.Any])
    
    inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
    
    inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
    
    @JSImport("@ionic/utils-terminal/dist/cursor", "Cursor.stream")
    @js.native
    def stream: WriteStream = js.native
    inline def stream_=(x: WriteStream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
    
    inline def toggle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[Unit]
  }
}
