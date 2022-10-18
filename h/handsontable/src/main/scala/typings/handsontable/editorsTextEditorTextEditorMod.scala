package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.editorsBaseEditorMod.BaseEditor
import typings.handsontable.handsontableStrings.text
import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsTextEditorTextEditorMod {
  
  @JSImport("handsontable/editors/textEditor/textEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: text = js.native
  
  @JSImport("handsontable/editors/textEditor/textEditor", "TextEditor")
  @js.native
  open class TextEditor protected () extends BaseEditor {
    def this(instance: default) = this()
    
    var TEXTAREA: HTMLElement = js.native
    
    var TEXTAREA_PARENT: HTMLElement = js.native
    
    def bindEvents(): Unit = js.native
    
    def createElements(): Unit = js.native
    
    def hideEditableElement(): Unit = js.native
    
    def refreshDimensions(): Unit = js.native
    def refreshDimensions(force: Boolean): Unit = js.native
    
    def refreshValue(): Unit = js.native
    
    def showEditableElement(): Unit = js.native
    
    var textareaParentStyle: CSSStyleDeclaration = js.native
    
    var textareaStyle: CSSStyleDeclaration = js.native
  }
}
