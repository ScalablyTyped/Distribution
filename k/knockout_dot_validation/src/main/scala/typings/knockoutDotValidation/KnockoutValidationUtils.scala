package typings.knockoutDotValidation

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationUtils extends js.Object {
  def contextFor(node: Element): KnockoutValidationConfiguration
  def getConfigOptions(element: Element): KnockoutValidationConfiguration
  def getDomData(node: Element): KnockoutValidationConfiguration
  def getValue(o: js.Any): js.Any
  def hasAttribute(node: Element, attr: String): Boolean
  def insertAfter(node: Element, newNode: Element): Unit
  def isArray(o: js.Any): Boolean
  def isEmptyVal(`val`: js.Any): Boolean
  def isObject(o: js.Any): Boolean
  def isValidatable(o: js.Any): Boolean
  def newId(): Double
  def setDomData(node: Element, data: KnockoutValidationConfiguration): Unit
  def values(o: js.Any): js.Array[_]
}

object KnockoutValidationUtils {
  @scala.inline
  def apply(
    contextFor: Element => KnockoutValidationConfiguration,
    getConfigOptions: Element => KnockoutValidationConfiguration,
    getDomData: Element => KnockoutValidationConfiguration,
    getValue: js.Any => js.Any,
    hasAttribute: (Element, String) => Boolean,
    insertAfter: (Element, Element) => Unit,
    isArray: js.Any => Boolean,
    isEmptyVal: js.Any => Boolean,
    isObject: js.Any => Boolean,
    isValidatable: js.Any => Boolean,
    newId: () => Double,
    setDomData: (Element, KnockoutValidationConfiguration) => Unit,
    values: js.Any => js.Array[_]
  ): KnockoutValidationUtils = {
    val __obj = js.Dynamic.literal(contextFor = js.Any.fromFunction1(contextFor), getConfigOptions = js.Any.fromFunction1(getConfigOptions), getDomData = js.Any.fromFunction1(getDomData), getValue = js.Any.fromFunction1(getValue), hasAttribute = js.Any.fromFunction2(hasAttribute), insertAfter = js.Any.fromFunction2(insertAfter), isArray = js.Any.fromFunction1(isArray), isEmptyVal = js.Any.fromFunction1(isEmptyVal), isObject = js.Any.fromFunction1(isObject), isValidatable = js.Any.fromFunction1(isValidatable), newId = js.Any.fromFunction0(newId), setDomData = js.Any.fromFunction2(setDomData), values = js.Any.fromFunction1(values))
  
    __obj.asInstanceOf[KnockoutValidationUtils]
  }
}

