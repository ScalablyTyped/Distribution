package typings.jsoneditoronline

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("JSONEditor")
  @js.native
  class JSONEditor protected ()
    extends typings.jsoneditoronline.JSONEditor {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONEditorOptions) = this()
    def this(container: HTMLElement, options: js.UndefOr[scala.Nothing], json: js.Any) = this()
    def this(container: HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
  }
  object JSONEditor {
    
    @JSGlobal("JSONEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.addClassName")
    @js.native
    def addClassName(elem: HTMLElement, className: String): Unit = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.focusNode")
    @js.native
    def focusNode: typings.jsoneditoronline.JSONEditorNode = js.native
    @scala.inline
    def focusNode_=(x: typings.jsoneditoronline.JSONEditorNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusNode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("JSONEditor.freezeHighlight")
    @js.native
    def freezeHighlight: Boolean = js.native
    @scala.inline
    def freezeHighlight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("freezeHighlight")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("JSONEditor.getAbsoluteLeft")
    @js.native
    def getAbsoluteLeft(elem: HTMLElement): Double = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.getAbsoluteTop")
    @js.native
    def getAbsoluteTop(elem: HTMLElement): Double = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.getInnerText")
    @js.native
    def getInnerText(element: HTMLElement, buffer: JSONEditorBuffer): String = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.getInternetExplorerVersion")
    @js.native
    def getInternetExplorerVersion(): Double = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.getNodeFromTarget")
    @js.native
    def getNodeFromTarget(target: HTMLElement): typings.jsoneditoronline.JSONEditorNode = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.parse")
    @js.native
    def parse(jsonString: String): js.Object = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.removeClassName")
    @js.native
    def removeClassName(elem: HTMLElement, className: String): Unit = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.setEndOfContentEditable")
    @js.native
    def setEndOfContentEditable(contentEditableElement: HTMLElement): Unit = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.stripFormatting")
    @js.native
    def stripFormatting(divElement: HTMLElement): Unit = js.native
    
    /* static member */
    @JSGlobal("JSONEditor.validate")
    @js.native
    def validate(jsonString: String): String = js.native
  }
  
  @JSGlobal("JSONEditorAppendNode")
  @js.native
  class JSONEditorAppendNode protected ()
    extends typings.jsoneditoronline.JSONEditorNode {
    def this(editor: typings.jsoneditoronline.JSONEditor) = this()
  }
  
  @JSGlobal("JSONEditorHistory")
  @js.native
  class JSONEditorHistory protected ()
    extends typings.jsoneditoronline.JSONEditorHistory {
    def this(editor: typings.jsoneditoronline.JSONEditor) = this()
  }
  
  @JSGlobal("JSONEditorNode")
  @js.native
  class JSONEditorNode protected ()
    extends typings.jsoneditoronline.JSONEditorNode {
    def this(editor: typings.jsoneditoronline.JSONEditor, params: JSONEditorConstructorParams) = this()
  }
  
  @JSGlobal("JSONEditorSearchBox")
  @js.native
  class JSONEditorSearchBox protected ()
    extends typings.jsoneditoronline.JSONEditorSearchBox {
    def this(editor: typings.jsoneditoronline.JSONEditor, container: HTMLElement) = this()
  }
  
  @JSGlobal("JSONFormatter")
  @js.native
  class JSONFormatter protected ()
    extends typings.jsoneditoronline.JSONFormatter {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions) = this()
    def this(container: HTMLElement, options: js.UndefOr[scala.Nothing], json: js.Any) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions, json: js.Any) = this()
  }
}
