package typings.highlightJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emitter extends js.Object {
  
  def addKeyword(text: String, kind: String): Unit = js.native
  
  def addSublanguage(emitter: Emitter, subLanguageName: String): Unit = js.native
  
  def addText(text: String): Unit = js.native
  
  def closeAllNodes(): Unit = js.native
  
  def closeNode(): Unit = js.native
  
  def openNode(kind: String): Unit = js.native
  
  def toHTML(): String = js.native
}
object Emitter {
  
  @scala.inline
  def apply(
    addKeyword: (String, String) => Unit,
    addSublanguage: (Emitter, String) => Unit,
    addText: String => Unit,
    closeAllNodes: () => Unit,
    closeNode: () => Unit,
    openNode: String => Unit,
    toHTML: () => String
  ): Emitter = {
    val __obj = js.Dynamic.literal(addKeyword = js.Any.fromFunction2(addKeyword), addSublanguage = js.Any.fromFunction2(addSublanguage), addText = js.Any.fromFunction1(addText), closeAllNodes = js.Any.fromFunction0(closeAllNodes), closeNode = js.Any.fromFunction0(closeNode), openNode = js.Any.fromFunction1(openNode), toHTML = js.Any.fromFunction0(toHTML))
    __obj.asInstanceOf[Emitter]
  }
  
  @scala.inline
  implicit class EmitterOps[Self <: Emitter] (val x: Self) extends AnyVal {
    
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
    def setAddKeyword(value: (String, String) => Unit): Self = this.set("addKeyword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddSublanguage(value: (Emitter, String) => Unit): Self = this.set("addSublanguage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddText(value: String => Unit): Self = this.set("addText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseAllNodes(value: () => Unit): Self = this.set("closeAllNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseNode(value: () => Unit): Self = this.set("closeNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenNode(value: String => Unit): Self = this.set("openNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToHTML(value: () => String): Self = this.set("toHTML", js.Any.fromFunction0(value))
  }
}
