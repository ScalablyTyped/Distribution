package typings.jasmineJquery.jasmine

import typings.jquery.JQueryCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  def toBe(selector: T): Boolean = js.native
  /**
    * Only for tags that have checked attribute
    * @example
    * // returns true
    * expect($('<input type="checkbox" checked="checked"/>')).toBeChecked()
    */
  def toBeChecked(): Boolean = js.native
  /**
    * Only for tags that have disabled attribute
    * @example
    * // returns true
    * expect('<input type="submit" disabled="disabled"/>').toBeDisabled()
    */
  def toBeDisabled(): Boolean = js.native
  /**
    * Checks for child DOM elements or text
    */
  def toBeEmpty(): Boolean = js.native
  /**
    * Check if DOM element is focused
    * @example
    * // returns true
    * expect($('<input type="text" />').focus()).toBeFocused()
    */
  def toBeFocused(): Boolean = js.native
  /**
    * Check if DOM element is hidden.
    * Elements can be hidden for several reasons:
    * - They have a CSS display value of none ;
    * - They are form elements with type equal to hidden.
    * - Their width and height are explicitly set to 0.
    * - An ancestor element is hidden, so the element is not shown on the page.
    */
  def toBeHidden(): Boolean = js.native
  /**
    * Checks to see if the matched element is attached to the DOM.
    * @example
    * expect($('#id-name')[0]).toBeInDOM()
    */
  def toBeInDOM(): Boolean = js.native
  /**
    * Check to see if the set of matched elements matches the given selector
    *
    * @example
    * expect($('<span></span>').addClass('js-something')).toBeMatchedBy('.js-something')
    *
    * @returns {Boolean} true if DOM contains the element
    */
  def toBeMatchedBy(selector: String): Boolean = js.native
  /**
    * Only for tags that have checked attribute
    *
    * @example
    * // returns true
    * expect($('<option selected="selected"></option>')).toBeSelected()
    */
  def toBeSelected(): Boolean = js.native
  /**
    * Checks if DOM element is visible.
    * Elements are considered visible if they consume space in the document. Visible elements have a width or height that is greater than zero.
    */
  def toBeVisible(): Boolean = js.native
  /**
    * Check if DOM element is matched by the given selector.
    *
    * @example
    * // returns true
    * expect($('<div><span class="some-class"></span></div>')).toContain('some-class')
    */
  def toContain(selector: js.Any): Boolean = js.native
  /**
    * Check if DOM element exists inside the given parent element.
    *
    * @example
    * // returns true
    * expect($('<div><span class="some-class"></span></div>')).toContainElement('span.some-class')
    */
  def toContainElement(selector: String): Boolean = js.native
  /**
    * Check if DOM element contains the specified HTML.
    *
    * @example
    * // returns true
    * expect($('<div><ul></ul><h1>header</h1></div>')).toContainHtml('<ul></ul>')
    */
  def toContainHtml(html: String): Boolean = js.native
  /**
    * Check if DOM element contains the specified text.
    *
    * @example
    * // returns true
    * expect($('<div><ul></ul><h1>header</h1></div>')).toContainText('header')
    */
  def toContainText(text: String): Boolean = js.native
  /**
    * Checks if element exists in or out the DOM.
    */
  def toExist(): Boolean = js.native
  /**
    * Checks if DOM element handles event.
    *
    * @example
    * // returns true
    * expect($form).toHandle("submit")
    */
  def toHandle(eventName: String): Boolean = js.native
  /**
    * Assigns a callback to an event of the DOM element.
    *
    * @param eventName Name of the event to assign the callback to.
    * @param eventHandler Callback function to be assigned.
    *
    * @example
    * expect($form).toHandleWith("submit", yourSubmitCallback)
    */
  def toHandleWith(eventName: String, eventHandler: JQueryCallback): Boolean = js.native
  /**
    * Check if DOM element contains an attribute and, optionally, if the value of the attribute is equal to the expected one.
    *
    * @param attributeName Name of the attribute to check
    * @param expectedAttributeValue Expected attribute value
    */
  def toHaveAttr(attributeName: String): Boolean = js.native
  def toHaveAttr(attributeName: String, expectedAttributeValue: js.Any): Boolean = js.native
  /**
    * Checks if event propagation has been prevented.
    */
  def toHaveBeenPrevented(): Boolean = js.native
  /**
    * Checks if event propagation has been prevented on element with selector.
    *
    * @param selector Selector that should have prevented the event.
    */
  def toHaveBeenPreventedOn(selector: String): Boolean = js.native
  /**
    * Checks if event propagation has been stopped.
    *
    * @example
    * // returns true
    * var spyEvent = spyOnEvent('#some_element', 'click')
    * $('#some_element').click(function (event){event.stopPropagation();})
    * $('#some_element').click()
    * expect(spyEvent).toHaveBeenStopped()
    */
  def toHaveBeenStopped(): Boolean = js.native
  /**
    * Checks if event propagation has been stopped by an element with the given selector.
    * @param selector Selector of the element that should have stopped the event propagation.
    *
    * @example
    * // returns true
    * $('#some_element').click(function (event){event.stopPropagation();})
    * $('#some_element').click()
    * expect('click').toHaveBeenStoppedOn('#some_element')
    */
  def toHaveBeenStoppedOn(selector: String): Boolean = js.native
  /**
    * Checks if event was triggered.
    */
  def toHaveBeenTriggered(): Boolean = js.native
  /**
    * Checks if the event has been triggered on selector.
    * @param selector Selector that should have triggered the event.
    */
  def toHaveBeenTriggeredOn(selector: String): Boolean = js.native
  /**
    * Checks if the event has been triggered on selector.
    * @param selector Selector that should have triggered the event.
    * @param args Extra arguments to be passed to jQuery events functions.
    */
  def toHaveBeenTriggeredOnAndWith(selector: String, args: js.Any*): Boolean = js.native
  /**
    * Check if DOM element has class.
    *
    * @param className Name of the class to check.
    *
    * @example
    * // returns true
    * expect($('<div class="some-class"></div>')).toHaveClass("some-class")
    */
  def toHaveClass(className: String): Boolean = js.native
  /**
    * Check if DOM element has the given CSS properties.
    *
    * @param css Object containing the properties (and values) to check.
    *
    * @example
    * // returns true
    * expect($('<div style="display: none; margin: 10px;"></div>')).toHaveCss({display: "none", margin: "10px"})
    *
    * @example
    * // returns true
    * expect($('<div style="display: none; margin: 10px;"></div>')).toHaveCss({margin: "10px"})
    */
  def toHaveCss(css: js.Any): Boolean = js.native
  /**
    * Check if DOM element has the given data.
    * This can only be applied for element on with jQuery data(key) can be called.
    *
    */
  def toHaveData(key: String, expectedValue: String): Boolean = js.native
  /**
    * Check if DOM element has the specified HTML.
    *
    * @example
    * // returns true
    * expect($('<div><span></span></div>')).toHaveHtml('<span></span>')
    */
  def toHaveHtml(html: String): Boolean = js.native
  /**
    * Check if DOM element has the given Id
    *
    * @param Id Expected identifier
    */
  def toHaveId(id: String): Boolean = js.native
  /**
    * Checks if array has the given length.
    *
    * @param length Expected length
    */
  def toHaveLength(length: Double): Boolean = js.native
  /**
    * Check if DOM element contains a property and, optionally, if the value of the property is equal to the expected one.
    *
    * @param propertyName Property name to check
    * @param expectedPropertyValue Expected property value
    */
  def toHaveProp(propertyName: String): Boolean = js.native
  def toHaveProp(propertyName: String, expectedPropertyValue: js.Any): Boolean = js.native
  /**
    * Check if DOM element has the given Text.
    * @param text Accepts a string or regular expression
    *
    * @example
    * // returns true
    * expect($('<div>some text</div>')).toHaveText('some text')
    */
  def toHaveText(text: String): Boolean = js.native
  /**
    * Check if DOM element has the given value.
    * This can only be applied for element on with jQuery val() can be called.
    *
    * @example
    * // returns true
    * expect($('<input type="text" value="some text"/>')).toHaveValue('some text')
    */
  def toHaveValue(value: String): Boolean = js.native
}

