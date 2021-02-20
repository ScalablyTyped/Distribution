package typings.jsoneditoronline

import typings.jsoneditoronline.anon.AddEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditor extends StObject {
  
  var Events: AddEventListener = js.native
  
  var History: JSONEditorHistory = js.native
  
  var Node: JSONEditorNode = js.native
  
  var SearchBox: JSONEditorSearchBox = js.native
  
  def clear(): Unit = js.native
  
  def collapseAll(): Unit = js.native
  
  def expandAll(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def get(): js.Object = js.native
  
  def getName(): String = js.native
  
  def scrollTo(top: Double): Unit = js.native
  
  def search(text: String): js.Array[_] = js.native
  
  def set(json: js.Object): Unit = js.native
  def set(json: js.Object, name: String): Unit = js.native
  
  def setName(): Unit = js.native
  def setName(name: String): Unit = js.native
}
