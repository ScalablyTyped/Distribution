package typings.kendoUi.kendo.data

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableObject extends Observable {
  
  def get(name: String): js.Any = js.native
  
  def init(): Unit = js.native
  def init(value: js.Any): Unit = js.native
  
  def parent(): ObservableObject = js.native
  
  def set(name: String, value: js.Any): Unit = js.native
  
  def toJSON(): js.Object = js.native
  
  var uid: String = js.native
}
