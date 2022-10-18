package typings.jupyterlabShortcutsExtension

import typings.jupyterlabShortcutsExtension.anon.External
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRendererMod {
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderShortCut(props: External): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderShortCut")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
