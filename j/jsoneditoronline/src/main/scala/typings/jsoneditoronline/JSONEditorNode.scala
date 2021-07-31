package typings.jsoneditoronline

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorNode extends StObject {
  
  def appendChild(node: JSONEditorNode): Unit
  
  def blur(): Unit
  
  def changeType(newType: String): Unit
  
  def clearDom(): Unit
  
  def collapse(recurse: Boolean): Unit
  
  def containsNode(node: JSONEditorNode): Boolean
  
  def expand(recurse: Boolean): Unit
  
  def focus(): Unit
  
  def getAppend(): HTMLElement
  
  def getDom(): HTMLElement
  
  def getField(): String
  
  def getLevel(): Double
  
  def getParent(): JSONEditorNode
  
  def getValue(): js.Any
  
  def hide(): Unit
  
  def hideChilds(): Unit
  
  def insertBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit
  
  def moveBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit
  
  def moveTo(node: JSONEditorNode, index: Double): Unit
  
  def onEvent(event: Event): Unit
  
  def removeChild(node: JSONEditorNode): JSONEditorNode
  
  def scrollTo(): Unit
  
  def search(text: String): js.Array[JSONEditorNode]
  
  def setField(field: String, fieldEditable: Boolean): Unit
  
  def setHighlight(highlight: Boolean): Unit
  
  def setParent(parent: JSONEditorNode): Unit
  
  def setValue(value: js.Any): Unit
  
  def showChilds(): Unit
  
  var types: js.Array[JSONEditorNodeType]
  
  def updateDom(): Unit
  
  def updateField(field: String): Unit
  
  def updateValue(value: js.Any): Unit
}
object JSONEditorNode {
  
  @scala.inline
  def apply(
    appendChild: JSONEditorNode => Unit,
    blur: () => Unit,
    changeType: String => Unit,
    clearDom: () => Unit,
    collapse: Boolean => Unit,
    containsNode: JSONEditorNode => Boolean,
    expand: Boolean => Unit,
    focus: () => Unit,
    getAppend: () => HTMLElement,
    getDom: () => HTMLElement,
    getField: () => String,
    getLevel: () => Double,
    getParent: () => JSONEditorNode,
    getValue: () => js.Any,
    hide: () => Unit,
    hideChilds: () => Unit,
    insertBefore: (JSONEditorNode, JSONEditorNode) => Unit,
    moveBefore: (JSONEditorNode, JSONEditorNode) => Unit,
    moveTo: (JSONEditorNode, Double) => Unit,
    onEvent: Event => Unit,
    removeChild: JSONEditorNode => JSONEditorNode,
    scrollTo: () => Unit,
    search: String => js.Array[JSONEditorNode],
    setField: (String, Boolean) => Unit,
    setHighlight: Boolean => Unit,
    setParent: JSONEditorNode => Unit,
    setValue: js.Any => Unit,
    showChilds: () => Unit,
    types: js.Array[JSONEditorNodeType],
    updateDom: () => Unit,
    updateField: String => Unit,
    updateValue: js.Any => Unit
  ): JSONEditorNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), blur = js.Any.fromFunction0(blur), changeType = js.Any.fromFunction1(changeType), clearDom = js.Any.fromFunction0(clearDom), collapse = js.Any.fromFunction1(collapse), containsNode = js.Any.fromFunction1(containsNode), expand = js.Any.fromFunction1(expand), focus = js.Any.fromFunction0(focus), getAppend = js.Any.fromFunction0(getAppend), getDom = js.Any.fromFunction0(getDom), getField = js.Any.fromFunction0(getField), getLevel = js.Any.fromFunction0(getLevel), getParent = js.Any.fromFunction0(getParent), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hideChilds = js.Any.fromFunction0(hideChilds), insertBefore = js.Any.fromFunction2(insertBefore), moveBefore = js.Any.fromFunction2(moveBefore), moveTo = js.Any.fromFunction2(moveTo), onEvent = js.Any.fromFunction1(onEvent), removeChild = js.Any.fromFunction1(removeChild), scrollTo = js.Any.fromFunction0(scrollTo), search = js.Any.fromFunction1(search), setField = js.Any.fromFunction2(setField), setHighlight = js.Any.fromFunction1(setHighlight), setParent = js.Any.fromFunction1(setParent), setValue = js.Any.fromFunction1(setValue), showChilds = js.Any.fromFunction0(showChilds), types = types.asInstanceOf[js.Any], updateDom = js.Any.fromFunction0(updateDom), updateField = js.Any.fromFunction1(updateField), updateValue = js.Any.fromFunction1(updateValue))
    __obj.asInstanceOf[JSONEditorNode]
  }
  
  @scala.inline
  implicit class JSONEditorNodeMutableBuilder[Self <: JSONEditorNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendChild(value: JSONEditorNode => Unit): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeType(value: String => Unit): Self = StObject.set(x, "changeType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearDom(value: () => Unit): Self = StObject.set(x, "clearDom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapse(value: Boolean => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsNode(value: JSONEditorNode => Boolean): Self = StObject.set(x, "containsNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpand(value: Boolean => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAppend(value: () => HTMLElement): Self = StObject.set(x, "getAppend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDom(value: () => HTMLElement): Self = StObject.set(x, "getDom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetField(value: () => String): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLevel(value: () => Double): Self = StObject.set(x, "getLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParent(value: () => JSONEditorNode): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideChilds(value: () => Unit): Self = StObject.set(x, "hideChilds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertBefore(value: (JSONEditorNode, JSONEditorNode) => Unit): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveBefore(value: (JSONEditorNode, JSONEditorNode) => Unit): Self = StObject.set(x, "moveBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveTo(value: (JSONEditorNode, Double) => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnEvent(value: Event => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChild(value: JSONEditorNode => JSONEditorNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollTo(value: () => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearch(value: String => js.Array[JSONEditorNode]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetField(value: (String, Boolean) => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetHighlight(value: Boolean => Unit): Self = StObject.set(x, "setHighlight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParent(value: JSONEditorNode => Unit): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowChilds(value: () => Unit): Self = StObject.set(x, "showChilds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypes(value: js.Array[JSONEditorNodeType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: JSONEditorNodeType*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setUpdateDom(value: () => Unit): Self = StObject.set(x, "updateDom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateField(value: String => Unit): Self = StObject.set(x, "updateField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateValue(value: js.Any => Unit): Self = StObject.set(x, "updateValue", js.Any.fromFunction1(value))
  }
}
