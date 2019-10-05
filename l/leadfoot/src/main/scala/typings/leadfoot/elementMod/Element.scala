package typings.leadfoot.elementMod

import typings.dojo.promisePromiseMod.Promise
import typings.leadfoot.Anon_ELEMENT
import typings.leadfoot.Anon_Height
import typings.leadfoot.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An Element represents a DOM or UI element within the remote environment.
	 */
@js.native
trait Element extends js.Object {
  /**
  		 * The opaque, remote-provided ID of the element.
  		 * @readonly
  		 */
  var elementId: String = js.native
  /**
  		 * The session that the element belongs to.
  		 *
  		 * @readonly
  		 */
  var session: typings.leadfoot.sessionMod.^ = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _get(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _get(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _post(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _post(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * Clears the value of a form element.
  		 */
  def clearValue(): Promise[Unit] = js.native
  /**
  		 * Clicks the element. This method works on both mouse and touch platforms.
  		 */
  def click(): Promise[Unit] = js.native
  /**
  		 * Determines if this element is equal to another element.
  		 *
  		 * @param other The other element.
  		 */
  def equals(other: Element): Promise[Boolean] = js.native
  /**
  		 * Gets the first element within this element that matches the given query.
  		 *
  		 * @see {@link module:leadfoot/Session#setFindTimeout} to set the amount of time it the remote environment
  		 * should spend waiting for an element that does not exist at the time of the `find` call before timing
  		 * out.
  		 *
  		 * @param using
  		 * The element retrieval strategy to use. See {@link module:leadfoot/Session#find} for options.
  		 *
  		 * @param value
  		 * The strategy-specific value to search for. See {@link module:leadfoot/Session#find} for details.
  		 */
  def find(using: String, value: String): Promise[Element] = js.native
  /**
  		 * Gets all elements within this element that match the given query.
  		 *
  		 * @param using
  		 * The element retrieval strategy to use. See {@link module:leadfoot/Session#find} for options.
  		 *
  		 * @param value
  		 * The strategy-specific value to search for. See {@link module:leadfoot/Session#find} for details.
  		 */
  def findAll(using: String, value: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets all elements inside this element matching the given CSS class name.
  		 *
  		 * @param className The CSS class name to search for.
  		 */
  def findAllByClassName(className: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets all elements inside this element matching the given CSS selector.
  		 *
  		 * @param selector The CSS selector to search for.
  		 */
  def findAllByCssSelector(selector: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets all elements inside this element matching the given case-insensitive link text.
  		 *
  		 * @param text The link text of the element.
  		 */
  def findAllByLinkText(text: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets all elements inside this element matching the given name attribute.
  		 *
  		 * @param name The name of the element.
  		 */
  def findAllByName(name: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets all elements inside this element partially matching the given case-insensitive link text.
  		 *
  		 * @param text The partial link text of the element.
  		 */
  def findAllByPartialLinkText(text: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets all elements inside this element matching the given HTML tag name.
  		 *
  		 * @param tagName The tag name of the element.
  		 */
  def findAllByTagName(tagName: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets all elements inside this element matching the given XPath selector.
  		 *
  		 * @param path The XPath selector to search for.
  		 */
  def findAllByXpath(path: String): Promise[js.Array[Element]] = js.native
  /**
  		 * Gets the first element inside this element matching the given CSS class name.
  		 *
  		 * @param className The CSS class name to search for.
  		 */
  def findByClassName(className: String): Promise[Element] = js.native
  /**
  		 * Gets the first element inside this element matching the given CSS selector.
  		 *
  		 * @param selector The CSS selector to search for.
  		 */
  def findByCssSelector(selector: String): Promise[Element] = js.native
  /**
  		 * Gets the first element inside this element matching the given ID.
  		 *
  		 * @param id The ID of the element.
  		 */
  def findById(id: String): Promise[Element] = js.native
  /**
  		 * Gets the first element inside this element matching the given case-insensitive link text.
  		 *
  		 * @param text The link text of the element.
  		 */
  def findByLinkText(text: String): Promise[Element] = js.native
  /**
  		 * Gets the first element inside this element matching the given name attribute.
  		 *
  		 * @param name The name of the element.
  		 */
  def findByName(name: String): Promise[Element] = js.native
  /**
  		 * Gets the first element inside this element partially matching the given case-insensitive link text.
  		 *
  		 * @param text The partial link text of the element.
  		 */
  def findByPartialLinkText(text: String): Promise[Element] = js.native
  /**
  		 * Gets the first element inside this element matching the given HTML tag name.
  		 *
  		 * @param tagName The tag name of the element.
  		 */
  def findByTagName(tagName: String): Promise[Element] = js.native
  /**
  		 * Gets the first element inside this element matching the given XPath selector.
  		 *
  		 * @param path The XPath selector to search for.
  		 */
  def findByXpath(path: String): Promise[Element] = js.native
  /**
  		 * Gets an attribute of the element.
  		 *
  		 * @see Element#getProperty to retrieve an element property.
  		 * @param name The name of the attribute.
  		 * @returns The value of the attribute, or `null` if no such attribute exists.
  		 */
  def getAttribute(name: String): Promise[String] = js.native
  /**
  		 * Gets a CSS computed property value for the element.
  		 *
  		 * @param propertyName
  		 * The CSS property to retrieve. This argument must be camel-case, *not* hyphenated.
  		 */
  def getComputedStyle(propertyName: String): Promise[String] = js.native
  /**
  		 * Gets the position of the element relative to the top-left corner of the document, taking into account
  		 * scrolling and CSS transformations (if they are supported).
  		 */
  def getPosition(): Promise[Anon_X] = js.native
  /**
  		 * Gets a property of the element.
  		 *
  		 * @see Element#getAttribute to retrieve an element attribute.
  		 * @param name The name of the property.
  		 * @returns The value of the property.
  		 */
  def getProperty[T /* <: js.Any */](name: String): Promise[T] = js.native
  /**
  		 * Gets the size of the element, taking into account CSS transformations (if they are supported).
  		 */
  def getSize(): Promise[Anon_Height] = js.native
  /**
  		 * Gets a property or attribute of the element according to the WebDriver specification algorithm. Use of this
  		 * method is not recommended; instead, use {@link module:leadfoot/Element#getAttribute} to retrieve DOM attributes
  		 * and {@link module:leadfoot/Element#getProperty} to retrieve DOM properties.
  		 *
  		 * This method uses the following algorithm on the server to determine what value to return:
  		 *
  		 * 1. If `name` is 'style', returns the `style.cssText` property of the element.
  		 * 2. If the attribute exists and is a boolean attribute, returns 'true' if the attribute is true, or null
  		 *    otherwise.
  		 * 3. If the element is an `<option>` element and `name` is 'value', returns the `value` attribute if it exists,
  		 *    otherwise returns the visible text content of the option.
  		 * 4. If the element is a checkbox or radio button and `name` is 'selected', returns 'true' if the element is
  		 *    checked, or null otherwise.
  		 * 5. If the returned value is expected to be a URL (e.g. element is `<a>` and attribute is `href`), returns the
  		 *    fully resolved URL from the `href`/`src` property of the element, not the attribute.
  		 * 6. If `name` is 'class', returns the `className` property of the element.
  		 * 7. If `name` is 'readonly', returns 'true' if the `readOnly` property is true, or null otherwise.
  		 * 8. If `name` corresponds to a property of the element, and the property is not an Object, return the property
  		 *    value coerced to a string.
  		 * 9. If `name` corresponds to an attribute of the element, return the attribute value.
  		 *
  		 * @param name The property or attribute name.
  		 * @returns The value of the attribute as a string, or `null` if no such property or
  		 * attribute exists.
  		 */
  def getSpecAttribute(name: String): Promise[String] = js.native
  /**
  		 * Gets the tag name of the element. For HTML documents, the value is always lowercase.
  		 */
  def getTagName(): Promise[String] = js.native
  /**
  		 * Gets the visible text within the element. `<br>` elements are converted to line breaks in the returned
  		 * text, and whitespace is normalised per the usual XML/HTML whitespace normalisation rules.
  		 */
  def getVisibleText(): Promise[String] = js.native
  /**
  		 * Returns whether or not the element would be visible to an actual user. This means that the following types
  		 * of elements are considered to be not displayed:
  		 *
  		 * 1. Elements with `display: none`
  		 * 2. Elements with `visibility: hidden`
  		 * 3. Elements positioned outside of the viewport that cannot be scrolled into view
  		 * 4. Elements with `opacity: 0`
  		 * 5. Elements with no `offsetWidth` or `offsetHeight`
  		 */
  def isDisplayed(): Promise[Boolean] = js.native
  /**
  		 * Returns whether or not a form element can be interacted with.
  		 */
  def isEnabled(): Promise[Boolean] = js.native
  /**
  		 * Returns whether or not a form element is currently selected (for drop-down options and radio buttons), or
  		 * whether or not the element is currently checked (for checkboxes).
  		 */
  def isSelected(): Promise[Boolean] = js.native
  /**
  		 * Submits the element, if it is a form, or the form belonging to the element, if it is a form element.
  		 */
  def submit(): Promise[Unit] = js.native
  def toJSON(): Anon_ELEMENT = js.native
  /**
  		 * Types into the element. This method works the same as the {@link module:leadfoot/Session#pressKeys} method
  		 * except that any modifier keys are automatically released at the end of the command.
  		 *
  		 * @param value
  		 * The text to type in the remote environment. See {@link module:leadfoot/Session#pressKeys} for more information.
  		 */
  def `type`(value: String): Promise[Unit] = js.native
  def `type`(value: js.Array[String]): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element that match the given query to be destroyed.
  		 *
  		 * @param using
  		 * The element retrieval strategy to use. See {@link module:leadfoot/Session#find} for options.
  		 *
  		 * @param value
  		 * The strategy-specific value to search for. See {@link module:leadfoot/Session#find} for details.
  		 */
  def waitForDeleted(using: String, value: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element matching the given CSS class name to be destroyed.
  		 *
  		 * @param className The CSS class name to search for.
  		 */
  def waitForDeletedByClassName(className: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element matching the given CSS selector to be destroyed.
  		 *
  		 * @param selector The CSS selector to search for.
  		 */
  def waitForDeletedByCssSelector(className: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element matching the given ID to be destroyed.
  		 *
  		 * @param id The ID of the element.
  		 */
  def waitForDeletedById(id: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element matching the given case-insensitive link text to be destroyed.
  		 *
  		 * @param text The link text of the element.
  		 */
  def waitForDeletedByLinkText(text: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element matching the given name attribute to be destroyed.
  		 *
  		 * @param name The name of the element.
  		 */
  def waitForDeletedByName(name: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element partially matching the given case-insensitive link text to be
  		 * destroyed.
  		 *
  		 * @param text The partial link text of the element.
  		 */
  def waitForDeletedByPartialLinkText(text: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element matching the given HTML tag name to be destroyed.
  		 *
  		 * @param tagName The tag name of the element.
  		 */
  def waitForDeletedByTagName(tagName: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements inside this element matching the given XPath selector to be destroyed.
  		 *
  		 * @param path The XPath selector to search for.
  		 */
  def waitForDeletedByXpath(path: String): Promise[Unit] = js.native
}

