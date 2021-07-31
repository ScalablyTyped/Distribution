package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binding
  extends StObject
     with Observable {
  
  def change(e: js.Object): Unit = js.native
  
  var dependencies: StringDictionary[Boolean] = js.native
  
  def destroy(): Unit = js.native
  
  def get(): js.Any = js.native
  
  var observable: Boolean = js.native
  
  var parents: js.Array[js.Any] = js.native
  
  var path: String = js.native
  
  def set(value: js.Any): Unit = js.native
  
  var source: js.Any = js.native
  
  def start(source: Observable): Unit = js.native
  
  def stop(source: Observable): Unit = js.native
}
