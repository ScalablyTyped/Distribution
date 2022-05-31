package typings.jupyterlabSettingeditor

import typings.jupyterlabInspector.mod.InspectorPanel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.raweditorMod.RawEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/inspector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInspector(editor: RawEditor): InspectorPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("createInspector")(editor.asInstanceOf[js.Any]).asInstanceOf[InspectorPanel]
  inline def createInspector(editor: RawEditor, rendermime: IRenderMimeRegistry): InspectorPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createInspector")(editor.asInstanceOf[js.Any], rendermime.asInstanceOf[js.Any])).asInstanceOf[InspectorPanel]
}
