package typings.atJupyterlabSettingeditor

import typings.atJupyterlabInspector.atJupyterlabInspectorMod.InspectorPanel
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atJupyterlabSettingeditor.libRaweditorMod.RawEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/inspector", JSImport.Namespace)
@js.native
object libInspectorMod extends js.Object {
  def createInspector(editor: RawEditor): InspectorPanel = js.native
  def createInspector(editor: RawEditor, rendermime: IRenderMimeRegistry): InspectorPanel = js.native
}

