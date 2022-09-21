package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.textEditorMod.TextEditor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handsontableEditorHandsontableEditorMod {
  
  @JSImport("handsontable/editors/handsontableEditor/handsontableEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: typings.handsontable.handsontableStrings.handsontable = js.native
  
  @JSImport("handsontable/editors/handsontableEditor/handsontableEditor", "HandsontableEditor")
  @js.native
  open class HandsontableEditor protected () extends TextEditor {
    def this(instance: default) = this()
    
    var htContainer: HTMLElement = js.native
    
    var htEditor: default = js.native
  }
}
