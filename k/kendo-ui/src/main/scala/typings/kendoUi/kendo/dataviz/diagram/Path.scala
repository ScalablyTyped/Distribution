package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path
  extends StObject
     with Observable {
  
  def data(): String = js.native
  def data(path: String): Unit = js.native
  
  var drawingElement: typings.kendoUi.kendo.drawing.Path = js.native
  
  var options: PathOptions = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
