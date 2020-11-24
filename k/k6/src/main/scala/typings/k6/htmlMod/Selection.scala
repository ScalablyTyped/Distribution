package typings.k6.htmlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "Selection")
@js.native
abstract class Selection () extends js.Object {
  
  /**
    * Get the value of an attribute for the first element in the Selection.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-attr-name
    * @param name - Name of attribute to get.
    * @returns Attribute value.
    */
  def attr(name: String): js.UndefOr[String] = js.native
  
  /**
    * Get the children of each element in the set of matched elements,
    * optionally filtered by a selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-children-selector
    * @param selector - Selector expression.
    * @returns Selected children.
    */
  def children(): Selection = js.native
  def children(selector: String): Selection = js.native
  
  /**
    * For each element in the set, get the first element that matches the
    * selector by testing the element itself and traversing up through its
    * ancestors in the DOM tree.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-closest-selector
    * @param selector - Selector expression.
    * @returns Selected nodes.
    */
  def closest(selector: String): Selection = js.native
  
  /**
    * Get the children of each element in the set of matched elements,
    * including text and comment nodes.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-contents
    * @returns Selected nodes.
    */
  def contents(): Selection = js.native
  
  /**
    * Return the value at the named data store for the first element in the
    * set of matched elements.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-data-key
    * @param key - A string naming the piece of data to set.\
    * @returns The value at the named data store.
    */
  def data(): js.UndefOr[String] = js.native
  def data(key: String): js.UndefOr[String] = js.native
  
  /**
    * Iterate over a Selection (k6/html), executing a function for each
    * matched element.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-each-fn
    * @param handler - Logic to execute for each element.
    */
  def each(handler: Handler): Unit = js.native
  
  /**
    * Reduce the set of matched elements to the one at the specified index.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-eq-index
    * @param index - An integer indicating the 0-based position of the element.
    * @returns Unary set of selected element.
    */
  def eq(index: Double): Selection = js.native
  
  /**
    * Reduce the set of matched elements to those that match the selector
    * or pass the function's test.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-filter-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def filter(selector: String): Selection = js.native
  /**
    * Reduce the set of matched elements to those that match the selector
    * or pass the function's test.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-filter-selector
    * @param selector - A selection to match elements against.
    * @returns Selected elements.
    */
  def filter(selector: Selection): Selection = js.native
   // tslint:disable:unified-signatures
  /**
    * Reduce the set of matched elements to those that match the selector
    * or pass the function's test.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-filter-selector
    * @param selector - A function used as a test for each element in the set.
    * @returns Selected elements.
    */
  def filter(selector: Tester): Selection = js.native
  
  /**
    * Find the selection descendants, filtered by a selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-find-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def find(selector: String): Selection = js.native
  
  /**
    * Reduce the set of matched elements to the first.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-first
    * @returns Unary set of first element.
    */
  def first(): Selection = js.native
  
  /**
    * Retrieve the element matched by the selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-get-index
    * @param index - A zero-based integer indicating which element to retrieve.
    * @returns Selected element.
    */
  def get(index: Double): Element = js.native
  
  /**
    * Reduce the set of matched elements to those that have a descendant that
    * matches the selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-has-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def has(selector: String): Selection = js.native
  
  /**
    * Get the HTML contents of the first element.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-html
    * @returns The HTML content of the first element.
    */
  def html(): js.UndefOr[String] = js.native
  
  /**
    * Check the current matched set of elements against a selector or element
    * and return true if at least one of these elements matches the given
    * arguments.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-is-selector
    * @param selector - Selector expression.
    * @returns Whether selector matched at least one element.
    */
  def is(selector: String): Boolean = js.native
  /**
    * Check the current matched set of elements against a selector or element
    * and return true if at least one of these elements matches the given
    * arguments.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-is-selector
    * @param selector - A selection to match against.
    * @returns Whether selector matched at least one element.
    */
  def is(selector: Selection): Boolean = js.native
  /**
    * Check the current matched set of elements against a selector or element
    * and return true if at least one of these elements matches the given
    * arguments.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-is-selector
    * @param selector - A function used as a test for each element in the set.
    * @returns Whether selector matched at least one element.
    */
  def is(selector: Tester): Boolean = js.native
  
