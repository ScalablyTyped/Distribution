package typings.guardianProsemirrorInvisibles

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@TestsHelpersMod` {
  
  @JSImport("@guardian/prosemirror-invisibles/dist/@/tests/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEditor(): EditorView = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")().asInstanceOf[EditorView]
  inline def createEditor(docNode: Unit, isActive: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[EditorView]
  inline def createEditor(docNode: Node): EditorView = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any]).asInstanceOf[EditorView]
  inline def createEditor(docNode: Node, isActive: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[EditorView]
}
