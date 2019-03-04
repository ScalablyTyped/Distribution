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
    contextFor: js.Function1[stdLib.Element, KnockoutValidationConfiguration],
    getConfigOptions: js.Function1[stdLib.Element, KnockoutValidationConfiguration],
    getDomData: js.Function1[stdLib.Element, KnockoutValidationConfiguration],
    getValue: js.Function1[js.Any, js.Any],
    hasAttribute: js.Function2[stdLib.Element, java.lang.String, scala.Boolean],
    insertAfter: js.Function2[stdLib.Element, stdLib.Element, scala.Unit],
    isArray: js.Function1[js.Any, scala.Boolean],
    isEmptyVal: js.Function1[js.Any, scala.Boolean],
    isObject: js.Function1[js.Any, scala.Boolean],
    isValidatable: js.Function1[js.Any, scala.Boolean],
    newId: js.Function0[scala.Double],
    setDomData: js.Function2[stdLib.Element, KnockoutValidationConfiguration, scala.Unit],
    values: js.Function1[js.Any, js.Array[_]]
  ): KnockoutValidationUtils = {
    val __obj = js.Dynamic.literal(contextFor = contextFor, getConfigOptions = getConfigOptions, getDomData = getDomData, getValue = getValue, hasAttribute = hasAttribute, insertAfter = insertAfter, isArray = isArray, isEmptyVal = isEmptyVal, isObject = isObject, isValidatable = isValidatable, newId = newId, setDomData = setDomData, values = values)
  
    __obj.asInstanceOf[KnockoutValidationUtils]
  }
}

