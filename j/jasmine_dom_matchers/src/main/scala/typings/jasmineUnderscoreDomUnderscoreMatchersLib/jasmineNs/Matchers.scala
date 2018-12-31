package typings
package jasmineUnderscoreDomUnderscoreMatchersLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  /**
    * Checks if element has a `checked` property, only useful for checkbox inputs.
    */
  def toBeChecked(): scala.Boolean = js.native
  /**
    * Checks if element has a disabled property.
    */
  def toBeDisabled(): scala.Boolean = js.native
  /**
    * Checks if element is focused.
    */
  def toBeFocused(): scala.Boolean = js.native
  /**
    * Checks if element has visibility `hidden` or `height` or `width = 0`.
    *
    * The reverse of {@link toBeVisible}.
    */
  def toBeHidden(): scala.Boolean = js.native
  /**
    * Checks if element has a `selected` property, only useful for options.
    */
  def toBeSelected(): scala.Boolean = js.native
  /**
    * Checks if element has visibility style not `hidden` and both `height` and `width > 0`.
    *
    * The reverse of {@link toBeHidden}.
    */
  def toBeVisible(): scala.Boolean = js.native
  /**
    * Checks if text substring is contained within element.
    */
  def toContainText(text: java.lang.String): scala.Boolean = js.native
  def toContainText(text: scala.Double): scala.Boolean = js.native
  def toContainText(text: stdLib.RegExp): scala.Boolean = js.native
  /**
    * True if the element exists, does not have to be in the DOM.
    */
  def toExist(): scala.Boolean = js.native
  /**
    * Checks element attributes.
    * `attributeValue` is optional, if omitted, will check that the attribute exists.
    */
  def toHaveAttr(attributeName: java.lang.String): scala.Boolean = js.native
  def toHaveAttr(attributeName: java.lang.String, attributeValue: java.lang.String): scala.Boolean = js.native
  def toHaveAttr(attributeName: java.lang.String, attributeValue: scala.Double): scala.Boolean = js.native
  def toHaveAttr(attributeName: java.lang.String, attributeValue: stdLib.RegExp): scala.Boolean = js.native
  /**
    * Checks for presence of classes on the element.
    * If `className` is an Array, checks for all classes in the array.
    */
  def toHaveClass(className: java.lang.String): scala.Boolean = js.native
  def toHaveClass(className: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * Checks if all styles are present.
    * `styles` is an object, all styles given in that object will be checked.
    */
  def toHaveCss(
    styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | stdLib.RegExp]
  ): scala.Boolean = js.native
  /**
    * Checks for length number of html elements.
    * Also works for plain Arrays.
    */
  def toHaveLength(length: scala.Double): scala.Boolean = js.native
  /**
    * Checks element properties.
    * `propertyValue` is optional, if omitted, will check that the property exists.
    */
  def toHaveProp(propertyName: java.lang.String): scala.Boolean = js.native
  def toHaveProp(propertyName: java.lang.String, propertyValue: java.lang.String): scala.Boolean = js.native
  def toHaveProp(propertyName: java.lang.String, propertyValue: scala.Double): scala.Boolean = js.native
  def toHaveProp(propertyName: java.lang.String, propertyValue: stdLib.RegExp): scala.Boolean = js.native
  /**
    * Checks for exact match with text, after trimming whitespace.
    */
  def toHaveText(text: java.lang.String): scala.Boolean = js.native
  def toHaveText(text: scala.Double): scala.Boolean = js.native
  def toHaveText(text: stdLib.RegExp): scala.Boolean = js.native
  /**
    * Checks the `value` of eligible elements (like inputs).
    */
  def toHaveValue(value: java.lang.String): scala.Boolean = js.native
  def toHaveValue(value: scala.Double): scala.Boolean = js.native
  def toHaveValue(value: stdLib.RegExp): scala.Boolean = js.native
}

