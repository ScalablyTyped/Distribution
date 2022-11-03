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
  inline def createEditor(docNode: Unit, shouldShowInvisibles: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], shouldShowInvisibles.asInstanceOf[js.Any])).asInstanceOf[EditorView]
  inline def createEditor(docNode: Unit, shouldShowInvisibles: Boolean, displayLineEndSelection: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], shouldShowInvisibles.asInstanceOf[js.Any], displayLineEndSelection.asInstanceOf[js.Any])).asInstanceOf[EditorView]
  inline def createEditor(docNode: Unit, shouldShowInvisibles: Unit, displayLineEndSelection: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], shouldShowInvisibles.asInstanceOf[js.Any], displayLineEndSelection.asInstanceOf[js.Any])).asInstanceOf[EditorView]
  inline def createEditor(docNode: Node): EditorView = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any]).asInstanceOf[EditorView]
  inline def createEditor(docNode: Node, shouldShowInvisibles: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], shouldShowInvisibles.asInstanceOf[js.Any])).asInstanceOf[EditorView]
  inline def createEditor(docNode: Node, shouldShowInvisibles: Boolean, displayLineEndSelection: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], shouldShowInvisibles.asInstanceOf[js.Any], displayLineEndSelection.asInstanceOf[js.Any])).asInstanceOf[EditorView]
  inline def createEditor(docNode: Node, shouldShowInvisibles: Unit, displayLineEndSelection: Boolean): EditorView = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")(docNode.asInstanceOf[js.Any], shouldShowInvisibles.asInstanceOf[js.Any], displayLineEndSelection.asInstanceOf[js.Any])).asInstanceOf[EditorView]
}
