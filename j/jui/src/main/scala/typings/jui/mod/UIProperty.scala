package typings.jui.mod

import typings.jui.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIProperty extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Items): this.type = js.native
  
  def addItem(item: js.Array[_]): Unit = js.native
  def addItem(item: js.Object): Unit = js.native
  
  /**
    *
    * collapse group's children
    *
    */
  def collapsed(id: String): Unit = js.native
  
  /**
    *
    * expand group's children
    *
    */
  def expanded(id: String): Unit = js.native
  
  def findItem(key: String): js.Any = js.native
  
  def findRender(key: String): js.Any = js.native
  
  def getAllValue(key: String): js.Any = js.native
  
  def getDefaultValue(): js.Array[_] = js.native
  
  def getGroupList(): js.Array[_] = js.native
  
  /**
    *
    * get a list of property's value
    *
    * @param [key=null]  if key is null, value is all properties.
    */
  def getValue(): js.Object | js.Array[_] = js.native
  def getValue(key: String): js.Object | js.Array[_] = js.native
  
  def initValue(obj: js.Object): Unit = js.native
  
  def loadItems(newItems: js.Array[_]): Unit = js.native
  
  def refreshValue($dom: js.Any, newValue: js.Any): Unit = js.native
  
  // remove item by key or title
  def removeItem(item: js.Object): Unit = js.native
  
  /**
    *
    * set a list of property's value
    *
    */
  def setValue(obj: js.Object): Unit = js.native
  
  def updateValue(key: String, value: js.Any): Unit = js.native
}
