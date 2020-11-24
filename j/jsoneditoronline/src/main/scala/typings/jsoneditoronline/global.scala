package typings.jsoneditoronline

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class JSONEditor protected ()
    extends typings.jsoneditoronline.JSONEditor {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONEditorOptions) = this()
    def this(container: HTMLElement, options: js.UndefOr[scala.Nothing], json: js.Any) = this()
    def this(container: HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
  }
  /* static members */
  @js.native
  object JSONEditor extends js.Object {
    
    def addClassName(elem: HTMLElement, className: String): Unit = js.native
    
    var focusNode: typings.jsoneditoronline.JSONEditorNode = js.native
    
    var freezeHighlight: Boolean = js.native
    
    def getAbsoluteLeft(elem: HTMLElement): Double = js.native
    
    def getAbsoluteTop(elem: HTMLElement): Double = js.native
    
    def getInnerText(element: HTMLElement, buffer: JSONEditorBuffer): String = js.native
    
    def getInternetExplorerVersion(): Double = js.native
    
    def getNodeFromTarget(target: HTMLElement): typings.jsoneditoronline.JSONEditorNode = js.native
    
    def parse(jsonString: String): js.Object = js.native
    
    def removeClassName(elem: HTMLElement, className: String): Unit = js.native
    
    def setEndOfContentEditable(contentEditableElement: HTMLElement): Unit = js.native
    
    def stripFormatting(divElement: HTMLElement): Unit = js.native
    
    def validate(jsonString: String): String = js.native
  }
  
  @js.native
  class JSONEditorAppendNode protected ()
    extends typings.jsoneditoronline.JSONEditorNode {
    def this(editor: typings.jsoneditoronline.JSONEditor) = this()
  }
  
  @js.native
  class JSONEditorHistory protected ()
    extends typings.jsoneditoronline.JSONEditorHistory {
    def this(editor: typings.jsoneditoronline.JSONEditor) = this()
  }
  
  @js.native
  class JSONEditorNode protected ()
    extends typings.jsoneditoronline.JSONEditorNode {
    def this(editor: typings.jsoneditoronline.JSONEditor, params: JSONEditorConstructorParams) = this()
  }
  
  @js.native
  class JSONEditorSearchBox protected ()
    extends typings.jsoneditoronline.JSONEditorSearchBox {
    def this(editor: typings.jsoneditoronline.JSONEditor, container: HTMLElement) = this()
  }
  
  @js.native
  class JSONFormatter protected ()
    extends typings.jsoneditoronline.JSONFormatter {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions) = this()
    def this(container: HTMLElement, options: js.UndefOr[scala.Nothing], json: js.Any) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions, json: js.Any) = this()
  }
}
