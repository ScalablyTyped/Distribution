package typings.htmlparser2.mod

import typings.domhandler.mod.DomElement
import typings.domutils.anon.DecodeEntities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("htmlparser2", "DomUtils")
@js.native
object DomUtils extends js.Object {
  
  def append(elem: DomElement, next: DomElement): Unit = js.native
  
  def appendChild(elem: DomElement, child: DomElement): Unit = js.native
  
  def compareDocumentPosition(nodeA: DomElement, nodeB: DomElement): Double = js.native
  
  def existsOne(test: js.Any, elems: js.Array[DomElement]): Boolean = js.native
  
  def filter(test: js.Any, element: DomElement, recurse: Boolean, limit: Double): js.Array[DomElement] = js.native
  
  def find(test: js.Any, elems: js.Array[DomElement], recurse: Boolean, limit: Double): js.Array[DomElement] = js.native
  
  def findAll(test: js.Any, rootElems: js.Array[DomElement]): js.Array[DomElement] = js.native
  
  def findOne(test: js.Any, elems: js.Array[DomElement]): DomElement = js.native
  
  def findOneChild(test: js.Any, elems: js.Array[DomElement]): DomElement = js.native
  
  def getAttributeValue(elem: DomElement, name: String): String = js.native
  
  def getChildren(elem: DomElement): js.Array[DomElement] = js.native
  
  def getElementById(id: js.Any, element: js.Any): js.Any = js.native
  def getElementById(id: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  
  def getElements(options: js.Any, element: js.Any): js.Any = js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  
  def getElementsByTagName(name: js.Any, element: js.Any): js.Any = js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  
  def getElementsByTagType(`type`: js.Any, element: js.Any): js.Any = js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  
  def getInnerHTML(elem: DomElement, opts: js.Any): String = js.native
  
  def getName(elem: DomElement): String = js.native
  
  def getOuterHTML(dom: js.Array[DomElement]): String = js.native
  def getOuterHTML(dom: js.Array[DomElement], opts: DecodeEntities): String = js.native
  
  def getParent(elem: DomElement): DomElement = js.native
  
  def getSiblings(elem: DomElement): js.Array[DomElement] = js.native
  
  def getText(elem: DomElement): String = js.native
  
  def hasAttrib(elem: DomElement, name: String): Boolean = js.native
  
  def isTag(elem: DomElement): Boolean = js.native
  
  def prepend(elem: DomElement, prev: DomElement): Unit = js.native
  
  def removeElement(elem: DomElement): Unit = js.native
  
  def removeSubsets(nodes: js.Array[DomElement]): js.Array[DomElement] = js.native
  
  def replaceElement(elem: DomElement, replacement: DomElement): Unit = js.native
  
  def testElement(options: js.Any, element: js.Any): js.Any = js.native
  
  def uniqueSort(nodes: js.Array[DomElement]): js.Array[DomElement] = js.native
}
