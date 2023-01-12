package typings.highlightJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emitter extends StObject {
  
  def addKeyword(text: String, kind: String): Unit
  
  def addSublanguage(emitter: Emitter, subLanguageName: String): Unit
  
  def addText(text: String): Unit
  
  def closeAllNodes(): Unit
  
  def closeNode(): Unit
  
  def openNode(kind: String): Unit
  
  def toHTML(): String
}
object Emitter {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Emitter] (val x: Self) extends AnyVal {
    
    inline def setAddKeyword(value: (String, String) => Unit): Self = StObject.set(x, "addKeyword", js.Any.fromFunction2(value))
    
    inline def setAddSublanguage(value: (Emitter, String) => Unit): Self = StObject.set(x, "addSublanguage", js.Any.fromFunction2(value))
    
    inline def setAddText(value: String => Unit): Self = StObject.set(x, "addText", js.Any.fromFunction1(value))
    
    inline def setCloseAllNodes(value: () => Unit): Self = StObject.set(x, "closeAllNodes", js.Any.fromFunction0(value))
    
    inline def setCloseNode(value: () => Unit): Self = StObject.set(x, "closeNode", js.Any.fromFunction0(value))
    
    inline def setOpenNode(value: String => Unit): Self = StObject.set(x, "openNode", js.Any.fromFunction1(value))
    
    inline def setToHTML(value: () => String): Self = StObject.set(x, "toHTML", js.Any.fromFunction0(value))
  }
}
