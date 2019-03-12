package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationUtils extends js.Object {
  def contextFor(node: stdLib.Element): KnockoutValidationConfiguration
  def getConfigOptions(element: stdLib.Element): KnockoutValidationConfiguration
  def getDomData(node: stdLib.Element): KnockoutValidationConfiguration
  def getValue(o: js.Any): js.Any
  def hasAttribute(node: stdLib.Element, attr: java.lang.String): scala.Boolean
  def insertAfter(node: stdLib.Element, newNode: stdLib.Element): scala.Unit
  def isArray(o: js.Any): scala.Boolean
  def isEmptyVal(`val`: js.Any): scala.Boolean
  def isObject(o: js.Any): scala.Boolean
  def isValidatable(o: js.Any): scala.Boolean
  def newId(): scala.Double
  def setDomData(node: stdLib.Element, data: KnockoutValidationConfiguration): scala.Unit
  def values(o: js.Any): js.Array[_]
}

object KnockoutValidationUtils {
  @scala.inline
  def apply(
    contextFor: stdLib.Element => KnockoutValidationConfiguration,
    getConfigOptions: stdLib.Element => KnockoutValidationConfiguration,
    getDomData: stdLib.Element => KnockoutValidationConfiguration,
    getValue: js.Any => js.Any,
    hasAttribute: (stdLib.Element, java.lang.String) => scala.Boolean,
    insertAfter: (stdLib.Element, stdLib.Element) => scala.Unit,
    isArray: js.Any => scala.Boolean,
    isEmptyVal: js.Any => scala.Boolean,
    isObject: js.Any => scala.Boolean,
    isValidatable: js.Any => scala.Boolean,
    newId: () => scala.Double,
    setDomData: (stdLib.Element, KnockoutValidationConfiguration) => scala.Unit,
    values: js.Any => js.Array[_]
  ): KnockoutValidationUtils = {
    val __obj = js.Dynamic.literal(contextFor = js.Any.fromFunction1(contextFor), getConfigOptions = js.Any.fromFunction1(getConfigOptions), getDomData = js.Any.fromFunction1(getDomData), getValue = js.Any.fromFunction1(getValue), hasAttribute = js.Any.fromFunction2(hasAttribute), insertAfter = js.Any.fromFunction2(insertAfter), isArray = js.Any.fromFunction1(isArray), isEmptyVal = js.Any.fromFunction1(isEmptyVal), isObject = js.Any.fromFunction1(isObject), isValidatable = js.Any.fromFunction1(isValidatable), newId = js.Any.fromFunction0(newId), setDomData = js.Any.fromFunction2(setDomData), values = js.Any.fromFunction1(values))
  
    __obj.asInstanceOf[KnockoutValidationUtils]
  }
}

