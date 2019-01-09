package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIProperty extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_EventItems): this.type = js.native
  def addItem(item: js.Array[_]): scala.Unit = js.native
  def addItem(item: js.Object): scala.Unit = js.native
  /**
    *
    * collapse group's children
    *
    */
  def collapsed(id: java.lang.String): scala.Unit = js.native
  /**
    *
    * expand group's children
    *
    */
  def expanded(id: java.lang.String): scala.Unit = js.native
  def findItem(key: java.lang.String): js.Any = js.native
  def findRender(key: java.lang.String): js.Any = js.native
  def getAllValue(key: java.lang.String): js.Any = js.native
  def getDefaultValue(): js.Array[_] = js.native
  def getGroupList(): js.Array[_] = js.native
  /**
    *
    * get a list of property's value
    *
    * @param [key=null]  if key is null, value is all properties.
    */
  def getValue(): js.Object | js.Array[_] = js.native
  def getValue(key: java.lang.String): js.Object | js.Array[_] = js.native
  def initValue(obj: js.Object): scala.Unit = js.native
  def loadItems(newItems: js.Array[_]): scala.Unit = js.native
  def refreshValue($dom: js.Any, newValue: js.Any): scala.Unit = js.native
  // remove item by key or title
  def removeItem(item: js.Object): scala.Unit = js.native
  /**
    *
    * set a list of property's value
    *
    */
  def setValue(obj: js.Object): scala.Unit = js.native
  def updateValue(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

