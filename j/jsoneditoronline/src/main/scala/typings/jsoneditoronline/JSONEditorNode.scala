package typings.jsoneditoronline

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorNode extends js.Object {
  var types: js.Array[JSONEditorNodeType] = js.native
  def appendChild(node: JSONEditorNode): Unit = js.native
  def blur(): Unit = js.native
  def changeType(newType: String): Unit = js.native
  def clearDom(): Unit = js.native
  def collapse(recurse: Boolean): Unit = js.native
  def containsNode(node: JSONEditorNode): Boolean = js.native
  def expand(recurse: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def getAppend(): HTMLElement = js.native
  def getDom(): HTMLElement = js.native
  def getField(): String = js.native
  def getLevel(): Double = js.native
  def getParent(): JSONEditorNode = js.native
  def getValue(): js.Any = js.native
  def hide(): Unit = js.native
  def hideChilds(): Unit = js.native
  def insertBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit = js.native
  def moveBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit = js.native
  def moveTo(node: JSONEditorNode, index: Double): Unit = js.native
  def onEvent(event: Event): Unit = js.native
  def removeChild(node: JSONEditorNode): JSONEditorNode = js.native
  def scrollTo(): Unit = js.native
  def search(text: String): js.Array[JSONEditorNode] = js.native
  def setField(field: String, fieldEditable: Boolean): Unit = js.native
  def setHighlight(highlight: Boolean): Unit = js.native
  def setParent(parent: JSONEditorNode): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
  def showChilds(): Unit = js.native
  def updateDom(): Unit = js.native
  def updateField(field: String): Unit = js.native
  def updateValue(value: js.Any): Unit = js.native
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
  implicit class JSONEditorNodeOps[Self <: JSONEditorNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendChild(value: JSONEditorNode => Unit): Self = this.set("appendChild", js.Any.fromFunction1(value))
    @scala.inline
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeType(value: String => Unit): Self = this.set("changeType", js.Any.fromFunction1(value))
    @scala.inline
    def setClearDom(value: () => Unit): Self = this.set("clearDom", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapse(value: Boolean => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def setContainsNode(value: JSONEditorNode => Boolean): Self = this.set("containsNode", js.Any.fromFunction1(value))
    @scala.inline
    def setExpand(value: Boolean => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAppend(value: () => HTMLElement): Self = this.set("getAppend", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDom(value: () => HTMLElement): Self = this.set("getDom", js.Any.fromFunction0(value))
    @scala.inline
    def setGetField(value: () => String): Self = this.set("getField", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLevel(value: () => Double): Self = this.set("getLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParent(value: () => JSONEditorNode): Self = this.set("getParent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setHideChilds(value: () => Unit): Self = this.set("hideChilds", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertBefore(value: (JSONEditorNode, JSONEditorNode) => Unit): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveBefore(value: (JSONEditorNode, JSONEditorNode) => Unit): Self = this.set("moveBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveTo(value: (JSONEditorNode, Double) => Unit): Self = this.set("moveTo", js.Any.fromFunction2(value))
    @scala.inline
    def setOnEvent(value: Event => Unit): Self = this.set("onEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveChild(value: JSONEditorNode => JSONEditorNode): Self = this.set("removeChild", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollTo(value: () => Unit): Self = this.set("scrollTo", js.Any.fromFunction0(value))
    @scala.inline
    def setSearch(value: String => js.Array[JSONEditorNode]): Self = this.set("search", js.Any.fromFunction1(value))
    @scala.inline
    def setSetField(value: (String, Boolean) => Unit): Self = this.set("setField", js.Any.fromFunction2(value))
    @scala.inline
    def setSetHighlight(value: Boolean => Unit): Self = this.set("setHighlight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParent(value: JSONEditorNode => Unit): Self = this.set("setParent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def setShowChilds(value: () => Unit): Self = this.set("showChilds", js.Any.fromFunction0(value))
    @scala.inline
    def setTypesVarargs(value: JSONEditorNodeType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[JSONEditorNodeType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateDom(value: () => Unit): Self = this.set("updateDom", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateField(value: String => Unit): Self = this.set("updateField", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateValue(value: js.Any => Unit): Self = this.set("updateValue", js.Any.fromFunction1(value))
  }
  
}

