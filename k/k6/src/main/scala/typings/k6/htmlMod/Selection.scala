package typings.k6.htmlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "Selection")
@js.native
abstract class Selection () extends js.Object {
  /**
    * Get the value of an attribute for the first element in the Selection.
    * https://docs.k6.io/docs/selectionattrname
    * @param name - Name of attribute to get.
    * @returns Attribute value.
    */
  def attr(name: String): js.UndefOr[String] = js.native
  /**
    * Get the children of each element in the set of matched elements,
    * optionally filtered by a selector.
    * https://docs.k6.io/docs/selectionchildrenselector
    * @param selector - Selector expression.
    * @returns Selected children.
    */
  def children(): Selection = js.native
  def children(selector: String): Selection = js.native
  /**
    * For each element in the set, get the first element that matches the
    * selector by testing the element itself and traversing up through its
    * ancestors in the DOM tree.
    * https://docs.k6.io/docs/selectionclosestselector
    * @param selector - Selector expression.
    * @returns Selected nodes.
    */
  def closest(selector: String): Selection = js.native
  /**
    * Get the children of each element in the set of matched elements,
    * including text and comment nodes.
    * https://docs.k6.io/docs/selectioncontents
    * @returns Selected nodes.
    */
  def contents(): Selection = js.native
  /**
    * Return the value at the named data store for the first element in the
    * set of matched elements.
    * https://docs.k6.io/docs/selectiondatakey
    * @param key - A string naming the piece of data to set.\
    * @returns The value at the named data store.
    */
  def data(): js.UndefOr[String] = js.native
  def data(key: String): js.UndefOr[String] = js.native
  /**
    * Iterate over a Selection (k6/html), executing a function for each
    * matched element.
    * https://docs.k6.io/docs/selectioneachfn
    * @param handler - Logic to execute for each element.
    */
  def each(handler: Handler): Unit = js.native
  /**
    * Reduce the set of matched elements to the one at the specified index.
    * https://docs.k6.io/docs/selectioneqindex
    * @param index - An integer indicating the 0-based position of the element.
    * @returns Unary set of selected element.
    */
  def eq(index: Double): Selection = js.native
  /**
    * Reduce the set of matched elements to those that match the selector
    * or pass the function's test.
    * https://docs.k6.io/docs/selectionfilterfn
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def filter(selector: String): Selection = js.native
   // tslint:disable:unified-signatures
  /**
    * Reduce the set of matched elements to those that match the selector
    * or pass the function's test.
    * https://docs.k6.io/docs/selectionfilterfn
    * @param selector - A selection to match elements against.
    * @returns Selected elements.
    */
  def filter(selector: Selection): Selection = js.native
   // tslint:disable:unified-signatures
  /**
    * Reduce the set of matched elements to those that match the selector
    * or pass the function's test.
    * https://docs.k6.io/docs/selectionfilterfn
    * @param selector - A function used as a test for each element in the set.
    * @returns Selected elements.
    */
  def filter(selector: Tester): Selection = js.native
   // tslint:disable:unified-signatures
  /**
    * Find the selection descendants, filtered by a selector.
    * https://docs.k6.io/docs/selectionfindselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def find(selector: String): Selection = js.native
  /**
    * Reduce the set of matched elements to the first.
    * https://docs.k6.io/docs/selectionfirst
    * @returns Unary set of first element.
    */
  def first(): Selection = js.native
  /**
    * Retrieve the element matched by the selector.
    * https://docs.k6.io/docs/selectiongetindex
    * @param index - A zero-based integer indicating which element to retrieve.
    * @returns Selected element.
    */
  def get(index: Double): Element = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that
    * matches the selector.
    * https://docs.k6.io/docs/selectionhasselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def has(selector: String): Selection = js.native
  /**
    * Get the HTML contents of the first element.
    * https://docs.k6.io/docs/selectionhtml
    * @returns The HTML content of the first element.
    */
  def html(): js.UndefOr[String] = js.native
  /**
    * Check the current matched set of elements against a selector or element
    * and return true if at least one of these elements matches the given
    * arguments.
    * https://docs.k6.io/docs/selectionisselector
    * @param selector - Selector expression.
    * @returns Whether selector matched at least one element.
    */
  def is(selector: String): Boolean = js.native
   // tslint:disable:unified-signatures
  /**
    * Check the current matched set of elements against a selector or element
    * and return true if at least one of these elements matches the given
    * arguments.
    * https://docs.k6.io/docs/selectionisselector
    * @param selector - A selection to match against.
    * @returns Whether selector matched at least one element.
    */
  def is(selector: Selection): Boolean = js.native
   // tslint:disable:unified-signatures
  /**
    * Check the current matched set of elements against a selector or element
    * and return true if at least one of these elements matches the given
    * arguments.
    * https://docs.k6.io/docs/selectionisselector
    * @param selector - A function used as a test for each element in the set.
    * @returns Whether selector matched at least one element.
    */
  def is(selector: Tester): Boolean = js.native
   // tslint:disable:unified-signatures
  /**
    * Reduce the set of matched elements to the final one.
    * https://docs.k6.io/docs/selectionlast
    * @returns Unary set of last element.
    */
  def last(): Selection = js.native
  /**
    * Pass each element in the current matched set through a function,
    * producing a new Array containing the return values.
    * https://docs.k6.io/docs/selectionmapfn
    * @param mapper - Procedure to execute on each element.
    * @returns Mapper return values.
    */
  def map(mapper: Mapper): js.Array[_] = js.native
  /**
    * Get the immediately following sibling of each element.
    * https://docs.k6.io/docs/selectionnext
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def next(): Selection = js.native
  def next(selector: String): Selection = js.native
  /**
    * Get all following siblings of each element,
    * optionally filtered by a selector.
    * https://docs.k6.io/docs/selectionnextallselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def nextAll(): Selection = js.native
  def nextAll(selector: String): Selection = js.native
  /**
    * Get all following siblings of each element up to but not including the
    * element matched by the selector.
    * https://docs.k6.io/docs/selectionnextuntilselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def nextUntil(): Selection = js.native
  def nextUntil(selector: String): Selection = js.native
  /**
    * Remove elements.
    * https://docs.k6.io/docs/selectionnotselector
    * @param selector - Selector expression.
    * @returns Selection with matched elements removed.
    */
  def not(selector: String): Selection = js.native
   // tslint:disable:unified-signatures
  /**
    * Remove elements.
    * https://docs.k6.io/docs/selectionnotselector
    * @param selector - A function used as a test for each element in the set.
    * @returns Selection with matched elements removed.
    */
  def not(selector: Tester): Selection = js.native
   // tslint:disable:unified-signatures
  /**
    * Get the parent of each element, optionally filtered by a selector.
    * https://docs.k6.io/docs/selectionparentselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def parent(): Selection = js.native
  def parent(selector: String): Selection = js.native
  /**
    * Get the ancestors of each element, optionally filtered by a selector.
    * https://docs.k6.io/docs/selectionparentsselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def parents(): Selection = js.native
  def parents(selector: String): Selection = js.native
  /**
    * Get the ancestors of each element,
    * up to but not including the element matched by the selector.
    * https://docs.k6.io/docs/selectionparentsuntilselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def parentsUntil(): Selection = js.native
  def parentsUntil(selector: String): Selection = js.native
  /**
    * Get the immediately preceding sibling of each element.
    * https://docs.k6.io/docs/selectionprevselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def prev(): Selection = js.native
  def prev(selector: String): Selection = js.native
  /**
    * Get all preceding siblings of each element,
    * optionally filtered by a selector.
    * https://docs.k6.io/docs/selectionprevallselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def prevAll(): Selection = js.native
  def prevAll(selector: String): Selection = js.native
  /**
    * Get all preceding siblings of each element
    * up to but not including the element matched by the selector.
    * https://docs.k6.io/docs/selectionprevuntilselector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def prevUntil(): Selection = js.native
  def prevUntil(selector: String): Selection = js.native
  /**
    * Encode a set of form elements as a string
    * in standard URL-encoded notation for submission.
    * https://docs.k6.io/docs/selectionserialize
    * @returns URL-encoded representation of the form or form elements.
    */
  def serialize(): String = js.native
  /**
    * Encode a set of form elements as an array of name-value objects.
    * `[{ name: "name", value: "value" }, ... ]`
    * https://docs.k6.io/docs/selectionserializearray
    * @returns Array of name value objects of the form or form elements.
    */
  def serializeArray(): js.Array[FormValue] = js.native
  /**
    * Encode a set of form elements as an object.
    * `{ inputName: "value", checkboxName: "value", ... }`
    * https://docs.k6.io/docs/selectionserializeobject
    * @returns Object representation of the form or form elements,
    *     key is field name and value is field value.
    */
  def serializeObject(): StringDictionary[String] = js.native
  /**
    * Return the number of elements in the selection.
    * https://docs.k6.io/docs/selectionsize
    * @returns The number of elements in the selection.
    */
  def size(): Double = js.native
  /**
    * Reduce the set of elements to a subset specified by a range of indices.
    * https://docs.k6.io/docs/selectionslicestart-end
    * @param start - An integer indicating the 0-based position at which the
    *     elements begin to be selected.
    * @param end - An integer indicating the 0-based position at which the
    *     elements stop being selected.
    * @returns Selected elements.
    */
  def slice(start: Double): Selection = js.native
  def slice(start: Double, end: Double): Selection = js.native
  /**
    * Get the text content of the selection.
    * @returns Text content.
    */
  def text(): String = js.native
  /**
    * Retrieve all the elements contained in the selection as an array.
    * https://docs.k6.io/docs/selectiontoarray
    * @returns A unary selection of each element.
    */
  def toArray(): js.Array[Selection] = js.native
  /**
    * Get the current value of the first element.
    * @returns The value of the first element.
    */
  def `val`(): js.UndefOr[String] = js.native
}

