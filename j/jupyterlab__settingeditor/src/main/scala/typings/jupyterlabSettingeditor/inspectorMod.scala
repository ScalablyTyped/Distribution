package typings.jupyterlabSettingeditor

import typings.jupyterlabInspector.mod.InspectorPanel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.raweditorMod.RawEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor/lib/inspector", JSImport.Namespace)
@js.native
object inspectorMod extends js.Object {
  
  def createInspector(editor: RawEditor): InspectorPanel = js.native
  def createInspector(editor: RawEditor, rendermime: IRenderMimeRegistry): InspectorPanel = js.native
}
