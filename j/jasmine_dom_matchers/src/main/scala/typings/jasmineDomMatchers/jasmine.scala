package typings.jasmineDomMatchers

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    /**
      * Checks if element has a `checked` property, only useful for checkbox inputs.
      */
    def toBeChecked(): Boolean = js.native
    /**
      * Checks if element has a disabled property.
      */
    def toBeDisabled(): Boolean = js.native
    /**
      * Checks if element is focused.
      */
    def toBeFocused(): Boolean = js.native
    /**
      * Checks if element has visibility `hidden` or `height` or `width = 0`.
      *
      * The reverse of {@link toBeVisible}.
      */
    def toBeHidden(): Boolean = js.native
    /**
      * Checks if element has a `selected` property, only useful for options.
      */
    def toBeSelected(): Boolean = js.native
    /**
      * Checks if element has visibility style not `hidden` and both `height` and `width > 0`.
      *
      * The reverse of {@link toBeHidden}.
      */
    def toBeVisible(): Boolean = js.native
    /**
      * Checks if text substring is contained within element.
      */
    def toContainText(text: String): Boolean = js.native
    def toContainText(text: Double): Boolean = js.native
    def toContainText(text: RegExp): Boolean = js.native
    /**
      * True if the element exists, does not have to be in the DOM.
      */
    def toExist(): Boolean = js.native
    /**
      * Checks element attributes.
      * `attributeValue` is optional, if omitted, will check that the attribute exists.
      */
    def toHaveAttr(attributeName: String): Boolean = js.native
    def toHaveAttr(attributeName: String, attributeValue: String): Boolean = js.native
    def toHaveAttr(attributeName: String, attributeValue: Double): Boolean = js.native
    def toHaveAttr(attributeName: String, attributeValue: RegExp): Boolean = js.native
    /**
      * Checks for presence of classes on the element.
      * If `className` is an Array, checks for all classes in the array.
      */
    def toHaveClass(className: String): Boolean = js.native
    def toHaveClass(className: js.Array[String]): Boolean = js.native
    /**
      * Checks if all styles are present.
      * `styles` is an object, all styles given in that object will be checked.
      */
    def toHaveCss(styles: StringDictionary[String | Double | RegExp]): Boolean = js.native
    /**
      * Checks for length number of html elements.
      * Also works for plain Arrays.
      */
    def toHaveLength(length: Double): Boolean = js.native
    /**
      * Checks element properties.
      * `propertyValue` is optional, if omitted, will check that the property exists.
      */
    def toHaveProp(propertyName: String): Boolean = js.native
    def toHaveProp(propertyName: String, propertyValue: String): Boolean = js.native
    def toHaveProp(propertyName: String, propertyValue: Double): Boolean = js.native
    def toHaveProp(propertyName: String, propertyValue: RegExp): Boolean = js.native
    /**
      * Checks for exact match with text, after trimming whitespace.
      */
    def toHaveText(text: String): Boolean = js.native
    def toHaveText(text: Double): Boolean = js.native
    def toHaveText(text: RegExp): Boolean = js.native
    /**
      * Checks the `value` of eligible elements (like inputs).
      */
    def toHaveValue(value: String): Boolean = js.native
    def toHaveValue(value: Double): Boolean = js.native
    def toHaveValue(value: RegExp): Boolean = js.native
  }
  
}

