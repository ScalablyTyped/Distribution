package typings.jsoneditoronline

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class JSONEditor protected ()
    extends typings.jsoneditoronline.JSONEditor {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONEditorOptions) = this()
    def this(container: HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
  }
  
  @js.native
  class JSONEditorAppendNode protected ()
    extends typings.jsoneditoronline.JSONEditorNode {
    def this(editor: typings.jsoneditoronline.JSONEditor) = this()
    /* CompleteClass */
    override var types: js.Array[JSONEditorNodeType] = js.native
    /* CompleteClass */
    override def appendChild(node: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def blur(): Unit = js.native
    /* CompleteClass */
    override def changeType(newType: String): Unit = js.native
    /* CompleteClass */
    override def clearDom(): Unit = js.native
    /* CompleteClass */
    override def collapse(recurse: Boolean): Unit = js.native
    /* CompleteClass */
    override def containsNode(node: typings.jsoneditoronline.JSONEditorNode): Boolean = js.native
    /* CompleteClass */
    override def expand(recurse: Boolean): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def getAppend(): HTMLElement = js.native
    /* CompleteClass */
    override def getDom(): HTMLElement = js.native
    /* CompleteClass */
    override def getField(): String = js.native
    /* CompleteClass */
    override def getLevel(): Double = js.native
    /* CompleteClass */
    override def getParent(): typings.jsoneditoronline.JSONEditorNode = js.native
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def hideChilds(): Unit = js.native
    /* CompleteClass */
    override def insertBefore(node: typings.jsoneditoronline.JSONEditorNode, beforeNode: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def moveBefore(node: typings.jsoneditoronline.JSONEditorNode, beforeNode: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def moveTo(node: typings.jsoneditoronline.JSONEditorNode, index: Double): Unit = js.native
    /* CompleteClass */
    override def onEvent(event: Event): Unit = js.native
    /* CompleteClass */
    override def removeChild(node: typings.jsoneditoronline.JSONEditorNode): typings.jsoneditoronline.JSONEditorNode = js.native
    /* CompleteClass */
    override def scrollTo(): Unit = js.native
    /* CompleteClass */
    override def search(text: String): js.Array[typings.jsoneditoronline.JSONEditorNode] = js.native
    /* CompleteClass */
    override def setField(field: String, fieldEditable: Boolean): Unit = js.native
    /* CompleteClass */
    override def setHighlight(highlight: Boolean): Unit = js.native
    /* CompleteClass */
    override def setParent(parent: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def setValue(value: js.Any): Unit = js.native
    /* CompleteClass */
    override def showChilds(): Unit = js.native
    /* CompleteClass */
    override def updateDom(): Unit = js.native
    /* CompleteClass */
    override def updateField(field: String): Unit = js.native
    /* CompleteClass */
    override def updateValue(value: js.Any): Unit = js.native
  }
  
  @js.native
  class JSONEditorHistory protected ()
    extends typings.jsoneditoronline.JSONEditorHistory {
    def this(editor: typings.jsoneditoronline.JSONEditor) = this()
    /* CompleteClass */
    override def add(action: String, params: js.Object): Unit = js.native
    /* CompleteClass */
    override def canRedo(): Boolean = js.native
    /* CompleteClass */
    override def canUndo(): Boolean = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def onChange(): Unit = js.native
    /* CompleteClass */
    override def redo(): Unit = js.native
    /* CompleteClass */
    override def undo(): Unit = js.native
  }
  
  @js.native
  class JSONEditorNode protected ()
    extends typings.jsoneditoronline.JSONEditorNode {
    def this(editor: typings.jsoneditoronline.JSONEditor, params: JSONEditorConstructorParams) = this()
    /* CompleteClass */
    override var types: js.Array[JSONEditorNodeType] = js.native
    /* CompleteClass */
    override def appendChild(node: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def blur(): Unit = js.native
    /* CompleteClass */
    override def changeType(newType: String): Unit = js.native
    /* CompleteClass */
    override def clearDom(): Unit = js.native
    /* CompleteClass */
    override def collapse(recurse: Boolean): Unit = js.native
    /* CompleteClass */
    override def containsNode(node: typings.jsoneditoronline.JSONEditorNode): Boolean = js.native
    /* CompleteClass */
    override def expand(recurse: Boolean): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def getAppend(): HTMLElement = js.native
    /* CompleteClass */
    override def getDom(): HTMLElement = js.native
    /* CompleteClass */
    override def getField(): String = js.native
    /* CompleteClass */
    override def getLevel(): Double = js.native
    /* CompleteClass */
    override def getParent(): typings.jsoneditoronline.JSONEditorNode = js.native
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def hideChilds(): Unit = js.native
    /* CompleteClass */
    override def insertBefore(node: typings.jsoneditoronline.JSONEditorNode, beforeNode: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def moveBefore(node: typings.jsoneditoronline.JSONEditorNode, beforeNode: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def moveTo(node: typings.jsoneditoronline.JSONEditorNode, index: Double): Unit = js.native
    /* CompleteClass */
    override def onEvent(event: Event): Unit = js.native
    /* CompleteClass */
    override def removeChild(node: typings.jsoneditoronline.JSONEditorNode): typings.jsoneditoronline.JSONEditorNode = js.native
    /* CompleteClass */
    override def scrollTo(): Unit = js.native
    /* CompleteClass */
    override def search(text: String): js.Array[typings.jsoneditoronline.JSONEditorNode] = js.native
    /* CompleteClass */
    override def setField(field: String, fieldEditable: Boolean): Unit = js.native
    /* CompleteClass */
    override def setHighlight(highlight: Boolean): Unit = js.native
    /* CompleteClass */
    override def setParent(parent: typings.jsoneditoronline.JSONEditorNode): Unit = js.native
    /* CompleteClass */
    override def setValue(value: js.Any): Unit = js.native
    /* CompleteClass */
    override def showChilds(): Unit = js.native
    /* CompleteClass */
    override def updateDom(): Unit = js.native
    /* CompleteClass */
    override def updateField(field: String): Unit = js.native
    /* CompleteClass */
    override def updateValue(value: js.Any): Unit = js.native
  }
  
  @js.native
  class JSONEditorSearchBox protected ()
    extends typings.jsoneditoronline.JSONEditorSearchBox {
    def this(editor: typings.jsoneditoronline.JSONEditor, container: HTMLElement) = this()
    /* CompleteClass */
    override def clearDelay(): Unit = js.native
    /* CompleteClass */
    override def focusActiveResult(): Unit = js.native
    /* CompleteClass */
    override def next(): Unit = js.native
    /* CompleteClass */
    override def onDelayedSearch(event: Event): Unit = js.native
    /* CompleteClass */
    override def onKeyDown(event: Event): Unit = js.native
    /* CompleteClass */
    override def onKeyUp(event: Event): Unit = js.native
    /* CompleteClass */
    override def onSearch(event: Event, forcedSearch: Boolean): Unit = js.native
    /* CompleteClass */
    override def previous(): Unit = js.native
    /* CompleteClass */
    override def setActiveResult(index: Double): Unit = js.native
  }
  
  @js.native
  class JSONFormatter protected ()
    extends typings.jsoneditoronline.JSONFormatter {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions, json: js.Any) = this()
    /* CompleteClass */
    override def get(): js.Object = js.native
    /* CompleteClass */
    override def getText(): String = js.native
    /* CompleteClass */
    override def onError(err: String): Unit = js.native
    /* CompleteClass */
    override def set(json: js.Object): Unit = js.native
    /* CompleteClass */
    override def setText(jsonString: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object JSONEditor extends js.Object {
    var focusNode: typings.jsoneditoronline.JSONEditorNode = js.native
    var freezeHighlight: Boolean = js.native
    def addClassName(elem: HTMLElement, className: String): Unit = js.native
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
  
}

