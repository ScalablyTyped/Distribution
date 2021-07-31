package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.anon.AddDisposeCallback
import typings.jqueryAjaxfile.anon.Clear
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutUtils extends StObject {
  
  def arrayFilter[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
  
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): T = js.native
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean], predicateOwner: js.Any): T = js.native
  
  def arrayForEach[T](array: js.Array[T], action: js.Function1[/* item */ T, Unit]): Unit = js.native
  
  def arrayGetDistinctValues[T](array: js.Array[T]): js.Array[T] = js.native
  
  def arrayIndexOf[T](array: js.Array[T], item: T): Double = js.native
  
  def arrayMap[T, U](array: js.Array[T], mapping: js.Function1[/* item */ T, U]): js.Array[U] = js.native
  
  def arrayPushAll[T](array: js.Array[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  def arrayPushAll[T](array: KnockoutObservableArray[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  
  def arrayRemoveItem(array: js.Array[js.Any], itemToRemove: js.Any): Unit = js.native
  
  def cloneNodes(nodesArray: js.Array[js.Any], shouldCleanNodes: Boolean): js.Array[js.Any] = js.native
  
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): js.Array[KnockoutArrayChange[T]] = js.native
  
  //////////////////////////////////
  // utils.domData.js
  //////////////////////////////////
  var domData: Clear = js.native
  
  //////////////////////////////////
  // utils.domNodeDisposal.js
  //////////////////////////////////
  var domNodeDisposal: AddDisposeCallback = js.native
  
  def domNodeIsAttachedToDocument(node: js.Any): Boolean = js.native
  
  def domNodeIsContainedBy(node: js.Any, containedByNode: js.Any): Boolean = js.native
  
  def ensureSelectElementIsRenderedCorrectly(selectElement: js.Any): Unit = js.native
  
  def extend(target: Object, source: Object): Object = js.native
  
  //////////////////////////////////
  // utils.js
  //////////////////////////////////
  var fieldsIncludedWithJsonPost: js.Array[js.Any] = js.native
  
  def forceRefresh(node: js.Any): Unit = js.native
  
  def getFormFields(form: js.Any, fieldName: String): js.Array[js.Any] = js.native
  
  var ieVersion: Double = js.native
  
  var isIe6: Boolean = js.native
  
  var isIe7: Boolean = js.native
  
  def jQueryHtmlParse(html: String): js.Array[js.Any] = js.native
  
  def makeArray(arrayLikeObject: js.Any): js.Array[js.Any] = js.native
  
  def moveCleanedNodesToContainerElement(nodes: js.Array[js.Any]): HTMLElement = js.native
  
  def parseHtmlFragment(html: String): js.Array[js.Any] = js.native
  
  def parseJson(jsonString: String): js.Any = js.native
  
  def peekObservable[T](value: KnockoutObservable[T]): T = js.native
  
  def postJson(urlOrForm: js.Any, data: js.Any, options: js.Any): Unit = js.native
  
  def range(min: js.Any, max: js.Any): js.Any = js.native
  
  def registerEventHandler(element: js.Any, eventType: js.Any, handler: js.Function): Unit = js.native
  
  def replaceDomNodes(nodeToReplaceOrNodeArray: js.Any, newNodesArray: js.Array[js.Any]): Unit = js.native
  
  def setDomNodeChildren(domNode: js.Any, childNodes: js.Array[js.Any]): Unit = js.native
  
  //setTextContent(element: any, textContent: string): void; // NOT PART OF THE MINIFIED API SURFACE (ONLY IN knockout-{version}.debug.js) https://github.com/SteveSanderson/knockout/issues/670
  def setElementName(element: js.Any, name: String): Unit = js.native
  
  def setHtml(node: Element, html: String): Unit = js.native
  def setHtml(node: Element, html: js.Function0[String]): Unit = js.native
  
  def setOptionNodeSelectionState(optionNode: js.Any, isSelected: Boolean): Unit = js.native
  
  //////////////////////////////////
  // utils.domManipulation.js
  //////////////////////////////////
  def simpleHtmlParse(html: String): js.Array[js.Any] = js.native
  
  def stringStartsWith(str: String, startsWith: String): Boolean = js.native
  
  def stringTokenize(str: String, delimiter: String): js.Array[String] = js.native
  
  def stringTrim(str: String): String = js.native
  
  def stringifyJson(data: js.Any): String = js.native
  def stringifyJson(data: js.Any, replacer: js.Function): String = js.native
  def stringifyJson(data: js.Any, replacer: js.Function, space: String): String = js.native
  def stringifyJson(data: js.Any, replacer: Unit, space: String): String = js.native
  
  def tagNameLower(element: js.Any): String = js.native
  
  def toggleDomNodeCssClass(node: js.Any, className: String, shouldHaveClass: Boolean): Unit = js.native
  
  def triggerEvent(element: js.Any, eventType: js.Any): Unit = js.native
  
  def unwrapObservable[T](value: T): T = js.native
  def unwrapObservable[T](value: KnockoutObservable[T]): T = js.native
}
