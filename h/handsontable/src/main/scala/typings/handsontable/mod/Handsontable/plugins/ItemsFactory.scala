package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsFactory extends js.Object {
  
  var defaultOrderPattern: js.Array[_] | Unit = js.native
  
  def getItems(): js.Array[_] = js.native
  def getItems(pattern: js.Array[_]): js.Array[_] = js.native
  def getItems(pattern: js.Object): js.Array[_] = js.native
  def getItems(pattern: Boolean): js.Array[_] = js.native
  
  var hot: Core = js.native
  
  var predefinedItems: js.Object = js.native
  
  def setPredefinedItems(predefinedItems: js.Array[_]): Unit = js.native
}
