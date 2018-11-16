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

