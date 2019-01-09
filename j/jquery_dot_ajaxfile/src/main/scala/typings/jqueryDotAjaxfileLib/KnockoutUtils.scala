package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutUtils extends js.Object {
  //////////////////////////////////
  // utils.domData.js
  //////////////////////////////////
  var domData: Anon_Clear = js.native
  //////////////////////////////////
  // utils.domNodeDisposal.js
  //////////////////////////////////
  var domNodeDisposal: Anon_AddDisposeCallback = js.native
  //////////////////////////////////
  // utils.js
  //////////////////////////////////
  var fieldsIncludedWithJsonPost: js.Array[_] = js.native
  var ieVersion: scala.Double = js.native
  var isIe6: scala.Boolean = js.native
  var isIe7: scala.Boolean = js.native
  def arrayFilter[T](array: js.Array[T], predicate: js.Function1[/* item */ T, scala.Boolean]): js.Array[T] = js.native
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, scala.Boolean], predicateOwner: js.Any): T = js.native
  def arrayForEach[T](array: js.Array[T], action: js.Function1[/* item */ T, scala.Unit]): scala.Unit = js.native
  def arrayGetDistinctValues[T](array: js.Array[T]): js.Array[T] = js.native
  def arrayIndexOf[T](array: js.Array[T], item: T): scala.Double = js.native
  def arrayMap[T, U](array: js.Array[T], mapping: js.Function1[/* item */ T, U]): js.Array[U] = js.native
  def arrayPushAll[T](array: KnockoutObservableArray[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  def arrayPushAll[T](array: js.Array[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  def arrayRemoveItem(array: js.Array[_], itemToRemove: js.Any): scala.Unit = js.native
  def cloneNodes(nodesArray: js.Array[_], shouldCleanNodes: scala.Boolean): js.Array[_] = js.native
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): js.Array[KnockoutArrayChange[T]] = js.native
  def domNodeIsAttachedToDocument(node: js.Any): scala.Boolean = js.native
  def domNodeIsContainedBy(node: js.Any, containedByNode: js.Any): scala.Boolean = js.native
  def ensureSelectElementIsRenderedCorrectly(selectElement: js.Any): scala.Unit = js.native
  def extend(target: Object, source: Object): Object = js.native
  def forceRefresh(node: js.Any): scala.Unit = js.native
  def getFormFields(form: js.Any, fieldName: java.lang.String): js.Array[_] = js.native
  def jQueryHtmlParse(html: java.lang.String): js.Array[_] = js.native
  def makeArray(arrayLikeObject: js.Any): js.Array[_] = js.native
  def moveCleanedNodesToContainerElement(nodes: js.Array[_]): stdLib.HTMLElement = js.native
  def parseHtmlFragment(html: java.lang.String): js.Array[_] = js.native
  def parseJson(jsonString: java.lang.String): js.Any = js.native
  def peekObservable[T](value: KnockoutObservable[T]): T = js.native
  def postJson(urlOrForm: js.Any, data: js.Any, options: js.Any): scala.Unit = js.native
  def range(min: js.Any, max: js.Any): js.Any = js.native
  def registerEventHandler(element: js.Any, eventType: js.Any, handler: js.Function): scala.Unit = js.native
  def replaceDomNodes(nodeToReplaceOrNodeArray: js.Any, newNodesArray: js.Array[_]): scala.Unit = js.native
  def setDomNodeChildren(domNode: js.Any, childNodes: js.Array[_]): scala.Unit = js.native
  //setTextContent(element: any, textContent: string): void; // NOT PART OF THE MINIFIED API SURFACE (ONLY IN knockout-{version}.debug.js) https://github.com/SteveSanderson/knockout/issues/670
  def setElementName(element: js.Any, name: java.lang.String): scala.Unit = js.native
  def setHtml(node: stdLib.Element, html: java.lang.String): scala.Unit = js.native
  def setHtml(node: stdLib.Element, html: js.Function0[java.lang.String]): scala.Unit = js.native
  def setOptionNodeSelectionState(optionNode: js.Any, isSelected: scala.Boolean): scala.Unit = js.native
  //////////////////////////////////
  // utils.domManipulation.js
  //////////////////////////////////
  def simpleHtmlParse(html: java.lang.String): js.Array[_] = js.native
  def stringStartsWith(str: java.lang.String, startsWith: java.lang.String): scala.Boolean = js.native
  def stringTokenize(str: java.lang.String, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def stringTrim(str: java.lang.String): java.lang.String = js.native
  def stringifyJson(data: js.Any): java.lang.String = js.native
  def stringifyJson(data: js.Any, replacer: js.Function): java.lang.String = js.native
  def stringifyJson(data: js.Any, replacer: js.Function, space: java.lang.String): java.lang.String = js.native
  def tagNameLower(element: js.Any): java.lang.String = js.native
  def toggleDomNodeCssClass(node: js.Any, className: java.lang.String, shouldHaveClass: scala.Boolean): scala.Unit = js.native
  def triggerEvent(element: js.Any, eventType: js.Any): scala.Unit = js.native
  def unwrapObservable[T](value: T): T = js.native
  def unwrapObservable[T](value: KnockoutObservable[T]): T = js.native
}

