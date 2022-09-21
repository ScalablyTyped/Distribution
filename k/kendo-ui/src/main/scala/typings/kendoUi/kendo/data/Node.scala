package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node
  extends StObject
     with Model {
  
  def append(model: Any): Unit = js.native
  
  var children: HierarchicalDataSource = js.native
  
  def level(): Double = js.native
  
  def load(): Unit = js.native
  
  def loaded(): Boolean = js.native
  def loaded(value: Boolean): Unit = js.native
  
  def parentNode(): Node = js.native
}
