package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// NOTE TO MAINTAINERS AND CONTRIBUTORS : pay attention to only include symbols that are
// publicly exported in the minified version of ko, without that you can give the false
// impression that some functions will be available in production builds.
//
@js.native
trait KnockoutUtils extends js.Object {
  //////////////////////////////////
  // utils.domData.js
  //////////////////////////////////
  var domData: Anon_Set = js.native
  //////////////////////////////////
  // utils.domNodeDisposal.js
  //////////////////////////////////
  var domNodeDisposal: Anon_AddDisposeCallback = js.native
  var fieldsIncludedWithJsonPost: js.Array[_] = js.native
  def addOrRemoveItem[T](array: js.Array[T], value: T, included: T): scala.Unit = js.native
  def addOrRemoveItem[T](array: KnockoutObservable[T], value: T, included: T): scala.Unit = js.native
  def arrayFilter[T](array: js.Array[T], predicate: js.Function1[/* item */ T, scala.Boolean]): js.Array[T] = js.native
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, scala.Boolean], predicateOwner: js.Any): T = js.native
  def arrayForEach[T](array: js.Array[T], action: js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def arrayGetDistinctValues[T](array: js.Array[T]): js.Array[T] = js.native
  def arrayIndexOf[T](array: js.Array[T], item: T): scala.Double = js.native
  def arrayMap[T, U](array: js.Array[T], mapping: js.Function1[/* item */ T, U]): js.Array[U] = js.native
  def arrayPushAll[T](array: js.Array[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  def arrayPushAll[T](array: KnockoutObservableArray[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  def arrayRemoveItem(array: js.Array[_], itemToRemove: js.Any): scala.Unit = js.native
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): js.Array[KnockoutArrayChange[T]] = js.native
  def extend(target: js.Object, source: js.Object): js.Object = js.native
  def getFormFields(form: js.Any, fieldName: java.lang.String): js.Array[_] = js.native
  def objectForEach(obj: js.Any, action: js.Function2[/* key */ js.Any, /* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def parseHtmlFragment(html: java.lang.String): js.Array[_] = js.native
  def parseJson(jsonString: java.lang.String): js.Any = js.native
  def peekObservable[T](value: KnockoutObservable[T]): T = js.native
  def postJson(urlOrForm: js.Any, data: js.Any, options: js.Any): scala.Unit = js.native
  def range(min: js.Any, max: js.Any): js.Any = js.native
  def registerEventHandler(element: js.Any, eventType: js.Any, handler: js.Function): scala.Unit = js.native
  def setHtml(node: stdLib.Element, html: java.lang.String): scala.Unit = js.native
  def setHtml(node: stdLib.Element, html: js.Function0[java.lang.String]): scala.Unit = js.native
  def setTextContent(element: js.Any, textContent: java.lang.String): scala.Unit = js.native
  def setTextContent(element: js.Any, textContent: KnockoutObservable[java.lang.String]): scala.Unit = js.native
  def stringifyJson(data: js.Any): java.lang.String = js.native
  def stringifyJson(data: js.Any, replacer: js.Function): java.lang.String = js.native
  def stringifyJson(data: js.Any, replacer: js.Function, space: java.lang.String): java.lang.String = js.native
  def toggleDomNodeCssClass(node: js.Any, className: java.lang.String, shouldHaveClass: scala.Boolean): scala.Unit = js.native
  def triggerEvent(element: js.Any, eventType: js.Any): scala.Unit = js.native
  def unwrapObservable[T](value: T): T = js.native
  def unwrapObservable[T](value: KnockoutObservable[T]): T = js.native
}

