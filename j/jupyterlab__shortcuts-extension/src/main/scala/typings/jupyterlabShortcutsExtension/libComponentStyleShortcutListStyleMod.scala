package typings.jupyterlabShortcutsExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentStyleShortcutListStyleMod {
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/componentStyle/ShortcutListStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ShortcutListContainerStyle(topNavHeight: Double, widgetHeight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ShortcutListContainerStyle")(topNavHeight.asInstanceOf[js.Any], widgetHeight.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/componentStyle/ShortcutListStyle", "ShortcutListStyle")
  @js.native
  val ShortcutListStyle: String = js.native
}
