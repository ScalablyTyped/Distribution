package typings.knockoutPaging

import typings.knockoutPaging.anon.AddDisposeCallback
import typings.knockoutPaging.anon.Clear
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// NOTE TO MAINTAINERS AND CONTRIBUTORS : pay attention to only include symbols that are
// publicly exported in the minified version of ko, without that you can give the false
// impression that some functions will be available in production builds.
//
@js.native
trait KnockoutUtils extends StObject {
  
  def addOrRemoveItem[T](array: js.Array[T], value: T, included: T): Unit = js.native
  def addOrRemoveItem[T](array: KnockoutObservable[T], value: T, included: T): Unit = js.native
  
  def arrayFilter[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
  
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): T = js.native
  def arrayFirst[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean], predicateOwner: Any): T = js.native
  
  def arrayForEach[T](array: js.Array[T], action: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = js.native
  
  def arrayGetDistinctValues[T](array: js.Array[T]): js.Array[T] = js.native
  
  def arrayIndexOf[T](array: js.Array[T], item: T): Double = js.native
  
  def arrayMap[T, U](array: js.Array[T], mapping: js.Function1[/* item */ T, U]): js.Array[U] = js.native
  
  def arrayPushAll[T](array: js.Array[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  def arrayPushAll[T](array: KnockoutObservableArray[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  
  def arrayRemoveItem(array: js.Array[Any], itemToRemove: Any): Unit = js.native
  
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): js.Array[KnockoutArrayChange[T]] = js.native
  
  //////////////////////////////////
  // utils.domData.js
  //////////////////////////////////
  var domData: Clear = js.native
  
  //////////////////////////////////
  // utils.domNodeDisposal.js
  //////////////////////////////////
  var domNodeDisposal: AddDisposeCallback = js.native
  
  def extend(target: js.Object, source: js.Object): js.Object = js.native
  
  var fieldsIncludedWithJsonPost: js.Array[Any] = js.native
  
  def getFormFields(form: Any, fieldName: String): js.Array[Any] = js.native
  
  def objectForEach(obj: Any, action: js.Function2[/* key */ Any, /* value */ Any, Unit]): Unit = js.native
  
  def parseHtmlFragment(html: String): js.Array[Any] = js.native
  
  def parseJson(jsonString: String): Any = js.native
  
  def peekObservable[T](value: KnockoutObservable[T]): T = js.native
  
  def postJson(urlOrForm: Any, data: Any, options: Any): Unit = js.native
  
  def range(min: Any, max: Any): Any = js.native
  
  def registerEventHandler(element: Any, eventType: Any, handler: js.Function): Unit = js.native
  
  def setHtml(node: Element, html: String): Unit = js.native
  def setHtml(node: Element, html: js.Function0[String]): Unit = js.native
  
  def setTextContent(element: Any, textContent: String): Unit = js.native
  def setTextContent(element: Any, textContent: KnockoutObservable[String]): Unit = js.native
  
  def stringifyJson(data: Any): String = js.native
  def stringifyJson(data: Any, replacer: js.Function): String = js.native
  def stringifyJson(data: Any, replacer: js.Function, space: String): String = js.native
  def stringifyJson(data: Any, replacer: Unit, space: String): String = js.native
  
  def toggleDomNodeCssClass(node: Any, className: String, shouldHaveClass: Boolean): Unit = js.native
  
  def triggerEvent(element: Any, eventType: Any): Unit = js.native
  
  def unwrapObservable[T](value: T): T = js.native
  def unwrapObservable[T](value: KnockoutObservable[T]): T = js.native
}