  /**
    * Reduce the set of matched elements to the final one.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-last
    * @returns Unary set of last element.
    */
  def last(): Selection = js.native
  
  /**
    * Pass each element in the current matched set through a function,
    * producing a new Array containing the return values.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-map-fn
    * @param mapper - Procedure to execute on each element.
    * @returns Mapper return values.
    */
  def map(mapper: Mapper): js.Array[_] = js.native
  
  /**
    * Get the immediately following sibling of each element.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-next-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def next(): Selection = js.native
  def next(selector: String): Selection = js.native
  
  /**
    * Get all following siblings of each element,
    * optionally filtered by a selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-nextall-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def nextAll(): Selection = js.native
  def nextAll(selector: String): Selection = js.native
  
  /**
    * Get all following siblings of each element up to but not including the
    * element matched by the selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-nextuntil-selector-filter
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def nextUntil(): Selection = js.native
  def nextUntil(selector: String): Selection = js.native
  
  /**
    * Remove elements.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-not-selector
    * @param selector - Selector expression.
    * @returns Selection with matched elements removed.
    */
  def not(selector: String): Selection = js.native
  /**
    * Remove elements.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-not-selector
    * @param selector - A function used as a test for each element in the set.
    * @returns Selection with matched elements removed.
    */
  def not(selector: Tester): Selection = js.native
  
  /**
    * Get the parent of each element, optionally filtered by a selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-parent-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def parent(): Selection = js.native
  def parent(selector: String): Selection = js.native
  
  /**
    * Get the ancestors of each element, optionally filtered by a selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-parents-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def parents(): Selection = js.native
  def parents(selector: String): Selection = js.native
  
  /**
    * Get the ancestors of each element,
    * up to but not including the element matched by the selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-parentsuntil-selector-filter
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def parentsUntil(): Selection = js.native
  def parentsUntil(selector: String): Selection = js.native
  
  /**
    * Get the immediately preceding sibling of each element.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-prev-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def prev(): Selection = js.native
  def prev(selector: String): Selection = js.native
  
  /**
    * Get all preceding siblings of each element,
    * optionally filtered by a selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-prevall-selector
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def prevAll(): Selection = js.native
  def prevAll(selector: String): Selection = js.native
  
  /**
    * Get all preceding siblings of each element
    * up to but not including the element matched by the selector.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-prevuntil-selector-filter
    * @param selector - Selector expression.
    * @returns Selected elements.
    */
  def prevUntil(): Selection = js.native
  def prevUntil(selector: String): Selection = js.native
  
  /**
    * Encode a set of form elements as a string
    * in standard URL-encoded notation for submission.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-serialize
    * @returns URL-encoded representation of the form or form elements.
    */
  def serialize(): String = js.native
  
  /**
    * Encode a set of form elements as an array of name-value objects.
    * `[{ name: "name", value: "value" }, ... ]`
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-serializearray
    * @returns Array of name value objects of the form or form elements.
    */
  def serializeArray(): js.Array[FormValue] = js.native
  
  /**
    * Encode a set of form elements as an object.
    * `{ inputName: "value", checkboxName: "value", ... }`
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-serializeobject
    * @returns Object representation of the form or form elements,
    *     key is field name and value is field value.
    */
  def serializeObject(): StringDictionary[String] = js.native
  
  /**
    * Return the number of elements in the selection.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-size
    * @returns The number of elements in the selection.
    */
  def size(): Double = js.native
  
  /**
    * Reduce the set of elements to a subset specified by a range of indices.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-slice-start-end
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
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-text
    * @returns Text content.
    */
  def text(): String = js.native
  
  /**
    * Retrieve all the elements contained in the selection as an array.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-toarray
    * @returns A unary selection of each element.
    */
  def toArray(): js.Array[Selection] = js.native
  
  /**
    * Get the current value of the first element.
    * https://k6.io/docs/javascript-api/k6-html/selection/selection-val
    * @returns The value of the first element.
    */
  def `val`(): js.UndefOr[String] = js.native
}
